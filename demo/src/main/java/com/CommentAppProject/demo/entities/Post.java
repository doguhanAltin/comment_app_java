package com.CommentAppProject.demo.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "post")
@Data
public class Post {
    @Id
    Long id;
    Long userid;
    String title;

    @Lob
    @Column(columnDefinition = "text")
    String text;
}
