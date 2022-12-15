package com.CommentAppProject.demo.repositories;

import com.CommentAppProject.demo.entities.Like;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILikeRepository extends JpaRepository<Like,Long> {
}
