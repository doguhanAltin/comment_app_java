package com.CommentAppProject.demo.repositories;

import com.CommentAppProject.demo.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPostRepository extends JpaRepository<Post,Long> {
}
