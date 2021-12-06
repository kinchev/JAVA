package com.telerikacademy.ocp.examples.solution;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl {

    /**
     * We separate the different types of user into User and Employee. We also
     * define the BaseUser abstract class that defines the getDisplayName() abstract method.
     * User and Employee implement the method, applying the needed logic.
     * <br/><br/>
     * If another user type needs to be added we will simply create a new class for it
     * and implement the getDisplayName() method.
     */

    public String getFormattedName(BaseUser user) {
        return user.getDisplayName();
    }
}
