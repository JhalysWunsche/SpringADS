package com.projectmannage.springads.infrastructure.dto;

import lombok.Data;
import java.time.LocalDate;

@Data
public class SaveProjectDataDto {
    private final String name;
    private final String description;
    private final LocalDate initialDate;
    private final LocalDate finalDate;
    private final String status;
}
