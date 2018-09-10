package ru.lember.petfriend.entities.organization;


import ru.lember.petfriend.entities.AbstractEntity;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Organization extends AbstractEntity {

    private String organizationName;

    private Address address;
    private Rating rating;
    private License license;
    private Contact contact;
    private Payment payment;

    private Map<DayOfWeek, WorkingHours> workingTime = new HashMap<>();

    /**
     * How many free spot does organization have.
     */
    private Integer capacity;


    private Description description;

    /**
     * see enum ServiceType.
     */
    private List<ServiceType> serviceTypes = new ArrayList<>();


    /**
     * list of photo urls.
     */
    private List<String> photoUrls = new ArrayList<>();

}
