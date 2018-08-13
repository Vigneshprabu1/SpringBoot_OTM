package com.example.SpringOTM.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringOTM.model.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

}