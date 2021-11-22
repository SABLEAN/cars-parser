import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class UnparserTest extends AnyWordSpec with Matchers {
  "Parser" should {
    "back List[String]OneYear" in {

      Unparser.unparser (List(YearOfRelease("BMW M3",List(1990)))) shouldEqual List("Car,Year", "BMW M3,[\"1990\"]")
    }

    "back List[String]ManyYear" in {

      Unparser.unparser (List(YearOfRelease("BMW M3", List(1990, 1992, 2000)))) shouldEqual List("Car,Year","BMW M3,[\"1990\",\"1992\",\"2000\"]")
    }


  }

}





