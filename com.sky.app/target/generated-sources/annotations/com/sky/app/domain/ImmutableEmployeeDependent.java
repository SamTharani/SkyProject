package com.sky.app.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.sky.app.roles.Relation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link EmployeeDependent}.
 * <p>
 * Use builder to create immutable instances:
 * {@code ImmutableEmployeeDependent.builder()}.
 */
@SuppressWarnings("all")
@Generated({"Immutables.generator", "EmployeeDependent"})
public final class ImmutableEmployeeDependent implements EmployeeDependent {
  private final String name;
  private final Date dateOfBirth;
  private final Relation relationship;
  private final Employee employeeId;

  private ImmutableEmployeeDependent(ImmutableEmployeeDependent.Builder builder) {
    this.name = builder.name;
    this.dateOfBirth = builder.dateOfBirth;
    this.relationship = builder.relationship;
    this.employeeId = builder.employeeId;
  }

  private ImmutableEmployeeDependent(
      ImmutableEmployeeDependent original,
      String name,
      Date dateOfBirth,
      Relation relationship,
      Employee employeeId) {
    this.name = name;
    this.dateOfBirth = dateOfBirth;
    this.relationship = relationship;
    this.employeeId = employeeId;
  }
  
  /**
   * {@inheritDoc}
   * @return value of {@code name} attribute
   */
  @JsonProperty("name")
  @Override
  public String name() {
    return name;
  }
  
  /**
   * {@inheritDoc}
   * @return value of {@code dateOfBirth} attribute
   */
  @JsonProperty("dateOfBirth")
  @Override
  public Date dateOfBirth() {
    return dateOfBirth;
  }
  
  /**
   * {@inheritDoc}
   * @return value of {@code relationship} attribute
   */
  @JsonProperty("relationship")
  @Override
  public Relation relationship() {
    return relationship;
  }
  
  /**
   * {@inheritDoc}
   * @return value of {@code employeeId} attribute
   */
  @JsonProperty("employeeId")
  @Override
  public Employee employeeId() {
    return employeeId;
  }
  
  /**
   * Copy current immutable object by setting value for {@link EmployeeDependent#name() name}.
   * Shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value new value for name
   * @return modified copy of the {@code this} object
   */
  public final ImmutableEmployeeDependent withName(String value) {
    if (this.name == value) {
      return this;
    }
    String newValue = Objects.requireNonNull(value);
    return new ImmutableEmployeeDependent(this, newValue, this.dateOfBirth, this.relationship, this.employeeId);
  }
  
  /**
   * Copy current immutable object by setting value for {@link EmployeeDependent#dateOfBirth() dateOfBirth}.
   * Shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value new value for dateOfBirth
   * @return modified copy of the {@code this} object
   */
  public final ImmutableEmployeeDependent withDateOfBirth(Date value) {
    if (this.dateOfBirth == value) {
      return this;
    }
    Date newValue = Objects.requireNonNull(value);
    return new ImmutableEmployeeDependent(this, this.name, newValue, this.relationship, this.employeeId);
  }
  
  /**
   * Copy current immutable object by setting value for {@link EmployeeDependent#relationship() relationship}.
   * Shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value new value for relationship
   * @return modified copy of the {@code this} object
   */
  public final ImmutableEmployeeDependent withRelationship(Relation value) {
    if (this.relationship == value) {
      return this;
    }
    Relation newValue = Objects.requireNonNull(value);
    return new ImmutableEmployeeDependent(this, this.name, this.dateOfBirth, newValue, this.employeeId);
  }
  
  /**
   * Copy current immutable object by setting value for {@link EmployeeDependent#employeeId() employeeId}.
   * Shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value new value for employeeId
   * @return modified copy of the {@code this} object
   */
  public final ImmutableEmployeeDependent withEmployeeId(Employee value) {
    if (this.employeeId == value) {
      return this;
    }
    Employee newValue = Objects.requireNonNull(value);
    return new ImmutableEmployeeDependent(this, this.name, this.dateOfBirth, this.relationship, newValue);
  }
  
  /**
   * This instance is equal to instances of {@code ImmutableEmployeeDependent} with equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    return this == another
        || (another instanceof ImmutableEmployeeDependent && equalTo((ImmutableEmployeeDependent) another));
  }
  
  private boolean equalTo(ImmutableEmployeeDependent another) {
    return name.equals(another.name)
        && dateOfBirth.equals(another.dateOfBirth)
        && relationship.equals(another.relationship)
        && employeeId.equals(another.employeeId);
  }
  
  /**
   * Computes hash code from attributes: {@code name}, {@code dateOfBirth}, {@code relationship}, {@code employeeId}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 31;
    h = h * 17 + name.hashCode();
    h = h * 17 + dateOfBirth.hashCode();
    h = h * 17 + relationship.hashCode();
    h = h * 17 + employeeId.hashCode();
    return h;
  }
  
  /**
   * Prints immutable value {@code EmployeeDependent{...}} with attribute values,
   * excluding any non-generated and auxiliary attributes.
   * @return string representation of value
   */
  @Override
  public String toString() {
    return new StringBuilder("EmployeeDependent{")
        .append("name=").append(name)
        .append(", dateOfBirth=").append(dateOfBirth)
        .append(", relationship=").append(relationship)
        .append(", employeeId=").append(employeeId)
        .append('}').toString();
  }
  
  @JsonCreator
  public static ImmutableEmployeeDependent fromAllAttributes(
      @JsonProperty("name") String name,
      @JsonProperty("dateOfBirth") Date dateOfBirth,
      @JsonProperty("relationship") Relation relationship,
      @JsonProperty("employeeId") Employee employeeId) {
    ImmutableEmployeeDependent.Builder builder = ImmutableEmployeeDependent.builder();
    if (name != null) {
      builder.name(name);
    }
    if (dateOfBirth != null) {
      builder.dateOfBirth(dateOfBirth);
    }
    if (relationship != null) {
      builder.relationship(relationship);
    }
    if (employeeId != null) {
      builder.employeeId(employeeId);
    }
    return builder.build();
  }
  
  /**
   * Creates immutable copy of {@link EmployeeDependent}.
   * Uses accessors to get values to initialize immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @return copied immutable EmployeeDependent instance
   */
  public static ImmutableEmployeeDependent copyOf(EmployeeDependent instance) {
    if (instance instanceof ImmutableEmployeeDependent) {
      return (ImmutableEmployeeDependent) instance;
    }
    return ImmutableEmployeeDependent.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates builder for {@link com.sky.app.domain.ImmutableEmployeeDependent}.
   * @return new ImmutableEmployeeDependent builder
   */
  public static ImmutableEmployeeDependent.Builder builder() {
    return new ImmutableEmployeeDependent.Builder();
  }
  
  /**
   * Builds instances of {@link com.sky.app.domain.ImmutableEmployeeDependent}.
   * Initialized attributes and then invoke {@link #build()} method to create
   * immutable instance.
   * <p><em>Builder is not thread safe and generally should not be stored in field or collection,
   * but used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INITIALIZED_BITSET_ALL = 0xf;
    private static final long INITIALIZED_BIT_NAME = 0x1L;
    private static final long INITIALIZED_BIT_DATE_OF_BIRTH = 0x2L;
    private static final long INITIALIZED_BIT_RELATIONSHIP = 0x4L;
    private static final long INITIALIZED_BIT_EMPLOYEE_ID = 0x8L;
    private long initializedBitset;
  
    private String name;
    private Date dateOfBirth;
    private Relation relationship;
    private Employee employeeId;
    private Builder() {}
  
    /**
     * Fill builder with attribute values from provided {@link EmployeeDependent} instance.
     * Regular attribute values will be overridden, i.e. replaced with ones of an instance.
     * Instance's absent optional values will not be copied (will not override current).
     * Collection elements and entries will be added, not replaced.
     * @param instance instance to copy values from
     * @return {@code this} builder for chained invocation
     */
    public final Builder from(EmployeeDependent instance) {
      Objects.requireNonNull(instance);
      name(instance.name());
      dateOfBirth(instance.dateOfBirth());
      relationship(instance.relationship());
      employeeId(instance.employeeId());
      return this;
    }
  
    /**
     * Initializes value for {@link EmployeeDependent#name() name}.
     * @param name value for name
     * @return {@code this} builder for chained invocation
     */
    public final Builder name(String name) {
      this.name = Objects.requireNonNull(name);
      initializedBitset |= INITIALIZED_BIT_NAME;
      return this;
    }
  
    /**
     * Initializes value for {@link EmployeeDependent#dateOfBirth() dateOfBirth}.
     * @param dateOfBirth value for dateOfBirth
     * @return {@code this} builder for chained invocation
     */
    public final Builder dateOfBirth(Date dateOfBirth) {
      this.dateOfBirth = Objects.requireNonNull(dateOfBirth);
      initializedBitset |= INITIALIZED_BIT_DATE_OF_BIRTH;
      return this;
    }
  
    /**
     * Initializes value for {@link EmployeeDependent#relationship() relationship}.
     * @param relationship value for relationship
     * @return {@code this} builder for chained invocation
     */
    public final Builder relationship(Relation relationship) {
      this.relationship = Objects.requireNonNull(relationship);
      initializedBitset |= INITIALIZED_BIT_RELATIONSHIP;
      return this;
    }
  
    /**
     * Initializes value for {@link EmployeeDependent#employeeId() employeeId}.
     * @param employeeId value for employeeId
     * @return {@code this} builder for chained invocation
     */
    public final Builder employeeId(Employee employeeId) {
      this.employeeId = Objects.requireNonNull(employeeId);
      initializedBitset |= INITIALIZED_BIT_EMPLOYEE_ID;
      return this;
    }
  
    /**
     * Builds new {@link com.sky.app.domain.ImmutableEmployeeDependent}.
     * @return immutable instance of EmployeeDependent
     */
    public ImmutableEmployeeDependent build() {
      checkRequiredAttributes();
      return new ImmutableEmployeeDependent(this);
    }
  
    private boolean nameIsSet() {
      return (initializedBitset & INITIALIZED_BIT_NAME) != 0;
    }
  
    private boolean dateOfBirthIsSet() {
      return (initializedBitset & INITIALIZED_BIT_DATE_OF_BIRTH) != 0;
    }
  
    private boolean relationshipIsSet() {
      return (initializedBitset & INITIALIZED_BIT_RELATIONSHIP) != 0;
    }
  
    private boolean employeeIdIsSet() {
      return (initializedBitset & INITIALIZED_BIT_EMPLOYEE_ID) != 0;
    }
  
    private void checkRequiredAttributes() {
      if (initializedBitset != INITIALIZED_BITSET_ALL) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }
  
    private String formatRequiredAttributesMessage() {
      Collection<String> attributes = new ArrayList<String>();
      if (!nameIsSet()) {
        attributes.add("name");
      }
      if (!dateOfBirthIsSet()) {
        attributes.add("dateOfBirth");
      }
      if (!relationshipIsSet()) {
        attributes.add("relationship");
      }
      if (!employeeIdIsSet()) {
        attributes.add("employeeId");
      }
      return "Cannot build EmployeeDependent, some of required attributes are not set " + attributes;
    }
  }
}
