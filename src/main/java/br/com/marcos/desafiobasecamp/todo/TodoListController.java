package br.com.marcos.desafiobasecamp.todo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.com.marcos.desafiobasecamp.todo.entity.TodoSet;
import jakarta.validation.Valid;

import java.util.List;

@RestController
@RequestMapping("/todosets")
public class TodoListController {

    private TodoSetRepository todoRepository;

    public TodoListController(TodoSetRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<?>  createTodoList(@Valid @RequestBody CreateTodoListRequest request) {
        TodoSet todo = todoRepository.save(request.toModel());
        return ResponseEntity.ok().body(todo);
    }

    @GetMapping
    public List<TodoSet> getAllTodos() {
        return todoRepository.findAll();
    }

    @GetMapping("/{id}")
    public TodoSet getById(@PathVariable Long id) {
        return todoRepository.findById(id).orElse(null);
    }

}
