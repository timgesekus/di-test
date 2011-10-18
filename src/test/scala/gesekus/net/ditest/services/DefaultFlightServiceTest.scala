package gesekus.net.ditest.services
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.Spec
import org.scalatest.matchers.MustMatchers
import net.liftweb.util.SimpleInjector
import gesekus.net.ditest.manager.FlightManager
import net.liftweb.common.Box
import gesekus.net.ditest.manager.defaultimpl.DefaultFlightManager
import gesekus.net.ditest.manager.ManagerRegistry
import gesekus.net.ditest.services.defaultimpl.DefaultFlightService

@RunWith(classOf[JUnitRunner])
class DefaultFlightServiceTest extends Spec with MustMatchers {
		val managerRegistry = ManagerRegistry()
		val flightService = new DefaultFlightService(managerRegistry)
		describe ("A FlightManager") {
		  it ("should work") (pending)
		}
}