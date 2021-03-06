package com.github.ldaniels528.trifecta.modules

import com.github.ldaniels528.trifecta.messages.MessageOutputSource

/**
 * Module Helper
 * @author lawrence.daniels@gmail.com
 */
object ModuleHelper {

  def die[S](message: String): S = throw new IllegalStateException(message)

  def die[S](message: String, cause: Throwable): S = throw new IllegalStateException(message, cause)

  def dieNoCursor[S](): S = die("No topic/partition specified and no cursor exists")

  def dieNoInputSource[S](): S = die("No input source specified")

  def dieNoOutputSource[S](): S = die("No output source specified")

  def dieNoOutputHandler[S](device: MessageOutputSource): S = die(s"Unhandled output device $device")

  def dieNotMessageComparator[S](): S = die("Decoder does not support logical operations")

}
