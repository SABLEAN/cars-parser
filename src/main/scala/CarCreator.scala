object CarCreator {

  def carcreatorDef(l: String): Car = {

    val s1: List[String] = l.split(",").toList
    val s2: Car          = Car(s1.head.toInt, s1.apply(1), s1.apply(2))
    s2
  }
}
