package com.wyb;

import java.io.File;
import java.net.URL;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class CaseLoader {
    public CaseRunner load() throws Exception {
        String packge = "com/wyb/cases";
        List<String> classNameList = new ArrayList<String>();
        List<Case> caseList = new ArrayList<Case>();
        //根据一个固定的类，找到类加载器
        //根据类加载器找到类文件所在的路径
        //扫描路径下的所有类文件
        ClassLoader classLoader = this.getClass().getClassLoader();
        Enumeration<URL> urls = classLoader.getResources(packge);
        while (urls.hasMoreElements()) {
            URL url = urls.nextElement();
            if (!url.getProtocol().equals("file")) {
                //如果不是*.class文件 暂时不支持
                continue;
            }
            String dirname = URLDecoder.decode(url.getPath(), "utf-8");
            File dir = new File(dirname);
            if (!dir.isDirectory()) {
                //不是目录
                continue;
            }
            //扫描该目录下所有的*.class文件，作为所有的类文件
            File[] files = dir.listFiles();
            if (files == null) {
                continue;
            }
            for (File file : files) {
                //没有判断后缀是否是.class
                String filename = file.getName();
                if (filename.endsWith(".class")) {
                    String classname = filename.substring(0, filename.length() - 6);
                    classNameList.add(classname);
                }
            }
        }
        for (String classname : classNameList) {
            Class<?> cls = Class.forName("com.wyb.cases" + "." + classname);
            if (Case.class.isAssignableFrom(cls)) {
                caseList.add((Case) cls.newInstance());
            }
        }
        return new CaseRunner(caseList);
    }
}
