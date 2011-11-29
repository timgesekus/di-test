package gesekus.net.subcut.components
import org.scala_tools.subcut.inject.NewBindingModule

object SubcutRunner {
  def main(args: Array[String]): Unit = {
    implicit object SomeConfigurationModule extends NewBindingModule({ module =>
      import module._
      bind[DataSourceComponent] toInstance new DefaultDataSourceComponent()
    })
    val dsUser = new DSUser
  }
}
