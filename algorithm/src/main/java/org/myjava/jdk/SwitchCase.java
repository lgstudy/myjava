package org.myjava.jdk;

/**
 * 测试 jdk14 里面的 switch 语法
 */
public class SwitchCase {
    public static void main(String[] args) {
        month(3);
        month(6);
        month(2);
        month(30);
//        System.out.println("31 days");
    }

    public static void month(int month){
        /*switch (month){
            case 1,3,5,7,8,10,12 -> System.out.println("31 days");
            case 4,6,9 -> System.out.println("30 days");
            case 2 -> System.out.println("28 or 29 days");
            default -> System.out.println("invalid month");
        }*/
    }
}
