import java.io.FileInputStream
import scala.io.Source

object InputStreamDef {
  def inputStreamDef(ff: FileInputStream): List[String] =
    Source.fromInputStream(ff).getLines().toList

  def parser(l: List[String]): List[Cars] =
    l.map { s =>
      val s1: List[String] = s.split(",").toList
      val s2: Cars         = Cars(s1.apply(0).toInt, s1.apply(1), s1.apply(2))
      s2
    }
}
