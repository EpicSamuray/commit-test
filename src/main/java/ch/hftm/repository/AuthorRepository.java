package ch.hftm.repository;

import ch.hftm.model.Author;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;
import lombok.NoArgsConstructor;

@ApplicationScoped
@NoArgsConstructor
public class AuthorRepository implements PanacheRepository<Author>{

    public Author findAuthorByNachname(String nachname) {
        return find("nachname", nachname).firstResult();
    }

    @Transactional
    public void addAuthor(Author author) {
        persist(author);
    }



}