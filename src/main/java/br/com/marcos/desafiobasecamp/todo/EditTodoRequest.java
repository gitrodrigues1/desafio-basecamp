package br.com.marcos.desafiobasecamp.todo;

import br.com.marcos.desafiobasecamp.person.Person;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public record EditTodoRequest(
        String name,
        Set<Person> assignedTo,
        Set<Person> notifyTo,
        LocalDate dueOn,
        String notes,
        List<Comment> comments

        ) {
}
