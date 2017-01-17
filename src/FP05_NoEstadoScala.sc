object FP05_NoEstadoScala {
  var i = 1
  while (i <= 5) {
  	val j = 1
  	println("Si usamos val dara error ya que es inmutable")
  	i = i + 1
  	j = 3
  }
}