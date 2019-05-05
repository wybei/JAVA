public class Power {
    public static void main(String[] args) {
        double num1 = Power(4, 0);
        double num2 = Power(4, 2);
        double num3 = Power(4, -2);
        double num4 = Power(0, 2);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);

    }

/*   public static double Power(double base, int exponent) {
       double result = 1.0;
       if (exponent == 0) {
           result = 1.0;
       }
       if (exponent > 0) {
           for (int i = 0; i < exponent; i++) {
               result *= base;
           }
       } else {
           for (int i = 0; i < (-exponent); i++) {
               result *= base;
           }
           result = 1 / result;
       }
       return result;
   }*/

//改进：
public static double Power(double base, int exponent) {
    if(equal(base,exponent)){
        return 0;
    }
    if (exponent == 0) {
        return 1.0;
    }
    if (exponent == 1) {
        return base;
    }
    if (exponent < 0) {
        base = 1 / base;
        exponent = -exponent;
    }
    //用exponent >> 1代替exponent/2，用(exponent & 0x1) == 0代替exponent%2 == 0
    if ((exponent & 0x1) == 0) {
        return Power(base, exponent >> 1) * Power(base, exponent >> 1);
    } else if ((exponent & 0x1) == 1) {
        return Power(base, exponent >> 1) * Power(base, exponent >> 1) * base;
    }
    return -1;// 边界base为0,返回-1
}
    // 注意考虑边界base为0，判断double不能用base == 0.0，要写专门的函数equal来判断
    public static boolean equal ( double num1, double num2){
        if (num1 - num2 ==0) {
            return true;
        }
        return false;
    }
}