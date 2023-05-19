package ch.hftm.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import jakarta.inject.Inject;

import ch.hftm.model.Author;
import ch.hftm.model.Blog;
import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class AuthorRepositoryTest {
    @Inject
    private AuthorRepository authorRepo;

    private static Author author;

    @BeforeAll
    static void initialize() {
        LocalDate geburtstag = LocalDate.of(1996, Month.JUNE, 16);
        author = new Author("Hans", "Kartoffel", geburtstag, "xXProGramming96Xx");
    }

    @Test
    void testAddAndFindByName() {
       authorRepo.addAuthor(author);
       Author authorResult = authorRepo.findAuthorByNachname("Hans");
       assertEquals("Hans", authorResult.getNachname());
    }

    @Test
    void test() {
        LocalDate birthD = LocalDate.of(1996, Month.JUNE, 16);
        Author auth = new Author();
        List<Blog> blogs = new ArrayList<>();
        blogs.add(new Blog("test", "hallo"));
        blogs.add(new Blog("Moin", "dasra"));
        auth.setNachname("Felice");
        auth.setVorname("Pettinaro");
        auth.setGeburtstag(birthD);
        auth.setNickname("EpicSamuray");
        auth.setBlog(blogs);
        authorRepo.addAuthor(auth);
        Author auth2 = authorRepo.findAuthorByNachname("Felice");
        System.out.println(auth2.getBlog());
    }


}
