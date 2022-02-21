package com.company.demo.DATATYPE;

public class StringEquals {
    public static void main(String[] args) {

    String A="QQQ";
    String B="QQQ";
    String C=new String("QQQ");
    String D=new String("QQQ");
    String J=new String("WWW");
    String E="WWW";
        System.out.println(A==B);//true
        System.out.println(A==C);//false
        System.out.println(A==D);//false
        System.out.println(A==J);//false
        System.out.println(A.equals(B));//true
        System.out.println(A.equals(C));//true
        System.out.println(A.equals(D));//true
        System.out.println(A.equals(J));//false
        System.out.println(E.equals(A));//false
        System.out.println(E.equals(C));//false
    }




}
