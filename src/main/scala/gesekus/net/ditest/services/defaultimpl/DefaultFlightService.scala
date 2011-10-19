package gesekus.net.ditest.services.defaultimpl

import gesekus.net.ditest._
import component._
import model._
import services._

trait DefaultFlightServiceComponent extends TrackManagerComponent with FlightManagerComponent {
  val flightService: FlightService = new DefaultFlightService()
  private class DefaultFlightService extends FlightService{
    def getTrack(flightId: Int): Track = {
      flightManager.empty
      val track = new Track(1, 1.0, 1.0)
      trackManager.add(track)
      track
    }
  }
}