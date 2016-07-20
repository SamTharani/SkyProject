package com.sky.app.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link Branch}.
 * <p>
 * Use builder to create immutable instances:
 * {@code ImmutableBranch.builder()}.
 */
@SuppressWarnings("all")
@Generated({"Immutables.generator", "Branch"})
public final class ImmutableBranch implements Branch {
  private final String branchName;
  private final String identificationCode;
  private final String telephoneNo;
  private final String branchAddress;
  private final String branchEmail;

  private ImmutableBranch(ImmutableBranch.Builder builder) {
    this.branchName = builder.branchName;
    this.identificationCode = builder.identificationCode;
    this.telephoneNo = builder.telephoneNo;
    this.branchAddress = builder.branchAddress;
    this.branchEmail = builder.branchEmail;
  }

  private ImmutableBranch(
      ImmutableBranch original,
      String branchName,
      String identificationCode,
      String telephoneNo,
      String branchAddress,
      String branchEmail) {
    this.branchName = branchName;
    this.identificationCode = identificationCode;
    this.telephoneNo = telephoneNo;
    this.branchAddress = branchAddress;
    this.branchEmail = branchEmail;
  }
  
  /**
   * {@inheritDoc}
   * @return value of {@code branchName} attribute
   */
  @JsonProperty("branchName")
  @Override
  public String branchName() {
    return branchName;
  }
  
  /**
   * {@inheritDoc}
   * @return value of {@code identificationCode} attribute
   */
  @JsonProperty("identificationCode")
  @Override
  public String identificationCode() {
    return identificationCode;
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
   * @return value of {@code branchAddress} attribute
   */
  @JsonProperty("branchAddress")
  @Override
  public String branchAddress() {
    return branchAddress;
  }
  
  /**
   * {@inheritDoc}
   * @return value of {@code branchEmail} attribute
   */
  @JsonProperty("branchEmail")
  @Override
  public String branchEmail() {
    return branchEmail;
  }
  
  /**
   * Copy current immutable object by setting value for {@link Branch#branchName() branchName}.
   * Shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value new value for branchName
   * @return modified copy of the {@code this} object
   */
  public final ImmutableBranch withBranchName(String value) {
    if (this.branchName == value) {
      return this;
    }
    String newValue = Objects.requireNonNull(value);
    return new ImmutableBranch(this, newValue, this.identificationCode, this.telephoneNo, this.branchAddress, this.branchEmail);
  }
  
  /**
   * Copy current immutable object by setting value for {@link Branch#identificationCode() identificationCode}.
   * Shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value new value for identificationCode
   * @return modified copy of the {@code this} object
   */
  public final ImmutableBranch withIdentificationCode(String value) {
    if (this.identificationCode == value) {
      return this;
    }
    String newValue = Objects.requireNonNull(value);
    return new ImmutableBranch(this, this.branchName, newValue, this.telephoneNo, this.branchAddress, this.branchEmail);
  }
  
  /**
   * Copy current immutable object by setting value for {@link Branch#telephoneNo() telephoneNo}.
   * Shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value new value for telephoneNo
   * @return modified copy of the {@code this} object
   */
  public final ImmutableBranch withTelephoneNo(String value) {
    if (this.telephoneNo == value) {
      return this;
    }
    String newValue = Objects.requireNonNull(value);
    return new ImmutableBranch(this, this.branchName, this.identificationCode, newValue, this.branchAddress, this.branchEmail);
  }
  
  /**
   * Copy current immutable object by setting value for {@link Branch#branchAddress() branchAddress}.
   * Shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value new value for branchAddress
   * @return modified copy of the {@code this} object
   */
  public final ImmutableBranch withBranchAddress(String value) {
    if (this.branchAddress == value) {
      return this;
    }
    String newValue = Objects.requireNonNull(value);
    return new ImmutableBranch(this, this.branchName, this.identificationCode, this.telephoneNo, newValue, this.branchEmail);
  }
  
  /**
   * Copy current immutable object by setting value for {@link Branch#branchEmail() branchEmail}.
   * Shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value new value for branchEmail
   * @return modified copy of the {@code this} object
   */
  public final ImmutableBranch withBranchEmail(String value) {
    if (this.branchEmail == value) {
      return this;
    }
    String newValue = Objects.requireNonNull(value);
    return new ImmutableBranch(this, this.branchName, this.identificationCode, this.telephoneNo, this.branchAddress, newValue);
  }
  
  /**
   * This instance is equal to instances of {@code ImmutableBranch} with equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    return this == another
        || (another instanceof ImmutableBranch && equalTo((ImmutableBranch) another));
  }
  
  private boolean equalTo(ImmutableBranch another) {
    return branchName.equals(another.branchName)
        && identificationCode.equals(another.identificationCode)
        && telephoneNo.equals(another.telephoneNo)
        && branchAddress.equals(another.branchAddress)
        && branchEmail.equals(another.branchEmail);
  }
  
  /**
   * Computes hash code from attributes: {@code branchName}, {@code identificationCode}, {@code telephoneNo}, {@code branchAddress}, {@code branchEmail}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 31;
    h = h * 17 + branchName.hashCode();
    h = h * 17 + identificationCode.hashCode();
    h = h * 17 + telephoneNo.hashCode();
    h = h * 17 + branchAddress.hashCode();
    h = h * 17 + branchEmail.hashCode();
    return h;
  }
  
  /**
   * Prints immutable value {@code Branch{...}} with attribute values,
   * excluding any non-generated and auxiliary attributes.
   * @return string representation of value
   */
  @Override
  public String toString() {
    return new StringBuilder("Branch{")
        .append("branchName=").append(branchName)
        .append(", identificationCode=").append(identificationCode)
        .append(", telephoneNo=").append(telephoneNo)
        .append(", branchAddress=").append(branchAddress)
        .append(", branchEmail=").append(branchEmail)
        .append('}').toString();
  }
  
  @JsonCreator
  public static ImmutableBranch fromAllAttributes(
      @JsonProperty("branchName") String branchName,
      @JsonProperty("identificationCode") String identificationCode,
      @JsonProperty("telephoneNo") String telephoneNo,
      @JsonProperty("branchAddress") String branchAddress,
      @JsonProperty("branchEmail") String branchEmail) {
    ImmutableBranch.Builder builder = ImmutableBranch.builder();
    if (branchName != null) {
      builder.branchName(branchName);
    }
    if (identificationCode != null) {
      builder.identificationCode(identificationCode);
    }
    if (telephoneNo != null) {
      builder.telephoneNo(telephoneNo);
    }
    if (branchAddress != null) {
      builder.branchAddress(branchAddress);
    }
    if (branchEmail != null) {
      builder.branchEmail(branchEmail);
    }
    return builder.build();
  }
  
  /**
   * Creates immutable copy of {@link Branch}.
   * Uses accessors to get values to initialize immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @return copied immutable Branch instance
   */
  public static ImmutableBranch copyOf(Branch instance) {
    if (instance instanceof ImmutableBranch) {
      return (ImmutableBranch) instance;
    }
    return ImmutableBranch.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates builder for {@link com.sky.app.domain.ImmutableBranch}.
   * @return new ImmutableBranch builder
   */
  public static ImmutableBranch.Builder builder() {
    return new ImmutableBranch.Builder();
  }
  
  /**
   * Builds instances of {@link com.sky.app.domain.ImmutableBranch}.
   * Initialized attributes and then invoke {@link #build()} method to create
   * immutable instance.
   * <p><em>Builder is not thread safe and generally should not be stored in field or collection,
   * but used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INITIALIZED_BITSET_ALL = 0x1f;
    private static final long INITIALIZED_BIT_BRANCH_NAME = 0x1L;
    private static final long INITIALIZED_BIT_IDENTIFICATION_CODE = 0x2L;
    private static final long INITIALIZED_BIT_TELEPHONE_NO = 0x4L;
    private static final long INITIALIZED_BIT_BRANCH_ADDRESS = 0x8L;
    private static final long INITIALIZED_BIT_BRANCH_EMAIL = 0x10L;
    private long initializedBitset;
  
    private String branchName;
    private String identificationCode;
    private String telephoneNo;
    private String branchAddress;
    private String branchEmail;
    private Builder() {}
  
    /**
     * Fill builder with attribute values from provided {@link Branch} instance.
     * Regular attribute values will be overridden, i.e. replaced with ones of an instance.
     * Instance's absent optional values will not be copied (will not override current).
     * Collection elements and entries will be added, not replaced.
     * @param instance instance to copy values from
     * @return {@code this} builder for chained invocation
     */
    public final Builder from(Branch instance) {
      Objects.requireNonNull(instance);
      branchName(instance.branchName());
      identificationCode(instance.identificationCode());
      telephoneNo(instance.telephoneNo());
      branchAddress(instance.branchAddress());
      branchEmail(instance.branchEmail());
      return this;
    }
  
    /**
     * Initializes value for {@link Branch#branchName() branchName}.
     * @param branchName value for branchName
     * @return {@code this} builder for chained invocation
     */
    public final Builder branchName(String branchName) {
      this.branchName = Objects.requireNonNull(branchName);
      initializedBitset |= INITIALIZED_BIT_BRANCH_NAME;
      return this;
    }
  
    /**
     * Initializes value for {@link Branch#identificationCode() identificationCode}.
     * @param identificationCode value for identificationCode
     * @return {@code this} builder for chained invocation
     */
    public final Builder identificationCode(String identificationCode) {
      this.identificationCode = Objects.requireNonNull(identificationCode);
      initializedBitset |= INITIALIZED_BIT_IDENTIFICATION_CODE;
      return this;
    }
  
    /**
     * Initializes value for {@link Branch#telephoneNo() telephoneNo}.
     * @param telephoneNo value for telephoneNo
     * @return {@code this} builder for chained invocation
     */
    public final Builder telephoneNo(String telephoneNo) {
      this.telephoneNo = Objects.requireNonNull(telephoneNo);
      initializedBitset |= INITIALIZED_BIT_TELEPHONE_NO;
      return this;
    }
  
    /**
     * Initializes value for {@link Branch#branchAddress() branchAddress}.
     * @param branchAddress value for branchAddress
     * @return {@code this} builder for chained invocation
     */
    public final Builder branchAddress(String branchAddress) {
      this.branchAddress = Objects.requireNonNull(branchAddress);
      initializedBitset |= INITIALIZED_BIT_BRANCH_ADDRESS;
      return this;
    }
  
    /**
     * Initializes value for {@link Branch#branchEmail() branchEmail}.
     * @param branchEmail value for branchEmail
     * @return {@code this} builder for chained invocation
     */
    public final Builder branchEmail(String branchEmail) {
      this.branchEmail = Objects.requireNonNull(branchEmail);
      initializedBitset |= INITIALIZED_BIT_BRANCH_EMAIL;
      return this;
    }
  
    /**
     * Builds new {@link com.sky.app.domain.ImmutableBranch}.
     * @return immutable instance of Branch
     */
    public ImmutableBranch build() {
      checkRequiredAttributes();
      return new ImmutableBranch(this);
    }
  
    private boolean branchNameIsSet() {
      return (initializedBitset & INITIALIZED_BIT_BRANCH_NAME) != 0;
    }
  
    private boolean identificationCodeIsSet() {
      return (initializedBitset & INITIALIZED_BIT_IDENTIFICATION_CODE) != 0;
    }
  
    private boolean telephoneNoIsSet() {
      return (initializedBitset & INITIALIZED_BIT_TELEPHONE_NO) != 0;
    }
  
    private boolean branchAddressIsSet() {
      return (initializedBitset & INITIALIZED_BIT_BRANCH_ADDRESS) != 0;
    }
  
    private boolean branchEmailIsSet() {
      return (initializedBitset & INITIALIZED_BIT_BRANCH_EMAIL) != 0;
    }
  
    private void checkRequiredAttributes() {
      if (initializedBitset != INITIALIZED_BITSET_ALL) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }
  
    private String formatRequiredAttributesMessage() {
      Collection<String> attributes = new ArrayList<String>();
      if (!branchNameIsSet()) {
        attributes.add("branchName");
      }
      if (!identificationCodeIsSet()) {
        attributes.add("identificationCode");
      }
      if (!telephoneNoIsSet()) {
        attributes.add("telephoneNo");
      }
      if (!branchAddressIsSet()) {
        attributes.add("branchAddress");
      }
      if (!branchEmailIsSet()) {
        attributes.add("branchEmail");
      }
      return "Cannot build Branch, some of required attributes are not set " + attributes;
    }
  }
}
