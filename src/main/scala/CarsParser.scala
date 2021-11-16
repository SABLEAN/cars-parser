import cats.effect.{IO, Resource}

import java.io.{FileInputStream, FileOutputStream}

object CarsParser extends App {

  case class Cars(year: Int, brand: String, model: String)
  case class Cars2(car: String, years: List[Int])

  def putAndDrop(fileNameIn: String, fileNameOut: String): Resource[IO, (FileInputStream, FileOutputStream)] =
    for {
      in  <- RiderFile.openInputStream(fileNameIn)
      out <- RiderFile.openOutputStream(fileNameOut)

    } yield (in, out)
  def inputStreamDef(ff: FileInputStream): List[String] = ???
  def parser(l: List[String]):List[Cars] = ???
  def calculiator(l:List[Cars]):List[Cars2] = ???
  def outputStreamDef(oo:FileOutputStream, l:List[Cars2]):Unit = ???

  putAndDrop("cars.csv", "cars2.csv").use(streams => streams())
  println("Scala-parser test!!!")
  val carsOut: Cars = RiderFile.openInputStream("cars.csv")
  println("Scala-parser test!!!")
}
