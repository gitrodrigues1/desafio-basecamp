package br.com.marcos.desafiobasecamp.project;

import lombok.Getter;

import java.time.LocalDate;

@Getter
public class UpdateProjectRequest {

    private String name;
    private String description;
    private LocalDate startDate;
    private LocalDate endDate;

    //TODO criar alterações de permissões de acesso

    public Project toModel() {
        Project p = Project.builder()
                .name(this.getName())
                .description(this.getDescription())
                .startDate(this.getStartDate())
                .endDate(this.getEndDate())
                .build();

        return p;
    }
}
