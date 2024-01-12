package br.com.marcos.desafiobasecamp.todo;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.marcos.desafiobasecamp.todo.entity.TodoSet;

public interface TodoSetRepository extends JpaRepository<TodoSet, Long> {
}
