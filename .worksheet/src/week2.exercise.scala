package week2

import math.abs


object exercise {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(158); 
	def product(f: Int => Int)(a: Int, b: Int): Int = {
			if (a > b) 1
			else f(a) * product(f)(a + 1, b)
	};System.out.println("""product: (f: Int => Int)(a: Int, b: Int)Int""");$skip(29); val res$0 = 
	
	product(x => x * 2)(1, 2);System.out.println("""res0: Int = """ + $show(res$0));$skip(53); 
	
	def factorial(n: Int): Int = product(x => x)(1,n);System.out.println("""factorial: (n: Int)Int""");$skip(18); val res$1 = 
		
	factorial(15);System.out.println("""res1: Int = """ + $show(res$1));$skip(25); 

	val tolerance = 0.0001;System.out.println("""tolerance  : Double = """ + $show(tolerance ));$skip(78); 
	def isCloseEnough(x: Double, y: Double) =
		abs((x - y) / x) / x < tolerance;System.out.println("""isCloseEnough: (x: Double, y: Double)Boolean""");$skip(219); 
		
	def fixedPoint(f: Double => Double)(firstGuess: Double) = {
		def iterate(guess: Double): Double = {
			val next = f(guess)
			if (isCloseEnough(guess, next)) next
			else iterate(next)
		}
		iterate(firstGuess)
	};System.out.println("""fixedPoint: (f: Double => Double)(firstGuess: Double)Double""");$skip(31); val res$2 = 
	
	fixedPoint(x => 1 + x/2)(1);System.out.println("""res2: Double = """ + $show(res$2));$skip(51); 
	def sqrt(x: Double) = fixedPoint(y => x / y)(1.0);System.out.println("""sqrt: (x: Double)Double""")}
	
}
