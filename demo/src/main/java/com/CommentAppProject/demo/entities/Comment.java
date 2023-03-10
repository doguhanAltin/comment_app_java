package com.CommentAppProject.demo.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="comment")
@Data
public class Comment {
    @Id
    Long id;
    Long userId;
    Long postId;
    @Lob
    @Column(columnDefinition = "text")
    String text;


}
