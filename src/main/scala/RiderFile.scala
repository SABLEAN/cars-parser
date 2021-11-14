import cats.effect.{IO, Resource, Sync}

import java.io.{File, FileInputStream, FileOutputStream}

object RiderFile {

  private def openInputStream(fileName: String): Resource[IO, FileInputStream] =
    Resource.make(getInputStreamF(fileName))(s => IO.delay(s.close()))

private def getInputStreamF(fileName:String):IO[FileInputStream] = {
  IO{
    new FileInputStream(new File(fileName))
  }
}


  private def openOutputStream(fileName: String): Resource[IO, FileOutputStream] =
    Resource.make(getOutputStreamF(fileName))(s => IO.delay(s.close()))

  private def getOutputStreamF(fileName:String):IO[FileOutputStream] = {
    IO{
      new FileOutputStream(new File(fileName))
    }
  }





}