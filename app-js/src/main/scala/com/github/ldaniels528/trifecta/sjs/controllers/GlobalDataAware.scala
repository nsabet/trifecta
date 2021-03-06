package com.github.ldaniels528.trifecta.sjs.controllers

import io.scalajs.npm.angularjs.Scope

import scala.scalajs.js

/**
  * Global Data Aware
  * @author lawrence.daniels@gmail.com
  */
@js.native
trait GlobalDataAware extends js.Object {
  self: Scope =>

  // properties
  var hideEmptyTopics: Boolean = js.native
  var hideConsoleConsumers: Boolean = js.native

  // functions
  var toggleHideShowEmptyTopics: js.Function0[Unit] = js.native
  var toggleHideShowConsoleConsumers: js.Function0[Unit] = js.native

}
