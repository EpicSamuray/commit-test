package ch.hftm.resource;

import ch.hftm.model.Blog;
import ch.hftm.service.BlogService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

import java.util.List;

@Path("/blog")
@ApplicationScoped
public class BlogResource {
    @Inject
    BlogService blogService;
    
    @GET
    public List<Blog> blog() {
        return this.blogService.getBlogs();
    }

    @POST
    public void addBlog(Blog blog) {
        this.blogService.addBlog(blog);
    }

}
