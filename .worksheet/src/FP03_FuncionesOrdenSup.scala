object FP03_FuncionesOrdenSup {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(198); 

 	// Funcion generica suma a la que se le pasa una funcion como parametro
 	def suma(f:Int => Int, a:Int, b:Int): Int =
 		if (a > b) 0 else f(a) +  suma (f, a+1, b);System.out.println("""suma: (f: Int => Int, a: Int, b: Int)Int""");$skip(175); 
 	
 	// Definimos 3 nuevas funciones para diferentes tipos de suma, simple,
 	// suma de cuadrados, suma de factoriales.
 	def sumaEnteros(a:Int, b:Int): Int = suma(id, a, b);System.out.println("""sumaEnteros: (a: Int, b: Int)Int""");$skip(62); 
 	def sumaCuadrados(a:Int, b:Int): Int = suma(cuadrado, a, b);System.out.println("""sumaCuadrados: (a: Int, b: Int)Int""");$skip(65); 
 	def sumaFactoriales(a:Int, b:Int): Int = suma(factorial, a, b);System.out.println("""sumaFactoriales: (a: Int, b: Int)Int""");$skip(27); 
 	
 	def id(x:Int):Int = x;System.out.println("""id: (x: Int)Int""");$skip(34); 
 	def cuadrado(x:Int):Int = x * x;System.out.println("""cuadrado: (x: Int)Int""");$skip(67); 
 	def factorial(x:Int):Int = if (x == 0) 1 else x * factorial(x-1);System.out.println("""factorial: (x: Int)Int""");$skip(26); val res$0 = 
 	
 	sumaFactoriales(2,3);System.out.println("""res0: Int = """ + $show(res$0));$skip(21); val res$1 = 
 	sumaCuadrados(2,3);System.out.println("""res1: Int = """ + $show(res$1));$skip(19); val res$2 = 
 	sumaEnteros(3,4);System.out.println("""res2: Int = """ + $show(res$2));$skip(137); 
 	
 	// Implementamos mediante funcion anonima
 	def sum(f:Int => Int, a:Int, b:Int): Int =
 		if (a > b) 0 else f(a) +  sum (f, a+1, b);System.out.println("""sum: (f: Int => Int, a: Int, b: Int)Int""");$skip(52); 
 		
 	def sumInts(a:Int, b:Int) = sum(x => x, a, b);System.out.println("""sumInts: (a: Int, b: Int)Int""");$skip(55); 
 	def sumSquares(a:Int, b:Int) = sum(x => x * x, a, b);System.out.println("""sumSquares: (a: Int, b: Int)Int""");$skip(65); val res$3 = 
                                                  
	sumInts(3,4);System.out.println("""res3: Int = """ + $show(res$3));$skip(17); val res$4 = 
	sumSquares(3,4);System.out.println("""res4: Int = """ + $show(res$4))}
	
}
