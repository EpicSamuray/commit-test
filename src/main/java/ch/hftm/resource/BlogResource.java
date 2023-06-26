package ch.hftm.resource;

import ch.hftm.model.Blog;
import ch.hftm.service.BlogService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;

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

    @DELETE
    @Path("/{id}")
    public Response deleteBlog(@PathParam("id") Long id) {
        return this.blogService.deleteBlog(id);
    }


}
