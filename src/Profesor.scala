  
/*
 * Defincion de una clase Profesor que hereda de Persona
 */ 
class Profesor (
  nombre: String,
  apellido: String,
  edad: Int,
  val especialidad: String,
  val nivelDeEnsenanza: String
) extends Persona(nombre, apellido, edad, "Profesor") with Trabajador {
  
  def saludoDeTrabajo =
    "Como" + ocupacion + ", mi especialidad es " + especialidad + 
    " y ejerzo en el nivel " + nivelDeEnsenanza + "."
}