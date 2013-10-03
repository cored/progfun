package week2

object session {
  
  def factorial(n: Int): Int = {
  	def loop(accu: Int, n: Int): Int =
  		if (n == 0) accu
  		else loop(n*accu, n-1)
  		
  	loop(1,n)
  			  	
  	
	}                                         //> factorial: (n: Int)Int
	
	def id(x: Int) = x                        //> id: (x: Int)Int
	
	def sumInts = sum(x => x)                 //> sumInts: => (Int, Int) => Int
		
	
	def cube(x: Int): Int = x * x * x         //> cube: (x: Int)Int
	
	def sumCubes = sum(x => x*x*x)            //> sumCubes: => (Int, Int) => Int
		
	def sum(f:  Int => Int): (Int, Int) => Int =  {
		def sumF(a: Int, b: Int): Int =
			if (a > b) 0
			else f(a)  + sumF(a + 1, b)
		sumF
	}                                         //> sum: (f: Int => Int)(Int, Int) => Int
	
	sumInts(1,5)                              //> res0: Int = 15
	
  factorial(5)                                    //> res1: Int = 120
  
  
}