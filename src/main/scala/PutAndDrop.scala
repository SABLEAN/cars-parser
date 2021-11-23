import cats.effect.{IO, Resource}

import java.io.{FileInputStream, FileOutputStream}

object PutAndDrop {

  def putAndDrop(fileNameIn: String, fileNameOut: String): Resource[IO, (FileInputStream, FileOutputStream)] =
    for {
      in  <- RiderFile.openInputStream(fileNameIn)
      out <- RiderFile.openOutputStream(fileNameOut)

    } yield (in, out)

}
