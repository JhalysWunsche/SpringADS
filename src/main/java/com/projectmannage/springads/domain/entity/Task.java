package com.projectmannage.springads.domain.entity;

import com.projectmannage.springads.domain.model.TaskStatus;

public class Task {
    private String id;
    private String title;
    private String description;
    private Integer numberOfDays;
    private TaskStatus status;
    private Project project;
    private Member assignMember;
}