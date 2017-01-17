object FP02_ComposicionFuncional {
	def cuadrado(x:Double) = x * x            //> cuadrado: (x: Double)Double
	
	cuadrado(2)                               //> res0: Double = 4.0
	cuadrado(cuadrado(3 + cuadrado(2)))       //> res1: Double = 2401.0
	
	def sumaCuadrados(x:Double, y:Double) = cuadrado(x) + cuadrado(y)
                                                  //> sumaCuadrados: (x: Double, y: Double)Double
	
	sumaCuadrados(3,4)                        //> res2: Double = 25.0
	sumaCuadrados(cuadrado(2), cuadrado(3))   //> res3: Double = 97.0
}