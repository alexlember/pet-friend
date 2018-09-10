package ru.lember.petfriend.entities;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
public abstract class AbstractEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    public UUID id;
    public LocalDateTime createdDateTime;
    public LocalDateTime lastModifiedDateTime;
    public String lastModifiedBy;
}
