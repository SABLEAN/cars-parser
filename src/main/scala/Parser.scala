object Parser {
  def parser(l: List[String]): List[Car] =
    l.tail.map { s =>
      val s1: List[String] = s.split(",").toList
      val s2: Car          = Car(s1.head.toInt, s1.apply(1), s1.apply(2))
      s2
    }

}
