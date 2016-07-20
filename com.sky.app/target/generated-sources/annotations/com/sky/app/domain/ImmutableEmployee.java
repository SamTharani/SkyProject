package com.sky.app.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.sky.app.roles.JobRole;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link Employee}.
 * <p>
 * Use builder to create immutable instances:
 * {@code ImmutableEmployee.builder()}.
 */
@SuppressWarnings("all")
@Generated({"Immutables.generator", "Employee"})
public final class ImmutableEmployee implements Employee {
  private final String employeeId;
  private final String name;
  private final String address;
  private final Date dateOfBirth;
  private final double salary;
  private final String telephoneNo;
  private final int workExperience;
  private final JobRole jobrole;
  private final Branch branchName;
  private final List<String> qualification;

  private ImmutableEmployee(ImmutableEmployee.Builder builder) {
    this.employeeId = builder.employeeId;
    this.name = builder.name;
    this.address = builder.address;
    this.dateOfBirth = builder.dateOfBirth;
    this.salary = builder.salary;
    this.telephoneNo = builder.telephoneNo;
    this.workExperience = builder.workExperience;
    this.jobrole = builder.jobrole;
    this.branchName = builder.branchName;
    this.qualification = createUnmodifiableList(true, builder.qualificationBuilder);
  }

  private ImmutableEmployee(
      ImmutableEmployee original,
      String employeeId,
      String name,
      String address,
      Date dateOfBirth,
      double salary,
      String telephoneNo,
      int workExperience,
      JobRole jobrole,
      Branch branchName,
      List<String> qualification) {
    this.employeeId = employeeId;
    this.name = name;
    this.address = address;
    this.dateOfBirth = dateOfBirth;
    this.salary = salary;
    this.telephoneNo = telephoneNo;
    this.workExperience = workExperience;
    this.jobrole = jobrole;
    this.branchName = branchName;
    this.qualification = qualification;
  }
  
  /**
   * {@inheritDoc}
   * @return value of {@code employeeId} attribute
   */
  @JsonProperty("employeeId")
  @Override
  public String employeeId() {
    return employeeId;
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
   * @return value of {@code address} attribute
   */
  @JsonProperty("address")
  @Override
  public String address() {
    return address;
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
   * @return value of {@code salary} attribute
   */
  @JsonProperty("salary")
  @Override
  public double salary() {
    return salary;
  }
  
  /**
   * {@inheritDoc}
   * @return value of {@code telephoneNo} attribute
   */
  @JsonProperty("telephoneNo")
  @Override
  public String telephoneNo() {
    return telephoneNo;
  }
  
  /**
   * {@inheritDoc}
   * @return value of {@code workExperience} attribute
   */
  @JsonProperty("workExperience")
  @Override
  public int workExperience() {
    return workExperience;
  }
  
  /**
   * {@inheritDoc}
   * @return value of {@code jobrole} attribute
   */
  @JsonProperty("jobRole")
  @Override
  public JobRole jobrole() {
    return jobrole;
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
   * @return value of {@code qualification} attribute
   */
  @JsonProperty("qualification")
  @Override
  public List<String> qualification() {
    return qualification;
  }
  
  /**
   * Copy current immutable object by setting value for {@link Employee#employeeId() employeeId}.
   * Shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value new value for employeeId
   * @return modified copy of the {@code this} object
   */
  public final ImmutableEmployee withEmployeeId(String value) {
    if (this.employeeId == value) {
      return this;
    }
    String newValue = Objects.requireNonNull(value);
    return new ImmutableEmployee(
        this,
        newValue,
        this.name,
        this.address,
        this.dateOfBirth,
        this.salary,
        this.telephoneNo,
        this.workExperience,
        this.jobrole,
        this.branchName,
        this.qualification);
  }
  
  /**
   * Copy current immutable object by setting value for {@link Employee#name() name}.
   * Shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value new value for name
   * @return modified copy of the {@code this} object
   */
  public final ImmutableEmployee withName(String value) {
    if (this.name == value) {
      return this;
    }
    String newValue = Objects.requireNonNull(value);
    return new ImmutableEmployee(
        this,
        this.employeeId,
        newValue,
        this.address,
        this.dateOfBirth,
        this.salary,
        this.telephoneNo,
        this.workExperience,
        this.jobrole,
        this.branchName,
        this.qualification);
  }
  
  /**
   * Copy current immutable object by setting value for {@link Employee#address() address}.
   * Shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value new value for address
   * @return modified copy of the {@code this} object
   */
  public final ImmutableEmployee withAddress(String value) {
    if (this.address == value) {
      return this;
    }
    String newValue = Objects.requireNonNull(value);
    return new ImmutableEmployee(
        this,
        this.employeeId,
        this.name,
        newValue,
        this.dateOfBirth,
        this.salary,
        this.telephoneNo,
        this.workExperience,
        this.jobrole,
        this.branchName,
        this.qualification);
  }
  
  /**
   * Copy current immutable object by setting value for {@link Employee#dateOfBirth() dateOfBirth}.
   * Shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value new value for dateOfBirth
   * @return modified copy of the {@code this} object
   */
  public final ImmutableEmployee withDateOfBirth(Date value) {
    if (this.dateOfBirth == value) {
      return this;
    }
    Date newValue = Objects.requireNonNull(value);
    return new ImmutableEmployee(
        this,
        this.employeeId,
        this.name,
        this.address,
        newValue,
        this.salary,
        this.telephoneNo,
        this.workExperience,
        this.jobrole,
        this.branchName,
        this.qualification);
  }
  
  /**
   * Copy current immutable object by setting value for {@link Employee#salary() salary}.
   * @param value new value for salary
   * @return modified copy of the {@code this} object
   */
  public final ImmutableEmployee withSalary(double value) {
    double newValue = value;
    return new ImmutableEmployee(
        this,
        this.employeeId,
        this.name,
        this.address,
        this.dateOfBirth,
        newValue,
        this.telephoneNo,
        this.workExperience,
        this.jobrole,
        this.branchName,
        this.qualification);
  }
  
  /**
   * Copy current immutable object by setting value for {@link Employee#telephoneNo() telephoneNo}.
   * Shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value new value for telephoneNo
   * @return modified copy of the {@code this} object
   */
  public final ImmutableEmployee withTelephoneNo(String value) {
    if (this.telephoneNo == value) {
      return this;
    }
    String newValue = Objects.requireNonNull(value);
    return new ImmutableEmployee(
        this,
        this.employeeId,
        this.name,
        this.address,
        this.dateOfBirth,
        this.salary,
        newValue,
        this.workExperience,
        this.jobrole,
        this.branchName,
        this.qualification);
  }
  
  /**
   * Copy current immutable object by setting value for {@link Employee#workExperience() workExperience}.
   * Value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value new value for workExperience
   * @return modified copy of the {@code this} object
   */
  public final ImmutableEmployee withWorkExperience(int value) {
    if (this.workExperience == value) {
      return this;
    }
    int newValue = value;
    return new ImmutableEmployee(
        this,
        this.employeeId,
        this.name,
        this.address,
        this.dateOfBirth,
        this.salary,
        this.telephoneNo,
        newValue,
        this.jobrole,
        this.branchName,
        this.qualification);
  }
  
  /**
   * Copy current immutable object by setting value for {@link Employee#jobrole() jobrole}.
   * Shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value new value for jobrole
   * @return modified copy of the {@code this} object
   */
  public final ImmutableEmployee withJobrole(JobRole value) {
    if (this.jobrole == value) {
      return this;
    }
    JobRole newValue = Objects.requireNonNull(value);
    return new ImmutableEmployee(
        this,
        this.employeeId,
        this.name,
        this.address,
        this.dateOfBirth,
        this.salary,
        this.telephoneNo,
        this.workExperience,
        newValue,
        this.branchName,
        this.qualification);
  }
  
  /**
   * Copy current immutable object by setting value for {@link Employee#branchName() branchName}.
   * Shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value new value for branchName
   * @return modified copy of the {@code this} object
   */
  public final ImmutableEmployee withBranchName(Branch value) {
    if (this.branchName == value) {
      return this;
    }
    Branch newValue = Objects.requireNonNull(value);
    return new ImmutableEmployee(
        this,
        this.employeeId,
        this.name,
        this.address,
        this.dateOfBirth,
        this.salary,
        this.telephoneNo,
        this.workExperience,
        this.jobrole,
        newValue,
        this.qualification);
  }
  
  /**
   * Copy current immutable object with elements that replace content of {@link Employee#qualification() qualification}.
   * @param elements elements to set
   * @return modified copy of {@code this} object
   */
  public final ImmutableEmployee withQualification(String... elements) {
    List<String> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements)));
    return new ImmutableEmployee(
        this,
        this.employeeId,
        this.name,
        this.address,
        this.dateOfBirth,
        this.salary,
        this.telephoneNo,
        this.workExperience,
        this.jobrole,
        this.branchName,
        newValue);
  }
  
  /**
   * Copy current immutable object with elements that replace content of {@link Employee#qualification() qualification}.
   * Shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements iterable of qualification elements to set
   * @return modified copy of {@code this} object
   */
  public final ImmutableEmployee withQualification(Iterable<String> elements) {
    if (this.qualification == elements) {
      return this;
    }
    List<String> newValue = createUnmodifiableList(false, createSafeList(elements));
    return new ImmutableEmployee(
        this,
        this.employeeId,
        this.name,
        this.address,
        this.dateOfBirth,
        this.salary,
        this.telephoneNo,
        this.workExperience,
        this.jobrole,
        this.branchName,
        newValue);
  }
  
  /**
   * This instance is equal to instances of {@code ImmutableEmployee} with equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    return this == another
        || (another instanceof ImmutableEmployee && equalTo((ImmutableEmployee) another));
  }
  
  private boolean equalTo(ImmutableEmployee another) {
    return employeeId.equals(another.employeeId)
        && name.equals(another.name)
        && address.equals(another.address)
        && dateOfBirth.equals(another.dateOfBirth)
        && Double.doubleToLongBits(salary) == Double.doubleToLongBits(another.salary)
        && telephoneNo.equals(another.telephoneNo)
        && workExperience == another.workExperience
        && jobrole.equals(another.jobrole)
        && branchName.equals(another.branchName)
        && qualification.equals(another.qualification);
  }
  
  /**
   * Computes hash code from attributes: {@code employeeId}, {@code name}, {@code address}, {@code dateOfBirth}, {@code salary}, {@code telephoneNo}, {@code workExperience}, {@code jobrole}, {@code branchName}, {@code qualification}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 31;
    h = h * 17 + employeeId.hashCode();
    h = h * 17 + name.hashCode();
    h = h * 17 + address.hashCode();
    h = h * 17 + dateOfBirth.hashCode();
    h = h * 17 + java.lang.Double.hashCode(salary);
    h = h * 17 + telephoneNo.hashCode();
    h = h * 17 + workExperience;
    h = h * 17 + jobrole.hashCode();
    h = h * 17 + branchName.hashCode();
    h = h * 17 + qualification.hashCode();
    return h;
  }
  
  /**
   * Prints immutable value {@code Employee{...}} with attribute values,
   * excluding any non-generated and auxiliary attributes.
   * @return string representation of value
   */
  @Override
  public String toString() {
    return new StringBuilder("Employee{")
        .append("employeeId=").append(employeeId)
        .append(", name=").append(name)
        .append(", address=").append(address)
        .append(", dateOfBirth=").append(dateOfBirth)
        .append(", salary=").append(salary)
        .append(", telephoneNo=").append(telephoneNo)
        .append(", workExperience=").append(workExperience)
        .append(", jobrole=").append(jobrole)
        .append(", branchName=").append(branchName)
        .append(", qualification=").append(qualification)
        .append('}').toString();
  }
  
  @JsonCreator
  public static ImmutableEmployee fromAllAttributes(
      @JsonProperty("employeeId") String employeeId,
      @JsonProperty("name") String name,
      @JsonProperty("address") String address,
      @JsonProperty("dateOfBirth") Date dateOfBirth,
      @JsonProperty("salary") java.lang.Double salary,
      @JsonProperty("telephoneNo") String telephoneNo,
      @JsonProperty("workExperience") Integer workExperience,
      @JsonProperty("jobRole") JobRole jobrole,
      @JsonProperty("branchName") Branch branchName,
      @JsonProperty("qualification") List<String> qualification) {
    ImmutableEmployee.Builder builder = ImmutableEmployee.builder();
    if (employeeId != null) {
      builder.employeeId(employeeId);
    }
    if (name != null) {
      builder.name(name);
    }
    if (address != null) {
      builder.address(address);
    }
    if (dateOfBirth != null) {
      builder.dateOfBirth(dateOfBirth);
    }
    if (salary != null) {
      builder.salary(salary);
    }
    if (telephoneNo != null) {
      builder.telephoneNo(telephoneNo);
    }
    if (workExperience != null) {
      builder.workExperience(workExperience);
    }
    if (jobrole != null) {
      builder.jobrole(jobrole);
    }
    if (branchName != null) {
      builder.branchName(branchName);
    }
    if (qualification != null) {
      builder.addAllQualification(qualification);
    }
    return builder.build();
  }
  
  /**
   * Creates immutable copy of {@link Employee}.
   * Uses accessors to get values to initialize immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @return copied immutable Employee instance
   */
  public static ImmutableEmployee copyOf(Employee instance) {
    if (instance instanceof ImmutableEmployee) {
      return (ImmutableEmployee) instance;
    }
    return ImmutableEmployee.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates builder for {@link com.sky.app.domain.ImmutableEmployee}.
   * @return new ImmutableEmployee builder
   */
  public static ImmutableEmployee.Builder builder() {
    return new ImmutableEmployee.Builder();
  }
  
  /**
   * Builds instances of {@link com.sky.app.domain.ImmutableEmployee}.
   * Initialized attributes and then invoke {@link #build()} method to create
   * immutable instance.
   * <p><em>Builder is not thread safe and generally should not be stored in field or collection,
   * but used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INITIALIZED_BITSET_ALL = 0x1ff;
    private static final long INITIALIZED_BIT_EMPLOYEE_ID = 0x1L;
    private static final long INITIALIZED_BIT_NAME = 0x2L;
    private static final long INITIALIZED_BIT_ADDRESS = 0x4L;
    private static final long INITIALIZED_BIT_DATE_OF_BIRTH = 0x8L;
    private static final long INITIALIZED_BIT_SALARY = 0x10L;
    private static final long INITIALIZED_BIT_TELEPHONE_NO = 0x20L;
    private static final long INITIALIZED_BIT_WORK_EXPERIENCE = 0x40L;
    private static final long INITIALIZED_BIT_JOBROLE = 0x80L;
    private static final long INITIALIZED_BIT_BRANCH_NAME = 0x100L;
    private long initializedBitset;
  
    private String employeeId;
    private String name;
    private String address;
    private Date dateOfBirth;
    private double salary;
    private String telephoneNo;
    private int workExperience;
    private JobRole jobrole;
    private Branch branchName;
    private ArrayList<String> qualificationBuilder = new ArrayList<String>();
    private Builder() {}
  
    /**
     * Fill builder with attribute values from provided {@link Employee} instance.
     * Regular attribute values will be overridden, i.e. replaced with ones of an instance.
     * Instance's absent optional values will not be copied (will not override current).
     * Collection elements and entries will be added, not replaced.
     * @param instance instance to copy values from
     * @return {@code this} builder for chained invocation
     */
    public final Builder from(Employee instance) {
      Objects.requireNonNull(instance);
      employeeId(instance.employeeId());
      name(instance.name());
      address(instance.address());
      dateOfBirth(instance.dateOfBirth());
      salary(instance.salary());
      telephoneNo(instance.telephoneNo());
      workExperience(instance.workExperience());
      jobrole(instance.jobrole());
      branchName(instance.branchName());
      addAllQualification(instance.qualification());
      return this;
    }
  
    /**
     * Initializes value for {@link Employee#employeeId() employeeId}.
     * @param employeeId value for employeeId
     * @return {@code this} builder for chained invocation
     */
    public final Builder employeeId(String employeeId) {
      this.employeeId = Objects.requireNonNull(employeeId);
      initializedBitset |= INITIALIZED_BIT_EMPLOYEE_ID;
      return this;
    }
  
    /**
     * Initializes value for {@link Employee#name() name}.
     * @param name value for name
     * @return {@code this} builder for chained invocation
     */
    public final Builder name(String name) {
      this.name = Objects.requireNonNull(name);
      initializedBitset |= INITIALIZED_BIT_NAME;
      return this;
    }
  
    /**
     * Initializes value for {@link Employee#address() address}.
     * @param address value for address
     * @return {@code this} builder for chained invocation
     */
    public final Builder address(String address) {
      this.address = Objects.requireNonNull(address);
      initializedBitset |= INITIALIZED_BIT_ADDRESS;
      return this;
    }
  
    /**
     * Initializes value for {@link Employee#dateOfBirth() dateOfBirth}.
     * @param dateOfBirth value for dateOfBirth
     * @return {@code this} builder for chained invocation
     */
    public final Builder dateOfBirth(Date dateOfBirth) {
      this.dateOfBirth = Objects.requireNonNull(dateOfBirth);
      initializedBitset |= INITIALIZED_BIT_DATE_OF_BIRTH;
      return this;
    }
  
    /**
     * Initializes value for {@link Employee#salary() salary}.
     * @param salary value for salary
     * @return {@code this} builder for chained invocation
     */
    public final Builder salary(double salary) {
      this.salary = salary;
      initializedBitset |= INITIALIZED_BIT_SALARY;
      return this;
    }
  
    /**
     * Initializes value for {@link Employee#telephoneNo() telephoneNo}.
     * @param telephoneNo value for telephoneNo
     * @return {@code this} builder for chained invocation
     */
    public final Builder telephoneNo(String telephoneNo) {
      this.telephoneNo = Objects.requireNonNull(telephoneNo);
      initializedBitset |= INITIALIZED_BIT_TELEPHONE_NO;
      return this;
    }
  
    /**
     * Initializes value for {@link Employee#workExperience() workExperience}.
     * @param workExperience value for workExperience
     * @return {@code this} builder for chained invocation
     */
    public final Builder workExperience(int workExperience) {
      this.workExperience = workExperience;
      initializedBitset |= INITIALIZED_BIT_WORK_EXPERIENCE;
      return this;
    }
  
    /**
     * Initializes value for {@link Employee#jobrole() jobrole}.
     * @param jobrole value for jobrole
     * @return {@code this} builder for chained invocation
     */
    public final Builder jobrole(JobRole jobrole) {
      this.jobrole = Objects.requireNonNull(jobrole);
      initializedBitset |= INITIALIZED_BIT_JOBROLE;
      return this;
    }
  
    /**
     * Initializes value for {@link Employee#branchName() branchName}.
     * @param branchName value for branchName
     * @return {@code this} builder for chained invocation
     */
    public final Builder branchName(Branch branchName) {
      this.branchName = Objects.requireNonNull(branchName);
      initializedBitset |= INITIALIZED_BIT_BRANCH_NAME;
      return this;
    }
  
    /**
     * Adds one element to {@link Employee#qualification() qualification} list.
     * @param element qualification element
     * @return {@code this} builder for chained invocation
     */
    public final Builder addQualification(String element) {
      qualificationBuilder.add(Objects.requireNonNull(element));
      return this;
    }
  
    /**
     * Adds elements to {@link Employee#qualification() qualification} list.
     * @param elements array of qualification elements
     * @return {@code this} builder for chained invocation
     */
    public final Builder addQualification(String... elements) {
      for (String element : elements) {
        qualificationBuilder.add(Objects.requireNonNull(element));
      }
      return this;
    }
  
    /**
     * Sets or replaces all elements for {@link Employee#qualification() qualification} list.
     * @param elements iterable of qualification elements
     * @return {@code this} builder for chained invocation
     */
    public final Builder qualification(Iterable<String> elements) {
      qualificationBuilder = new ArrayList<String>();
      return addAllQualification(elements);
    }
  
    /**
     * Adds elements to {@link Employee#qualification() qualification} list.
     * @param elements iterable of qualification elements
     * @return {@code this} builder for chained invocation
     */
    public final Builder addAllQualification(Iterable<String> elements) {
      for (String element : elements) {
        qualificationBuilder.add(Objects.requireNonNull(element));
      }
      return this;
    }
  
    /**
     * Builds new {@link com.sky.app.domain.ImmutableEmployee}.
     * @return immutable instance of Employee
     */
    public ImmutableEmployee build() {
      checkRequiredAttributes();
      return new ImmutableEmployee(this);
    }
  
    private boolean employeeIdIsSet() {
      return (initializedBitset & INITIALIZED_BIT_EMPLOYEE_ID) != 0;
    }
  
    private boolean nameIsSet() {
      return (initializedBitset & INITIALIZED_BIT_NAME) != 0;
    }
  
    private boolean addressIsSet() {
      return (initializedBitset & INITIALIZED_BIT_ADDRESS) != 0;
    }
  
    private boolean dateOfBirthIsSet() {
      return (initializedBitset & INITIALIZED_BIT_DATE_OF_BIRTH) != 0;
    }
  
    private boolean salaryIsSet() {
      return (initializedBitset & INITIALIZED_BIT_SALARY) != 0;
    }
  
    private boolean telephoneNoIsSet() {
      return (initializedBitset & INITIALIZED_BIT_TELEPHONE_NO) != 0;
    }
  
    private boolean workExperienceIsSet() {
      return (initializedBitset & INITIALIZED_BIT_WORK_EXPERIENCE) != 0;
    }
  
    private boolean jobroleIsSet() {
      return (initializedBitset & INITIALIZED_BIT_JOBROLE) != 0;
    }
  
    private boolean branchNameIsSet() {
      return (initializedBitset & INITIALIZED_BIT_BRANCH_NAME) != 0;
    }
  
    private void checkRequiredAttributes() {
      if (initializedBitset != INITIALIZED_BITSET_ALL) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }
  
    private String formatRequiredAttributesMessage() {
      Collection<String> attributes = new ArrayList<String>();
      if (!employeeIdIsSet()) {
        attributes.add("employeeId");
      }
      if (!nameIsSet()) {
        attributes.add("name");
      }
      if (!addressIsSet()) {
        attributes.add("address");
      }
      if (!dateOfBirthIsSet()) {
        attributes.add("dateOfBirth");
      }
      if (!salaryIsSet()) {
        attributes.add("salary");
      }
      if (!telephoneNoIsSet()) {
        attributes.add("telephoneNo");
      }
      if (!workExperienceIsSet()) {
        attributes.add("workExperience");
      }
      if (!jobroleIsSet()) {
        attributes.add("jobrole");
      }
      if (!branchNameIsSet()) {
        attributes.add("branchName");
      }
      return "Cannot build Employee, some of required attributes are not set " + attributes;
    }
  }
  
  private static <T> ArrayList<T> createSafeList(Iterable<? extends T> iterable) {
    ArrayList<T> list = iterable instanceof Collection<?>
        ? new ArrayList<T>(((Collection<?>) iterable).size())
        : new ArrayList<T>();
  
    for (T element : iterable) {
      list.add(Objects.requireNonNull(element, "Null in collection attribute is not allowed"));
    }
    return list;
  }
  
  private static <T> List<T> createUnmodifiableList(boolean clone, List<T> list) {
    switch(list.size()) {
    case 0: return Collections.emptyList();
    case 1: return Collections.singletonList(list.get(0));
    default:
      if (clone) {
        return Collections.unmodifiableList(new ArrayList<T>(list));
      } else {
        if (list instanceof ArrayList<?>) {
          ((ArrayList<?>) list).trimToSize();
        }
        return Collections.unmodifiableList(list);
      }
    }
  }
}
