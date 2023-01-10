ThisBuild / scalaVersion := "2.13.10"

lazy val common = project.in(file("mod_common"))
lazy val client = project.in(file("mod_client")).dependsOn(common)
lazy val server = project.in(file("mod_server")).dependsOn(common)

lazy val cams = project.in(file(".")).aggregate(common, client, server)
