package com.sky.app.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link Manager}.
 * <p>
 * Use builder to create immutable instances:
 * {@code ImmutableManager.builder()}.
 */
@SuppressWarnings("all")
@Generated({"Immutables.generator", "Manager"})
public final class ImmutableManager implements Manager {
  private final String name;
  private final Branch branchName;
  private final Date joinDate;
  private final Employee employeeId;

  private ImmutableManager(ImmutableManager.Builder builder) {
    this.name = builder.name;
    this.branchName = builder.branchName;
    this.joinDate = builder.joinDate;
    this.employeeId = builder.employeeId;
  }

  private ImmutableManager(
      ImmutableManager original,
      String name,
      Branch branchName,
      Date joinDate,
      Employee employeeId) {
    this.name = name;
    this.branchName = branchName;
    this.joinDate = joinDate;
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
   * @return value of {@code branchName} attribute
   */
  @JsonProperty("branchName")
  @Override
  public Branch branchName() {
    return branchName;
  }
  
  /**
   * {@inheritDoc}
   * @return value of {@code joinDate} attribute
   */
  @JsonProperty("joinDate")
  @Override
  public Date joinDate() {
    return joinDate;
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
   * Copy current immutable object by setting value for {@link Manager#name() name}.
   * Shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value new value for name
   * @return modified copy of the {@code this} object
   */
  public final ImmutableManager withName(String value) {
    if (this.name == value) {
      return this;
    }
    String newValue = Objects.requireNonNull(value);
    return new ImmutableManager(this, newValue, this.branchName, this.joinDate, this.employeeId);
  }
  
  /**
   * Copy current immutable object by setting value for {@link Manager#branchName() branchName}.
   * Shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value new value for branchName
   * @return modified copy of the {@code this} object
   */
  public final ImmutableManager withBranchName(Branch value) {
    if (this.branchName == value) {
      return this;
    }
    Branch newValue = Objects.requireNonNull(value);
    return new ImmutableManager(this, this.name, newValue, this.joinDate, this.employeeId);
  }
  
  /**
   * Copy current immutable object by setting value for {@link Manager#joinDate() joinDate}.
   * Shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value new value for joinDate
   * @return modified copy of the {@code this} object
   */
  public final ImmutableManager withJoinDate(Date value) {
    if (this.joinDate == value) {
      return this;
    }
    Date newValue = Objects.requireNonNull(value);
    return new ImmutableManager(this, this.name, this.branchName, newValue, this.employeeId);
  }
  
  /**
   * Copy current immutable object by setting value for {@link Manager#employeeId() employeeId}.
   * Shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value new value for employeeId
   * @return modified copy of the {@code this} object
   */
  public final ImmutableManager withEmployeeId(Employee value) {
    if (this.employeeId == value) {
      return this;
    }
    Employee newValue = Objects.requireNonNull(value);
    return new ImmutableManager(this, this.name, this.branchName, this.joinDate, newValue);
  }
  
  /**
   * This instance is equal to instances of {@code ImmutableManager} with equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    return this == another
        || (another instanceof ImmutableManager && equalTo((ImmutableManager) another));
  }
  
  private boolean equalTo(ImmutableManager another) {
    return name.equals(another.name)
        && branchName.equals(another.branchName)
        && joinDate.equals(another.joinDate)
        && employeeId.equals(another.employeeId);
  }
  
  /**
   * Computes hash code from attributes: {@code name}, {@code branchName}, {@code joinDate}, {@code employeeId}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 31;
    h = h * 17 + name.hashCode();
    h = h * 17 + branchName.hashCode();
    h = h * 17 + joinDate.hashCode();
    h = h * 17 + employeeId.hashCode();
    return h;
  }
  
  /**
   * Prints immutable value {@code Manager{...}} with attribute values,
   * excluding any non-generated and auxiliary attributes.
   * @return string representation of value
   */
  @Override
  public String toString() {
    return new StringBuilder("Manager{")
        .append("name=").append(name)
        .append(", branchName=").append(branchName)
        .append(", joinDate=").append(joinDate)
        .append(", employeeId=").append(employeeId)
        .append('}').toString();
  }
  
  @JsonCreator
  public static ImmutableManager fromAllAttributes(
      @JsonProperty("name") String name,
      @JsonProperty("branchName") Branch branchName,
      @JsonProperty("joinDate") Date joinDate,
      @JsonProperty("employeeId") Employee employeeId) {
    ImmutableManager.Builder builder = ImmutableManager.builder();
    if (name != null) {
      builder.name(name);
    }
    if (branchName != null) {
      builder.branchName(branchName);
    }
    if (joinDate != null) {
      builder.joinDate(joinDate);
    }
    if (employeeId != null) {
      builder.employeeId(employeeId);
    }
    return builder.build();
  }
  
  /**
   * Creates immutable copy of {@link Manager}.
   * Uses accessors to get values to initialize immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @return copied immutable Manager instance
   */
  public static ImmutableManager copyOf(Manager instance) {
    if (instance instanceof ImmutableManager) {
      return (ImmutableManager) instance;
    }
    return ImmutableManager.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates builder for {@link com.sky.app.domain.ImmutableManager}.
   * @return new ImmutableManager builder
   */
  public static ImmutableManager.Builder builder() {
    return new ImmutableManager.Builder();
  }
  
  /**
   * Builds instances of {@link com.sky.app.domain.ImmutableManager}.
   * Initialized attributes and then invoke {@link #build()} method to create
   * immutable instance.
   * <p><em>Builder is not thread safe and generally should not be stored in field or collection,
   * but used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INITIALIZED_BITSET_ALL = 0xf;
    private static final long INITIALIZED_BIT_NAME = 0x1L;
    private static final long INITIALIZED_BIT_BRANCH_NAME = 0x2L;
    private static final long INITIALIZED_BIT_JOIN_DATE = 0x4L;
    private static final long INITIALIZED_BIT_EMPLOYEE_ID = 0x8L;
    private long initializedBitset;
  
    private String name;
    private Branch branchName;
    private Date joinDate;
    private Employee employeeId;
    private Builder() {}
  
    /**
     * Fill builder with attribute values from provided {@link Manager} instance.
     * Regular attribute values will be overridden, i.e. replaced with ones of an instance.
     * Instance's absent optional values will not be copied (will not override current).
     * Collection elements and entries will be added, not replaced.
     * @param instance instance to copy values from
     * @return {@code this} builder for chained invocation
     */
    public final Builder from(Manager instance) {
      Objects.requireNonNull(instance);
      name(instance.name());
      branchName(instance.branchName());
      joinDate(instance.joinDate());
      employeeId(instance.employeeId());
      return this;
    }
  
    /**
     * Initializes value for {@link Manager#name() name}.
     * @param name value for name
     * @return {@code this} builder for chained invocation
     */
    public final Builder name(String name) {
      this.name = Objects.requireNonNull(name);
      initializedBitset |= INITIALIZED_BIT_NAME;
      return this;
    }
  
    /**
     * Initializes value for {@link Manager#branchName() branchName}.
     * @param branchName value for branchName
     * @return {@code this} builder for chained invocation
     */
    public final Builder branchName(Branch branchName) {
      this.branchName = Objects.requireNonNull(branchName);
      initializedBitset |= INITIALIZED_BIT_BRANCH_NAME;
      return this;
    }
  
    /**
     * Initializes value for {@link Manager#joinDate() joinDate}.
     * @param joinDate value for joinDate
     * @return {@code this} builder for chained invocation
     */
    public final Builder joinDate(Date joinDate) {
      this.joinDate = Objects.requireNonNull(joinDate);
      initializedBitset |= INITIALIZED_BIT_JOIN_DATE;
      return this;
    }
  
    /**
     * Initializes value for {@link Manager#employeeId() employeeId}.
     * @param employeeId value for employeeId
     * @return {@code this} builder for chained invocation
     */
    public final Builder employeeId(Employee employeeId) {
      this.employeeId = Objects.requireNonNull(employeeId);
      initializedBitset |= INITIALIZED_BIT_EMPLOYEE_ID;
      return this;
    }
  
    /**
     * Builds new {@link com.sky.app.domain.ImmutableManager}.
     * @return immutable instance of Manager
     */
    public ImmutableManager build() {
      checkRequiredAttributes();
      return new ImmutableManager(this);
    }
  
    private boolean nameIsSet() {
      return (initializedBitset & INITIALIZED_BIT_NAME) != 0;
    }
  
    private boolean branchNameIsSet() {
      return (initializedBitset & INITIALIZED_BIT_BRANCH_NAME) != 0;
    }
  
    private boolean joinDateIsSet() {
      return (initializedBitset & INITIALIZED_BIT_JOIN_DATE) != 0;
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
      if (!branchNameIsSet()) {
        attributes.add("branchName");
      }
      if (!joinDateIsSet()) {
        attributes.add("joinDate");
      }
      if (!employeeIdIsSet()) {
        attributes.add("employeeId");
      }
      return "Cannot build Manager, some of required attributes are not set " + attributes;
    }
  }
}
