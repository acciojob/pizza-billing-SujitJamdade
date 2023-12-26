package com.driver;

public class Pizza {

    private int price;
    Boolean isVeg;
    private String bill="";

    private boolean needExtraCheese = false;
    private boolean needExtraTopping = false;
    private boolean needTakeAway = false;

    /*

    Veg pizza base price = 300
    Non-veg pizza base price = 400
    Extra Cheese Price = 80
    Extra Toppings For Veg Pizza = 70
    Extra Toppings For Non-veg Pizza = 120
    Paper bag Price = 20

    Bill Structure Example:

    Example 1:
    Base Price Of The Pizza: 300
    Extra Cheese Added: 80
    Extra Toppings Added: 70
    Paperbag Added: 20
    Total Price: 470

    Example 2:
    Base Price Of The Pizza: 400
    Extra Cheese Added: 80
    Extra Toppings Added: 120
    Total Price: 600
     */

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here

        if(this.isVeg==true){
            this.bill = "Base Price Of The Pizza: "+300+"\n";
            this.price +=300;
        } else {
            this.bill = "Base Price Of The Pizza: "+400+"\n";
            this.price +=400;
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(needExtraCheese==false){
            bill += "Extra Cheese Added: 80\n";
            this.price+=80;
            needExtraCheese=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(needExtraTopping==false){
            if(this.isVeg==true){
                bill+="Extra Toppings Added: 70\n";
                price+=70;
            }else{
                bill+="Extra Toppings Added: 120\n";
                price+=120;
            }
        }
        needExtraTopping=true;

    }

    public void addTakeaway(){
        // your code goes here
        if(needTakeAway==false){
            this.bill+="Paperbag Added: 20\n";
            this.price+=20;
        }
    }

    public String getBill(){
        // your code goes here
        this.bill += "Total Price: "+this.price+"\n";
        return this.bill;
    }
}
