package com.projectmannage.springads.domain.applicationservice;

import com.projectmannage.springads.domain.entity.Project;
import com.projectmannage.springads.infrastructure.dto.SaveProjectDataDto;
import com.projectmannage.springads.domain.model.ProjectStatus;
import com.projectmannage.springads.domain.repository.ProjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


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
        return project;
    }
}
