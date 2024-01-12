package br.com.marcos.desafiobasecamp.todo;

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

    //TODO implementar inclusão de arquivos
}
