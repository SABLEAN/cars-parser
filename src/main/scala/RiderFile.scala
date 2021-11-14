import cats.effect.{IO, Resource}

import java.io.{File, FileInputStream, FileOutputStream}

object RiderFile {

  def openInputStream(fileName: String): Resource[IO, FileInputStream] =
    Resource.make(getInputStreamF(fileName))(s => IO.delay(s.close()))

  def getInputStreamF(fileName: String): IO[FileInputStream] =
    IO {
      new FileInputStream(new File(fileName))
    }

  def openOutputStream(fileName: String): Resource[IO, FileOutputStream] =
    Resource.make(getOutputStreamF(fileName))(s => IO.delay(s.close()))

  def getOutputStreamF(fileName: String): IO[FileOutputStream] =
    IO {
      new FileOutputStream(new File(fileName))
    }

  def fileNames(): Set[String] =
    Range.inclusive(1992, 2022).toSet.map[String](year => s"car-models-data/$year.csv")

}
