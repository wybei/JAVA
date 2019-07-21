package com.wyb;

import com.wyb.annotations.Benchmark;
import com.wyb.annotations.Measurement;
import java.lang.reflect.Method;
import java.util.List;

class CaseRunner{
    private static final int DEFAULT_ITERRTIONS=10;
    private static final int DEFAULT_GROUPS=5;
    private final List<Case> caseList;
    public CaseRunner(List<Case> caseList) {
        this.caseList=caseList;
    }

    public void run() throws Exception {
        for (Case bCase:caseList) {
            int iterations=DEFAULT_ITERRTIONS;
            int groups=DEFAULT_GROUPS;
            //先获取类级别的配置
            Measurement classMeasurement = bCase.getClass().getAnnotation(Measurement.class);
            if (classMeasurement!=null){
                iterations=classMeasurement.iterations();
                groups=classMeasurement.groups();
            }
            //找到对象中哪些方法是需要测试的方法
            Method[] methods = bCase.getClass().getMethods();
            for (Method method:methods) {
                Benchmark benchmark = method.getAnnotation(Benchmark.class);
                if (benchmark==null){
                    continue;
                }
                Measurement methodAnnotation = method.getAnnotation(Measurement.class);
                if (methodAnnotation!=null){
                    iterations=methodAnnotation.iterations();
                    groups=methodAnnotation.groups();
                }
                runCase(bCase,method,iterations,groups);
            }
        }
    }
    private void runCase(Case bcase,Method method,int iterations,int groups) throws Exception {
        System.out.println(method.getName());
        for (int i = 0; i <groups ; i++) {
            long t1= System.nanoTime();
            for (int j = 0; j <iterations ; j++) {
                method.invoke(bcase);
            }
            long t2=System.nanoTime();
            System.out.println("第"+i+"次试验耗时："+(t2-t1)+"纳秒");
        }
    }
}
