package com.telerikacademy.ocp.examples.violation;

import com.telerikacademy.ocp.models.Beer;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class UserServiceImpl {

    /**
     * Every new role that we add to the application will require modifying
     * this method and adding another else if statement. We do not want that.
     */

    public String getFormattedName(User user) {
        if (user.getRole().equals("admin")) {
            return String.format("%s, Email: %s",
                    user.getUsername(),
                    user.getEmail());
        } else if (user.getRole().equals("user")) {
            return String.format("%s, Wish list: %s",
                    user.getUsername(),
                    user.getWishList().stream().map(Beer::getName).collect(Collectors.joining(",")));
        }

        return user.getUsername();
    }
}
