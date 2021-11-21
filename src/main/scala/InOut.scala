object InOut {

  def inOut(inOutFileName: List[String]): (String, String) = {

    val in  = inOutFileName.find(b => b.startsWith("in="))
    val out = inOutFileName.find(b => b.startsWith("out="))

    (in.get.stripPrefix("in="), out.get.stripPrefix("out="))
  }

}
