package gesekus.net.subcut.components
import org.scala_tools.subcut.inject.NewBindingModule
import com.sun.xml.internal.ws.encoding.DataSourceStreamingDataHandler
import org.scala_tools.subcut.inject.BindingModule
import org.scala_tools.subcut.inject.Injectable

class DataSource {
  
}

trait DataSourceComponent {
	def dataSource : DataSource
}

class DefaultDataSourceComponent extends DataSourceComponent {
  def dataSource : DataSource = new DataSource
}



class DSUser() (implicit val bindingModule: BindingModule) extends Injectable  {
  val dataSourceComponet  = inject[DataSourceComponent]
  dataSourceComponet.dataSource
}


