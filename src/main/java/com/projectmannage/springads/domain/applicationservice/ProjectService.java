package com.projectmannage.springads.domain.applicationservice;

import com.projectmannage.springads.domain.entity.Project;
import com.projectmannage.springads.infrastructure.dto.SaveProjectDataDto;
import com.projectmannage.springads.domain.model.ProjectStatus;
import com.projectmannage.springads.domain.repository.ProjectRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@RequiredArgsConstructor
public class ProjectService {
    private final ProjectRepository projectRepository;

    @Transactional
    public Project createProject(SaveProjectDataDto saveProjectData){
        Project project = Project
                .builder()
                .name(saveProjectData.getName())
                .description(saveProjectData.getDescription())
                .initialDate(saveProjectData.getInitialDate())
                .finalDate(saveProjectData.getFinalDate())
                .status(ProjectStatus.PEDDING)
                .build();
        projectRepository.save(project);
        log.info("Projeto criado com sucesso {}", project);
        return project;
    }
}
