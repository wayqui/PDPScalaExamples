object FP05_NoEstadoScala {
  var i = 1                                       //> i  : Int = 1
  while (i <= 10) {
  	var j = 1
  	println("Dara excepción al compilar ya que val es inmutable")
  	i = i + 1
  	j = 3
  }                                               //> Dara excepciÃ³n al compilar ya que val es inmutable
                                                  //| Dara excepciÃ³n al compilar ya que val es inmutable
                                                  //| Dara excepciÃ³n al compilar ya que val es inmutable
                                                  //| Dara excepciÃ³n al compilar ya que val es inmutable
                                                  //| Dara excepciÃ³n al compilar ya que val es inmutable
                                                  //| Dara excepciÃ³n al compilar ya que val es inmutable
                                                  //| Dara excepciÃ³n al compilar ya que val es inmutable
                                                  //| Dara excepciÃ³n al compilar ya que val es inmutable
                                                  //| Dara excepciÃ³n al compilar ya que val es inmutable
                                                  //| Dara excepciÃ³n al compilar ya que val es inmutable
}