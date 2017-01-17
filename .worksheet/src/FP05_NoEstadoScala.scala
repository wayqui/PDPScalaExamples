object FP05_NoEstadoScala {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(39); 
  var i = 1;System.out.println("""i  : Int = """ + $show(i ));$skip(117); 
  while (i <= 5) {
  	val j = 1
  	println("Si usamos val dara error ya que es inmutable")
  	i = i + 1
  	j = 3
  }}
}
