package br.com.marcos.desafiobasecamp.project;

import java.time.LocalDate;

public class CreateProjectRequest {

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
                .name(this.name)
                .description(this.description)
                .startDate(this.startDate)
                .endDate(this.endDate)
                .hasMessageBoard(this.hasMessageBoard)
                .hasTodos(this.hasTodos)
                .hasDocsAndFiles(this.hasDocsAndFiles)
                .hasChat(this.hasChat)
                .hasSchedule(this.hasSchedule)
                .hasKanban(this.hasKanban)
                .build();

        return p;
    }
}
