/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sw_project;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author df
 */
public class User {
    public String name;
    public int id;
    public String email;
    public String password;
    public int phone;
    Scanner in = new Scanner (System.in);
    public String getname() {
	return name;
}
       public int getid() {
	return id;
}
          public String getmail() {
	return email;
}
             public String getpassword() {
	return password;
}
                public int getphone() {
	return phone;
}
    public void setname(String name) {
	this.name = name;
}
    public void setid(int id) {
	this.id = id;
}
    public void setemail(String email) {
	this.email = email;
}
    public void setphone(int phone) {
	this.phone = phone;
}
public void setpassword(String pass) {
	this.password = pass;
}
    public User() {
        email=null;
        password=null;
    }
    ArrayList<User> users=new ArrayList();
    public void log_in(String userName , String pass ) {
	  
	for(int i=0; i<users.size();i++)
        {
            if(users.get(i).getname().equals(userName))
            
            System.out.println("log in successfully");
             else{
            System.out.println("Wrong user name or password");
            System.out.println("please try again.");
        }
        }
       
        
    }
    public void Register() {
        System.out.println("please enter your first name");
        String Fname = in.nextLine();
        name = Fname ;
        System.out.println("please enter your last name");
        String Lname = in.nextLine();
        name += Lname ;
        System.out.println("please enter a valid mail");
        String mail = in.nextLine();
        email = mail ;
        System.out.println("please enter at least 9 characters and numbers in your password");
        String pass = in.nextLine();
        password = pass;
      
        if (!(email==null)){
            if((email.contains("@yahoo.com"))||(email.contains("@gmail.com"))){
                System.out.println("valid email");   
            }
            else {System.out.println("Invalid email");}
          
        }
        else{System.out.println("please enter your email");}
      
        if (password.length()<8){System.out.println("please enter longer password to keep security");}
        addindatabase(users);
        
    }
    
    public void addindatabase(ArrayList<User>database)
    {
        User tmp=new User();
        tmp.setname(name);
        database.add(tmp);
        tmp.setemail(email);
        database.add(tmp);
        tmp.setid(id);
        database.add(tmp);
        tmp.setpassword(password);
        database.add(tmp);
        tmp.setphone(phone);
        database.add(tmp);
    }
    
}
