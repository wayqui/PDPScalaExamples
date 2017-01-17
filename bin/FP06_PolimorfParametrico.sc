object FP06_PolimorfParametrico {
  def pertenece(a: Any, xs: List[Any]): Boolean = {
		if (xs.isEmpty) false
		else if (a == xs.head) true
		else pertenece(a, xs.tail)
	}                                         //> pertenece: (a: Any, xs: List[Any])Boolean
	val nums = 1::2::3::4::Nil                //> nums  : List[Int] = List(1, 2, 3, 4)
	val fruit = "apples" :: ("oranges" :: ("pears" :: Nil))
                                                  //> fruit  : List[String] = List(apples, oranges, pears)
	pertenece("pears", fruit)                 //> res0: Boolean = true
	pertenece(5, nums)                        //> res1: Boolean = false
}