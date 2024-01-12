package br.com.marcos.desafiobasecamp.todo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<TodoSet, Long> {
}
