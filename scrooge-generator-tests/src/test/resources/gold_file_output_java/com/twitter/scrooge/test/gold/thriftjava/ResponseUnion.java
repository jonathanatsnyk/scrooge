/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package com.twitter.scrooge.test.gold.thriftjava;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;

import org.apache.thrift.*;
import org.apache.thrift.async.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.transport.*;
import org.apache.thrift.protocol.*;

import com.twitter.scrooge.ThriftStructIface;
import com.twitter.scrooge.UtilValidator;
import com.twitter.scrooge.thrift_validation.BaseValidator;
import com.twitter.scrooge.thrift_validation.ThriftValidationViolation;
import com.twitter.scrooge.TFieldBlob;
import com.twitter.scrooge.internal.TProtocols;

// No additional import required for struct/union.

public class ResponseUnion extends TUnion<ResponseUnion, ResponseUnion._Fields> {
  private static final TStruct STRUCT_DESC = new TStruct("ResponseUnion");

  private static final TField ID_FIELD_DESC = new TField("id", TType.I64, (short)1);
  private static final TField DETAILS_FIELD_DESC = new TField("details", TType.STRING, (short)2);

  /** The set of fields this object contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    UNKNOWN_PASSTHROUGH((short)-1, "unknown_passthrough"),
    ID((short)1, "id"),
    DETAILS((short)2, "details");
  
    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();
  
    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }
  
    /**
     * Find the _Fields constant that matches fieldId, or unknown passthrough if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ID
          return ID;
        case 2: // DETAILS
          return DETAILS;
        default:
          UNKNOWN_PASSTHROUGH._thriftId = (short)fieldId;
          return UNKNOWN_PASSTHROUGH;
      }
    }
  
    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }
  
    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }
  
    private short _thriftId;
    private final String _fieldName;
  
    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }
  
    public short getThriftFieldId() {
      return _thriftId;
    }
  
    public String getFieldName() {
      return _fieldName;
    }
  }

  public static final Map<_Fields, FieldMetaData> metaDataMap;
  
  /**
   * FieldValueMetaData.type returns TType.STRING for both string and binary field values.
   * This set can be used to determine if a FieldValueMetaData with type TType.STRING is actually
   * declared as binary in the idl file.
   */
  public static final Set<FieldValueMetaData> binaryFieldValueMetaDatas;
  
  private static FieldValueMetaData registerBinaryFieldValueMetaData(FieldValueMetaData f, Set<FieldValueMetaData> binaryFieldValues) {
    binaryFieldValues.add(f);
    return f;
  }
  
  static {
    Map<_Fields, FieldMetaData> tmpMap = new EnumMap<_Fields, FieldMetaData>(_Fields.class);
    Set<FieldValueMetaData> tmpSet = new HashSet<FieldValueMetaData>();
    tmpMap.put(_Fields.ID, new FieldMetaData("id", TFieldRequirementType.DEFAULT,
      new FieldValueMetaData(TType.I64)));
    tmpMap.put(_Fields.DETAILS, new FieldMetaData("details", TFieldRequirementType.DEFAULT,
      new FieldValueMetaData(TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    binaryFieldValueMetaDatas = Collections.unmodifiableSet(tmpSet);
    FieldMetaData.addStructMetaDataMap(ResponseUnion.class, metaDataMap);
  }

  /**
   * Returns a map of the annotations and their values for this struct declaration.
   * See fieldAnnotations or valueAnnotations for the annotations attached to struct fields
   * or enum values.
   */
  public static final Map<String, String> structAnnotations;
  static {
    Map<String, String> tmpMap = new HashMap<String, String>();
    tmpMap.put("u.annotation", "y");
    structAnnotations = Collections.unmodifiableMap(tmpMap);
  }

  /**
   * Returns a map of the annotations for each of this struct's fields, keyed by the field.
   * See structAnnotations for the annotations attached to this struct's declaration.
   */
  public static final Map<_Fields, Map<String, String>> fieldAnnotations;
  static {
    Map<_Fields, Map<String, String>> tmpMap = new EnumMap<_Fields, Map<String, String>>(_Fields.class);
      {
        Map<String, String> tmpFieldMap = new HashMap<String, String>();
        tmpFieldMap.put("u.field.annotation", "x");
        tmpMap.put(_Fields.DETAILS, Collections.unmodifiableMap(tmpFieldMap));
      }
    fieldAnnotations = Collections.unmodifiableMap(tmpMap);
  }


  public ResponseUnion() {
    super();
  }

  public ResponseUnion(_Fields setField, Object value) {
    super(setField, value);
  }

  public ResponseUnion(ResponseUnion other) {
    super(other);
  }

  public static List<String> validateNewInstance(ResponseUnion item) {
    final List<String> buf = new ArrayList<String>();
    final TFieldIdEnum setField = item.getSetField();

    if (setField != null) {
      final short thriftFieldId = setField.getThriftFieldId();
    } else {
      buf.add("No fields set for union type 'ResponseUnion'.");
    }
    return buf;
  }

  public static Set<ThriftValidationViolation> validateInstanceValue(ResponseUnion item) {
    final Set<ThriftValidationViolation> violations = new HashSet<ThriftValidationViolation>();
    _Fields field = item.getSetField();
    Map<String, String> annotations = fieldAnnotations.get(field);
    if (annotations != null) {
      final BaseValidator validator = new UtilValidator();
      violations.addAll(validator.validateField(field.getFieldName(), item.getFieldValue(), annotations));
    }

    return violations;
  }

  public ResponseUnion deepCopy() {
    return new ResponseUnion(this);
  }

  public static ResponseUnion id(long value) {
    ResponseUnion x = new ResponseUnion();
    x.setId(value);
    return x;
  }
  public static ResponseUnion details(String value) {
    ResponseUnion x = new ResponseUnion();
    x.setDetails(value);
    return x;
  }

  @java.lang.Override
  protected void checkType(_Fields setField, Object value) throws ClassCastException {
    switch (setField) {
      case ID:
        if (value instanceof Long) {
          break;
        }
        throw new ClassCastException("Was expecting value of type Long for field 'id', but got " + value.getClass().getSimpleName());
      case DETAILS:
        if (value instanceof String) {
          break;
        }
        throw new ClassCastException("Was expecting value of type String for field 'details', but got " + value.getClass().getSimpleName());
      default:
        throw new IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @java.lang.Override
  protected Object standardSchemeReadValue(TProtocol iprot, TField field) throws TException {
    _Fields setField = _Fields.findByThriftId(field.id);
    if (setField != null) {
      switch (setField) {
        case ID:
          if (field.type == ID_FIELD_DESC.type) {
            Long id;
            id = iprot.readI64();

            return id;
          } else {
            TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case DETAILS:
          if (field.type == DETAILS_FIELD_DESC.type) {
            String details;
            details = iprot.readString();

            return details;
          } else {
            TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case UNKNOWN_PASSTHROUGH:
          if (field.type != TType.STOP) {
            return TFieldBlob.extractBlob(field, iprot);
          } else {
            TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        default:
          throw new IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
      }
    } else {
      TProtocolUtil.skip(iprot, field.type);
      return null;
    }
  }

  @java.lang.Override
  protected void standardSchemeWriteValue(TProtocol oprot) throws TException {
    switch (setField_) {
      case ID:
        Long id = (Long)value_;
        oprot.writeI64(id);

        return;
      case DETAILS:
        String details = (String)value_;
        oprot.writeString(details);

        return;
      case UNKNOWN_PASSTHROUGH:
        TFieldBlob tFieldBlob = (TFieldBlob)value_;
        tFieldBlob.writeWithoutFieldMeta(oprot);
        return;
      default:
        throw new IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @java.lang.Override
  protected Object tupleSchemeReadValue(TProtocol iprot, short fieldID) throws TException {
    throw new UnsupportedOperationException("tuple scheme not implemented");
  }

  @java.lang.Override
  protected void tupleSchemeWriteValue(TProtocol oprot) throws TException {
    throw new UnsupportedOperationException("tuple scheme not implemented");
  }

  @java.lang.Override
  protected TField getFieldDesc(_Fields setField) {
    switch (setField) {
      case ID:
        return ID_FIELD_DESC;
      case DETAILS:
        return DETAILS_FIELD_DESC;
      case UNKNOWN_PASSTHROUGH:
        TFieldBlob tFieldBlob = (TFieldBlob)value_;
        return tFieldBlob.field();
      default:
        throw new IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @java.lang.Override
  protected TStruct getStructDesc() {
    return STRUCT_DESC;
  }

  @java.lang.Override
  protected _Fields enumForId(short id) {
    return _Fields.findByThriftIdOrThrow(id);
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }


  public long getId() {
    if (getSetField() == _Fields.ID) {
      return (Long)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'id' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setId(long value) {
    setField_ = _Fields.ID;
    value_ = value;
  }
  public String getDetails() {
    if (getSetField() == _Fields.DETAILS) {
      return (String)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'details' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setDetails(String value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.DETAILS;
    value_ = value;
  }

  public boolean equals(Object other) {
    if (other instanceof ResponseUnion) {
      return equals((ResponseUnion)other);
    } else {
      return false;
    }
  }

  public boolean equals(ResponseUnion other) {
    return this == other || (other != null && getSetField() == other.getSetField() && getFieldValue().equals(other.getFieldValue()));
  }

  @java.lang.Override
  public int compareTo(ResponseUnion other) {
    int lastComparison = TBaseHelper.compareTo(getSetField(), other.getSetField());
    if (lastComparison == 0) {
      return TBaseHelper.compareTo(getFieldValue(), other.getFieldValue());
    }
    return lastComparison;
  }

  @java.lang.Override
  public int hashCode() {
    int hashCode = this.getClass().getName().hashCode();
    TFieldIdEnum setField = getSetField();

    if (setField != null) {
      final short thriftFieldId = setField.getThriftFieldId();
      hashCode = hashCode * 31 + thriftFieldId;
      Object value = getFieldValue();

      if (1 == thriftFieldId) {
        hashCode = 31 * hashCode + ((Long)value).hashCode();
      }
      if (2 == thriftFieldId && (isSet(_Fields.DETAILS))) {
        hashCode = 31 * hashCode + ((String)value).hashCode();
      }
      if (_Fields.UNKNOWN_PASSTHROUGH._thriftId == thriftFieldId) {
        hashCode = 31 * hashCode + ((TFieldBlob)value).hashCode();
      }
    }
    return hashCode;
  }
}

