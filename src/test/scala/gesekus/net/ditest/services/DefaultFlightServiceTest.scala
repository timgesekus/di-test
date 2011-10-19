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


@RunWith(classOf[JUnitRunner])
class DefaultFlightServiceTest extends Spec { 
		describe ("A FlightManager") {
		  it ("should work") {
		    
		  }
		  object FlightServiceContext extends DefaultFlightServiceComponent {
		    val trackManager  = new DefaultTrackManager
		    val flightManager = new DefaultFlightManager
		    
		  }
		  ComponentRegistry.flightService.getTrack(5)
		}
		
}