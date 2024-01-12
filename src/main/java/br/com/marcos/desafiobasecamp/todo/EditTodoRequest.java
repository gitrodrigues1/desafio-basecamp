package br.com.marcos.desafiobasecamp.todo;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import br.com.marcos.desafiobasecamp.person.Person;
import br.com.marcos.desafiobasecamp.todo.entity.Comment;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class EditTodoRequest {
    
    private String name;
    private Set<Person> assignedTo;
    private Set<Person> notifyTo;
    private LocalDate dueOn;
    private String notes;  //[ ] Pensar em outra maneira de gravar textos grandes
    private List<Comment> comments;
}
