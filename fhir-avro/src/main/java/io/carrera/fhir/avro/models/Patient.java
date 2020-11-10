/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package io.carrera.fhir.avro.models;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class Patient extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -2603589745060845532L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Patient\",\"namespace\":\"io.carrera.fhir.avro.models\",\"fields\":[{\"name\":\"resourceType\",\"type\":\"string\"},{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"identifier\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"identifier_record\",\"fields\":[{\"name\":\"system\",\"type\":\"string\"},{\"name\":\"value\",\"type\":\"string\"}]}}},{\"name\":\"name\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"name_record\",\"fields\":[{\"name\":\"use\",\"type\":\"string\"},{\"name\":\"family\",\"type\":\"string\"},{\"name\":\"given\",\"type\":{\"type\":\"array\",\"items\":\"string\"}},{\"name\":\"prefix\",\"type\":{\"type\":\"array\",\"items\":\"string\"}}]}}},{\"name\":\"gender\",\"type\":\"string\"},{\"name\":\"birthDate\",\"type\":[\"null\",\"string\"]},{\"name\":\"maritalStatus\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"CodeableConcept\",\"fields\":[{\"name\":\"coding\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Coding\",\"fields\":[{\"name\":\"system\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"code\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"display\",\"type\":[\"null\",\"string\"],\"default\":null}]}}},{\"name\":\"text\",\"type\":[\"null\",\"string\"],\"default\":null}]}]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Patient> ENCODER =
      new BinaryMessageEncoder<Patient>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Patient> DECODER =
      new BinaryMessageDecoder<Patient>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Patient> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Patient> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Patient> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Patient>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Patient to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Patient from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Patient instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Patient fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence resourceType;
  @Deprecated public java.lang.CharSequence id;
  @Deprecated public java.util.List<io.carrera.fhir.avro.models.identifier_record> identifier;
  @Deprecated public java.util.List<io.carrera.fhir.avro.models.name_record> name;
  @Deprecated public java.lang.CharSequence gender;
  @Deprecated public java.lang.CharSequence birthDate;
  @Deprecated public io.carrera.fhir.avro.models.CodeableConcept maritalStatus;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Patient() {}

  /**
   * All-args constructor.
   * @param resourceType The new value for resourceType
   * @param id The new value for id
   * @param identifier The new value for identifier
   * @param name The new value for name
   * @param gender The new value for gender
   * @param birthDate The new value for birthDate
   * @param maritalStatus The new value for maritalStatus
   */
  public Patient(java.lang.CharSequence resourceType, java.lang.CharSequence id, java.util.List<io.carrera.fhir.avro.models.identifier_record> identifier, java.util.List<io.carrera.fhir.avro.models.name_record> name, java.lang.CharSequence gender, java.lang.CharSequence birthDate, io.carrera.fhir.avro.models.CodeableConcept maritalStatus) {
    this.resourceType = resourceType;
    this.id = id;
    this.identifier = identifier;
    this.name = name;
    this.gender = gender;
    this.birthDate = birthDate;
    this.maritalStatus = maritalStatus;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return resourceType;
    case 1: return id;
    case 2: return identifier;
    case 3: return name;
    case 4: return gender;
    case 5: return birthDate;
    case 6: return maritalStatus;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: resourceType = (java.lang.CharSequence)value$; break;
    case 1: id = (java.lang.CharSequence)value$; break;
    case 2: identifier = (java.util.List<io.carrera.fhir.avro.models.identifier_record>)value$; break;
    case 3: name = (java.util.List<io.carrera.fhir.avro.models.name_record>)value$; break;
    case 4: gender = (java.lang.CharSequence)value$; break;
    case 5: birthDate = (java.lang.CharSequence)value$; break;
    case 6: maritalStatus = (io.carrera.fhir.avro.models.CodeableConcept)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'resourceType' field.
   * @return The value of the 'resourceType' field.
   */
  public java.lang.CharSequence getResourceType() {
    return resourceType;
  }


  /**
   * Sets the value of the 'resourceType' field.
   * @param value the value to set.
   */
  public void setResourceType(java.lang.CharSequence value) {
    this.resourceType = value;
  }

  /**
   * Gets the value of the 'id' field.
   * @return The value of the 'id' field.
   */
  public java.lang.CharSequence getId() {
    return id;
  }


  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.CharSequence value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'identifier' field.
   * @return The value of the 'identifier' field.
   */
  public java.util.List<io.carrera.fhir.avro.models.identifier_record> getIdentifier() {
    return identifier;
  }


  /**
   * Sets the value of the 'identifier' field.
   * @param value the value to set.
   */
  public void setIdentifier(java.util.List<io.carrera.fhir.avro.models.identifier_record> value) {
    this.identifier = value;
  }

  /**
   * Gets the value of the 'name' field.
   * @return The value of the 'name' field.
   */
  public java.util.List<io.carrera.fhir.avro.models.name_record> getName() {
    return name;
  }


  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.util.List<io.carrera.fhir.avro.models.name_record> value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'gender' field.
   * @return The value of the 'gender' field.
   */
  public java.lang.CharSequence getGender() {
    return gender;
  }


  /**
   * Sets the value of the 'gender' field.
   * @param value the value to set.
   */
  public void setGender(java.lang.CharSequence value) {
    this.gender = value;
  }

  /**
   * Gets the value of the 'birthDate' field.
   * @return The value of the 'birthDate' field.
   */
  public java.lang.CharSequence getBirthDate() {
    return birthDate;
  }


  /**
   * Sets the value of the 'birthDate' field.
   * @param value the value to set.
   */
  public void setBirthDate(java.lang.CharSequence value) {
    this.birthDate = value;
  }

  /**
   * Gets the value of the 'maritalStatus' field.
   * @return The value of the 'maritalStatus' field.
   */
  public io.carrera.fhir.avro.models.CodeableConcept getMaritalStatus() {
    return maritalStatus;
  }


  /**
   * Sets the value of the 'maritalStatus' field.
   * @param value the value to set.
   */
  public void setMaritalStatus(io.carrera.fhir.avro.models.CodeableConcept value) {
    this.maritalStatus = value;
  }

  /**
   * Creates a new Patient RecordBuilder.
   * @return A new Patient RecordBuilder
   */
  public static io.carrera.fhir.avro.models.Patient.Builder newBuilder() {
    return new io.carrera.fhir.avro.models.Patient.Builder();
  }

  /**
   * Creates a new Patient RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Patient RecordBuilder
   */
  public static io.carrera.fhir.avro.models.Patient.Builder newBuilder(io.carrera.fhir.avro.models.Patient.Builder other) {
    if (other == null) {
      return new io.carrera.fhir.avro.models.Patient.Builder();
    } else {
      return new io.carrera.fhir.avro.models.Patient.Builder(other);
    }
  }

  /**
   * Creates a new Patient RecordBuilder by copying an existing Patient instance.
   * @param other The existing instance to copy.
   * @return A new Patient RecordBuilder
   */
  public static io.carrera.fhir.avro.models.Patient.Builder newBuilder(io.carrera.fhir.avro.models.Patient other) {
    if (other == null) {
      return new io.carrera.fhir.avro.models.Patient.Builder();
    } else {
      return new io.carrera.fhir.avro.models.Patient.Builder(other);
    }
  }

  /**
   * RecordBuilder for Patient instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Patient>
    implements org.apache.avro.data.RecordBuilder<Patient> {

    private java.lang.CharSequence resourceType;
    private java.lang.CharSequence id;
    private java.util.List<io.carrera.fhir.avro.models.identifier_record> identifier;
    private java.util.List<io.carrera.fhir.avro.models.name_record> name;
    private java.lang.CharSequence gender;
    private java.lang.CharSequence birthDate;
    private io.carrera.fhir.avro.models.CodeableConcept maritalStatus;
    private io.carrera.fhir.avro.models.CodeableConcept.Builder maritalStatusBuilder;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(io.carrera.fhir.avro.models.Patient.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.resourceType)) {
        this.resourceType = data().deepCopy(fields()[0].schema(), other.resourceType);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.id)) {
        this.id = data().deepCopy(fields()[1].schema(), other.id);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.identifier)) {
        this.identifier = data().deepCopy(fields()[2].schema(), other.identifier);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.name)) {
        this.name = data().deepCopy(fields()[3].schema(), other.name);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.gender)) {
        this.gender = data().deepCopy(fields()[4].schema(), other.gender);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.birthDate)) {
        this.birthDate = data().deepCopy(fields()[5].schema(), other.birthDate);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
      if (isValidValue(fields()[6], other.maritalStatus)) {
        this.maritalStatus = data().deepCopy(fields()[6].schema(), other.maritalStatus);
        fieldSetFlags()[6] = other.fieldSetFlags()[6];
      }
      if (other.hasMaritalStatusBuilder()) {
        this.maritalStatusBuilder = io.carrera.fhir.avro.models.CodeableConcept.newBuilder(other.getMaritalStatusBuilder());
      }
    }

    /**
     * Creates a Builder by copying an existing Patient instance
     * @param other The existing instance to copy.
     */
    private Builder(io.carrera.fhir.avro.models.Patient other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.resourceType)) {
        this.resourceType = data().deepCopy(fields()[0].schema(), other.resourceType);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.id)) {
        this.id = data().deepCopy(fields()[1].schema(), other.id);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.identifier)) {
        this.identifier = data().deepCopy(fields()[2].schema(), other.identifier);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.name)) {
        this.name = data().deepCopy(fields()[3].schema(), other.name);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.gender)) {
        this.gender = data().deepCopy(fields()[4].schema(), other.gender);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.birthDate)) {
        this.birthDate = data().deepCopy(fields()[5].schema(), other.birthDate);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.maritalStatus)) {
        this.maritalStatus = data().deepCopy(fields()[6].schema(), other.maritalStatus);
        fieldSetFlags()[6] = true;
      }
      this.maritalStatusBuilder = null;
    }

    /**
      * Gets the value of the 'resourceType' field.
      * @return The value.
      */
    public java.lang.CharSequence getResourceType() {
      return resourceType;
    }


    /**
      * Sets the value of the 'resourceType' field.
      * @param value The value of 'resourceType'.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Patient.Builder setResourceType(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.resourceType = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'resourceType' field has been set.
      * @return True if the 'resourceType' field has been set, false otherwise.
      */
    public boolean hasResourceType() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'resourceType' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Patient.Builder clearResourceType() {
      resourceType = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'id' field.
      * @return The value.
      */
    public java.lang.CharSequence getId() {
      return id;
    }


    /**
      * Sets the value of the 'id' field.
      * @param value The value of 'id'.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Patient.Builder setId(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.id = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'id' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Patient.Builder clearId() {
      id = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'identifier' field.
      * @return The value.
      */
    public java.util.List<io.carrera.fhir.avro.models.identifier_record> getIdentifier() {
      return identifier;
    }


    /**
      * Sets the value of the 'identifier' field.
      * @param value The value of 'identifier'.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Patient.Builder setIdentifier(java.util.List<io.carrera.fhir.avro.models.identifier_record> value) {
      validate(fields()[2], value);
      this.identifier = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'identifier' field has been set.
      * @return True if the 'identifier' field has been set, false otherwise.
      */
    public boolean hasIdentifier() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'identifier' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Patient.Builder clearIdentifier() {
      identifier = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'name' field.
      * @return The value.
      */
    public java.util.List<io.carrera.fhir.avro.models.name_record> getName() {
      return name;
    }


    /**
      * Sets the value of the 'name' field.
      * @param value The value of 'name'.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Patient.Builder setName(java.util.List<io.carrera.fhir.avro.models.name_record> value) {
      validate(fields()[3], value);
      this.name = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'name' field has been set.
      * @return True if the 'name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'name' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Patient.Builder clearName() {
      name = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'gender' field.
      * @return The value.
      */
    public java.lang.CharSequence getGender() {
      return gender;
    }


    /**
      * Sets the value of the 'gender' field.
      * @param value The value of 'gender'.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Patient.Builder setGender(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.gender = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'gender' field has been set.
      * @return True if the 'gender' field has been set, false otherwise.
      */
    public boolean hasGender() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'gender' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Patient.Builder clearGender() {
      gender = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'birthDate' field.
      * @return The value.
      */
    public java.lang.CharSequence getBirthDate() {
      return birthDate;
    }


    /**
      * Sets the value of the 'birthDate' field.
      * @param value The value of 'birthDate'.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Patient.Builder setBirthDate(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this.birthDate = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'birthDate' field has been set.
      * @return True if the 'birthDate' field has been set, false otherwise.
      */
    public boolean hasBirthDate() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'birthDate' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Patient.Builder clearBirthDate() {
      birthDate = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'maritalStatus' field.
      * @return The value.
      */
    public io.carrera.fhir.avro.models.CodeableConcept getMaritalStatus() {
      return maritalStatus;
    }


    /**
      * Sets the value of the 'maritalStatus' field.
      * @param value The value of 'maritalStatus'.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Patient.Builder setMaritalStatus(io.carrera.fhir.avro.models.CodeableConcept value) {
      validate(fields()[6], value);
      this.maritalStatusBuilder = null;
      this.maritalStatus = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'maritalStatus' field has been set.
      * @return True if the 'maritalStatus' field has been set, false otherwise.
      */
    public boolean hasMaritalStatus() {
      return fieldSetFlags()[6];
    }

    /**
     * Gets the Builder instance for the 'maritalStatus' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public io.carrera.fhir.avro.models.CodeableConcept.Builder getMaritalStatusBuilder() {
      if (maritalStatusBuilder == null) {
        if (hasMaritalStatus()) {
          setMaritalStatusBuilder(io.carrera.fhir.avro.models.CodeableConcept.newBuilder(maritalStatus));
        } else {
          setMaritalStatusBuilder(io.carrera.fhir.avro.models.CodeableConcept.newBuilder());
        }
      }
      return maritalStatusBuilder;
    }

    /**
     * Sets the Builder instance for the 'maritalStatus' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public io.carrera.fhir.avro.models.Patient.Builder setMaritalStatusBuilder(io.carrera.fhir.avro.models.CodeableConcept.Builder value) {
      clearMaritalStatus();
      maritalStatusBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'maritalStatus' field has an active Builder instance
     * @return True if the 'maritalStatus' field has an active Builder instance
     */
    public boolean hasMaritalStatusBuilder() {
      return maritalStatusBuilder != null;
    }

    /**
      * Clears the value of the 'maritalStatus' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Patient.Builder clearMaritalStatus() {
      maritalStatus = null;
      maritalStatusBuilder = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Patient build() {
      try {
        Patient record = new Patient();
        record.resourceType = fieldSetFlags()[0] ? this.resourceType : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.id = fieldSetFlags()[1] ? this.id : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.identifier = fieldSetFlags()[2] ? this.identifier : (java.util.List<io.carrera.fhir.avro.models.identifier_record>) defaultValue(fields()[2]);
        record.name = fieldSetFlags()[3] ? this.name : (java.util.List<io.carrera.fhir.avro.models.name_record>) defaultValue(fields()[3]);
        record.gender = fieldSetFlags()[4] ? this.gender : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.birthDate = fieldSetFlags()[5] ? this.birthDate : (java.lang.CharSequence) defaultValue(fields()[5]);
        if (maritalStatusBuilder != null) {
          try {
            record.maritalStatus = this.maritalStatusBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("maritalStatus"));
            throw e;
          }
        } else {
          record.maritalStatus = fieldSetFlags()[6] ? this.maritalStatus : (io.carrera.fhir.avro.models.CodeableConcept) defaultValue(fields()[6]);
        }
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Patient>
    WRITER$ = (org.apache.avro.io.DatumWriter<Patient>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Patient>
    READER$ = (org.apache.avro.io.DatumReader<Patient>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.resourceType);

    out.writeString(this.id);

    long size0 = this.identifier.size();
    out.writeArrayStart();
    out.setItemCount(size0);
    long actualSize0 = 0;
    for (io.carrera.fhir.avro.models.identifier_record e0: this.identifier) {
      actualSize0++;
      out.startItem();
      e0.customEncode(out);
    }
    out.writeArrayEnd();
    if (actualSize0 != size0)
      throw new java.util.ConcurrentModificationException("Array-size written was " + size0 + ", but element count was " + actualSize0 + ".");

    long size1 = this.name.size();
    out.writeArrayStart();
    out.setItemCount(size1);
    long actualSize1 = 0;
    for (io.carrera.fhir.avro.models.name_record e1: this.name) {
      actualSize1++;
      out.startItem();
      e1.customEncode(out);
    }
    out.writeArrayEnd();
    if (actualSize1 != size1)
      throw new java.util.ConcurrentModificationException("Array-size written was " + size1 + ", but element count was " + actualSize1 + ".");

    out.writeString(this.gender);

    if (this.birthDate == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.birthDate);
    }

    if (this.maritalStatus == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      this.maritalStatus.customEncode(out);
    }

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.resourceType = in.readString(this.resourceType instanceof Utf8 ? (Utf8)this.resourceType : null);

      this.id = in.readString(this.id instanceof Utf8 ? (Utf8)this.id : null);

      long size0 = in.readArrayStart();
      java.util.List<io.carrera.fhir.avro.models.identifier_record> a0 = this.identifier;
      if (a0 == null) {
        a0 = new SpecificData.Array<io.carrera.fhir.avro.models.identifier_record>((int)size0, SCHEMA$.getField("identifier").schema());
        this.identifier = a0;
      } else a0.clear();
      SpecificData.Array<io.carrera.fhir.avro.models.identifier_record> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<io.carrera.fhir.avro.models.identifier_record>)a0 : null);
      for ( ; 0 < size0; size0 = in.arrayNext()) {
        for ( ; size0 != 0; size0--) {
          io.carrera.fhir.avro.models.identifier_record e0 = (ga0 != null ? ga0.peek() : null);
          if (e0 == null) {
            e0 = new io.carrera.fhir.avro.models.identifier_record();
          }
          e0.customDecode(in);
          a0.add(e0);
        }
      }

      long size1 = in.readArrayStart();
      java.util.List<io.carrera.fhir.avro.models.name_record> a1 = this.name;
      if (a1 == null) {
        a1 = new SpecificData.Array<io.carrera.fhir.avro.models.name_record>((int)size1, SCHEMA$.getField("name").schema());
        this.name = a1;
      } else a1.clear();
      SpecificData.Array<io.carrera.fhir.avro.models.name_record> ga1 = (a1 instanceof SpecificData.Array ? (SpecificData.Array<io.carrera.fhir.avro.models.name_record>)a1 : null);
      for ( ; 0 < size1; size1 = in.arrayNext()) {
        for ( ; size1 != 0; size1--) {
          io.carrera.fhir.avro.models.name_record e1 = (ga1 != null ? ga1.peek() : null);
          if (e1 == null) {
            e1 = new io.carrera.fhir.avro.models.name_record();
          }
          e1.customDecode(in);
          a1.add(e1);
        }
      }

      this.gender = in.readString(this.gender instanceof Utf8 ? (Utf8)this.gender : null);

      if (in.readIndex() != 1) {
        in.readNull();
        this.birthDate = null;
      } else {
        this.birthDate = in.readString(this.birthDate instanceof Utf8 ? (Utf8)this.birthDate : null);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.maritalStatus = null;
      } else {
        if (this.maritalStatus == null) {
          this.maritalStatus = new io.carrera.fhir.avro.models.CodeableConcept();
        }
        this.maritalStatus.customDecode(in);
      }

    } else {
      for (int i = 0; i < 7; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.resourceType = in.readString(this.resourceType instanceof Utf8 ? (Utf8)this.resourceType : null);
          break;

        case 1:
          this.id = in.readString(this.id instanceof Utf8 ? (Utf8)this.id : null);
          break;

        case 2:
          long size0 = in.readArrayStart();
          java.util.List<io.carrera.fhir.avro.models.identifier_record> a0 = this.identifier;
          if (a0 == null) {
            a0 = new SpecificData.Array<io.carrera.fhir.avro.models.identifier_record>((int)size0, SCHEMA$.getField("identifier").schema());
            this.identifier = a0;
          } else a0.clear();
          SpecificData.Array<io.carrera.fhir.avro.models.identifier_record> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<io.carrera.fhir.avro.models.identifier_record>)a0 : null);
          for ( ; 0 < size0; size0 = in.arrayNext()) {
            for ( ; size0 != 0; size0--) {
              io.carrera.fhir.avro.models.identifier_record e0 = (ga0 != null ? ga0.peek() : null);
              if (e0 == null) {
                e0 = new io.carrera.fhir.avro.models.identifier_record();
              }
              e0.customDecode(in);
              a0.add(e0);
            }
          }
          break;

        case 3:
          long size1 = in.readArrayStart();
          java.util.List<io.carrera.fhir.avro.models.name_record> a1 = this.name;
          if (a1 == null) {
            a1 = new SpecificData.Array<io.carrera.fhir.avro.models.name_record>((int)size1, SCHEMA$.getField("name").schema());
            this.name = a1;
          } else a1.clear();
          SpecificData.Array<io.carrera.fhir.avro.models.name_record> ga1 = (a1 instanceof SpecificData.Array ? (SpecificData.Array<io.carrera.fhir.avro.models.name_record>)a1 : null);
          for ( ; 0 < size1; size1 = in.arrayNext()) {
            for ( ; size1 != 0; size1--) {
              io.carrera.fhir.avro.models.name_record e1 = (ga1 != null ? ga1.peek() : null);
              if (e1 == null) {
                e1 = new io.carrera.fhir.avro.models.name_record();
              }
              e1.customDecode(in);
              a1.add(e1);
            }
          }
          break;

        case 4:
          this.gender = in.readString(this.gender instanceof Utf8 ? (Utf8)this.gender : null);
          break;

        case 5:
          if (in.readIndex() != 1) {
            in.readNull();
            this.birthDate = null;
          } else {
            this.birthDate = in.readString(this.birthDate instanceof Utf8 ? (Utf8)this.birthDate : null);
          }
          break;

        case 6:
          if (in.readIndex() != 1) {
            in.readNull();
            this.maritalStatus = null;
          } else {
            if (this.maritalStatus == null) {
              this.maritalStatus = new io.carrera.fhir.avro.models.CodeableConcept();
            }
            this.maritalStatus.customDecode(in);
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










