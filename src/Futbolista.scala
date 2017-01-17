/*
 * Defincion de una clase Futbolista que hereda de Persona
 */ 
class Futbolista (
  nombre: String,
  apellido: String,
  edad: Int,
  val posicion: String,
  val equipo: String
) extends Persona(nombre, apellido, edad, "futbolista") with Trabajador {
  
  def saludoDeTrabajo =
    "Como" + ocupacion + ", mi posicion es " + posicion + 
    " y actualmente juego en el equipo " + equipo + "."
}
