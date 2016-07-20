package com.sky.app.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.sky.app.roles.Relation;
import org.immutables.value.Value;

import java.util.Date;

@Value.Immutable
@JsonDeserialize(as = ImmutableEmployeeDependent.class)
@JsonSerialize(as = ImmutableEmployeeDependent.class)
public interface EmployeeDependent {

    @JsonProperty("name")
    String name();

    @JsonProperty("dateOfBirth")
    Date dateOfBirth();

    @JsonProperty("relationship")
    Relation relationship();

    @JsonProperty("employeeId")
    Employee employeeId();

}
