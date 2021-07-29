package com.example.postvariable.user;

import com.example.postvariable.location.Location;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Api(tags = {"User API"})
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value="/users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @RequestMapping(value = "/users/{id}")
    public User getUser(@PathVariable String id) {
        return userService.getUser(id);
    }

    @RequestMapping(value="/users", method = RequestMethod.POST)
    public void addUser(@RequestBody User user) {
        userService.addUser(user);
    }

    @RequestMapping(value="/users/{id}", method = RequestMethod.PUT)
    public void getUser(@PathVariable String id, @RequestBody User user) {

        userService.updateUser(id, user);

    }
}
