object FP01_TransparenciaReferencial {
  def max(x:Int, y:Int):Int = {
  	if (x > y) x else y
  }                                               //> max: (x: Int, y: Int)Int
  
 max(3,5)                                         //> res0: Int = 5
  max(7,7)                                        //> res1: Int = 7
  max(3,5)                                        //> res2: Int = 5

}