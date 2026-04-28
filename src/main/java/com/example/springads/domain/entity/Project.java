package com.example.springads.domain.entity;

import com.example.springads.model.ProjectStatus;
import lombok.*;

import java.time.LocalDate;
import java.util.Objects;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class Project {

    private String id;
    private String name;
    private String description;
    private LocalDate initial_date;
    private LocalDate final_date;
    private ProjectStatus status;

}