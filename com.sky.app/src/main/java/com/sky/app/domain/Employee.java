package com.sky.app.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.sky.app.roles.JobRole;
import org.immutables.value.Value;

import java.util.Date;
import java.util.List;

@Value.Immutable
@JsonSerialize(as = ImmutableEmployee.class)
@JsonDeserialize(as = ImmutableEmployee.class)
public interface Employee {

    @JsonProperty("employeeId")
    String employeeId();

    @JsonProperty("name")
    String name();

    @JsonProperty("address")
    String address();

    @JsonProperty("dateOfBirth")
    Date dateOfBirth();

    @JsonProperty("salary")
    double salary();

    @JsonProperty("telephoneNo")
    String telephoneNo();

    @JsonProperty("workExperience")
    int workExperience();

    @JsonProperty("jobRole")
    JobRole jobrole();

    @JsonProperty("branchName")
    Branch branchName();

    @JsonProperty("qualification")
    List<String> qualification();


}
