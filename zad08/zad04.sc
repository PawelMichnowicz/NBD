def double(a: Int): Int = a * 2

def tripleDouble (b: Int, func: Int => Int) = {
   func(func(func(b)))
}


tripleDouble(3, double)

