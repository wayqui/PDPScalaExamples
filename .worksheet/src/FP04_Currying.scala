
object FP04_Currying {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(293); 
	// CURRING: Forma de escribir funciones con múltiples listas de parámetros.

	// Funcion toma un parámetro y retorna una funcion
	def sum(f: Int => Int): (Int, Int) => Int = {
	   def sumF(a:Int, b: Int): Int =
	      if (a > b) 0 else f(a) + sumF(a+1, b)
	    sumF
	};System.out.println("""sum: (f: Int => Int)(Int, Int) => Int""");$skip(35); 
	
	def cubo(x:Int):Int = x * x * x;System.out.println("""cubo: (x: Int)Int""");$skip(67); 
 	def factorial(x:Int):Int = if (x == 0) 1 else x * factorial(x-1);System.out.println("""factorial: (x: Int)Int""");$skip(64); 
	
	
	// Quitamos los parámetros
	def sumaEnteros = sum (x => x);System.out.println("""sumaEnteros: => (Int, Int) => Int""");$skip(34); 
	def sumaCubos = sum (x => x*x*x);System.out.println("""sumaCubos: => (Int, Int) => Int""");$skip(39); 
	def sumaFactoriales = sum (factorial);System.out.println("""sumaFactoriales: => (Int, Int) => Int""");$skip(84); val res$0 = 
	
	// Se puede invocar a las funciones de la siguiente forma
	sum (factorial) (2,3);System.out.println("""res0: Int = """ + $show(res$0));$skip(18); val res$1 = 
	sum (cubo) (2,3);System.out.println("""res1: Int = """ + $show(res$1));$skip(137); 
	
	// Podemos también invocara f(a) y, posteriormente,
	// invocar a la función resultante con el otro parámetro
	val x = sum(factorial);System.out.println("""x  : (Int, Int) => Int = """ + $show(x ));$skip(8); val res$2 = 
	x(2,3);System.out.println("""res2: Int = """ + $show(res$2));$skip(19); 
	val y = sum(cubo);System.out.println("""y  : (Int, Int) => Int = """ + $show(y ));$skip(8); val res$3 = 
	y(2,3);System.out.println("""res3: Int = """ + $show(res$3));$skip(87); val res$4 = 
	
	// La asociación de funciones se realiza desde la izquierda,
	sum (factorial) (2,3);System.out.println("""res4: Int = """ + $show(res$4));$skip(25); val res$5 = 
	(sum (factorial)) (2,3);System.out.println("""res5: Int = """ + $show(res$5));$skip(18); val res$6 = 
	sum (cubo) (2,3);System.out.println("""res6: Int = """ + $show(res$6));$skip(20); val res$7 = 
	(sum (cubo)) (2,3);System.out.println("""res7: Int = """ + $show(res$7))}
	
}
