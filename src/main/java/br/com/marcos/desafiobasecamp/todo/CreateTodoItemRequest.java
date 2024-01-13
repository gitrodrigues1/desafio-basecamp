package br.com.marcos.desafiobasecamp.todo;

import br.com.marcos.desafiobasecamp.person.Person;
import br.com.marcos.desafiobasecamp.todo.entity.TodoItem;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class CreateTodoItemRequest {

	@NotEmpty
	private String name;

	Set<Person> assignedTo;
	Set<Person> notifyTo;
	LocalDate dueOn;
	String notes;

	public TodoItem toModel() {
		TodoItem todoItem = TodoItem.builder()
			.name(this.getName())
			.assignedTo(this.getAssignedTo())
			.notifyTo(this.getNotifyTo())
			.dueOn(this.getDueOn())
			.notes(this.getNotes())
			.build();

		return todoItem;
	}

}
