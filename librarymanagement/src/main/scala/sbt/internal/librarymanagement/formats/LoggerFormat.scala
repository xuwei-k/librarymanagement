package sbt.internal.librarymanagement.formats

import sjsonnew._
import xsbti._

trait LoggerFormat { self: BasicJsonProtocol =>
  implicit lazy val LoggerFormat: JsonFormat[Logger] = ???
}
