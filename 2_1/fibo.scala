@main def fib(n: Int) : Int = 
    @annotation.tailrec
    def go(n: Int, current: Int, next: Int) : Int =
        if n <= 0 then current
        else go(n-1,next,current+next)

    go (n, 0, 1)