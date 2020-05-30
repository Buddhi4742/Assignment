object Q2_printprime extends App{
  def prime_check(num: Int,i:Int): Boolean={
    if (num <= 2){ 
        if(num==2)
            return true
            else
                return false
    }
    if(num%i==0){
      return false  
    }
    if(i*i>num){
      return true 
    }
    return prime_check(num,i+1)
}

def prime(num:Int){
for(num <- (0 to num).reverse){
if(prime_check(num,2)){
println(num)
}
}
}
println("Enter your number: ");
val num=scala.io.StdIn.readInt();
println("Prime numbers are: "); 
prime(num);

}
