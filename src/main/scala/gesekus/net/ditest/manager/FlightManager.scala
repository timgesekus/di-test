package gesekus.net.ditest.manager
import gesekus.net.ditest.model.Flight

trait FlightManager {
  def add(flight: Flight)
  def get(flightId: Int) : Option[Flight]
  def remove(flightId: Int)
  def empty : Boolean
}