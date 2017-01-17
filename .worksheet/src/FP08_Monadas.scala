object FP08_Monadas {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(125); 

	// MONADAS
	
  def division(a: Double, b: Double): Option[Double] =
  if (b == 0) None else Some(a/b);System.out.println("""division: (a: Double, b: Double)Option[Double]""");$skip(235); 
 
	def doSomething(d: Double): Option[String] = d match {
  	case n if n > 1 => Some("The parameter is greater than 1")
   	case n if n == 1 => Some("The parameter is exactly 1")
   	case _ => Some("The parameter is lesser than 1")
	};System.out.println("""doSomething: (d: Double)Option[String]""");$skip(142); 
 
	def prueba(numero1:Double, numero2:Double) {
  	println(division(numero1,numero2).flatMap{doSomething}.getOrElse("Division por cero!"))
	};System.out.println("""prueba: (numero1: Double, numero2: Double)Unit""")}
}
