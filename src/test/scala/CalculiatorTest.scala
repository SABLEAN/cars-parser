import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class CalculiatorTest extends AnyWordSpec with Matchers {

  "Calculiator" should {
    "back List[YearOfRelease]OneCar" in {

      Calculiator.calculiator(List(Car(1990, "BMW", "M3"))) shouldEqual List(YearOfRelease("BMW M3", List(1990)))
    }

    "back List[YearOfRelease]MoreCar" in {

      Calculiator.calculiator(List(Car(1990, "BMW", "M3"), Car(1990, "BMW", "M5"), Car(1991, "BMW", "M3"))) shouldEqual List(
        YearOfRelease("BMW M5", List(1990)),
        YearOfRelease("BMW M3", List(1990, 1991))
      )
    }

  }

}
