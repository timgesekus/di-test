package gesekus.net.ditest.services
import gesekus.net.ditest.model.Track
import gesekus.net.ditest.manager.FlightManager
import gesekus.net.ditest.manager.TrackManager
import gesekus.net.ditest.manager.defaultimpl.FlightManagerComponent
import gesekus.net.ditest.manager.defaultimpl.TrackManagerComponent


trait FlightService{
  def getTrack(flightId: Int ) : Track     
}