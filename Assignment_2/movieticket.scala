object movieticket extends App{

def profit_cal(ticket_price:Int):Int=rev(ticket_price)-cost(ticket_price);
def attendees_count(ticket_price:Int):Int=120+(15-ticket_price)/5*20;
def rev(ticket_price:Int):Int=attendees_count(ticket_price)*ticket_price;
def cost(ticket_price:Int):Int=500+attendees_count(ticket_price);
println("profits per ticket price: ");
println("Rs.5->profit:",profit_cal(5));
println("Rs.10->profit:",profit_cal(10)); 
println("Rs.15->profit:",profit_cal(15));
println("Rs.20->profit:",profit_cal(20)); 
println("Rs.25->profit:",profit_cal(25)); 
println("Rs.30->profit:",profit_cal(30)); 
println("Rs.35->profit:",profit_cal(35));
println("Rs.40->profit:",profit_cal(40)); 
}
