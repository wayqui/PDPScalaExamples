object OOP01_2_AbstraccionModularidad {
  var numer = new Racional(1,4)                   //> numer  : Racional = 1/4
  
  // Creamos varios objetos y operamos con ellos
	val num1 = new Racional(3,5)              //> num1  : Racional = 3/5
	val num2 = new Racional(5,8)              //> num2  : Racional = 5/8
	val num3 = new Racional(1,2)              //> num3  : Racional = 1/2

	num1.sumar(num2)                          //> res0: Racional = 49/40
	num1.restar(num2).restar(num3)            //> res1: Racional = -42/80
  
	num1.multiplicar(num2)                    //> res2: Racional = 15/40
	num1.dividir(num2)                        //> res3: Racional = 24/25
 
}