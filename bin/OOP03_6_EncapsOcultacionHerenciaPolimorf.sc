object OOP03_6_EncapsOcultacionHerenciaPolimorf {
	val persona1 = new Persona("Jose", "Bustamante", 36, "Ingeniero informático")
	persona1.saludo(true)
	persona1.ocupacion
	
	val futbolista1 = new Futbolista("Leonel", "Messi", 29, "delantero", "Barcelona")
	futbolista1.saludo(true)

	futbolista1.saludoDeTrabajo
	futbolista1.equipo
	
	val programador = new Programador("Andrew", "McCallum", 44, "machine learning", "Scala")
  val profesor = new Profesor("Anton", "Makarenko", 83, "profesor", "historia")
  val futbolista2 = new Futbolista("Luis", "Suárez", 27, "delantero", "Barcelona")
	val trabajadores = List(programador, profesor, futbolista2)

  trabajadores.map(prof => prof.ocupacion)
	
	trabajadores.foreach(prof => println(prof.nombreCompleto + ": " + prof.saludoDeTrabajo))
	
	trabajadores.foreach(prof => prof.nivelDeEnsenanza)
	
}