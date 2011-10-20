package gesekus.net.ditest.services
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.Spec
import org.scalatest.matchers.MustMatchers
import gesekus.net.ditest._
import component._
import model._
import services._
import services.defaultimpl._
import manager.defaultimpl._
import org.scalatest.matchers.ShouldMatchers

@RunWith(classOf[JUnitRunner])
class DefaultFlightServiceTest extends Spec with ShouldMatchers {
  describe("A FlightService") {
    object FlightServiceContext extends DefaultFlightServiceComponent {
      val trackManager = new DefaultTrackManager
      val flightManager = new DefaultFlightManager

    }
    val track = Track(1, 0.1, 0.1)
    FlightServiceContext.trackManager.add(track)

    val flight = new Flight(1, Some(1))
    FlightServiceContext.flightManager.add(flight)

    describe("when asked for an existing track") {
      it("should return it") {
        println("Size:" + FlightServiceContext.flightManager.size)

        val foundTrack = FlightServiceContext.flightService.getTrack(1)
        foundTrack should equal(Some(track))
      }
    }
    
    describe("when asked for a non existing track") {
      it("should return None") {
        println("Size:" + FlightServiceContext.flightManager.size)

        val foundTrack = FlightServiceContext.flightService.getTrack(2)
        foundTrack should equal(None)
      }
    }

  }
}