package ch.hftm.service;

import java.util.List;
import org.jboss.logging.Logger;

import ch.hftm.model.Blog;
import ch.hftm.repository.BlogRepository;
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@Dependent
public class BlogService {
    @Inject
    private BlogRepository blogRpy;

    @Inject
    private Logger logger;

    public List<Blog> getBlogs() {
        List<Blog> blogs = blogRpy.listAll();
        logger.info("Returning " + blogs.size() + " blogs");
        return blogs;
    }
    
    @Transactional
    public void addBlog(Blog blog) {
        logger.info("Adding blog " + blog.getTitle());
        blogRpy.persist(blog);
    }


}
