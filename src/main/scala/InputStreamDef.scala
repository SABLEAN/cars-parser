import java.io.FileInputStream
import scala.io.Source

object InputStreamDef {
  def inputStreamDef(ff: FileInputStream): List[String] =
    Source.fromInputStream(ff).getLines().toList

}
