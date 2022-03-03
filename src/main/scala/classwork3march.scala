import java.time.Year
import scala.io.StdIn.readLine

object classwork3march extends App {
  val personsName = readLine("What is your name?")
  println(s"Hello, $personsName")
  val personsAge = readLine("How old are you?")
  val currentYear = Year.now.getValue
  val yearof100 = currentYear-personsAge.toInt+100
  println(s"You will be 100 years old in $yearof100")
}
