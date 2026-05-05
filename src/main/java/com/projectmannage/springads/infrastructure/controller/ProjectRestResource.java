package com.projectmannage.springads.infrastructure.controller;

import com.projectmannage.springads.applicationservice.ProjectService;
import com.projectmannage.springads.domain.entity.Project;
import com.projectmannage.springads.infrastructure.dto.SaveProjectDataDto;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.net.URI;

@RestController
@RequestMapping("/api/projects")
@AllArgsConstructor
public class ProjectRestResource {
    private final ProjectService projectService;
    public ResponseEntity<Project> createProject(@RequestBody SaveProjectDataDto saveProjectDataDto) {
        Project project = projectService.createProject(saveProjectDataDto);
        return ResponseEntity.created(URI.create("/projects"+project.getId())).body(project);
    }
}
