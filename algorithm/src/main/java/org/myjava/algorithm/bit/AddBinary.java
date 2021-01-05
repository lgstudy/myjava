package org.myjava.algorithm.bit;

public class AddBinary {
    public static void main(String[] args) {
        String a = "100" ;
        String b = "10100" ;
        System.out.println(addBinary(a,b));
    }

    public static String addBinary(String a, String b) {
       int al = a.length() -1 ;
       int bl = b.length() -1 ;
        StringBuilder sb = new StringBuilder();
        int carry = 0 ;
        while (al >= 0 || bl >= 0 ){
            char l = '0' ;
            char m = '0' ;
            if(al >= 0){
                l = a.charAt(al) ;
            }
            if(bl >= 0){
                m = b.charAt(bl) ;
            }
            int sum = (l-'0') + (m-'0') + carry ;
            sb.append(sum%2) ;
            carry = sum/2 ;
            al-- ;
            bl-- ;
        }

        if(carry == 1){
            sb.append(1) ;
        }
        return sb.reverse().toString() ;
    }
}
