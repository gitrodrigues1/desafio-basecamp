package br.com.marcos.desafiobasecamp.todo;

import br.com.marcos.desafiobasecamp.person.Person;
import jakarta.persistence.Column;

import java.time.LocalDate;
import java.util.Set;

public record CreateTodoRequest(
        String name,
        @Column(nullable = true)
        Set<Person> assignedTo,
        @Column(nullable = true)
        Set<Person> notifyTo,
        @Column(nullable = true)
        LocalDate dueOn,
        String notes


        ) {
}
