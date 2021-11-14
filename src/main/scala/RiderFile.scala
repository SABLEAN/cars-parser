import cats.



object RiderFile {


  def file(name: String): Resource[IO, File] = Resource.make(openFile(name)))(file => close(file))


scala.io.Source.fromFile("file.txt").getLines.reduceLeft(_+_)




}
