/**
 * Generated by Scrooge
 *   version: ?
 *   rev: ?
 *   built at: ?
 */
package com.twitter.scrooge.test.gold.thriftscala

import com.twitter.io.Buf
import com.twitter.scrooge.{
  InvalidFieldsException,
  LazyTProtocol,
  StructBuilder,
  StructBuilderFactory,
  TFieldBlob,
  ThriftStruct,
  ThriftStructCodec3,
  ThriftStructField,
  ThriftStructFieldInfo,
  ThriftStructMetaData,
  ValidatingThriftStruct,
  ValidatingThriftStructCodec3
}
import com.twitter.scrooge.adapt.{AccessRecorder, AdaptTProtocol, Decoder}
import org.apache.thrift.protocol._
import org.apache.thrift.transport.TMemoryBuffer
import scala.collection.immutable.{Map => immutable$Map}
import scala.collection.mutable.Builder
import scala.reflect.{ClassTag, classTag}


object CollectionId extends ValidatingThriftStructCodec3[CollectionId] with StructBuilderFactory[CollectionId] {
  private[this] val _protos: _root_.com.twitter.scrooge.internal.TProtocols = _root_.com.twitter.scrooge.internal.TProtocols()

  val Struct: TStruct = new TStruct("CollectionId")
  val CollectionLongIdField: TField = new TField("collectionLongId", TType.I64, 1)
  val CollectionLongIdFieldManifest: Manifest[Long] = manifest[Long]

  /**
   * Field information in declaration order.
   */
  lazy val fieldInfos: scala.List[ThriftStructFieldInfo] = scala.List[ThriftStructFieldInfo](
    new ThriftStructFieldInfo(
      CollectionLongIdField,
      false,
      true,
      CollectionLongIdFieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String],
      None,
      _root_.scala.Option(0)
    )
  )


  val structAnnotations: immutable$Map[String, String] =
    immutable$Map.empty[String, String]

  private val fieldTypes: IndexedSeq[ClassTag[_]] = IndexedSeq[ClassTag[_]](
    classTag[Long].asInstanceOf[ClassTag[_]]
  )

  private[this] val structFields: Seq[ThriftStructField[CollectionId]] = Seq[ThriftStructField[CollectionId]](
    new ThriftStructField[CollectionId](
      CollectionLongIdField,
      _root_.scala.Some(CollectionLongIdFieldManifest),
      classOf[CollectionId]) {
        def getValue[R](struct: CollectionId): R = struct.collectionLongId.asInstanceOf[R]
    }
  )

  override lazy val metaData: ThriftStructMetaData[CollectionId] =
    ThriftStructMetaData(this, structFields, fieldInfos, Nil, structAnnotations)

  /**
   * Checks that all required fields are non-null.
   */
  def validate(_item: CollectionId): Unit = {
  }

  /**
   * Checks that the struct is a valid as a new instance. If there are any missing required or
   * construction required fields, return a non-empty list.
   */
  def validateNewInstance(item: CollectionId): scala.Seq[com.twitter.scrooge.validation.Issue] = {
    val buf = scala.collection.mutable.ListBuffer.empty[com.twitter.scrooge.validation.Issue]

    buf ++= validateField(item.collectionLongId)
    buf.toList
  }

  /**
   * Validate that all validation annotations on the struct meet the criteria defined in the
   * corresponding [[com.twitter.scrooge.validation.ThriftConstraintValidator]].
   */
  def validateInstanceValue(item: CollectionId): Set[com.twitter.scrooge.validation.ThriftValidationViolation] = {
    val thriftValidator = com.twitter.scrooge.ThriftValidator()
    val violations = scala.collection.mutable.Set.empty[com.twitter.scrooge.validation.ThriftValidationViolation]
    val fieldInfo0 = fieldInfos.apply(0)
    violations ++= validateFieldValue(fieldInfo0.tfield.name, item.collectionLongId, fieldInfo0.fieldAnnotations, thriftValidator)
    violations.toSet
  }

  def withoutPassthroughFields(original: CollectionId): CollectionId =
    new Immutable(
      collectionLongId = original.collectionLongId
    )

  lazy val unsafeEmpty: CollectionId = {
    val collectionLongId: Long = 0

    new Immutable(
      collectionLongId,
      _root_.com.twitter.scrooge.internal.TProtocols.NoPassthroughFields
    )
  }

  def newBuilder(): StructBuilder[CollectionId] = new CollectionIdStructBuilder(_root_.scala.None, fieldTypes)

  override def encode(_item: CollectionId, _oproto: TProtocol): Unit = {
    _item.write(_oproto)
  }

  @volatile private[this] var adaptiveDecoder: Decoder[CollectionId] = _

  private[this] val accessRecordingDecoderBuilder: AccessRecorder => Decoder[CollectionId] = { accessRecorder =>
    new Decoder[CollectionId] {
      def apply(prot: AdaptTProtocol): CollectionId = new AccessRecordingWrapper(decodeInternal(prot, true), accessRecorder)
    }
  }
  private[this] val fallbackDecoder = new Decoder[CollectionId] {
    def apply(prot: AdaptTProtocol): CollectionId = decodeInternal(prot, true)
  }
  private[this] def adaptiveDecode(_iprot: AdaptTProtocol): CollectionId = {
    val adaptContext = _iprot.adaptContext
    val reloadRequired = adaptContext.shouldReloadDecoder
    synchronized {
      if ((adaptiveDecoder eq null) || reloadRequired) {
        adaptiveDecoder = adaptContext.buildDecoder(this, fallbackDecoder, accessRecordingDecoderBuilder)
      }
    }
    adaptiveDecoder(_iprot)
  }

  /**
   * AccessRecordingWrapper keeps track of fields that are accessed while
   * delegating to underlying struct.
   */
  private[this] class AccessRecordingWrapper(underlying: CollectionId, accessRecorder: AccessRecorder) extends CollectionId {
    override def collectionLongId: Long = {
      accessRecorder.fieldAccessed(1)
      underlying.collectionLongId
    }
    override def write(_oprot: TProtocol): Unit = underlying.write(_oprot)

    override def _passthroughFields: immutable$Map[Short, TFieldBlob] = underlying._passthroughFields
  }

  override def decode(_iprot: TProtocol): CollectionId = {
    if (_iprot.isInstanceOf[LazyTProtocol]) {
      decodeInternal(_iprot, true)
    } else if (_iprot.isInstanceOf[AdaptTProtocol]) {
      adaptiveDecode(_iprot.asInstanceOf[AdaptTProtocol])
    } else {
      decodeInternal(_iprot, false)
    }
  }

  private[thriftscala] def eagerDecode(_iprot: TProtocol): CollectionId = {
    decodeInternal(_iprot, false)
  }

  private[this] def decodeInternal(_iprot: TProtocol, lazily: Boolean): CollectionId = {
    var collectionLongId: Long = 0L
    var _got_collectionLongId = false

    var _passthroughFields: Builder[(Short, TFieldBlob), immutable$Map[Short, TFieldBlob]] = null
    var _done = false
    val _start_offset = if (lazily) _iprot.asInstanceOf[LazyTProtocol].offset else -1

    _iprot.readStructBegin()
    do {
      val _field = _iprot.readFieldBegin()
      val _fieldType = _field.`type`
      if (_fieldType == TType.STOP) {
        _done = true
      } else {
        _field.id match {
          case 1 =>
            _root_.com.twitter.scrooge.internal.TProtocols.validateFieldType(TType.I64, _fieldType, "collectionLongId")
            collectionLongId = _iprot.readI64()
            _got_collectionLongId = true
          case _ =>
            _passthroughFields = _root_.com.twitter.scrooge.internal.TProtocols.readPassthroughField(_iprot, _field, _passthroughFields)
        }
        _iprot.readFieldEnd()
      }
    } while (!_done)
    _iprot.readStructEnd()

    if (!_got_collectionLongId) _root_.com.twitter.scrooge.internal.TProtocols.throwMissingRequiredField("CollectionId", "collectionLongId")

    val _passthroughFieldsResult =
      if (_passthroughFields eq null) _root_.com.twitter.scrooge.internal.TProtocols.NoPassthroughFields
      else _passthroughFields.result()
    if (lazily) {
      val _lazyProt = _iprot.asInstanceOf[LazyTProtocol]
      new LazyImmutable(
        _lazyProt,
        _lazyProt.buffer,
        _start_offset,
        _lazyProt.offset,
        collectionLongId,
        _passthroughFieldsResult
      )
    } else {
      new Immutable(
        collectionLongId,
        _passthroughFieldsResult
      )
    }
  }

  def apply(
    collectionLongId: Long
  ): CollectionId =
    new Immutable(
      collectionLongId
    )

  def unapply(_item: CollectionId): _root_.scala.Option[Long] = _root_.scala.Some(_item.collectionLongId)



  object Immutable extends ThriftStructCodec3[CollectionId] {
    override def encode(_item: CollectionId, _oproto: TProtocol): Unit = { _item.write(_oproto) }
    override def decode(_iprot: TProtocol): CollectionId = CollectionId.decode(_iprot)
    override lazy val metaData: ThriftStructMetaData[CollectionId] = CollectionId.metaData
  }

  /**
   * The default read-only implementation of CollectionId.  You typically should not need to
   * directly reference this class; instead, use the CollectionId.apply method to construct
   * new instances.
   */
  class Immutable(
      val collectionLongId: Long,
      override val _passthroughFields: immutable$Map[Short, TFieldBlob])
    extends CollectionId {
    def this(
      collectionLongId: Long
    ) = this(
      collectionLongId,
      immutable$Map.empty[Short, TFieldBlob]
    )
  }

  /**
   * This is another Immutable, this however keeps strings as lazy values that are lazily decoded from the backing
   * array byte on read.
   */
  private[this] class LazyImmutable(
      _proto: LazyTProtocol,
      _buf: Array[Byte],
      _start_offset: Int,
      _end_offset: Int,
      val collectionLongId: Long,
      override val _passthroughFields: immutable$Map[Short, TFieldBlob])
    extends CollectionId {

    override def write(_oprot: TProtocol): Unit = {
      if (_oprot.isInstanceOf[LazyTProtocol]) {
        _oprot.asInstanceOf[LazyTProtocol].writeRaw(_buf, _start_offset, _end_offset - _start_offset)
      } else {
        super.write(_oprot)
      }
    }


    /**
     * Override the super hash code to make it a lazy val rather than def.
     *
     * Calculating the hash code can be expensive, caching it where possible
     * can provide significant performance wins. (Key in a hash map for instance)
     * Usually not safe since the normal constructor will accept a mutable map or
     * set as an arg
     * Here however we control how the class is generated from serialized data.
     * With the class private and the contract that we throw away our mutable references
     * having the hash code lazy here is safe.
     */
    override lazy val hashCode: Int = super.hashCode
  }

}

/**
 * Prefer the companion object's [[com.twitter.scrooge.test.gold.thriftscala.CollectionId.apply]]
 * for construction if you don't need to specify passthrough fields.
 */
trait CollectionId
  extends ThriftStruct
  with _root_.scala.Product1[Long]
  with ValidatingThriftStruct[CollectionId]
  with java.io.Serializable
{
  import CollectionId._

  def collectionLongId: Long

  def _passthroughFields: immutable$Map[Short, TFieldBlob] = immutable$Map.empty

  def _1: Long = collectionLongId


  /**
   * Gets a field value encoded as a binary blob using TCompactProtocol.  If the specified field
   * is present in the passthrough map, that value is returned.  Otherwise, if the specified field
   * is known and not optional and set to None, then the field is serialized and returned.
   */
  def getFieldBlob(_fieldId: Short): _root_.scala.Option[TFieldBlob] = {
    val passedthroughValue = _passthroughFields.get(_fieldId)
    if (passedthroughValue.isDefined) {
      passedthroughValue
    } else {
      val _protos = _root_.com.twitter.scrooge.internal.TProtocols()
      val _buff = new TMemoryBuffer(32)
      val _oprot = new TCompactProtocol(_buff)

      val _fieldOpt: _root_.scala.Option[TField] = _fieldId match {
        case 1 =>
            _oprot.writeI64(collectionLongId)
            _root_.scala.Some(CollectionId.CollectionLongIdField)
        case _ => _root_.scala.None
      }
      if (_fieldOpt.isDefined) {
        _root_.scala.Some(TFieldBlob(_fieldOpt.get, Buf.ByteArray.Owned(_buff.getArray)))
      } else {
        _root_.scala.None
      }
    }
  }


  /**
   * Collects TCompactProtocol-encoded field values according to `getFieldBlob` into a map.
   */
  def getFieldBlobs(ids: TraversableOnce[Short]): immutable$Map[Short, TFieldBlob] =
    (ids.flatMap { id => getFieldBlob(id).map { fieldBlob => (id, fieldBlob) } }).toMap

  /**
   * Sets a field using a TCompactProtocol-encoded binary blob.  If the field is a known
   * field, the blob is decoded and the field is set to the decoded value.  If the field
   * is unknown and passthrough fields are enabled, then the blob will be stored in
   * _passthroughFields.
   */
  def setField(_blob: TFieldBlob): CollectionId = {
    val _protos: _root_.com.twitter.scrooge.internal.TProtocols = _root_.com.twitter.scrooge.internal.TProtocols()
    var collectionLongId: Long = this.collectionLongId
    var _passthroughFields = this._passthroughFields
    val _iprot = _blob.read 
    _blob.id match {
      case 1 =>
        collectionLongId = _iprot.readI64()
      case _ => _passthroughFields += _root_.scala.Tuple2(_blob.id, _blob)
    }
    new Immutable(
      collectionLongId,
      _passthroughFields
    )
  }

  /**
   * If the specified field is optional, it is set to None.  Otherwise, if the field is
   * known, it is reverted to its default value; if the field is unknown, it is removed
   * from the passthroughFields map, if present.
   */
  def unsetField(_fieldId: Short): CollectionId = {
    var collectionLongId: Long = this.collectionLongId

    _fieldId match {
      case 1 =>
        collectionLongId = 0L
      case _ =>
    }
    new Immutable(
      collectionLongId,
      _passthroughFields - _fieldId
    )
  }

  /**
   * If the specified field is optional, it is set to None.  Otherwise, if the field is
   * known, it is reverted to its default value; if the field is unknown, it is removed
   * from the passthroughFields map, if present.
   */
  def unsetCollectionLongId: CollectionId = unsetField(1)


  override def write(_oprot: TProtocol): Unit = {
    CollectionId.validate(this)
    val _protos = _root_.com.twitter.scrooge.internal.TProtocols()
    _oprot.writeStructBegin(Struct)
    _oprot.writeFieldBegin(CollectionLongIdField)
    _oprot.writeI64(collectionLongId)
    _oprot.writeFieldEnd()
    _root_.com.twitter.scrooge.internal.TProtocols.finishWritingStruct(_oprot, _passthroughFields)
  }

  def copy(
    collectionLongId: Long = this.collectionLongId,
    _passthroughFields: immutable$Map[Short, TFieldBlob] = this._passthroughFields
  ): CollectionId =
    new Immutable(
      collectionLongId,
      _passthroughFields
    )

  override def canEqual(other: Any): Boolean = other.isInstanceOf[CollectionId]

  private[this] def _equals(other: CollectionId): Boolean =
      this.productArity == other.productArity &&
      this.productIterator.sameElements(other.productIterator) &&
      this._passthroughFields == other._passthroughFields

  override def equals(other: Any): Boolean =
    canEqual(other) && _equals(other.asInstanceOf[CollectionId])

  override def hashCode: Int = {
    _root_.scala.runtime.ScalaRunTime._hashCode(this)
  }

  override def toString: String = _root_.scala.runtime.ScalaRunTime._toString(this)

  override def productPrefix: String = "CollectionId"

  def _codec: ValidatingThriftStructCodec3[CollectionId] = CollectionId

  def newBuilder(): StructBuilder[CollectionId] = new CollectionIdStructBuilder(_root_.scala.Some(this), fieldTypes)
}

private[thriftscala] class CollectionIdStructBuilder(instance: _root_.scala.Option[CollectionId], fieldTypes: IndexedSeq[ClassTag[_]])
    extends StructBuilder[CollectionId](fieldTypes) {

  def build(): CollectionId = {
    val _fieldArray = fieldArray // shadow variable
    if (instance.isDefined) {
      val instanceValue = instance.get
      CollectionId(
        if (_fieldArray(0) == null) instanceValue.collectionLongId else _fieldArray(0).asInstanceOf[Long]
      )
    } else {
      if (genericArrayOps(_fieldArray).contains(null)) throw new InvalidFieldsException(structBuildError("CollectionId"))
      CollectionId(
        _fieldArray(0).asInstanceOf[Long]
      )
    }
  }
}

private class CollectionId__AdaptDecoder {

  def decode(_iprot: AdaptTProtocol): CollectionId = {
    import CollectionId._
    val _protos: _root_.com.twitter.scrooge.internal.TProtocols = _root_.com.twitter.scrooge.internal.TProtocols()
    var _passthroughFields: Builder[(Short, TFieldBlob), immutable$Map[Short, TFieldBlob]] = null
    var _done = false
    val _start_offset = _iprot.offset

    val adapt = new CollectionId__Adapt(
      _iprot,
      _iprot.buffer,
      _start_offset)

    var _got_collectionLongId = false
    AdaptTProtocol.usedStartMarker(1)
    var collectionLongId: Long = 0L
    AdaptTProtocol.usedEndMarker(1)

    _iprot.readStructBegin()
    do {
      val _field = _iprot.readFieldBegin()
      val _fieldType = _field.`type`
      if (_field.`type` == TType.STOP) {
        _done = true
      } else {
        _field.id match {
          case 1 => {
            if (_fieldType == TType.I64) {
              AdaptTProtocol.usedStartMarker(1)
              collectionLongId = _iprot.readI64()
              AdaptTProtocol.usedEndMarker(1)
              AdaptTProtocol.unusedStartMarker(1)
              _iprot.offsetSkipI64()
              AdaptTProtocol.unusedEndMarker(1)
              _got_collectionLongId = true
            } else {
              throw AdaptTProtocol.unexpectedTypeException(
                TType.I64,
                _fieldType,
                "collectionLongId"
              )
            }
            AdaptTProtocol.usedStartMarker(1)
            adapt.set_collectionLongId(collectionLongId)
            AdaptTProtocol.usedEndMarker(1)
          }
          case _ =>
            if (_passthroughFields eq null)
              _passthroughFields = immutable$Map.newBuilder[Short, TFieldBlob]
            _passthroughFields += _root_.scala.Tuple2(_field.id, TFieldBlob.read(_field, _iprot))
        }
        _iprot.readFieldEnd()
      }
    } while (!_done)
    _iprot.readStructEnd()

    if (!_got_collectionLongId) throw new TProtocolException("Required field 'collectionLongId' was not found in serialized data for struct CollectionId")
    adapt.set__endOffset(_iprot.offset)
    if (_passthroughFields ne null) {
      adapt.set__passthroughFields(_passthroughFields.result())
    }
    adapt
  }
}

/**
 * This is the base template for Adaptive decoding. This class gets pruned and
 * reloaded at runtime.
 */
private class CollectionId__Adapt(
    _proto: AdaptTProtocol,
    _buf: Array[Byte],
    _start_offset: Int) extends CollectionId {

  /**
   * In case any unexpected field is accessed, fallback to eager decoding.
   */
  private[this] lazy val delegate: CollectionId = {
    val bytes = _root_.java.util.Arrays.copyOfRange(_buf, _start_offset, _end_offset)
    val proto = _proto.withBytes(bytes)
    CollectionId.eagerDecode(proto)
  }

  private[this] var m_collectionLongId: Long = _
  def set_collectionLongId(collectionLongId: Long): Unit = m_collectionLongId = collectionLongId
  // This will be removed by ASM if field is unused.
  def collectionLongId: Long = m_collectionLongId
  // This will be removed by ASM if field is used otherwise renamed to collectionLongId.
  def delegated_collectionLongId: Long = delegate.collectionLongId


  private[this] var _end_offset: Int = _
  def set__endOffset(offset: Int): Unit = _end_offset = offset

  private[this] var __passthroughFields: immutable$Map[Short, TFieldBlob] = _root_.com.twitter.scrooge.internal.TProtocols.NoPassthroughFields
  def set__passthroughFields(passthroughFields: immutable$Map[Short, TFieldBlob]): Unit =
    __passthroughFields = passthroughFields

  override def _passthroughFields: immutable$Map[Short, TFieldBlob] = __passthroughFields

  /*
  Override the super hash code to make it a lazy val rather than def.

  Calculating the hash code can be expensive, caching it where possible
  can provide significant performance wins. (Key in a hash map for instance)
  Usually not safe since the normal constructor will accept a mutable map or
  set as an arg
  Here however we control how the class is generated from serialized data.
  With the class private and the contract that we throw away our mutable references
  having the hash code lazy here is safe.
  */
  override lazy val hashCode: Int = super.hashCode

  override def write(_oprot: TProtocol): Unit = {
    if (_oprot.isInstanceOf[AdaptTProtocol]) {
      _oprot.asInstanceOf[AdaptTProtocol].writeRaw(_buf, _start_offset, _end_offset - _start_offset)
    } else {
      super.write(_oprot)
    }
  }
}
