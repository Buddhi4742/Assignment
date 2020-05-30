object Q6_fibo extends App{ 
  
def fibo(n:Int):Int={ 
  if (n <= 1){ 
  return n;
  }
  else{
  return fibo(n-1) + fibo(n-2);
  }
}
println("Enter your number");
val num=scala.io.StdIn.readInt()
for(n <-0 to num-1){
println(fibo(n));
}

} 

