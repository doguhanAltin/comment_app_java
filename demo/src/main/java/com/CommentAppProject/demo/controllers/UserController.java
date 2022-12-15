package com.CommentAppProject.demo.controllers;

import com.CommentAppProject.demo.entities.User;
import com.CommentAppProject.demo.repositories.IUserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {
  private  IUserRepository userRepository;


    public UserController(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    public List<User> getAllUsers() {
        return  userRepository.findAll();
    }
    @PostMapping
    public User createUser(@RequestBody User newUser) {
        return userRepository.save(newUser);
    }

    @GetMapping("/{userId}")
    public User getOneUser(@PathVariable  Long userId){
    return userRepository.findById(userId).orElse(null);

    }
    @PutMapping("/{userId}")
    public  User updateUser(@PathVariable Long userId ,@RequestBody User newUser){
      Optional<User> user = userRepository.findById(userId);
      if(user.isPresent()){
        User foundUser = user.get();
        foundUser.setUserName(newUser.getUserName());
        foundUser.setPassword(newUser.getPassword());
        userRepository.save(foundUser);
        return foundUser;


      }else{
        return null;
      }

    }

    @DeleteMapping("/{userId}")
  public void deleteOneUser(@PathVariable Long userId ){

      userRepository.deleteById(userId);
    }


}
