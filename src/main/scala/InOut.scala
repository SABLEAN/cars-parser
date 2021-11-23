import java.io.File
import scala.runtime.Nothing$

object InOut {

  def inOut(inOutFileName: List[String]): InOutFileName = {

    val in  = inOutFileName.find(b => b.startsWith("in="))
    val out = inOutFileName.find(b => b.startsWith("out="))

    if (in.isDefined && out.isDefined) {
      val inOutFileNameTrue: InOutFileName = InOutFileName(in.get.stripPrefix("in="), out.get.stripPrefix("out="))
      val f: File                          = new File(inOutFileNameTrue.inFileName)
      if (f.exists() && !f.isDirectory) {
        inOutFileNameTrue
      } else {
        println("Error!!!")
        println("Pls enter correct INFILENAME.csv:")
        System.exit(-1)
        ???

      }

    } else {
      println("Error!!!")
      println("Pls enter in/out file name for next format:")
      println("in=INFILENAME.csv out=OUTFILENAME.csv")
      System.exit(-1)
      ???
    }

  }

}
