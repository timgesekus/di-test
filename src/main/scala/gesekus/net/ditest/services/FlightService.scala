package gesekus.net.ditest.services
import gesekus.net.ditest.model.Track
import gesekus.net.ditest.manager.FlightManager
import gesekus.net.ditest.manager.TrackManager


trait FlightService{
  def getTrack(flightId: Int ) : Option[Track]     
}