object Unparser {
  def unparser(l: List[Cars2]): List[String] =
    l.map(s => s.car + "," + s.years.mkString("[\"", "\",\"", "\"]"))

}
