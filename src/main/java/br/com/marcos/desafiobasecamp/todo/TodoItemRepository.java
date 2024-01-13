package br.com.marcos.desafiobasecamp.todo;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.marcos.desafiobasecamp.todo.entity.TodoItem;

public interface TodoItemRepository extends JpaRepository<TodoItem, Long>{
    
}
