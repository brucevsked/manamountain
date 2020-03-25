package com.vsked.example.ex1;

//@Data
public class User{
    private Long id;
    private Boolean available;
    
    public void activate(){
           this.setAvailable(true);
    }
    
    public void setAvailable(boolean isAvailable) {
    	this.available=isAvailable;
    }
}
