package models

import java.util.Date
import models.swagger._

import org.joda.time.DateTime
import play.api.libs.json.{Reads, Writes, JsPath, Format}
import play.api.libs.functional.syntax._
import scala.util.Random

case class Lawyer(_id: Option[Any],
                  email: String,
                  password: String,
                  avatar: Option[String],
                  bearerToken: Option[BearerToken],
                  createdAt: DateTime)

object Lawyer {

}

object Status extends Enumeration {
  type Status = Value
  val Active, Blocked, Pending, Inactive = Value
}
