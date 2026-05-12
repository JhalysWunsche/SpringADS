package com.projectmannage.springads.infrastructure.controller;

import com.projectmannage.springads.domain.applicationservice.ProjectService;
import com.projectmannage.springads.domain.entity.Project;
import com.projectmannage.springads.infrastructure.dto.SaveProjectDataDto;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.net.URI;
import com.projectmannage.springads.infrastructure.dto.ProjectDto;

import static com.projectmannage.springads.infrastructure.constant.RestConstants.*;

@RestController
@RequestMapping("/projects")
@AllArgsConstructor
public class ProjectRestResource {
    private  final ProjectService projectService;

    @PostMapping
    public ResponseEntity<ProjectDto> createProject(@RequestBody SaveProjectDataDto saveProjectDataDTO){
        Project project = projectService.createProject(saveProjectDataDTO);
        return ResponseEntity.created(URI.create(PATH_PROJECTS + "/" + project.getId())).body(ProjectDto.create(project));
    }
}
