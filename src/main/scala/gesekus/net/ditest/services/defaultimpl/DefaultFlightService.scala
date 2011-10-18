package gesekus.net.ditest.services.defaultimpl
import gesekus.net.ditest.manager.FlightManager
import gesekus.net.ditest.manager.TrackManager
import gesekus.net.ditest.manager.ManagerRegistry

class DefaultFlightService(managerRegistry: ManagerRegistry) {
  val flightManager = managerRegistry.flightManager.vend
	val trackManager = managerRegistry.trackManager.vend
}