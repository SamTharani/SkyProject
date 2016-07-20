package com.sky.app.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableBranch.class)
@JsonSerialize(as = ImmutableBranch.class)
public interface Branch {

    @JsonProperty("branchName")
    String branchName();

    @JsonProperty("identificationCode")
    String identificationCode();

    @JsonProperty("telephoneNo")
    String telephoneNo();

    @JsonProperty("branchAddress")
    String branchAddress();

    @JsonProperty("branchEmail")
    String branchEmail();

}
