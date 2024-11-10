package com.example.msblog;

import com.example.msblog.Blog;

import java.util.List;

public interface BlogService {

    public Blog createBlog(Blog blog);

    public Blog getBlogById(Integer id);

    public List<Blog> getAllBlogs();

    public Blog updateBlog(Integer id, Blog blog);

    public void deleteBlog(Integer id);
}