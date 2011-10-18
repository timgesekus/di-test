package gesekus.net.ditest.manager.defaultimpl

import org.scalatest.Spec
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.matchers.MustMatchers
import gesekus.net.ditest.model.Flight

@RunWith(classOf[JUnitRunner])
class FlightManagerSpec extends Spec with MustMatchers {
  
  describe("A DefaultFlightManager") {
    val flightManager = new DefaultFlightManager()
  	describe ("When created") {
  		it("should should be empty") {
  		  flightManager must be ('empty)
  		}
  	  
  	}
    describe ("When filled with a flight") {
      val flightManager = new DefaultFlightManager() 
      val flight = new Flight(1,None)
      flightManager.add(flight)
      it ("should not be empty") {
    	  flightManager must not be ('empty)    
      }
    }
  }

}