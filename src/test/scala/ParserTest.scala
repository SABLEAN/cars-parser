import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class ParserTest extends AnyWordSpec with Matchers {
  "Parser" should {
    "back List[Cars]" in {

      Parser.parser(List("year,model,firma", "1990,BMW,M3")) shouldEqual List(Car(1990, "BMW", "M3"))
    }
  }
}
