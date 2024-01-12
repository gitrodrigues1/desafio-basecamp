package br.com.marcos.desafiobasecamp.todo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = true)
    private String comment;

    private LocalDate createdAt;

    @ManyToOne
    @JoinColumn(name = "todo_id")
    private Todo toDo;
}
