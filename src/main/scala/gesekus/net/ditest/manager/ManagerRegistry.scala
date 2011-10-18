package gesekus.net.ditest.manager

import gesekus.net.ditest.manager.defaultimpl.DefaultTrackManager
import net.liftweb.util.SimpleInjector
import gesekus.net.ditest.manager.defaultimpl.DefaultFlightManager

class ManagerRegistry extends SimpleInjector {
	val flightManager = new Inject(buildFlightManager _ ) {}
	val trackManager = new Inject(buildTrackManager _) {}
	
	private def buildFlightManager(): FlightManager = new DefaultFlightManager
  private def buildTrackManager(): TrackManager = new DefaultTrackManager
}

object ManagerRegistry {
  def apply() = new ManagerRegistry()
}
