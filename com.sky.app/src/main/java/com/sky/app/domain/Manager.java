package com.sky.app.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

import java.util.Date;

@Value.Immutable
@JsonDeserialize(as = ImmutableManager.class)
@JsonSerialize(as = ImmutableManager.class)
public interface Manager {


    @JsonProperty("name")
    String name();

    @JsonProperty("branchName")
    Branch branchName();

    @JsonProperty("joinDate")
    Date joinDate();

    @JsonProperty("employeeId")
    Employee employeeId();
}
