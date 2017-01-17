/*
 * Defincion de una clase Programador que hereda de Persona
 */ 
class Programador (
  nombre: String,
  apellido: String,
  edad: Int,
  val especialidad: String,
  val lenguajeFavorito: String
) extends Persona(nombre, apellido, edad, "Programador") with Trabajador {
  
  def saludoDeTrabajo =
    "Como" + ocupacion + ", mi especialidad es " + especialidad + 
    " y mi lenguaje favorito es " + lenguajeFavorito + "."
}
