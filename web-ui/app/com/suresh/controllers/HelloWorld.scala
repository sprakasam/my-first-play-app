package com.suresh.controllers

import play.api.mvc._

/**
 * Minimal controller examples that output text/plain responses.
 */
object Application extends Controller {

  def index = Action {
    Ok("Hello world")
  }

  def hello(name: String) = Action {
    Ok("Hello " + name)
  }
}

