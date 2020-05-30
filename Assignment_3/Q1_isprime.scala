object Q1_isprime extends App{
def prime(num: Int,i:Int): Boolean={
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
return prime(num,i+1)
}
println("Enter your number: ");
val num=scala.io.StdIn.readInt();
if(prime(num,2)==true){
println("Is a prime number");
}
else{
println("Is Not a prime number"); 
}

}
