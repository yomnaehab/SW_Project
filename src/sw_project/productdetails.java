/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sw_project;

import java.util.ArrayList;
import java.util.Scanner;
import static sw_project.product.size;

/**
 *
 * @author may
 */
public class productdetails {
    ArrayList<String> productdetail;
    public static int size;
     Scanner cin=new Scanner(System.in);
    public void storeproducts(String pro) 
    { System.out.println("enter product details");
        for(int i=0;i<size;i++)
        {
            pro=cin.next();
        }
        productdetail.add(pro);
    }
    
    
}
