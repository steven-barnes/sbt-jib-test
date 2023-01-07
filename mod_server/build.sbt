jibBaseImage := "openjdk:11-jre-slim"
jibRegistry := "555170539925.dkr.ecr.us-east-1.amazonaws.com"
jibCustomRepositoryPath := Some("commerce/jib-test")
jibVersion := version.value
jibJvmFlags := List("-Djib.serialize=true")
jibUseCurrentTimestamp := true
jibEntrypoint := Some(List("cams.server.Http4sMain"))

val http4sVersion = "0.21.3"

libraryDependencies ++= build.compile(
  "org.http4s" %% "http4s-dsl" % http4sVersion,
  "org.http4s" %% "http4s-blaze-server" % http4sVersion)
