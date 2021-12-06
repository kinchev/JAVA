package com.telerikacademy.lsp.examples.solution;

import com.telerikacademy.lsp.examples.solution.models.User;
import com.telerikacademy.lsp.examples.solution.models.UserWithList;
import com.telerikacademy.lsp.models.Beer;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class UserServiceImpl {

    public static void main(String[] args) {
        ArrayList<UserWithList> allUsers = new ArrayList<>();
        allUsers.add(new User());
//        allUsers.add(new Employee()); <--- can't compile, Employees are not UserWithList

        List<Beer> allWishLists = allUsers
                .stream()
                .flatMap(user -> user
                        .getWishList().stream())
                .collect(toList());

    }
}
