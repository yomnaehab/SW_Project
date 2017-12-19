/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sw_project;

import static java.nio.file.Files.size;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author may
 */
public class shoppingcontroller {
   // product products=new product();
    productdetails details=new productdetails();
    ArrayList<product>pro= new ArrayList();
    
    order order=new order();
      ArrayList<User> users;
      public static int size;
       Scanner cin=new Scanner(System.in);
   
    public void searchproduct(String p)
    {
        p=cin.next();
        for(int i=0;i<pro.size();i++)
        
        
        
        
        
        
        
//        p=cin.next();
//        for(int i=0;i<products.size();i++){
//        if(p==products.allproducts.get(i))
//        {
//            System.out.println(details.productdetail.get(i)); // 3yzen n3rf ezay en de el details bta3t el product da?? faa bnfkr n3ml map 3shan t3dl el 7ta dee
//        }
//        else
//            System.out.println("not found");
//            }
    }
    ArrayList<String> shoppingcart;
    public void order()
    {
        shoppingcart=new ArrayList<String>();
        
        
    }
    public void explore()
    {
        
    }
    
}
