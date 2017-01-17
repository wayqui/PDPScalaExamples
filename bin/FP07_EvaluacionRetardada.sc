object FP07_EvaluacionRetardada {
  val x = { println ("foo") ; 10 }                //> foo
                                                  //| x  : Int = 10
	println ("bar")                           //> bar
	println (x)                               //> 10

	lazy val y = { println ("foo") ; 10 }     //> y: => Int
	println ("bar")                           //> bar
	println (y)                               //> foo
                                                  //| 10
}