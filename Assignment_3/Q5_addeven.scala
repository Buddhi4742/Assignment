object Q5_addeven extends App{
var total:Int=0;
var result:Int=0;
  def addeven(num: Int): Int={

    if(num % 2==0 && num!=1){
       result=add(num);
       addeven(num-1);
    }
    else if(num==0){
      1
    }
    else if(num==1){
      1
    }
    else{
      addeven(num - 1) 
    }
  }
def add(num:Int):Int={
total=total+num;
//println(total);
return total;
}
//if(num==0){
//println("The total is: ",total);
//}
addeven(21);
println(result);
}
