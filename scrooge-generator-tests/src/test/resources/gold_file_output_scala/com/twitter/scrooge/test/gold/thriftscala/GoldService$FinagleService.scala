/**
 * Generated by Scrooge
 *   version: ?
 *   rev: ?
 *   built at: ?
 */
package com.twitter.scrooge.test.gold.thriftscala

import com.twitter.finagle.{
  Filter => _,
  Service => _,
  thrift => _,
  _
}
import com.twitter.finagle.stats.{NullStatsReceiver, StatsReceiver}
import com.twitter.finagle.thrift.RichServerParam
import com.twitter.io.Buf
import com.twitter.util.Future
import org.apache.thrift.protocol._
import org.apache.thrift.TApplicationException
import org.apache.thrift.transport.TMemoryInputTransport

trait ServerValidationMixin {

  def violationReturningDoGreatThings(
    request: com.twitter.scrooge.test.gold.thriftscala.Request,
    requestViolations: Set[com.twitter.scrooge.thrift_validation.ThriftValidationViolation]
  ): Future[com.twitter.scrooge.test.gold.thriftscala.Response] = {
    throw new com.twitter.scrooge.thrift_validation.ThriftValidationException("doGreatThings", request.getClass, requestViolations)
  }

  def violationReturningNoExceptionCall(
    request: com.twitter.scrooge.test.gold.thriftscala.Request,
    requestViolations: Set[com.twitter.scrooge.thrift_validation.ThriftValidationViolation]
  ): Future[com.twitter.scrooge.test.gold.thriftscala.Response] = {
    throw new com.twitter.scrooge.thrift_validation.ThriftValidationException("noExceptionCall", request.getClass, requestViolations)
  }
}

@javax.annotation.Generated(value = Array("com.twitter.scrooge.Compiler"))
class GoldService$FinagleService(
  iface: GoldService.MethodPerEndpoint with ServerValidationMixin,
  serverParam: RichServerParam
) extends com.twitter.finagle.Service[Array[Byte], Array[Byte]] {
  import GoldService._

  @deprecated("Use com.twitter.finagle.thrift.RichServerParam", "2017-08-16")
  def this(
    iface: GoldService.MethodPerEndpoint with ServerValidationMixin,
    protocolFactory: TProtocolFactory,
    stats: StatsReceiver = NullStatsReceiver,
    maxThriftBufferSize: Int = Thrift.param.maxThriftBufferSize,
    serviceName: String = "GoldService"
  ) = this(iface, RichServerParam(protocolFactory, serviceName, maxThriftBufferSize, stats))

  @deprecated("Use com.twitter.finagle.thrift.RichServerParam", "2017-08-16")
  def this(
    iface: GoldService.MethodPerEndpoint with ServerValidationMixin,
    protocolFactory: TProtocolFactory,
    stats: StatsReceiver,
    maxThriftBufferSize: Int
  ) = this(iface, protocolFactory, stats, maxThriftBufferSize, "GoldService")

  @deprecated("Use com.twitter.finagle.thrift.RichServerParam", "2017-08-16")
  def this(
    iface: GoldService.MethodPerEndpoint with ServerValidationMixin,
    protocolFactory: TProtocolFactory
  ) = this(iface, protocolFactory, NullStatsReceiver, Thrift.param.maxThriftBufferSize)

  def serviceName: String = serverParam.serviceName
  private[this] val filters: Filter = new Filter(serverParam)

  private[this] def protocolFactory: TProtocolFactory = serverParam.restrictedProtocolFactory

  protected val serviceMap: _root_.scala.collection.mutable.HashMap[String, _root_.com.twitter.finagle.Service[(TProtocol, Int), Array[Byte]]] =
    new _root_.scala.collection.mutable.HashMap[String, _root_.com.twitter.finagle.Service[(TProtocol, Int), Array[Byte]]]()

  protected def addService(name: String, service: _root_.com.twitter.finagle.Service[(TProtocol, Int), Array[Byte]]): Unit = {
    serviceMap(name) = service
  }

  final def apply(request: Array[Byte]): Future[Array[Byte]] = {
    val iprot = protocolFactory.getProtocol(new TMemoryInputTransport(request))

    try {
      val msg = iprot.readMessageBegin()
      val svcOpt = serviceMap.get(msg.name)
      if (svcOpt.isDefined) {
        svcOpt.get.apply((iprot, msg.seqid))
      } else {
        TProtocolUtil.skip(iprot, TType.STRUCT)
        invalidMethodNameFuture(msg)
      }
    } catch {
      case e: Exception => Future.exception(e)
    }
  }

  private[this] def invalidMethodNameFuture(msg: TMessage): Future[Array[Byte]] = {
     Future.value(Buf.ByteArray.Owned.extract(
       filters.exception(msg.name, msg.seqid, TApplicationException.UNKNOWN_METHOD,
         "Invalid method name: '" + msg.name + "'")))
  }
  // ---- end boilerplate.

  addService("doGreatThings", {
    val methodService = new _root_.com.twitter.finagle.Service[DoGreatThings.Args, DoGreatThings.SuccessType] {
      def apply(args: DoGreatThings.Args): Future[DoGreatThings.SuccessType] = {
        _root_.com.twitter.finagle.thrift.ServerAnnotations.annotate("doGreatThings", "com.twitter.scrooge.test.gold.thriftscala.GoldService#doGreatThings()")
        val requestViolations: Set[com.twitter.scrooge.thrift_validation.ThriftValidationViolation] =
          if (args.request != null) com.twitter.scrooge.test.gold.thriftscala.Request.validateInstanceValue(args.request)
          else Set.empty
        if (requestViolations.isEmpty) {
          iface.doGreatThings(args.request)
        } else {
          iface.violationReturningDoGreatThings(args.request, requestViolations)
        }
      }
    }
  
    filters.doGreatThings.andThen(methodService)
  })
  addService("noExceptionCall", {
    val methodService = new _root_.com.twitter.finagle.Service[NoExceptionCall.Args, NoExceptionCall.SuccessType] {
      def apply(args: NoExceptionCall.Args): Future[NoExceptionCall.SuccessType] = {
        _root_.com.twitter.finagle.thrift.ServerAnnotations.annotate("noExceptionCall", "com.twitter.scrooge.test.gold.thriftscala.GoldService#noExceptionCall()")
        val requestViolations: Set[com.twitter.scrooge.thrift_validation.ThriftValidationViolation] =
          if (args.request != null) com.twitter.scrooge.test.gold.thriftscala.Request.validateInstanceValue(args.request)
          else Set.empty
        if (requestViolations.isEmpty) {
          iface.noExceptionCall(args.request)
        } else {
          iface.violationReturningNoExceptionCall(args.request, requestViolations)
        }
      }
    }
  
    filters.noExceptionCall.andThen(methodService)
  })
}