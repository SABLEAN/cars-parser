import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class CalculiatorTest extends AnyWordSpec with Matchers {
  "Calculiator" should {
    "back List[YearOfRelease]" in {

      Calculiator.calculiator(List(Car(1990, "BMW", "M3"))) shouldEqual List(YearOfRelease("BMW M3", List(1990)))
    }
  }
}
