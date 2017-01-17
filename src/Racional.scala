class Racional (x:Int, y: Int) {
  def numer = x
  def denom = y
  
  def sumar(racional2: Racional)  =
    new Racional(numer*racional2.denom + racional2.numer*denom,
                 denom * racional2.denom)

  def negativo: Racional = new Racional (-numer, denom)
  
  def restar(racional2:Racional) = sumar(racional2.negativo)

  def multiplicar(racional2:Racional) =
    new Racional(numer*racional2.numer, denom*racional2.denom)

  def fraccionInversa: Racional = new Racional(denom, numer)
  
  def dividir(racional2:Racional) = multiplicar(racional2.fraccionInversa)

  override def toString = numer + "/" + denom
}

