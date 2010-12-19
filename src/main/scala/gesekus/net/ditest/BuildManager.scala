package gesekus.net.ditest

trait BuildManager {
	var builder
	def getBuildById(id : Int) : Build
}