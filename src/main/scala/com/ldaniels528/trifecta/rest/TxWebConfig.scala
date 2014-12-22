package com.ldaniels528.trifecta.rest

import com.ldaniels528.trifecta.TxConfig

/**
 * Trifecta Web Configuration
 * @author Lawrence Daniels <lawrence.daniels@gmail.com>
 */
object TxWebConfig {

  /**
   * Trifecta Configuration Extensions
   * @param config the given [[TxConfig]]
   */
  implicit class TxConfigExtensions(val config: TxConfig) extends AnyVal {

    /**
     * Returns the push interval (in seconds) for topic changes
     * @return the interval
     */
    def topicPushInterval: Int = config.getOrElse("trifecta.web.push.interval.topic", "15").toInt

    /**
     * Returns the push interval (in seconds) for consumer offset changes
     * @return the interval
     */
    def consumerPushInterval: Int = config.getOrElse("trifecta.web.push.interval.consumer", "15").toInt

    /**
     * Returns the web actor execution concurrency
     * @return the web actor execution concurrency
     */
    def webActorConcurrency: Int = config.getOrElse("trifecta.web.actor.concurrency", "10").toInt

    /**
     * Returns the embedded web server host/IP
     * @return the embedded web server host/IP
     */
    def webHost: String = config.getOrElse("trifecta.web.host", "localhost")

    /**
     * Returns the embedded web server port
     * @return the embedded web server port
     */
    def webPort: Int = config.getOrElse("trifecta.web.port", "8888").toInt

  }

}
