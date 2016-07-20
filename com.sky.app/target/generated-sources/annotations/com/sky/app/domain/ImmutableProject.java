package com.sky.app.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link Project}.
 * <p>
 * Use builder to create immutable instances:
 * {@code ImmutableProject.builder()}.
 */
@SuppressWarnings("all")
@Generated({"Immutables.generator", "Project"})
public final class ImmutableProject implements Project {
  private final String projectId;
  private final String projectName;
  private final String description;

  private ImmutableProject(ImmutableProject.Builder builder) {
    this.projectId = builder.projectId;
    this.projectName = builder.projectName;
    this.description = builder.description;
  }

  private ImmutableProject(
      ImmutableProject original,
      String projectId,
      String projectName,
      String description) {
    this.projectId = projectId;
    this.projectName = projectName;
    this.description = description;
  }
  
  /**
   * {@inheritDoc}
   * @return value of {@code projectId} attribute
   */
  @JsonProperty("projectId")
  @Override
  public String projectId() {
    return projectId;
  }
  
  /**
   * {@inheritDoc}
   * @return value of {@code projectName} attribute
   */
  @JsonProperty("projectName")
  @Override
  public String projectName() {
    return projectName;
  }
  
  /**
   * {@inheritDoc}
   * @return value of {@code description} attribute
   */
  @JsonProperty("description")
  @Override
  public String description() {
    return description;
  }
  
  /**
   * Copy current immutable object by setting value for {@link Project#projectId() projectId}.
   * Shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value new value for projectId
   * @return modified copy of the {@code this} object
   */
  public final ImmutableProject withProjectId(String value) {
    if (this.projectId == value) {
      return this;
    }
    String newValue = Objects.requireNonNull(value);
    return new ImmutableProject(this, newValue, this.projectName, this.description);
  }
  
  /**
   * Copy current immutable object by setting value for {@link Project#projectName() projectName}.
   * Shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value new value for projectName
   * @return modified copy of the {@code this} object
   */
  public final ImmutableProject withProjectName(String value) {
    if (this.projectName == value) {
      return this;
    }
    String newValue = Objects.requireNonNull(value);
    return new ImmutableProject(this, this.projectId, newValue, this.description);
  }
  
  /**
   * Copy current immutable object by setting value for {@link Project#description() description}.
   * Shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value new value for description
   * @return modified copy of the {@code this} object
   */
  public final ImmutableProject withDescription(String value) {
    if (this.description == value) {
      return this;
    }
    String newValue = Objects.requireNonNull(value);
    return new ImmutableProject(this, this.projectId, this.projectName, newValue);
  }
  
  /**
   * This instance is equal to instances of {@code ImmutableProject} with equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    return this == another
        || (another instanceof ImmutableProject && equalTo((ImmutableProject) another));
  }
  
  private boolean equalTo(ImmutableProject another) {
    return projectId.equals(another.projectId)
        && projectName.equals(another.projectName)
        && description.equals(another.description);
  }
  
  /**
   * Computes hash code from attributes: {@code projectId}, {@code projectName}, {@code description}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 31;
    h = h * 17 + projectId.hashCode();
    h = h * 17 + projectName.hashCode();
    h = h * 17 + description.hashCode();
    return h;
  }
  
  /**
   * Prints immutable value {@code Project{...}} with attribute values,
   * excluding any non-generated and auxiliary attributes.
   * @return string representation of value
   */
  @Override
  public String toString() {
    return new StringBuilder("Project{")
        .append("projectId=").append(projectId)
        .append(", projectName=").append(projectName)
        .append(", description=").append(description)
        .append('}').toString();
  }
  
  @JsonCreator
  public static ImmutableProject fromAllAttributes(
      @JsonProperty("projectId") String projectId,
      @JsonProperty("projectName") String projectName,
      @JsonProperty("description") String description) {
    ImmutableProject.Builder builder = ImmutableProject.builder();
    if (projectId != null) {
      builder.projectId(projectId);
    }
    if (projectName != null) {
      builder.projectName(projectName);
    }
    if (description != null) {
      builder.description(description);
    }
    return builder.build();
  }
  
  /**
   * Creates immutable copy of {@link Project}.
   * Uses accessors to get values to initialize immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @return copied immutable Project instance
   */
  public static ImmutableProject copyOf(Project instance) {
    if (instance instanceof ImmutableProject) {
      return (ImmutableProject) instance;
    }
    return ImmutableProject.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates builder for {@link com.sky.app.domain.ImmutableProject}.
   * @return new ImmutableProject builder
   */
  public static ImmutableProject.Builder builder() {
    return new ImmutableProject.Builder();
  }
  
  /**
   * Builds instances of {@link com.sky.app.domain.ImmutableProject}.
   * Initialized attributes and then invoke {@link #build()} method to create
   * immutable instance.
   * <p><em>Builder is not thread safe and generally should not be stored in field or collection,
   * but used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INITIALIZED_BITSET_ALL = 0x7;
    private static final long INITIALIZED_BIT_PROJECT_ID = 0x1L;
    private static final long INITIALIZED_BIT_PROJECT_NAME = 0x2L;
    private static final long INITIALIZED_BIT_DESCRIPTION = 0x4L;
    private long initializedBitset;
  
    private String projectId;
    private String projectName;
    private String description;
    private Builder() {}
  
    /**
     * Fill builder with attribute values from provided {@link Project} instance.
     * Regular attribute values will be overridden, i.e. replaced with ones of an instance.
     * Instance's absent optional values will not be copied (will not override current).
     * Collection elements and entries will be added, not replaced.
     * @param instance instance to copy values from
     * @return {@code this} builder for chained invocation
     */
    public final Builder from(Project instance) {
      Objects.requireNonNull(instance);
      projectId(instance.projectId());
      projectName(instance.projectName());
      description(instance.description());
      return this;
    }
  
    /**
     * Initializes value for {@link Project#projectId() projectId}.
     * @param projectId value for projectId
     * @return {@code this} builder for chained invocation
     */
    public final Builder projectId(String projectId) {
      this.projectId = Objects.requireNonNull(projectId);
      initializedBitset |= INITIALIZED_BIT_PROJECT_ID;
      return this;
    }
  
    /**
     * Initializes value for {@link Project#projectName() projectName}.
     * @param projectName value for projectName
     * @return {@code this} builder for chained invocation
     */
    public final Builder projectName(String projectName) {
      this.projectName = Objects.requireNonNull(projectName);
      initializedBitset |= INITIALIZED_BIT_PROJECT_NAME;
      return this;
    }
  
    /**
     * Initializes value for {@link Project#description() description}.
     * @param description value for description
     * @return {@code this} builder for chained invocation
     */
    public final Builder description(String description) {
      this.description = Objects.requireNonNull(description);
      initializedBitset |= INITIALIZED_BIT_DESCRIPTION;
      return this;
    }
  
    /**
     * Builds new {@link com.sky.app.domain.ImmutableProject}.
     * @return immutable instance of Project
     */
    public ImmutableProject build() {
      checkRequiredAttributes();
      return new ImmutableProject(this);
    }
  
    private boolean projectIdIsSet() {
      return (initializedBitset & INITIALIZED_BIT_PROJECT_ID) != 0;
    }
  
    private boolean projectNameIsSet() {
      return (initializedBitset & INITIALIZED_BIT_PROJECT_NAME) != 0;
    }
  
    private boolean descriptionIsSet() {
      return (initializedBitset & INITIALIZED_BIT_DESCRIPTION) != 0;
    }
  
    private void checkRequiredAttributes() {
      if (initializedBitset != INITIALIZED_BITSET_ALL) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }
  
    private String formatRequiredAttributesMessage() {
      Collection<String> attributes = new ArrayList<String>();
      if (!projectIdIsSet()) {
        attributes.add("projectId");
      }
      if (!projectNameIsSet()) {
        attributes.add("projectName");
      }
      if (!descriptionIsSet()) {
        attributes.add("description");
      }
      return "Cannot build Project, some of required attributes are not set " + attributes;
    }
  }
}
