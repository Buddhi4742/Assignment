object bookprice extends App{
//assuming a bookstore is making the wholesale order of 60 copies just to clarify the question
def get_additional(num_of_books:Int)=num_of_books-50;
def get_ship_costs(excess:Int)=excess*0.75+3;

def get_total_cost(num_of_books:Int):Double={
var excess:Int=get_additional(num_of_books);
var ship_costs:Double=get_ship_costs(excess);
var total_cost:Double=ship_costs+num_of_books*24.95*0.4;
return total_cost;
}

println(get_total_cost(60));
}
