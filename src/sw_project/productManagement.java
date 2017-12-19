/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sw_project;

import java.util.ArrayList;
import java.util.Scanner;
import sw_project.product;

/**
 *
 * @author may
 */
public class productManagement {
   // ArrayList<product>products=new ArrayList();
    
    Scanner cin=new Scanner(System.in);
    public void addproduct()
    {
        ArrayList<product>products=new ArrayList();
        System.out.println("enter your product");
        String name=cin.next();
          System.out.println("enter productID");
        int ID=cin.nextInt();
          System.out.println("enter product price");
          
         float price=cin.nextFloat();
           System.out.println("enter product quantity");
           int quantity=cin.nextInt();
             System.out.println("enter product supplier");
             String supplier=cin.next();
          // ArrayList<product>newproduct=new ArrayList();
             product obj=new product( name,ID, price, quantity,  supplier);
             products.add(obj);
    }
    
}
