package br.com.marcos.desafiobasecamp.todo.entity;

import br.com.marcos.desafiobasecamp.person.Person;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String name;

    @OneToMany(mappedBy = "assigned_person_id")
    private Set<Person> assignedTo = new HashSet<>();

    @OneToMany(mappedBy = "notified_person_id")
    private Set<Person> notifyTo = new HashSet<>();

    private LocalDate dueOn;

    private String notes;

    private File attachedFile;      //[ ] implementar manipulação de arquivos

    @OneToMany(mappedBy = "toDo")
    private List<Comment> comments = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "todoset_id")
    private TodoSet todoSet;

    private LocalDate createdAt;
}
