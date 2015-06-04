package controllers

import play.api._
import play.api.mvc._

import com.wordnik.swagger.annotations._

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent._
import scala.language.higherKinds

import models.Lawyer
import models.swagger.BearerToken

@Api(value = "/lawyers", description = "Operations with account")
object LawyerController extends Controller {
 
  @ApiOperation(
    nickname = "createAccount",
    value = "Create user account",
    notes = "User Sign Up endpoint",
    httpMethod = "POST",
    response = classOf[models.swagger.BearerToken])
  @ApiResponses(Array(
    new ApiResponse(code = 201, message = "Account successfully created"),
    new ApiResponse(code = 400, message = "Email already exist"),
    new ApiResponse(code = 500, message = "DB connection error")))
  @ApiImplicitParams(Array(
    new ApiImplicitParam(value = "Account object that need to be created", required = true, dataType = "models.swagger.UserAccountInfo", paramType = "body")))
  def createAccount = Action.async {
    implicit request => {
      Future(
        Ok("Hi")
        )
    }
  }
 
}
