package br.com.marcos.desafiobasecamp.todo;

public class CreateTodoListRequest {

    private String name;

    private String description;
    
    
    public TodoSet toModel() {
        TodoSet t = TodoSet.builder()
                .name(this.name)
                .description(this.description)
                .build();
        
        return t;
    }

    //TODO implementar inclusão de arquivos
}
