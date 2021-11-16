object Calculiator {
  def calculiator(l: List[Cars]): List[Cars2] =
    l.foldLeft(List.empty[Cars2]) { (cc, l) =>
      val carrs2: Cars2 = cc.find(ex => ex.car == l.brand + l.model) match {
        case Some(value) => Cars2(value.car, value.years :+ l.year)
        case None        => Cars2(l.brand + l.model, List(l.year))
      }
      cc.filter(b => b.car != carrs2.car) :+ carrs2

    }

}
