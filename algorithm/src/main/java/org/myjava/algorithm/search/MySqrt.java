package org.myjava.algorithm.search;

public class MySqrt {
    public static void main(String[] args) {
        int n = 115 ;
        System.out.println(mySqrt(n));
    }

    /**
     * 实现 int sqrt(int x) 函数。
     *
     * 计算并返回 x 的平方根，其中 x 是非负整数。
     *
     * 由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
     *
     * 示例 1:
     *
     * 输入: 4
     * 输出: 2
     * 示例 2:
     *
     * 输入: 8
     * 输出: 2
     * 说明: 8 的平方根是 2.82842...,
     *      由于返回类型是整数，小数部分将被舍去。
     * @param n
     * @return
     */
    public static int mySqrt(int n) {
        if(n <= 1){
            return 1 ;
        }
        int begin = 1 ;
        int end = n ;
        int middle = 0 ;
        while (begin <= end){
            middle = begin + (end - begin)/2 ;
            if(middle == n/middle ){
                return middle ;
            }else {
                if(middle < n/middle){
                    begin = middle + 1 ;
                }else {
                    end = middle -1 ;
                }
            }
        }

        return  middle ;

    }
}
