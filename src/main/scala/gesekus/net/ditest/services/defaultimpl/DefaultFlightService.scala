package gesekus.net.ditest.services.defaultimpl

import gesekus.net.ditest._
import component._
import model._
import services._

trait DefaultFlightServiceComponent extends TrackManagerComponent with FlightManagerComponent {
  
  val flightService: FlightService = new DefaultFlightService()
  
  private class DefaultFlightService extends FlightService {
    
    def getTrack(flightId: Int): Option[Track] = {
      println("Size:" + flightManager.size)
      flightManager.get(flightId) match {
        case Some(flight) => getTrack(flight.trackId)
        case _ => None
      }
    }
  
    def getTrack(trackIdOption: Option[Int]) = {
      trackIdOption match {
        case Some(trackId) => trackManager.get(trackId)
        case _ => None
      }
    }
    
  }
}