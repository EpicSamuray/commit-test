package ch.hftm.service;

import java.util.List;
import java.util.Optional;

import ch.hftm.model.Author;
import jakarta.ws.rs.WebApplicationException;
import jakarta.ws.rs.core.Response;
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
        blogRpy.persist(blog);
        logger.info("The Blog with id {" + blog.getId() + "} and Title {"+ blog.getTitle() + "} is Successfully Added");
    }

    @Transactional
    public Response deleteBlog(Long id) {
        Blog blog = blogRpy.findById(id);
        if(blog == null) {
            logger.error("The Blog with id: " + id + " Not Found");
            return Response.status(404).build();
        }

        blogRpy.delete(blog);
        logger.info("The Blog with id: " + id + " Deleted Successfully");
        return Response.status(204).build();
    }

}
