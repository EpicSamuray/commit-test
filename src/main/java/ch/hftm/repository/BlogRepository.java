package ch.hftm.repository;

import ch.hftm.model.Blog;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import lombok.NoArgsConstructor;

@ApplicationScoped
@NoArgsConstructor
public class BlogRepository implements PanacheRepository<Blog>{

    
}
