object OOP03_6_EncapsOcultacionHerenciaPolimorf {
	val persona1 = new Persona("Jose", "Bustamante", 36, "Ingeniero informático")
                                                  //> persona1  : Persona = Persona@22927a81
	persona1.saludo(true)                     //> res0: String = Hola, mi nombre es Jose Bustamante y soy Ingeniero informÃ¡ti
                                                  //| co.
	persona1.ocupacion                        //> res1: String = Ingeniero informÃ¡tico
	
	val futbolista1 = new Futbolista("Leonel", "Messi", 29, "delantero", "Barcelona")
                                                  //> futbolista1  : Futbolista = Futbolista@7a79be86
	futbolista1.saludo(true)                  //> res2: String = Hola, mi nombre es Leonel Messi y soy futbolista.

	futbolista1.saludoDeTrabajo               //> res3: String = Comofutbolista, mi posicion es delantero y actualmente juego 
                                                  //| en el equipo Barcelona.
	futbolista1.equipo                        //> res4: String = Barcelona
	
	val programador = new Programador("Andrew", "McCallum", 44, "machine learning", "Scala")
                                                  //> programador  : Programador = Programador@34ce8af7
  val profesor = new Profesor("Anton", "Makarenko", 83, "profesor", "historia")
                                                  //> profesor  : Profesor = Profesor@b684286
  val futbolista2 = new Futbolista("Luis", "Suárez", 27, "delantero", "Barcelona")
                                                  //> futbolista2  : Futbolista = Futbolista@880ec60
	val trabajadores = List(programador, profesor, futbolista2)
                                                  //> trabajadores  : List[Persona with Trabajador] = List(Programador@34ce8af7, P
                                                  //| rofesor@b684286, Futbolista@880ec60)

  trabajadores.map(prof => prof.ocupacion)        //> res5: List[String] = List(Programador, Profesor, futbolista)
	
  trabajadores.foreach(prof => println(prof.nombreCompleto + ": " + prof.saludoDeTrabajo))
                                                  //> Andrew McCallum: ComoProgramador, mi especialidad es machine learning y mi l
                                                  //| enguaje favorito es Scala.
                                                  //| Anton Makarenko: ComoProfesor, mi especialidad es profesor y ejerzo en el ni
                                                  //| vel historia.
                                                  //| Luis SuÃ¡rez: Comofutbolista, mi posicion es delantero y actualmente juego e
                                                  //| n el equipo Barcelona.
  
	///trabajadores.foreach(prof => prof.nivelDeEnsenanza)
	 
}