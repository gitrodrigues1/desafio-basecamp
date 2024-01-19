package br.com.marcos.desafiobasecamp.project;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/project")
public class ProjectController {

    private ProjectRepository projectRepository;

    public ProjectController(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProject(@Valid @RequestBody CreateProjectRequest request) {
        projectRepository.save(request.toModel());
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateProject(@Valid @PathVariable Long id, UpdateProjectRequest request) {
        return projectRepository.findById(id)
                .map(project -> ResponseEntity.ok().body("Updated with success."))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

}
