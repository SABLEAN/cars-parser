object Parser {
  def parser(l: List[String]): List[Car] =
    UnheadCSV.unheadcsv(l).map(s => CarCreator.carcreatorDef(s))

}
