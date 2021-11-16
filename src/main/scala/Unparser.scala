object Unparser {
  def unparser(l: List[Cars2]): List[String] =
   List("Car,Year") ++  l.map(s => s.car + "," + s.years.mkString("[\"", "\",\"", "\"]"))

}
