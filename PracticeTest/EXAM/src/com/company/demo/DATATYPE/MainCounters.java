package com.company.demo.DATATYPE;



public class MainCounters {

    public static void main(String[] args) {
	int sum=2;
        Counter first=new Counter();
        sum=sum+first.count;
        Counter second=new Counter();
        sum=sum+second.count;
        System.out.println(Counter.count+sum);
    }

}
