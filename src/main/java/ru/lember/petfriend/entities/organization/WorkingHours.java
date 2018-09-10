package ru.lember.petfriend.entities.organization;

import lombok.Data;
import lombok.NonNull;

import java.time.LocalTime;
import java.util.Objects;

@Data
public class WorkingHours {

    private LocalTime startWorkingTime;
    private LocalTime endWorkingTime;

    public WorkingHours(@NonNull LocalTime startWorkingTime, @NonNull LocalTime endWorkingTime) {

        Objects.requireNonNull(startWorkingTime, "startWorkingTime");
        Objects.requireNonNull(endWorkingTime, "endWorkingTime");

        this.startWorkingTime = startWorkingTime;
        this.endWorkingTime = endWorkingTime;
    }
}
