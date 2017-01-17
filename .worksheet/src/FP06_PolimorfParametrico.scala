object FP06_PolimorfParametrico {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(172); 

  def pertenece(a: Any, xs: List[Any]): Boolean = {
		if (xs.isEmpty) false
		else if (a == xs.head) true
		else pertenece(a, xs.tail)
	};System.out.println("""pertenece: (a: Any, xs: List[Any])Boolean""");$skip(28); 
	val nums = 1::2::3::4::Nil;System.out.println("""nums  : List[Int] = """ + $show(nums ));$skip(57); 
	val fruit = "apples" :: ("oranges" :: ("pears" :: Nil));System.out.println("""fruit  : List[String] = """ + $show(fruit ));$skip(27); val res$0 = 
	pertenece("pears", fruit);System.out.println("""res0: Boolean = """ + $show(res$0));$skip(20); val res$1 = 
	pertenece(5, nums);System.out.println("""res1: Boolean = """ + $show(res$1))}

}
