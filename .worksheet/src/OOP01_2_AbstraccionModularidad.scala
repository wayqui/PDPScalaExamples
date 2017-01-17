object OOP01_2_AbstraccionModularidad {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(71); 
  var numer = new Racional(1,4);System.out.println("""numer  : Racional = """ + $show(numer ));$skip(82); 
  
  // Creamos varios objetos y operamos con ellos
	val num1 = new Racional(3,5);System.out.println("""num1  : Racional = """ + $show(num1 ));$skip(30); 
	val num2 = new Racional(5,8);System.out.println("""num2  : Racional = """ + $show(num2 ));$skip(30); 
	val num3 = new Racional(1,2);System.out.println("""num3  : Racional = """ + $show(num3 ));$skip(19); val res$0 = 

	num1.sumar(num2);System.out.println("""res0: Racional = """ + $show(res$0));$skip(32); val res$1 = 
	num1.restar(num2).restar(num3);System.out.println("""res1: Racional = """ + $show(res$1));$skip(27); val res$2 = 
  
	num1.multiplicar(num2);System.out.println("""res2: Racional = """ + $show(res$2));$skip(20); val res$3 = 
	num1.dividir(num2);System.out.println("""res3: Racional = """ + $show(res$3))}
 
}
