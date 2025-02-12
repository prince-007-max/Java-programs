package com.prince;





class NewException extends RuntimeException{

    public NewException( String str){
        super(str);
    }
}



public class Exception1 {
    public static void main(String[] args) {
    
        int i = 0;
        int j = 0;

        try {

            i = 18/i;
                throw new NewException("This is zero");
            
            
        } catch (NewException e) {
            System.out.println(e);
        }
    }
    
}
