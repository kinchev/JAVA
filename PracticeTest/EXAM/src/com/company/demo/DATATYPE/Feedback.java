package com.company.demo.DATATYPE;

import java.util.ArrayList;
import java.util.List;

public class Feedback {
    private final List<String> comments=new ArrayList<>();

    public List<String> getComments() {
        return comments;
    }
    public void addComment(String comment) {
        if(!comment.isBlank()){
            getComments().add(comment);
        }
    }
}
