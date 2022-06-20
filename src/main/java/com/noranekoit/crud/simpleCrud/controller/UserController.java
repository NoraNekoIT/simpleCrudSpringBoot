package com.noranekoit.crud.simpleCrud.controller;

import com.noranekoit.crud.simpleCrud.entity.User;
import com.noranekoit.crud.simpleCrud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    // Insert user record
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public User addEmployee(@RequestBody User user) {
        return userService.addUser(user);
    }
    // Fetch all user records
    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }
    // Fetch single user
    @GetMapping("/user{id}")
    public User getUserById(@PathVariable("id") int userId){
        return userService.getUserById(userId);
    }
    // Update user record
    @PutMapping("/updateuser")
    public ResponseEntity<String> updateUser(@RequestBody User user) {
        try {
            userService.updateUser(user);
            return new ResponseEntity<String>(HttpStatus.OK);
        }catch(NoSuchElementException ex){
            // log the error message
            System.out.println(ex.getMessage());
            return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
        }
    }
    // Delete user record
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable int id){
        try {
            userService.deleteUserById(id);
            return new ResponseEntity<String>(HttpStatus.OK);
        }catch(RuntimeException ex){
            // log the error message
            System.out.println(ex.getMessage());
            return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
        }
    }
}
