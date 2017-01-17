class Persona (
  val nombres: String,
  val apellidos: String,
  val edad: Int,
  val ocupacion: String
) {
  def nombreCompleto: String = nombres + " " + apellidos
  def saludo (formal: Boolean): String = {
    if (formal)

      "Hola, mi nombre es " + nombreCompleto + " y soy " + ocupacion + "."
    else
      "¡Hola, me llamo " + nombres + "!"
  }
}
