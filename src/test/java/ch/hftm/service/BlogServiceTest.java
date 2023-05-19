package ch.hftm.service;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import jakarta.inject.Inject;

import ch.hftm.model.Blog;
import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class BlogServiceTest {

    @Inject
    private BlogService blogService;

    private static Blog blog;

    private boolean isBlogsEmpty;
    private boolean isBlogsAdded;

    @BeforeAll
    static void initialiseObjectBlogService() {
        blog = new Blog("Testing Title", "Lorem Ipsum dolor");
    }

    @Test
    void testGetBlog() {
        isBlogsEmpty = blogService.getBlogs().isEmpty();
        assertFalse(isBlogsEmpty);
    
    }

    @Test
    void testSetBlog() {
        blogService.addBlog(blog);
        isBlogsAdded = blogService.getBlogs().contains(blog);
        assertFalse(isBlogsAdded);

    }

}
