object caesar_cipher_assignment extends App{

val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
val E=(c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)+key)%a.size)
val D=(c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)-key)%a.size)
val cipher=(algo:(Char,Int,String)=>Char,s:String,key:Int,a:String)=>s.map(algo(_,key,a))


def ciphering(){
println("Enter your shift number: ")
val shift_no:Int=scala.io.StdIn.readInt()
println("Enter your text: ")
var text:String=scala.io.StdIn.readLine()
var choice:Int=0;

do{
println("***Menu****\n 1)Encrypt \n 2)Decrypt \n 3)Exit")
println("Current text: "+text)
println("enter choice: ")
choice=scala.io.StdIn.readInt()
var encrypt=text;

if(choice==1)
{
encrypt=cipher(E,text,4,alphabet)
println("Encrypted text: " +encrypt)
text=encrypt;
}
else if(choice==2)
{
var decrypt=cipher(D,encrypt,4,alphabet)
println("Decrypted text" +decrypt)
text=decrypt;
}

}while(choice!=3)

}

ciphering()
}
