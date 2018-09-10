package ru.lember.petfriend.entities.organization;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
public class License {
    private String licenseNumber;
    private LocalDateTime startRegistrationDate;
    private LocalDateTime endRegistrationDate;
    /**
     * available licenses list
     */
    private List<String> licenses = new ArrayList<>();
}
