package com.company.demo.DATATYPE;

public class MainFeedback {
    public static void main(String[] args) {
        var feedback=new Feedback();

        feedback.addComment("Hi");
        feedback.addComment("How are tot");
        feedback.addComment("DO you know OOp");
        feedback.getComments().forEach(System.out::println);
    }
}
