public class Cloth {
   int id;
   String model;
   String color;
   float price ;
   int quantity;
   
   enum sizeValue{small ,medium,large,xl,xxl,xxxl}
   sizeValue size;
  
   public float totalPrice(){
   float totalprice=0;
       if  (quantity > 10) 
           totalprice += quantity*(this.price) - 2 * quantity * (this.price) / 100;
       else 
           totalprice += quantity*(this.price);
       return totalprice;
   }

    public Cloth(int id, String model, String color, float price, int quantity, sizeValue size) {
        this.id = id;
        this.model = model;
        this.color = color;
        this.price = price;
        this.quantity = quantity;
        this.size = size;
    }
   
   public void print(){
   System.out.println( model +" \t"+color +" \t "+ size+"\t "+quantity+"\t  "+price+" \t"+totalPrice()  );
   
   }
}
