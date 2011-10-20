/**
 *
 */
package gesekus.net.ditest.manager.defaultimpl

import gesekus.net.ditest.manager.TrackManager
import gesekus.net.ditest.model.Track
import scala.collection.mutable.HashMap

/**
 * @author gesekus
 *
 */
class DefaultTrackManager extends TrackManager {
  val tracks = HashMap[Int, Track]()
  def add(track: Track) = {
    tracks += track.trackId -> track
  }

  def get(trackId: Int): Option[Track] = {
    tracks.get(trackId)
  }

  def remove(trackId: Int) = {
    tracks -= trackId
  }

}