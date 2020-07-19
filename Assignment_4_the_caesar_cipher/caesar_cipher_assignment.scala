object caesar_cipher_assignment extends App{

val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
var E=(c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)+key)%a.size)
var D=(c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)-key)%a.size)
var cipher=(algo:(Char,Int,String)=>Char,s:String,key:Int,a:String)=>s.map(algo(_,key,a))


def ciphering(){
println("Enter your shift number: ")
val shift_no:Int=scala.io.StdIn.readInt()
println("Enter your text: ")
var text:String=scala.io.StdIn.readLine()
var choice:Int=0;

do{
println("\n***Menu****\n 1)Encrypt \n 2)Decrypt \n 3)Exit")
println("Current Text : "+text)
println("enter choice: ")
choice=scala.io.StdIn.readInt()
if(choice==1)
{
var encrypt=cipher(E,text,shift_no,alphabet)
println("Encrypted text: " +encrypt)
text=encrypt;
}
else if(choice==2)
{
var decrypt=cipher(D,text,shift_no,alphabet)
println("Decrypted text: " +decrypt)
text=decrypt;
}

}while(choice!=3)

}

ciphering()
}
