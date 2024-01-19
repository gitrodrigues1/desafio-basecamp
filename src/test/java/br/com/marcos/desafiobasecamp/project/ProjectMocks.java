package br.com.marcos.desafiobasecamp.project;

import java.time.LocalDate;

public class ProjectMocks {
    
    public static final Project PROJECT = Project.builder()
            .id(1L)
            .name("Name")
            .description("Descr")
            .startDate(LocalDate.now())
            .endDate(LocalDate.of(2024, 01, 30))
            .hasMessageBoard(false)
            .hasTodos(false)
            .hasDocsAndFiles(false)
            .hasChat(false)
            .hasSchedule(false)
            .hasKanban(false)
            .build();
}
