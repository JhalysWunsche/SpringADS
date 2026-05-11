package com.projectmannage.springads.infrastructure.dto;

import com.projectmannage.springads.domain.model.ProjectStatus;

import java.time.LocalDate;

public class ProjectDto {
    private final String id;
    private final String name;
    private final String description;
    private final LocalDate initialDate;
    private final LocalDate fialDate;
    private final ProjectStatus status;

}
