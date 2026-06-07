class KidUser implements LibraryUser{
    int age;
    String bookType;
    @Override
    public void registerAccount(){
        if(age<12){
            System.out.println( "You have successfully registered under an Kid Account");
        }
        else{
           System.out.println("Sorry, Age must be smaller than 12 to register as an kid"); 
        }
    }
    @Override
    public void requestBook(){
        if(bookType.equals("Kids")){
            System.out.println( "Book Issued successfully, please return the book within 10 days");
        }
        else{
            System.out.println("Oops, you are allowed to take only kids book");
        }
    }
}
