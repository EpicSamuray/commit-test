package ch.hftm.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@RequiredArgsConstructor
@NoArgsConstructor
@Entity
public class Blog implements Comparable<Blog>{

    @Id
    @GeneratedValue
    private int id;

    @NonNull
    private String title;

    @NonNull
    private String description;

    @ManyToOne(cascade = CascadeType.ALL)
    private Author author;

    @Override
    public int compareTo(Blog t) {
        if(t.getId() == getId()) {
            return 0;
        }
        return -1;
    }

}
