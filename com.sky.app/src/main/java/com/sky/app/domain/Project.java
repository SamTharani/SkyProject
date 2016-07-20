package com.sky.app.domain;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableProject.class)
@JsonSerialize(as = ImmutableProject.class)
public interface Project {

    @JsonProperty("projectId")
    String projectId();

    @JsonProperty("projectName")
    String projectName();

    @JsonProperty("description")
    String description();
}
