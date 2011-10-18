package gesekus.net.ditest.manager
import gesekus.net.ditest.model.Track

trait TrackManager {
  def add(track: Track)
  def get(trackId: Int) : Option[Track]
  def remove(trackId: Int)
}