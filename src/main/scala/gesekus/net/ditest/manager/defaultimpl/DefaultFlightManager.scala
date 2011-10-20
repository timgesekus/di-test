/**
 *
 */
package gesekus.net.ditest.manager.defaultimpl

import gesekus.net.ditest.manager.FlightManager
import gesekus.net.ditest.model.Flight
import scala.collection.mutable.HashMap

/**
 * @author gesekus
 *
 */
class DefaultFlightManager extends FlightManager {
  val flights = HashMap[Int,Flight]()
  def foreach[U](f:((Int, gesekus.net.ditest.model.Flight))=>U) : Unit = flights.foreach[U]((e) => f(e._1,e._2))
  def add(flight: Flight) {
    flights += flight.flightId -> flight
  }
  def get(flightId: Int): Option[Flight] = {
    flights.get(flightId)
  }
  def remove(flightId: Int) {
    flights -= flightId
  }
  
  def empty = flights.isEmpty

}