package br.com.marcos.desafiobasecamp.todo.entity;

import br.com.marcos.desafiobasecamp.person.Person;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
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
@Builder
@Entity
public class TodoItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String name;

    @ManyToMany
    @JoinTable(name = "todo_assigned_to", 
               joinColumns = @JoinColumn(name = "todo_id"),
               inverseJoinColumns = @JoinColumn(name = "person_id"))
    private Set<Person> assignedTo = new HashSet<>();

    @ManyToMany
    @JoinTable(name = "todo_notify_to", 
               joinColumns = @JoinColumn(name = "todo_id"),
               inverseJoinColumns = @JoinColumn(name = "person_id"))
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
