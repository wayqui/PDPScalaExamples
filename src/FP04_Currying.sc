
object FP04_Currying {
	// CURRING: Forma de escribir funciones con múltiples listas de parámetros.

	// Funcion toma un parámetro y retorna una funcion
	def sum(f: Int => Int): (Int, Int) => Int = {
	   def sumF(a:Int, b: Int): Int =
	      if (a > b) 0 else f(a) + sumF(a+1, b)
	    sumF
	}                                         //> sum: (f: Int => Int)(Int, Int) => Int
	
	def cubo(x:Int):Int = x * x * x           //> cubo: (x: Int)Int
 	def factorial(x:Int):Int = if (x == 0) 1 else x * factorial(x-1)
                                                  //> factorial: (x: Int)Int
	
	
	// Quitamos los parámetros
	def sumaEnteros = sum (x => x)            //> sumaEnteros: => (Int, Int) => Int
	def sumaCubos = sum (x => x*x*x)          //> sumaCubos: => (Int, Int) => Int
	def sumaFactoriales = sum (factorial)     //> sumaFactoriales: => (Int, Int) => Int
	
	// Se puede invocar a las funciones de la siguiente forma
	sum (factorial) (2,3)                     //> res0: Int = 8
	sum (cubo) (2,3)                          //> res1: Int = 35
	
	// Podemos también invocara f(a) y, posteriormente,
	// invocar a la función resultante con el otro parámetro
	val x = sum(factorial)                    //> x  : (Int, Int) => Int = <function2>
	x(2,3)                                    //> res2: Int = 8
	val y = sum(cubo)                         //> y  : (Int, Int) => Int = <function2>
	y(2,3)                                    //> res3: Int = 35
	
	// La asociación de funciones se realiza desde la izquierda,
	sum (factorial) (2,3)                     //> res4: Int = 8
	(sum (factorial)) (2,3)                   //> res5: Int = 8
	sum (cubo) (2,3)                          //> res6: Int = 35
	(sum (cubo)) (2,3)                        //> res7: Int = 35
	
}