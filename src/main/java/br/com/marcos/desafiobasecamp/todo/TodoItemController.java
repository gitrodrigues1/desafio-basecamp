package br.com.marcos.desafiobasecamp.todo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.validation.Valid;

@RequestMapping("/todo")
public class TodoItemController {

    private TodoItemRepository todoRepository;

    public TodoItemController(TodoItemRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @PostMapping
    public void createTodoItem(@Valid @RequestBody CreateTodoItemRequest request) {
        todoRepository.save(request.toModel());
    }
}
