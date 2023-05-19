package ch.hftm.resource;


import ch.hftm.model.Author;
import ch.hftm.repository.AuthorRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/author")
public class AuthorResource {

    @Inject
    private AuthorRepository authRepo;
    
    @GET
    @Path("/{name}")
    public Author getAuthor(String name) {
        return authRepo.findAuthorByNachname(name);
    }
}
