object OOP03_6_EncapsOcultacionHerenciaPolimorf {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(128); 
	val persona1 = new Persona("Jose", "Bustamante", 36, "Ingeniero informático");System.out.println("""persona1  : Persona = """ + $show(persona1 ));$skip(23); val res$0 = 
	persona1.saludo(true);System.out.println("""res0: String = """ + $show(res$0));$skip(20); val res$1 = 
	persona1.ocupacion;System.out.println("""res1: String = """ + $show(res$1));$skip(85); 
	
	val futbolista1 = new Futbolista("Leonel", "Messi", 29, "delantero", "Barcelona");System.out.println("""futbolista1  : Futbolista = """ + $show(futbolista1 ));$skip(26); val res$2 = 
	futbolista1.saludo(true);System.out.println("""res2: String = """ + $show(res$2));$skip(30); val res$3 = 

	futbolista1.saludoDeTrabajo;System.out.println("""res3: String = """ + $show(res$3));$skip(20); val res$4 = 
	futbolista1.equipo;System.out.println("""res4: String = """ + $show(res$4));$skip(92); 
	
	val programador = new Programador("Andrew", "McCallum", 44, "machine learning", "Scala");System.out.println("""programador  : Programador = """ + $show(programador ));$skip(80); 
  val profesor = new Profesor("Anton", "Makarenko", 83, "profesor", "historia");System.out.println("""profesor  : Profesor = """ + $show(profesor ));$skip(83); 
  val futbolista2 = new Futbolista("Luis", "Suárez", 27, "delantero", "Barcelona");System.out.println("""futbolista2  : Futbolista = """ + $show(futbolista2 ));$skip(61); 
	val trabajadores = List(programador, profesor, futbolista2);System.out.println("""trabajadores  : List[Persona with Trabajador] = """ + $show(trabajadores ));$skip(44); val res$5 = 

  trabajadores.map(prof => prof.ocupacion);System.out.println("""res5: List[String] = """ + $show(res$5));$skip(93); 
	
  trabajadores.foreach(prof => println(prof.nombreCompleto + ": " + prof.saludoDeTrabajo))}
  
	///trabajadores.foreach(prof => prof.nivelDeEnsenanza)
	 
}
