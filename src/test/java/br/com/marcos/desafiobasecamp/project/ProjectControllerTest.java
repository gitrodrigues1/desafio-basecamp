package br.com.marcos.desafiobasecamp.project;

import static org.mockito.Mockito.when;

import org.assertj.core.api.Assertions;

import static br.com.marcos.desafiobasecamp.project.ProjectMocks.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ProjectControllerTest {

    @Mock
    private ProjectRepository projectRepository;

    @Test
    public void createList_WithValidData_ReturnProject() {
        when(projectRepository.save(PROJECT)).thenReturn(PROJECT);

        Project sut = projectRepository.save(PROJECT);

        Assertions.assertThat(sut).isEqualTo(PROJECT);
    }
    
}
