import cats.effect.{ExitCode, IO, IOApp, Resource}

import java.io.{FileInputStream, FileOutputStream}
import java.nio.charset.StandardCharsets
import scala.io.Source

object CarsParser extends IOApp {

  override def run(args: List[String]): IO[ExitCode] = {

    val inout = InOut.inOut(args)

    PutAndDrop.putAndDrop(inout.inFileName, inout.outFileName).use { case (inputStream, outpuStream) =>
      for {
        inputLines <- IO(InputStreamDef.inputStreamDef(inputStream))
        pars       <- IO(Parser.parser(inputLines))
        calc       <- IO(Calculiator.calculiator(pars))
        unpars     <- IO(Unparser.unparser(calc))
        _          <- IO(OutPutStreamDef.outputStreamDef(outpuStream, unpars))

      } yield ExitCode.Success

    }
  }

}
