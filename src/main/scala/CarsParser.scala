object CarsParser extends App {

  case class Cars(year: Int, car: String)

  val b: String = RiderFile.openInputStream("cars.csv")
  println("Scala-parser test!!!")

}
