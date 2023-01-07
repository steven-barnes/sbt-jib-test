import sbt._

object build {

  def provided(list: sbt.ModuleID*): Seq[sbt.ModuleID] = list.map(_ % "provided")

  def test(list: sbt.ModuleID*): Seq[sbt.ModuleID] = list.map(_ % "test")

  def compile(list: sbt.ModuleID*): Seq[sbt.ModuleID] = list.map(_ % "compile")

  def core  = compile(
    "ch.qos.logback" % "logback-classic" % "1.4.5"
  )

}