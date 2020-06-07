/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.manning.pulsar.iiot.clutch;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class ClutchSensor extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 5216807985002897121L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ClutchSensor\",\"namespace\":\"com.manning.pulsar.iiot.clutch\",\"fields\":[{\"name\":\"sensor_id\",\"type\":\"int\"},{\"name\":\"bearing_1_temp\",\"type\":\"float\"},{\"name\":\"bearing_2_temp\",\"type\":\"float\"},{\"name\":\"bearing_3_temp\",\"type\":\"float\"},{\"name\":\"bearing_4_temp\",\"type\":\"float\"},{\"name\":\"bearing_5_temp\",\"type\":\"float\"},{\"name\":\"bearing_6_temp\",\"type\":\"float\"},{\"name\":\"thrust_bearing_temp\",\"type\":\"float\"},{\"name\":\"clutch_attitude\",\"type\":\"float\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<ClutchSensor> ENCODER =
      new BinaryMessageEncoder<ClutchSensor>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<ClutchSensor> DECODER =
      new BinaryMessageDecoder<ClutchSensor>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<ClutchSensor> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<ClutchSensor> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<ClutchSensor> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<ClutchSensor>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this ClutchSensor to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a ClutchSensor from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a ClutchSensor instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static ClutchSensor fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public int sensor_id;
  @Deprecated public float bearing_1_temp;
  @Deprecated public float bearing_2_temp;
  @Deprecated public float bearing_3_temp;
  @Deprecated public float bearing_4_temp;
  @Deprecated public float bearing_5_temp;
  @Deprecated public float bearing_6_temp;
  @Deprecated public float thrust_bearing_temp;
  @Deprecated public float clutch_attitude;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public ClutchSensor() {}

  /**
   * All-args constructor.
   * @param sensor_id The new value for sensor_id
   * @param bearing_1_temp The new value for bearing_1_temp
   * @param bearing_2_temp The new value for bearing_2_temp
   * @param bearing_3_temp The new value for bearing_3_temp
   * @param bearing_4_temp The new value for bearing_4_temp
   * @param bearing_5_temp The new value for bearing_5_temp
   * @param bearing_6_temp The new value for bearing_6_temp
   * @param thrust_bearing_temp The new value for thrust_bearing_temp
   * @param clutch_attitude The new value for clutch_attitude
   */
  public ClutchSensor(java.lang.Integer sensor_id, java.lang.Float bearing_1_temp, java.lang.Float bearing_2_temp, java.lang.Float bearing_3_temp, java.lang.Float bearing_4_temp, java.lang.Float bearing_5_temp, java.lang.Float bearing_6_temp, java.lang.Float thrust_bearing_temp, java.lang.Float clutch_attitude) {
    this.sensor_id = sensor_id;
    this.bearing_1_temp = bearing_1_temp;
    this.bearing_2_temp = bearing_2_temp;
    this.bearing_3_temp = bearing_3_temp;
    this.bearing_4_temp = bearing_4_temp;
    this.bearing_5_temp = bearing_5_temp;
    this.bearing_6_temp = bearing_6_temp;
    this.thrust_bearing_temp = thrust_bearing_temp;
    this.clutch_attitude = clutch_attitude;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return sensor_id;
    case 1: return bearing_1_temp;
    case 2: return bearing_2_temp;
    case 3: return bearing_3_temp;
    case 4: return bearing_4_temp;
    case 5: return bearing_5_temp;
    case 6: return bearing_6_temp;
    case 7: return thrust_bearing_temp;
    case 8: return clutch_attitude;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: sensor_id = (java.lang.Integer)value$; break;
    case 1: bearing_1_temp = (java.lang.Float)value$; break;
    case 2: bearing_2_temp = (java.lang.Float)value$; break;
    case 3: bearing_3_temp = (java.lang.Float)value$; break;
    case 4: bearing_4_temp = (java.lang.Float)value$; break;
    case 5: bearing_5_temp = (java.lang.Float)value$; break;
    case 6: bearing_6_temp = (java.lang.Float)value$; break;
    case 7: thrust_bearing_temp = (java.lang.Float)value$; break;
    case 8: clutch_attitude = (java.lang.Float)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'sensor_id' field.
   * @return The value of the 'sensor_id' field.
   */
  public int getSensorId() {
    return sensor_id;
  }


  /**
   * Sets the value of the 'sensor_id' field.
   * @param value the value to set.
   */
  public void setSensorId(int value) {
    this.sensor_id = value;
  }

  /**
   * Gets the value of the 'bearing_1_temp' field.
   * @return The value of the 'bearing_1_temp' field.
   */
  public float getBearing1Temp() {
    return bearing_1_temp;
  }


  /**
   * Sets the value of the 'bearing_1_temp' field.
   * @param value the value to set.
   */
  public void setBearing1Temp(float value) {
    this.bearing_1_temp = value;
  }

  /**
   * Gets the value of the 'bearing_2_temp' field.
   * @return The value of the 'bearing_2_temp' field.
   */
  public float getBearing2Temp() {
    return bearing_2_temp;
  }


  /**
   * Sets the value of the 'bearing_2_temp' field.
   * @param value the value to set.
   */
  public void setBearing2Temp(float value) {
    this.bearing_2_temp = value;
  }

  /**
   * Gets the value of the 'bearing_3_temp' field.
   * @return The value of the 'bearing_3_temp' field.
   */
  public float getBearing3Temp() {
    return bearing_3_temp;
  }


  /**
   * Sets the value of the 'bearing_3_temp' field.
   * @param value the value to set.
   */
  public void setBearing3Temp(float value) {
    this.bearing_3_temp = value;
  }

  /**
   * Gets the value of the 'bearing_4_temp' field.
   * @return The value of the 'bearing_4_temp' field.
   */
  public float getBearing4Temp() {
    return bearing_4_temp;
  }


  /**
   * Sets the value of the 'bearing_4_temp' field.
   * @param value the value to set.
   */
  public void setBearing4Temp(float value) {
    this.bearing_4_temp = value;
  }

  /**
   * Gets the value of the 'bearing_5_temp' field.
   * @return The value of the 'bearing_5_temp' field.
   */
  public float getBearing5Temp() {
    return bearing_5_temp;
  }


  /**
   * Sets the value of the 'bearing_5_temp' field.
   * @param value the value to set.
   */
  public void setBearing5Temp(float value) {
    this.bearing_5_temp = value;
  }

  /**
   * Gets the value of the 'bearing_6_temp' field.
   * @return The value of the 'bearing_6_temp' field.
   */
  public float getBearing6Temp() {
    return bearing_6_temp;
  }


  /**
   * Sets the value of the 'bearing_6_temp' field.
   * @param value the value to set.
   */
  public void setBearing6Temp(float value) {
    this.bearing_6_temp = value;
  }

  /**
   * Gets the value of the 'thrust_bearing_temp' field.
   * @return The value of the 'thrust_bearing_temp' field.
   */
  public float getThrustBearingTemp() {
    return thrust_bearing_temp;
  }


  /**
   * Sets the value of the 'thrust_bearing_temp' field.
   * @param value the value to set.
   */
  public void setThrustBearingTemp(float value) {
    this.thrust_bearing_temp = value;
  }

  /**
   * Gets the value of the 'clutch_attitude' field.
   * @return The value of the 'clutch_attitude' field.
   */
  public float getClutchAttitude() {
    return clutch_attitude;
  }


  /**
   * Sets the value of the 'clutch_attitude' field.
   * @param value the value to set.
   */
  public void setClutchAttitude(float value) {
    this.clutch_attitude = value;
  }

  /**
   * Creates a new ClutchSensor RecordBuilder.
   * @return A new ClutchSensor RecordBuilder
   */
  public static com.manning.pulsar.iiot.clutch.ClutchSensor.Builder newBuilder() {
    return new com.manning.pulsar.iiot.clutch.ClutchSensor.Builder();
  }

  /**
   * Creates a new ClutchSensor RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new ClutchSensor RecordBuilder
   */
  public static com.manning.pulsar.iiot.clutch.ClutchSensor.Builder newBuilder(com.manning.pulsar.iiot.clutch.ClutchSensor.Builder other) {
    if (other == null) {
      return new com.manning.pulsar.iiot.clutch.ClutchSensor.Builder();
    } else {
      return new com.manning.pulsar.iiot.clutch.ClutchSensor.Builder(other);
    }
  }

  /**
   * Creates a new ClutchSensor RecordBuilder by copying an existing ClutchSensor instance.
   * @param other The existing instance to copy.
   * @return A new ClutchSensor RecordBuilder
   */
  public static com.manning.pulsar.iiot.clutch.ClutchSensor.Builder newBuilder(com.manning.pulsar.iiot.clutch.ClutchSensor other) {
    if (other == null) {
      return new com.manning.pulsar.iiot.clutch.ClutchSensor.Builder();
    } else {
      return new com.manning.pulsar.iiot.clutch.ClutchSensor.Builder(other);
    }
  }

  /**
   * RecordBuilder for ClutchSensor instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ClutchSensor>
    implements org.apache.avro.data.RecordBuilder<ClutchSensor> {

    private int sensor_id;
    private float bearing_1_temp;
    private float bearing_2_temp;
    private float bearing_3_temp;
    private float bearing_4_temp;
    private float bearing_5_temp;
    private float bearing_6_temp;
    private float thrust_bearing_temp;
    private float clutch_attitude;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.manning.pulsar.iiot.clutch.ClutchSensor.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.sensor_id)) {
        this.sensor_id = data().deepCopy(fields()[0].schema(), other.sensor_id);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.bearing_1_temp)) {
        this.bearing_1_temp = data().deepCopy(fields()[1].schema(), other.bearing_1_temp);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.bearing_2_temp)) {
        this.bearing_2_temp = data().deepCopy(fields()[2].schema(), other.bearing_2_temp);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.bearing_3_temp)) {
        this.bearing_3_temp = data().deepCopy(fields()[3].schema(), other.bearing_3_temp);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.bearing_4_temp)) {
        this.bearing_4_temp = data().deepCopy(fields()[4].schema(), other.bearing_4_temp);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.bearing_5_temp)) {
        this.bearing_5_temp = data().deepCopy(fields()[5].schema(), other.bearing_5_temp);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
      if (isValidValue(fields()[6], other.bearing_6_temp)) {
        this.bearing_6_temp = data().deepCopy(fields()[6].schema(), other.bearing_6_temp);
        fieldSetFlags()[6] = other.fieldSetFlags()[6];
      }
      if (isValidValue(fields()[7], other.thrust_bearing_temp)) {
        this.thrust_bearing_temp = data().deepCopy(fields()[7].schema(), other.thrust_bearing_temp);
        fieldSetFlags()[7] = other.fieldSetFlags()[7];
      }
      if (isValidValue(fields()[8], other.clutch_attitude)) {
        this.clutch_attitude = data().deepCopy(fields()[8].schema(), other.clutch_attitude);
        fieldSetFlags()[8] = other.fieldSetFlags()[8];
      }
    }

    /**
     * Creates a Builder by copying an existing ClutchSensor instance
     * @param other The existing instance to copy.
     */
    private Builder(com.manning.pulsar.iiot.clutch.ClutchSensor other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.sensor_id)) {
        this.sensor_id = data().deepCopy(fields()[0].schema(), other.sensor_id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.bearing_1_temp)) {
        this.bearing_1_temp = data().deepCopy(fields()[1].schema(), other.bearing_1_temp);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.bearing_2_temp)) {
        this.bearing_2_temp = data().deepCopy(fields()[2].schema(), other.bearing_2_temp);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.bearing_3_temp)) {
        this.bearing_3_temp = data().deepCopy(fields()[3].schema(), other.bearing_3_temp);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.bearing_4_temp)) {
        this.bearing_4_temp = data().deepCopy(fields()[4].schema(), other.bearing_4_temp);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.bearing_5_temp)) {
        this.bearing_5_temp = data().deepCopy(fields()[5].schema(), other.bearing_5_temp);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.bearing_6_temp)) {
        this.bearing_6_temp = data().deepCopy(fields()[6].schema(), other.bearing_6_temp);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.thrust_bearing_temp)) {
        this.thrust_bearing_temp = data().deepCopy(fields()[7].schema(), other.thrust_bearing_temp);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.clutch_attitude)) {
        this.clutch_attitude = data().deepCopy(fields()[8].schema(), other.clutch_attitude);
        fieldSetFlags()[8] = true;
      }
    }

    /**
      * Gets the value of the 'sensor_id' field.
      * @return The value.
      */
    public int getSensorId() {
      return sensor_id;
    }


    /**
      * Sets the value of the 'sensor_id' field.
      * @param value The value of 'sensor_id'.
      * @return This builder.
      */
    public com.manning.pulsar.iiot.clutch.ClutchSensor.Builder setSensorId(int value) {
      validate(fields()[0], value);
      this.sensor_id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'sensor_id' field has been set.
      * @return True if the 'sensor_id' field has been set, false otherwise.
      */
    public boolean hasSensorId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'sensor_id' field.
      * @return This builder.
      */
    public com.manning.pulsar.iiot.clutch.ClutchSensor.Builder clearSensorId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'bearing_1_temp' field.
      * @return The value.
      */
    public float getBearing1Temp() {
      return bearing_1_temp;
    }


    /**
      * Sets the value of the 'bearing_1_temp' field.
      * @param value The value of 'bearing_1_temp'.
      * @return This builder.
      */
    public com.manning.pulsar.iiot.clutch.ClutchSensor.Builder setBearing1Temp(float value) {
      validate(fields()[1], value);
      this.bearing_1_temp = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'bearing_1_temp' field has been set.
      * @return True if the 'bearing_1_temp' field has been set, false otherwise.
      */
    public boolean hasBearing1Temp() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'bearing_1_temp' field.
      * @return This builder.
      */
    public com.manning.pulsar.iiot.clutch.ClutchSensor.Builder clearBearing1Temp() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'bearing_2_temp' field.
      * @return The value.
      */
    public float getBearing2Temp() {
      return bearing_2_temp;
    }


    /**
      * Sets the value of the 'bearing_2_temp' field.
      * @param value The value of 'bearing_2_temp'.
      * @return This builder.
      */
    public com.manning.pulsar.iiot.clutch.ClutchSensor.Builder setBearing2Temp(float value) {
      validate(fields()[2], value);
      this.bearing_2_temp = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'bearing_2_temp' field has been set.
      * @return True if the 'bearing_2_temp' field has been set, false otherwise.
      */
    public boolean hasBearing2Temp() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'bearing_2_temp' field.
      * @return This builder.
      */
    public com.manning.pulsar.iiot.clutch.ClutchSensor.Builder clearBearing2Temp() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'bearing_3_temp' field.
      * @return The value.
      */
    public float getBearing3Temp() {
      return bearing_3_temp;
    }


    /**
      * Sets the value of the 'bearing_3_temp' field.
      * @param value The value of 'bearing_3_temp'.
      * @return This builder.
      */
    public com.manning.pulsar.iiot.clutch.ClutchSensor.Builder setBearing3Temp(float value) {
      validate(fields()[3], value);
      this.bearing_3_temp = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'bearing_3_temp' field has been set.
      * @return True if the 'bearing_3_temp' field has been set, false otherwise.
      */
    public boolean hasBearing3Temp() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'bearing_3_temp' field.
      * @return This builder.
      */
    public com.manning.pulsar.iiot.clutch.ClutchSensor.Builder clearBearing3Temp() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'bearing_4_temp' field.
      * @return The value.
      */
    public float getBearing4Temp() {
      return bearing_4_temp;
    }


    /**
      * Sets the value of the 'bearing_4_temp' field.
      * @param value The value of 'bearing_4_temp'.
      * @return This builder.
      */
    public com.manning.pulsar.iiot.clutch.ClutchSensor.Builder setBearing4Temp(float value) {
      validate(fields()[4], value);
      this.bearing_4_temp = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'bearing_4_temp' field has been set.
      * @return True if the 'bearing_4_temp' field has been set, false otherwise.
      */
    public boolean hasBearing4Temp() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'bearing_4_temp' field.
      * @return This builder.
      */
    public com.manning.pulsar.iiot.clutch.ClutchSensor.Builder clearBearing4Temp() {
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'bearing_5_temp' field.
      * @return The value.
      */
    public float getBearing5Temp() {
      return bearing_5_temp;
    }


    /**
      * Sets the value of the 'bearing_5_temp' field.
      * @param value The value of 'bearing_5_temp'.
      * @return This builder.
      */
    public com.manning.pulsar.iiot.clutch.ClutchSensor.Builder setBearing5Temp(float value) {
      validate(fields()[5], value);
      this.bearing_5_temp = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'bearing_5_temp' field has been set.
      * @return True if the 'bearing_5_temp' field has been set, false otherwise.
      */
    public boolean hasBearing5Temp() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'bearing_5_temp' field.
      * @return This builder.
      */
    public com.manning.pulsar.iiot.clutch.ClutchSensor.Builder clearBearing5Temp() {
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'bearing_6_temp' field.
      * @return The value.
      */
    public float getBearing6Temp() {
      return bearing_6_temp;
    }


    /**
      * Sets the value of the 'bearing_6_temp' field.
      * @param value The value of 'bearing_6_temp'.
      * @return This builder.
      */
    public com.manning.pulsar.iiot.clutch.ClutchSensor.Builder setBearing6Temp(float value) {
      validate(fields()[6], value);
      this.bearing_6_temp = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'bearing_6_temp' field has been set.
      * @return True if the 'bearing_6_temp' field has been set, false otherwise.
      */
    public boolean hasBearing6Temp() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'bearing_6_temp' field.
      * @return This builder.
      */
    public com.manning.pulsar.iiot.clutch.ClutchSensor.Builder clearBearing6Temp() {
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'thrust_bearing_temp' field.
      * @return The value.
      */
    public float getThrustBearingTemp() {
      return thrust_bearing_temp;
    }


    /**
      * Sets the value of the 'thrust_bearing_temp' field.
      * @param value The value of 'thrust_bearing_temp'.
      * @return This builder.
      */
    public com.manning.pulsar.iiot.clutch.ClutchSensor.Builder setThrustBearingTemp(float value) {
      validate(fields()[7], value);
      this.thrust_bearing_temp = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'thrust_bearing_temp' field has been set.
      * @return True if the 'thrust_bearing_temp' field has been set, false otherwise.
      */
    public boolean hasThrustBearingTemp() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'thrust_bearing_temp' field.
      * @return This builder.
      */
    public com.manning.pulsar.iiot.clutch.ClutchSensor.Builder clearThrustBearingTemp() {
      fieldSetFlags()[7] = false;
      return this;
    }

    /**
      * Gets the value of the 'clutch_attitude' field.
      * @return The value.
      */
    public float getClutchAttitude() {
      return clutch_attitude;
    }


    /**
      * Sets the value of the 'clutch_attitude' field.
      * @param value The value of 'clutch_attitude'.
      * @return This builder.
      */
    public com.manning.pulsar.iiot.clutch.ClutchSensor.Builder setClutchAttitude(float value) {
      validate(fields()[8], value);
      this.clutch_attitude = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /**
      * Checks whether the 'clutch_attitude' field has been set.
      * @return True if the 'clutch_attitude' field has been set, false otherwise.
      */
    public boolean hasClutchAttitude() {
      return fieldSetFlags()[8];
    }


    /**
      * Clears the value of the 'clutch_attitude' field.
      * @return This builder.
      */
    public com.manning.pulsar.iiot.clutch.ClutchSensor.Builder clearClutchAttitude() {
      fieldSetFlags()[8] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public ClutchSensor build() {
      try {
        ClutchSensor record = new ClutchSensor();
        record.sensor_id = fieldSetFlags()[0] ? this.sensor_id : (java.lang.Integer) defaultValue(fields()[0]);
        record.bearing_1_temp = fieldSetFlags()[1] ? this.bearing_1_temp : (java.lang.Float) defaultValue(fields()[1]);
        record.bearing_2_temp = fieldSetFlags()[2] ? this.bearing_2_temp : (java.lang.Float) defaultValue(fields()[2]);
        record.bearing_3_temp = fieldSetFlags()[3] ? this.bearing_3_temp : (java.lang.Float) defaultValue(fields()[3]);
        record.bearing_4_temp = fieldSetFlags()[4] ? this.bearing_4_temp : (java.lang.Float) defaultValue(fields()[4]);
        record.bearing_5_temp = fieldSetFlags()[5] ? this.bearing_5_temp : (java.lang.Float) defaultValue(fields()[5]);
        record.bearing_6_temp = fieldSetFlags()[6] ? this.bearing_6_temp : (java.lang.Float) defaultValue(fields()[6]);
        record.thrust_bearing_temp = fieldSetFlags()[7] ? this.thrust_bearing_temp : (java.lang.Float) defaultValue(fields()[7]);
        record.clutch_attitude = fieldSetFlags()[8] ? this.clutch_attitude : (java.lang.Float) defaultValue(fields()[8]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<ClutchSensor>
    WRITER$ = (org.apache.avro.io.DatumWriter<ClutchSensor>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<ClutchSensor>
    READER$ = (org.apache.avro.io.DatumReader<ClutchSensor>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeInt(this.sensor_id);

    out.writeFloat(this.bearing_1_temp);

    out.writeFloat(this.bearing_2_temp);

    out.writeFloat(this.bearing_3_temp);

    out.writeFloat(this.bearing_4_temp);

    out.writeFloat(this.bearing_5_temp);

    out.writeFloat(this.bearing_6_temp);

    out.writeFloat(this.thrust_bearing_temp);

    out.writeFloat(this.clutch_attitude);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.sensor_id = in.readInt();

      this.bearing_1_temp = in.readFloat();

      this.bearing_2_temp = in.readFloat();

      this.bearing_3_temp = in.readFloat();

      this.bearing_4_temp = in.readFloat();

      this.bearing_5_temp = in.readFloat();

      this.bearing_6_temp = in.readFloat();

      this.thrust_bearing_temp = in.readFloat();

      this.clutch_attitude = in.readFloat();

    } else {
      for (int i = 0; i < 9; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.sensor_id = in.readInt();
          break;

        case 1:
          this.bearing_1_temp = in.readFloat();
          break;

        case 2:
          this.bearing_2_temp = in.readFloat();
          break;

        case 3:
          this.bearing_3_temp = in.readFloat();
          break;

        case 4:
          this.bearing_4_temp = in.readFloat();
          break;

        case 5:
          this.bearing_5_temp = in.readFloat();
          break;

        case 6:
          this.bearing_6_temp = in.readFloat();
          break;

        case 7:
          this.thrust_bearing_temp = in.readFloat();
          break;

        case 8:
          this.clutch_attitude = in.readFloat();
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










