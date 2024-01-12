package br.com.marcos.desafiobasecamp.todo;

import br.com.marcos.desafiobasecamp.todo.entity.TodoSet;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CreateTodoListRequest {

    private String name;

    private String description;
    
    
    public TodoSet toModel() {

        return TodoSet.builder()
                .name(this.getName())
                .description(this.getDescription())
                .build();
    }

    //[ ] implementar inclusão de arquivos
}
