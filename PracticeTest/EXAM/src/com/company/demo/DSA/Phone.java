package com.company.demo.DSA;

import java.util.Map;

public class Phone {
    private Map<String,String> data;

    public Phone(Map<String, String> data) {
        this.data=data;
    }

    public void addPhone(String name,String phone){
        data.put(name,phone);

        }
        public String getPhone(String name){
        return data.get(name);
        }
}
