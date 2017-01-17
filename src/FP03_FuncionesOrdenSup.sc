object FP03_FuncionesOrdenSup {

 	// Funcion generica suma a la que se le pasa una funcion como parametro
 	def suma(f:Int => Int, a:Int, b:Int): Int =
 		if (a > b) 0 else f(a) +  suma (f, a+1, b)
                                                  //> suma: (f: Int => Int, a: Int, b: Int)Int
 	
 	// Definimos 3 nuevas funciones para diferentes tipos de suma, simple,
 	// suma de cuadrados, suma de factoriales.
 	def sumaEnteros(a:Int, b:Int): Int = suma(id, a, b)
                                                  //> sumaEnteros: (a: Int, b: Int)Int
 	def sumaCuadrados(a:Int, b:Int): Int = suma(cuadrado, a, b)
                                                  //> sumaCuadrados: (a: Int, b: Int)Int
 	def sumaFactoriales(a:Int, b:Int): Int = suma(factorial, a, b)
                                                  //> sumaFactoriales: (a: Int, b: Int)Int
 	
 	def id(x:Int):Int = x                     //> id: (x: Int)Int
 	def cuadrado(x:Int):Int = x * x           //> cuadrado: (x: Int)Int
 	def factorial(x:Int):Int = if (x == 0) 1 else x * factorial(x-1)
                                                  //> factorial: (x: Int)Int
 	
 	sumaFactoriales(2,3)                      //> res0: Int = 8
 	sumaCuadrados(2,3)                        //> res1: Int = 13
 	sumaEnteros(3,4)                          //> res2: Int = 7
 	
 	// Implementamos mediante funcion anonima
 	def sum(f:Int => Int, a:Int, b:Int): Int =
 		if (a > b) 0 else f(a) +  sum (f, a+1, b)
                                                  //> sum: (f: Int => Int, a: Int, b: Int)Int
 		
 	def sumInts(a:Int, b:Int) = sum(x => x, a, b)
                                                  //> sumInts: (a: Int, b: Int)Int
 	def sumSquares(a:Int, b:Int) = sum(x => x * x, a, b)
                                                  //> sumSquares: (a: Int, b: Int)Int
                                                  
	sumInts(3,4)                              //> res3: Int = 7
	sumSquares(3,4)                           //> res4: Int = 25
	
}