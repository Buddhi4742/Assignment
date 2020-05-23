object bookprice extends App{
//assuming a bookstore is making the wholesale order of 60 copies just to clarify the question
def get_additional(num_of_books:Int)=num_of_books%50;
var excess:Int=get_additional(60);
var ship_costs=excess*0.75+3;
var total_cost:Double=(60*24.95*40)/100 +ship_costs;
println(total_cost);
}
