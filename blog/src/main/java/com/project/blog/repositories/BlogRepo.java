package com.project.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.blog.entities.Blog;

public interface BlogRepo extends JpaRepository<Blog, Integer> {


}
