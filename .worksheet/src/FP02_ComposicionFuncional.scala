object FP02_ComposicionFuncional {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(66); 
	def cuadrado(x:Double) = x * x;System.out.println("""cuadrado: (x: Double)Double""");$skip(15); val res$0 = 
	
	cuadrado(2);System.out.println("""res0: Double = """ + $show(res$0));$skip(37); val res$1 = 
	cuadrado(cuadrado(3 + cuadrado(2)));System.out.println("""res1: Double = """ + $show(res$1));$skip(70); 
	 
	def sumaCuadrados(x:Double, y:Double) = cuadrado(x) + cuadrado(y);System.out.println("""sumaCuadrados: (x: Double, y: Double)Double""");$skip(22); val res$2 = 
	
	sumaCuadrados(3,4);System.out.println("""res2: Double = """ + $show(res$2));$skip(41); val res$3 = 
	sumaCuadrados(cuadrado(2), cuadrado(3));System.out.println("""res3: Double = """ + $show(res$3))}
}
