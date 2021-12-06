package com.telerikacademy.lsp.examples.improved;

import com.telerikacademy.lsp.examples.improved.models.BaseUser;
import com.telerikacademy.lsp.examples.improved.models.Employee;
import com.telerikacademy.lsp.examples.improved.models.User;
import com.telerikacademy.lsp.models.Beer;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class UserServiceImpl {

    public static void main(String[] args) {
        List<BaseUser> allUsers = new ArrayList<>();
        allUsers.add(new User());
        allUsers.add(new Employee());
        List<Beer> allWishLists = allUsers
                .stream()
                .flatMap(user -> user
                        .getWishList().stream())
                .collect(toList());
    }

}
