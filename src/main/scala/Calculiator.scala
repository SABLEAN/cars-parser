object Calculiator {
  def calculiator(l: List[Car]): List[YearOfRelease] =
    l.foldLeft(List.empty[YearOfRelease]) { (cc, l) =>
      val carrs2: YearOfRelease = cc.find(ex => ex.car == l.brand + " " + l.model) match {
        case Some(value) => YearOfRelease(value.car, value.years :+ l.year)
        case None        => YearOfRelease(l.brand + " " + l.model, List(l.year))
      }
      cc.filter(b => b.car != carrs2.car) :+ carrs2

    }

}
