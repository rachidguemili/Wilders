public class Wilder {
    

String firstName ;
boolean aware = true;

     public Wilder(){

     }

   public  Wilder(String firstname, boolean aware){
   this.firstName = firstname;
   this.aware = aware;

  } 


public void setFistName(String name){
this.firstName = name;
    
}

public void setAware(boolean bool){
this.aware = bool;
    
}
public String getFirstName(){
    return firstName;
       
   }

   public boolean isAware(){
    if (aware ==  true )
    return  true ;
    else return false;

   }
   public boolean getAware(){
       return aware;
    }

      
public String whoAmI(){

    String iam =  isAware()?  "My name is " + firstName + 
    "and I am aware " : "My name is " + firstName + 
    "and I am not aware";  
  
     return iam;
}




}