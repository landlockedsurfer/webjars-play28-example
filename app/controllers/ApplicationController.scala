package controllers

import play.api.mvc._
import controllers.Assets._
import javax.inject.{Inject, Singleton}
import org.webjars.play.WebJarsUtil
import io.github.classgraph.ClassGraph

@Singleton
class ApplicationController @Inject ()(val controllerComponents: ControllerComponents, webJarsUtil: WebJarsUtil) extends BaseController {

  val logger = play.api.Logger("ApplicationLogger")

  def index = Action {
    logger.info("Invoked index actin.")
    Ok(views.html.index(webJarsUtil))
  }
}
