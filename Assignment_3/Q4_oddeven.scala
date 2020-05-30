object Q4_oddeven extends App{

  def oddeven(num: Int): Unit={ 
    if (num == 1){ 
      println("The entered number is odd");
    }
    else if(num == 0){
      println("The entered number is Even");  
    }
    else{
      oddeven(num - 2) 
    }
  }

oddeven(22);
}
