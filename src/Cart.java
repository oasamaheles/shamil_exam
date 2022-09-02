import java.util.ArrayList;
import java.util.List;

public class Cart {
 List <Cloth> clothes=new ArrayList();
  
 public void totalPriceValue(){
  
  float totalPrice=0;
  
  for (int indx=0; indx<clothes.size();indx++){
  
      totalPrice += clothes.get(indx).totalPrice();
  }
  System.out.println("Total Price : "+totalPrice );
 
 }
 
  public void printAllInCart(){
  
      System.out.println("All Clothes In Cart " );
      System.out.println("_________________________________________________________________________" );
      System.out.println("Model \t" +" \tColor \t"+" Size\t"+ "Quantity "+ " Unit Price  " +"  Total Price  \t ");
     
      for (int i=0; i<clothes.size();i++)
   {
    clothes.get(i).print();
      
    
  } 
       System.out.println("_________________________________________________________________________" );
}

  void addToCart(Cloth cloth){
     
      clothes.add(cloth);
}
  
public boolean removeFromCart(int id){
   
    boolean isFound=false;
    for (int indx=0; indx<clothes.size();indx++)
    {
            
    if  (clothes.get(indx).id==id) 
   { 
       isFound=true;
       clothes.remove(indx);
       break;
   } 
        
  }
    return isFound;
}
public void count(){
     int numberOfProduct=0;
    for (int indx=0; indx<clothes.size();indx++)
    {
       
        numberOfProduct +=clothes.get(indx).quantity;
    }
    System.out.println("Total Product In Your Cart : "+numberOfProduct );
}

}
