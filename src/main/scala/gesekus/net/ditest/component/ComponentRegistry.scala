package gesekus.net.ditest.component

import gesekus.net.ditest.manager.defaultimpl.DefaultTrackManager
import net.liftweb.util.SimpleInjector
import gesekus.net.ditest.manager.defaultimpl._
import gesekus.net.ditest.services.defaultimpl.DefaultFlightServiceComponent

//class ManagerRegistry extends SimpleInjector {
//	val flightManager = new Inject(buildFlightManager _ ) {}
//	val trackManager = new Inject(buildTrackManager _) {}
//	
//	private def buildFlightManager(): FlightManager = new DefaultFlightManager
//  private def buildTrackManager(): TrackManager = new DefaultTrackManager
//}
//
//object ManagerRegistry {
//  def apply() = new ManagerRegistry()
//}

object ComponentRegistry extends DefaultFlightServiceComponent  {
  val flightManager = new DefaultFlightManager
  val trackManager = new DefaultTrackManager
}