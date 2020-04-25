package cse512
import scala.math._
object HotzoneUtils {

  def ST_Contains(queryRectangle: String,pointString: String):Boolean = {
    if (Option(queryRectangle).getOrElse("").isEmpty || Option(pointString).getOrElse("").isEmpty)
      return false
    var rectArray = queryRectangle.split(",")
    var rect_x1 = rectArray(0).trim.toDouble
    var rect_y1 = rectArray(1).trim.toDouble
    var rect_x2 = rectArray(2).trim.toDouble
    var rect_y2 = rectArray(3).trim.toDouble

    var pointArray = pointString.split(",")
    var point_x = pointArray(0).trim.toDouble
    var point_y = pointArray(1).trim.toDouble

    if (point_x >= min(rect_x1, rect_x2) && point_x <= max(rect_x1, rect_x2) && point_y >= min(rect_y1, rect_y2) && point_y <= max(rect_y1, rect_y2))
      return true
    else
      return false

  }
}





