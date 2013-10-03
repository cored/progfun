package week2

object session {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(187); 
  
  def factorial(n: Int): Int = {
  	def loop(accu: Int, n: Int): Int =
  		if (n == 0) accu
  		else loop(n*accu, n-1)
  		
  	loop(1,n)
  			  	
  	
	};System.out.println("""factorial: (n: Int)Int""");$skip(22); 
	
	def id(x: Int) = x;System.out.println("""id: (x: Int)Int""");$skip(29); 
	
	def sumInts = sum(x => x);System.out.println("""sumInts: => (Int, Int) => Int""");$skip(40); 
		
	
	def cube(x: Int): Int = x * x * x;System.out.println("""cube: (x: Int)Int""");$skip(34); 
	
	def sumCubes = sum(x => x*x*x);System.out.println("""sumCubes: => (Int, Int) => Int""");$skip(143); 
		
	def sum(f:  Int => Int): (Int, Int) => Int =  {
		def sumF(a: Int, b: Int): Int =
			if (a > b) 0
			else f(a)  + sumF(a + 1, b)
		sumF
	};System.out.println("""sum: (f: Int => Int)(Int, Int) => Int""");$skip(16); val res$0 = 
	
	sumInts(1,5);System.out.println("""res0: Int = """ + $show(res$0));$skip(17); val res$1 = 
	
  factorial(5);System.out.println("""res1: Int = """ + $show(res$1))}
  
  
}
