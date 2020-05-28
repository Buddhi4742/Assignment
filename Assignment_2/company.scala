object company extends App{

def salary_count(work_hrs:Int,ot_hrs:Int)=(150*work_hrs+75*ot_hrs)*0.9;
println("The take home salary is: ");
println(salary_count(40,20));

}
