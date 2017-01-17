object FP01_TransparenciaReferencial {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(97); 
  def max(x:Int, y:Int):Int = {
  	if (x > y) x else y
  };System.out.println("""max: (x: Int, y: Int)Int""");$skip(13); val res$0 = 
  
 max(3,5);System.out.println("""res0: Int = """ + $show(res$0));$skip(11); val res$1 = 
  max(7,7);System.out.println("""res1: Int = """ + $show(res$1));$skip(11); val res$2 = 
  max(3,5);System.out.println("""res2: Int = """ + $show(res$2))}

}
