package br.com.marcos.desafiobasecamp.todo;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.marcos.desafiobasecamp.todo.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{
    
}
