package com.telerikacademy.lsp.examples.violation;


import com.telerikacademy.lsp.examples.violation.models.Moderator;
import com.telerikacademy.lsp.examples.violation.models.User;
import com.telerikacademy.lsp.models.Beer;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class UserServiceImpl {

    public static void main(String[] args) {
        List<User> allUsers = new ArrayList<>();
        List<Moderator> allModerators = new ArrayList<>();

        combineWishLists(allUsers, allModerators);
    }

    private static List<Beer> combineWishLists(List<User> users, List<Moderator> moderators) {
        List<Beer> result = new ArrayList<>();
        result.addAll(users.stream().flatMap(user -> user.getWishList().stream()).collect(toList()));
        result.addAll(moderators.stream().flatMap(mod -> mod.getWishList().stream()).collect(toList()));
        return result;
    }
}
