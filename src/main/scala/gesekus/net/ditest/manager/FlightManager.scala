package gesekus.net.ditest.manager
import gesekus.net.ditest.model.Flight
import scala.collection.Traversable

trait FlightManager extends Traversable[(Int, Flight)] {
  def add(flight: Flight)
  def get(flightId: Int) : Option[Flight]
  def remove(flightId: Int)
  def empty : Boolean
}