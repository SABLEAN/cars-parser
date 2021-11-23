object InOut {

  def inOut(inOutFileName: List[String]): InOutFileName = {

    val in  = inOutFileName.find(b => b.startsWith("in="))
    val out = inOutFileName.find(b => b.startsWith("out="))

    val inOutFileNameTrue: InOutFileName = InOutFileName(in.get.stripPrefix("in="), out.get.stripPrefix("out="))
    inOutFileNameTrue
  }

}
