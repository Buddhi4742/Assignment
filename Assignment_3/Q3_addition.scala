object Q3_addition extends App{

def sum(num: Int): Int={ 
if (num == 1){ 
1
}
else{
sum(num - 1) + num 
}
}

println(sum(5));
}
