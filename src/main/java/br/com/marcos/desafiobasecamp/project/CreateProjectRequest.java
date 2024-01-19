package br.com.marcos.desafiobasecamp.project;

import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class CreateProjectRequest {

    @NotBlank
    private String name;

    private String description;
    private LocalDate startDate;
    private LocalDate endDate;
    private boolean hasMessageBoard;
    private boolean hasTodos;
    private boolean hasDocsAndFiles;
    private boolean hasChat;
    private boolean hasSchedule;
    private boolean hasKanban;

    public Project toModel() {
        Project p = Project.builder()
                .name(this.getName())
                .description(this.getDescription())
                .startDate(this.getStartDate())
                .endDate(this.getEndDate())
                .hasMessageBoard(this.isHasMessageBoard())
                .hasTodos(this.isHasTodos())
                .hasDocsAndFiles(this.isHasDocsAndFiles())
                .hasChat(this.isHasChat())
                .hasSchedule(this.isHasSchedule())
                .hasKanban(this.isHasKanban())
                .build();

        return p;
    }
}
