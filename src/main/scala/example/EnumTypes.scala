package example

object EnumTypes {
  // GMT means approximately time difference from the UK
  case class GMT(td: Int)
  
  // latitude and longitude location is the capital of the Country
  // North and East is expressed + value, South and West is expressed - value
  enum Country(latitude: Double, longitude: Double):
    def gmt: GMT = GMT( (longitude / 15).toInt )
    case Japan extends Country(35.4122, 139.4130)
    case US extends Country(38.5342, -77.210)
    case UK extends Country(51, 0)
  end Country
  
  def run: Unit = {
    println("[EnumTypes]")
    val japan = Country.Japan
    println(japan.gmt)
  }
  
}
