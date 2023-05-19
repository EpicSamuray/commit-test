package ch.hftm.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
public class Author{
    @Id
    @GeneratedValue
    private int id;

    @NonNull
    private String nachname;

    @NonNull
    private String vorname;

    @NonNull
    private LocalDate geburtstag;

    @NonNull
    private String nickname;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Blog> blog;

}
