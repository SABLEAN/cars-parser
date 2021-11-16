import cats.effect.{IO, Resource}

import java.io.{FileInputStream, FileOutputStream}
import scala.io.Source

object CarsParser extends App {

  case class Cars(year: Int, brand: String, model: String)
  case class Cars2(car: String, years: List[Int])

  def putAndDrop(fileNameIn: String, fileNameOut: String): Resource[IO, (FileInputStream, FileOutputStream)] =
    for {
      in  <- RiderFile.openInputStream(fileNameIn)
      out <- RiderFile.openOutputStream(fileNameOut)

    } yield (in, out)
  def inputStreamDef(ff: FileInputStream): List[String] =
    Source.fromInputStream(ff).getLines().toList

  def parser(l: List[String]): List[Cars] =
    l.map { s =>
      val s1: List[String] = s.split(",").toList
      val s2: Cars         = Cars(s1.apply(0).toInt, s1.apply(1), s1.apply(2))
      s2
    }

  def calculiator(l: List[Cars]): List[Cars2] = {

    l.foldLeft(List.empty[Cars2] )((cc, l) => {

      val carrs2: Cars2 = cc.find(ex => ex.car == l.brand + l.model) match {
        case Some(value) => Cars2(value.car, value.years :+ l.year)
        case None => Cars2(l.brand + l.model, List(l.year))
      }
    cc.filter(b => b.car != carrs2.car):+carrs2

  })}

  def outputStreamDef(oo: FileOutputStream, l: List[Cars2]): Unit = ???

  putAndDrop("cars.csv", "cars2.csv").use(streams => streams(inputStreamDef()))
  println("Scala-parser test!!!")
  val carsOut: Cars = RiderFile.openInputStream("cars.csv")
  println("Scala-parser test!!!")
}
