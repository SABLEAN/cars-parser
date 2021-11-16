import java.io.FileOutputStream
import java.nio.charset.StandardCharsets

object OutPutStreamDef {
  def outputStreamDef(oo: FileOutputStream, l: List[String]): Unit =
    l.foreach { ll =>
      oo.write(ll.getBytes(StandardCharsets.UTF_8))
      oo.write(System.lineSeparator().getBytes(StandardCharsets.UTF_8))

    }
}
