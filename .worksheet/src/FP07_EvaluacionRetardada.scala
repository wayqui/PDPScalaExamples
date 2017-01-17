object FP07_EvaluacionRetardada {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(68); 
  val x = { println ("foo") ; 10 };System.out.println("""x  : Int = """ + $show(x ));$skip(17); 
	println ("bar");$skip(13); 
	println (x);$skip(40); 

	lazy val y = { println ("foo") ; 10 };System.out.println("""y: => Int""");$skip(17); 
	println ("bar");$skip(13); 
	println (y)}
}
