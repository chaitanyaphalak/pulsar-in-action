/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.manning.pulsar.iiot.oilcooler;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class OilCoolerSensor extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 5652121809275217959L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"OilCoolerSensor\",\"namespace\":\"com.manning.pulsar.iiot.oilcooler\",\"fields\":[{\"name\":\"sensor_id\",\"type\":\"int\"},{\"name\":\"lubricating_oil_temp\",\"type\":\"double\"},{\"name\":\"lubricating_oil_pressure\",\"type\":\"double\"},{\"name\":\"oil_temp_back\",\"type\":\"double\"},{\"name\":\"oil_temp_front\",\"type\":\"double\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<OilCoolerSensor> ENCODER =
      new BinaryMessageEncoder<OilCoolerSensor>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<OilCoolerSensor> DECODER =
      new BinaryMessageDecoder<OilCoolerSensor>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<OilCoolerSensor> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<OilCoolerSensor> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<OilCoolerSensor> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<OilCoolerSensor>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this OilCoolerSensor to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a OilCoolerSensor from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a OilCoolerSensor instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static OilCoolerSensor fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public int sensor_id;
  @Deprecated public double lubricating_oil_temp;
  @Deprecated public double lubricating_oil_pressure;
  @Deprecated public double oil_temp_back;
  @Deprecated public double oil_temp_front;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public OilCoolerSensor() {}

  /**
   * All-args constructor.
   * @param sensor_id The new value for sensor_id
   * @param lubricating_oil_temp The new value for lubricating_oil_temp
   * @param lubricating_oil_pressure The new value for lubricating_oil_pressure
   * @param oil_temp_back The new value for oil_temp_back
   * @param oil_temp_front The new value for oil_temp_front
   */
  public OilCoolerSensor(java.lang.Integer sensor_id, java.lang.Double lubricating_oil_temp, java.lang.Double lubricating_oil_pressure, java.lang.Double oil_temp_back, java.lang.Double oil_temp_front) {
    this.sensor_id = sensor_id;
    this.lubricating_oil_temp = lubricating_oil_temp;
    this.lubricating_oil_pressure = lubricating_oil_pressure;
    this.oil_temp_back = oil_temp_back;
    this.oil_temp_front = oil_temp_front;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return sensor_id;
    case 1: return lubricating_oil_temp;
    case 2: return lubricating_oil_pressure;
    case 3: return oil_temp_back;
    case 4: return oil_temp_front;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: sensor_id = (java.lang.Integer)value$; break;
    case 1: lubricating_oil_temp = (java.lang.Double)value$; break;
    case 2: lubricating_oil_pressure = (java.lang.Double)value$; break;
    case 3: oil_temp_back = (java.lang.Double)value$; break;
    case 4: oil_temp_front = (java.lang.Double)value$; break;
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
   * Gets the value of the 'lubricating_oil_temp' field.
   * @return The value of the 'lubricating_oil_temp' field.
   */
  public double getLubricatingOilTemp() {
    return lubricating_oil_temp;
  }


  /**
   * Sets the value of the 'lubricating_oil_temp' field.
   * @param value the value to set.
   */
  public void setLubricatingOilTemp(double value) {
    this.lubricating_oil_temp = value;
  }

  /**
   * Gets the value of the 'lubricating_oil_pressure' field.
   * @return The value of the 'lubricating_oil_pressure' field.
   */
  public double getLubricatingOilPressure() {
    return lubricating_oil_pressure;
  }


  /**
   * Sets the value of the 'lubricating_oil_pressure' field.
   * @param value the value to set.
   */
  public void setLubricatingOilPressure(double value) {
    this.lubricating_oil_pressure = value;
  }

  /**
   * Gets the value of the 'oil_temp_back' field.
   * @return The value of the 'oil_temp_back' field.
   */
  public double getOilTempBack() {
    return oil_temp_back;
  }


  /**
   * Sets the value of the 'oil_temp_back' field.
   * @param value the value to set.
   */
  public void setOilTempBack(double value) {
    this.oil_temp_back = value;
  }

  /**
   * Gets the value of the 'oil_temp_front' field.
   * @return The value of the 'oil_temp_front' field.
   */
  public double getOilTempFront() {
    return oil_temp_front;
  }


  /**
   * Sets the value of the 'oil_temp_front' field.
   * @param value the value to set.
   */
  public void setOilTempFront(double value) {
    this.oil_temp_front = value;
  }

  /**
   * Creates a new OilCoolerSensor RecordBuilder.
   * @return A new OilCoolerSensor RecordBuilder
   */
  public static com.manning.pulsar.iiot.oilcooler.OilCoolerSensor.Builder newBuilder() {
    return new com.manning.pulsar.iiot.oilcooler.OilCoolerSensor.Builder();
  }

  /**
   * Creates a new OilCoolerSensor RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new OilCoolerSensor RecordBuilder
   */
  public static com.manning.pulsar.iiot.oilcooler.OilCoolerSensor.Builder newBuilder(com.manning.pulsar.iiot.oilcooler.OilCoolerSensor.Builder other) {
    if (other == null) {
      return new com.manning.pulsar.iiot.oilcooler.OilCoolerSensor.Builder();
    } else {
      return new com.manning.pulsar.iiot.oilcooler.OilCoolerSensor.Builder(other);
    }
  }

  /**
   * Creates a new OilCoolerSensor RecordBuilder by copying an existing OilCoolerSensor instance.
   * @param other The existing instance to copy.
   * @return A new OilCoolerSensor RecordBuilder
   */
  public static com.manning.pulsar.iiot.oilcooler.OilCoolerSensor.Builder newBuilder(com.manning.pulsar.iiot.oilcooler.OilCoolerSensor other) {
    if (other == null) {
      return new com.manning.pulsar.iiot.oilcooler.OilCoolerSensor.Builder();
    } else {
      return new com.manning.pulsar.iiot.oilcooler.OilCoolerSensor.Builder(other);
    }
  }

  /**
   * RecordBuilder for OilCoolerSensor instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<OilCoolerSensor>
    implements org.apache.avro.data.RecordBuilder<OilCoolerSensor> {

    private int sensor_id;
    private double lubricating_oil_temp;
    private double lubricating_oil_pressure;
    private double oil_temp_back;
    private double oil_temp_front;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.manning.pulsar.iiot.oilcooler.OilCoolerSensor.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.sensor_id)) {
        this.sensor_id = data().deepCopy(fields()[0].schema(), other.sensor_id);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.lubricating_oil_temp)) {
        this.lubricating_oil_temp = data().deepCopy(fields()[1].schema(), other.lubricating_oil_temp);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.lubricating_oil_pressure)) {
        this.lubricating_oil_pressure = data().deepCopy(fields()[2].schema(), other.lubricating_oil_pressure);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.oil_temp_back)) {
        this.oil_temp_back = data().deepCopy(fields()[3].schema(), other.oil_temp_back);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.oil_temp_front)) {
        this.oil_temp_front = data().deepCopy(fields()[4].schema(), other.oil_temp_front);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
    }

    /**
     * Creates a Builder by copying an existing OilCoolerSensor instance
     * @param other The existing instance to copy.
     */
    private Builder(com.manning.pulsar.iiot.oilcooler.OilCoolerSensor other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.sensor_id)) {
        this.sensor_id = data().deepCopy(fields()[0].schema(), other.sensor_id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.lubricating_oil_temp)) {
        this.lubricating_oil_temp = data().deepCopy(fields()[1].schema(), other.lubricating_oil_temp);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.lubricating_oil_pressure)) {
        this.lubricating_oil_pressure = data().deepCopy(fields()[2].schema(), other.lubricating_oil_pressure);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.oil_temp_back)) {
        this.oil_temp_back = data().deepCopy(fields()[3].schema(), other.oil_temp_back);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.oil_temp_front)) {
        this.oil_temp_front = data().deepCopy(fields()[4].schema(), other.oil_temp_front);
        fieldSetFlags()[4] = true;
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
    public com.manning.pulsar.iiot.oilcooler.OilCoolerSensor.Builder setSensorId(int value) {
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
    public com.manning.pulsar.iiot.oilcooler.OilCoolerSensor.Builder clearSensorId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'lubricating_oil_temp' field.
      * @return The value.
      */
    public double getLubricatingOilTemp() {
      return lubricating_oil_temp;
    }


    /**
      * Sets the value of the 'lubricating_oil_temp' field.
      * @param value The value of 'lubricating_oil_temp'.
      * @return This builder.
      */
    public com.manning.pulsar.iiot.oilcooler.OilCoolerSensor.Builder setLubricatingOilTemp(double value) {
      validate(fields()[1], value);
      this.lubricating_oil_temp = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'lubricating_oil_temp' field has been set.
      * @return True if the 'lubricating_oil_temp' field has been set, false otherwise.
      */
    public boolean hasLubricatingOilTemp() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'lubricating_oil_temp' field.
      * @return This builder.
      */
    public com.manning.pulsar.iiot.oilcooler.OilCoolerSensor.Builder clearLubricatingOilTemp() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'lubricating_oil_pressure' field.
      * @return The value.
      */
    public double getLubricatingOilPressure() {
      return lubricating_oil_pressure;
    }


    /**
      * Sets the value of the 'lubricating_oil_pressure' field.
      * @param value The value of 'lubricating_oil_pressure'.
      * @return This builder.
      */
    public com.manning.pulsar.iiot.oilcooler.OilCoolerSensor.Builder setLubricatingOilPressure(double value) {
      validate(fields()[2], value);
      this.lubricating_oil_pressure = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'lubricating_oil_pressure' field has been set.
      * @return True if the 'lubricating_oil_pressure' field has been set, false otherwise.
      */
    public boolean hasLubricatingOilPressure() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'lubricating_oil_pressure' field.
      * @return This builder.
      */
    public com.manning.pulsar.iiot.oilcooler.OilCoolerSensor.Builder clearLubricatingOilPressure() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'oil_temp_back' field.
      * @return The value.
      */
    public double getOilTempBack() {
      return oil_temp_back;
    }


    /**
      * Sets the value of the 'oil_temp_back' field.
      * @param value The value of 'oil_temp_back'.
      * @return This builder.
      */
    public com.manning.pulsar.iiot.oilcooler.OilCoolerSensor.Builder setOilTempBack(double value) {
      validate(fields()[3], value);
      this.oil_temp_back = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'oil_temp_back' field has been set.
      * @return True if the 'oil_temp_back' field has been set, false otherwise.
      */
    public boolean hasOilTempBack() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'oil_temp_back' field.
      * @return This builder.
      */
    public com.manning.pulsar.iiot.oilcooler.OilCoolerSensor.Builder clearOilTempBack() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'oil_temp_front' field.
      * @return The value.
      */
    public double getOilTempFront() {
      return oil_temp_front;
    }


    /**
      * Sets the value of the 'oil_temp_front' field.
      * @param value The value of 'oil_temp_front'.
      * @return This builder.
      */
    public com.manning.pulsar.iiot.oilcooler.OilCoolerSensor.Builder setOilTempFront(double value) {
      validate(fields()[4], value);
      this.oil_temp_front = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'oil_temp_front' field has been set.
      * @return True if the 'oil_temp_front' field has been set, false otherwise.
      */
    public boolean hasOilTempFront() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'oil_temp_front' field.
      * @return This builder.
      */
    public com.manning.pulsar.iiot.oilcooler.OilCoolerSensor.Builder clearOilTempFront() {
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public OilCoolerSensor build() {
      try {
        OilCoolerSensor record = new OilCoolerSensor();
        record.sensor_id = fieldSetFlags()[0] ? this.sensor_id : (java.lang.Integer) defaultValue(fields()[0]);
        record.lubricating_oil_temp = fieldSetFlags()[1] ? this.lubricating_oil_temp : (java.lang.Double) defaultValue(fields()[1]);
        record.lubricating_oil_pressure = fieldSetFlags()[2] ? this.lubricating_oil_pressure : (java.lang.Double) defaultValue(fields()[2]);
        record.oil_temp_back = fieldSetFlags()[3] ? this.oil_temp_back : (java.lang.Double) defaultValue(fields()[3]);
        record.oil_temp_front = fieldSetFlags()[4] ? this.oil_temp_front : (java.lang.Double) defaultValue(fields()[4]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<OilCoolerSensor>
    WRITER$ = (org.apache.avro.io.DatumWriter<OilCoolerSensor>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<OilCoolerSensor>
    READER$ = (org.apache.avro.io.DatumReader<OilCoolerSensor>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeInt(this.sensor_id);

    out.writeDouble(this.lubricating_oil_temp);

    out.writeDouble(this.lubricating_oil_pressure);

    out.writeDouble(this.oil_temp_back);

    out.writeDouble(this.oil_temp_front);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.sensor_id = in.readInt();

      this.lubricating_oil_temp = in.readDouble();

      this.lubricating_oil_pressure = in.readDouble();

      this.oil_temp_back = in.readDouble();

      this.oil_temp_front = in.readDouble();

    } else {
      for (int i = 0; i < 5; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.sensor_id = in.readInt();
          break;

        case 1:
          this.lubricating_oil_temp = in.readDouble();
          break;

        case 2:
          this.lubricating_oil_pressure = in.readDouble();
          break;

        case 3:
          this.oil_temp_back = in.readDouble();
          break;

        case 4:
          this.oil_temp_front = in.readDouble();
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










