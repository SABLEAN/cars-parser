import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class UnparserTest extends AnyWordSpec with Matchers {
  "Parser" should {
    "back List[String]" in {

      Unparser.unparser (List(YearOfRelease("BMW M3",List(1990)))) shouldEqual List("Car,Year", "BMW M3,[\"1990\"]")
    }
  }
}
