package com.company.demo.DATATYPE;

public class Task {
    private  final String title;
    public Task(String title){
        this.title = title;

    }
    public void changeTitle(String newTitle){
//        title=newTitle; Its final compile error;
    }

    @Override
    public String toString() {
        return title;
    }
}
