/**
 * Generated by Scrooge
 *   version: ?
 *   rev: ?
 *   built at: ?
 */
package com.twitter.scrooge.test.gold.thriftscala

import com.twitter.finagle.{service => ctfs}
import com.twitter.finagle.stats.{NullStatsReceiver, StatsReceiver}
import com.twitter.finagle.thrift.{ClientFunction, Protocols, RichClientParam, ThriftClientRequest}
import com.twitter.util.Future
import org.apache.thrift.protocol._


@javax.annotation.Generated(value = Array("com.twitter.scrooge.Compiler"))
class PlatinumService$FinagleClient(
    override val service: com.twitter.finagle.Service[ThriftClientRequest, Array[Byte]],
    override val clientParam: RichClientParam)
  extends GoldService$FinagleClient(service, clientParam)
  with PlatinumService.MethodPerEndpoint {

  @deprecated("Use com.twitter.finagle.thrift.RichClientParam", "2017-08-16")
  def this(
    service: com.twitter.finagle.Service[ThriftClientRequest, Array[Byte]],
    protocolFactory: TProtocolFactory = Protocols.binaryFactory(),
    serviceName: String = "PlatinumService",
    stats: StatsReceiver = NullStatsReceiver,
    responseClassifier: ctfs.ResponseClassifier = ctfs.ResponseClassifier.Default
  ) = this(
    service,
    RichClientParam(
      protocolFactory,
      serviceName,
      clientStats = stats,
      responseClassifier = responseClassifier
    )
  )

  import PlatinumService._

  override def serviceName: String = clientParam.serviceName
  private[this] def stats: StatsReceiver = clientParam.clientStats
  private[this] def responseClassifier: ctfs.ResponseClassifier = clientParam.responseClassifier

  private[this] val scopedStats: StatsReceiver = if (serviceName != "") stats.scope(serviceName) else stats
  private[this] object __stats_moreCoolThings {
    val RequestsCounter: _root_.com.twitter.finagle.stats.Counter = scopedStats.scope("moreCoolThings").counter("requests")
    val SuccessCounter: _root_.com.twitter.finagle.stats.Counter = scopedStats.scope("moreCoolThings").counter("success")
    val FailuresCounter: _root_.com.twitter.finagle.stats.Counter = scopedStats.scope("moreCoolThings").counter("failures")
    val FailuresScope: StatsReceiver = scopedStats.scope("moreCoolThings").scope("failures")
  }
  val moreCoolThingsPlatinumServiceReplyDeserializer: Array[Byte] => _root_.com.twitter.util.Try[Int] = {
    response: Array[Byte] => {
      decodeResponse(response, MoreCoolThings.Result).flatMap { result: MoreCoolThings.Result =>
        val firstException = result.firstException()
        if (firstException.isDefined) {
          _root_.com.twitter.util.Throw(_root_.com.twitter.finagle.SourcedException.setServiceName(firstException.get, serviceName))
        } else if (result.successField.isDefined) {
          _root_.com.twitter.util.Return(result.successField.get)
        } else {
          _root_.com.twitter.util.Throw(_root_.com.twitter.scrooge.internal.ApplicationExceptions.missingResult("moreCoolThings"))
        }
      }
    }
  }
  
  def moreCoolThings(request: com.twitter.scrooge.test.gold.thriftscala.Request): Future[Int] =
    ClientFunction.serde[Int](
      "moreCoolThings",
      moreCoolThingsPlatinumServiceReplyDeserializer,
      MoreCoolThings.Args(request),
      serviceName,
      service,
      responseClassifier,
      tlReusableBuffer,
      protocolFactory,
      __stats_moreCoolThings.FailuresScope,
      __stats_moreCoolThings.RequestsCounter,
      __stats_moreCoolThings.SuccessCounter,
      __stats_moreCoolThings.FailuresCounter)
}
