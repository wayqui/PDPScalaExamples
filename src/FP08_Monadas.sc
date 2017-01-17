object FP08_Monadas {

	// MONADAS
	
  def division(a: Double, b: Double): Option[Double] =
  if (b == 0) None else Some(a/b)                 //> division: (a: Double, b: Double)Option[Double]
 
	def doSomething(d: Double): Option[String] = d match {
  	case n if n > 1 => Some("The parameter is greater than 1")
   	case n if n == 1 => Some("The parameter is exactly 1")
   	case _ => Some("The parameter is lesser than 1")
	}                                         //> doSomething: (d: Double)Option[String]
 
	def prueba(numero1:Double, numero2:Double) {
  	println(division(numero1,numero2).flatMap{doSomething}.getOrElse("Division por cero!"))
	}                                         //> prueba: (numero1: Double, numero2: Double)Unit
}