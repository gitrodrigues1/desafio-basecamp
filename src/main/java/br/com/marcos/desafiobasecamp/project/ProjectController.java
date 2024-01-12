package br.com.marcos.desafiobasecamp.project;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/project")
public class ProjectController {

    private ProjectRepository projectRepository;

    public ProjectController(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProject(@RequestBody CreateProjectRequest request) {
        projectRepository.save(request.toModel());
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateProject(@PathVariable Long id, UpdateProjectRequest request) {
        try {
            projectRepository.findById(id)
                    .ifPresent(p -> projectRepository.save(request.toModel()));

            return ResponseEntity.ok().body("Atualizado com sucesso");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
