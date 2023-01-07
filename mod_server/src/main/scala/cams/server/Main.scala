package cams.server

import cats.data.Kleisli
import cats.effect._
import cats.implicits._
import org.http4s.{Request, Response}
import org.http4s.server.blaze.BlazeServerBuilder

//object Main extends App {
//  cams.common.log("testing")
//  println("Hello world")
//}

object Http4sMain extends IOApp {
  def run(args: List[String]) : IO[ExitCode] =
    BlazeServerBuilder.apply[IO]
      .bindHttp(9000, "0.0.0.0")
      .withHttpApp(httpApp())
      .serve.compile.drain.as(ExitCode.Success)

  def httpApp(): Kleisli[IO, Request[IO], Response[IO]] = ???
}
