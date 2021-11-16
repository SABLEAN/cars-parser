object InOut {

  def intOut(l: List[String]): (String, String) = {

    val in  = l.find(b => b.startsWith("in="))
    val out = l.find(b => b.startsWith("out="))

    (in.get.stripPrefix("in="), out.get.stripPrefix("out="))
  }

}
