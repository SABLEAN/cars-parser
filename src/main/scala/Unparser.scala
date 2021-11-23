object Unparser {
  def unparser(l: List[YearOfRelease]): List[String] =
    List("Car,Year") ++ l.map(s => s.car + "," + s.years.mkString("[\"", "\",\"", "\"]"))

}
