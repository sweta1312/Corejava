package Encapsulation;

public class Customer {
    private String firstName;
    private String secondName;
    private String creditCard;

    public String getFirstName(){
        if(firstName==null){
            System.out.println("Invalid firstname");
        }
        return firstName;
    }
    public void setFirstName(String firstName){
      this.firstName=firstName;
    }
    public String getSecondName(){
        return secondName;
    }
    public void setsecondName(String secondName){
        this.secondName=secondName;
    }
    public String getcreditCard(){
        return creditCard;
    }
    public void setcreditCard(String creditCard){
        this.creditCard=creditCard;
    }
}