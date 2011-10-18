package gesekus.net.ditest.services
import gesekus.net.ditest.model.Track

trait FlightService {
	def getTrack(flightId: Int) : Track
}