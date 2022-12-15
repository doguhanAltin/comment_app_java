package com.CommentAppProject.demo.repositories;

import com.CommentAppProject.demo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User,Long> {

}
