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
 * @author may
 */
public class storeownerController {
    Store s=new Store();
    product temp= new product();
    ArrayList<product>products;
    
    ArrayList<Store>stores;
    boolean addProduct( String storeName,String productName, int productId, String supplier, float price,int quantity)
{
	product temp=new product();
	temp.setprice(price);
	temp.setproductid(productId);
	temp.setproductname(productName);
	temp.setquantity(quantity);
	temp.setsupplier(supplier);
	
	boolean check=false;
	int index=-1;
	for(int i=0;i<stores.size();i++)
	{
		if(stores.get(i).getname().equals(storeName))
		{
			index=i;
			check=true;
		}
	}
	if(check==false|| index==-1)
	{
		System.out.println("you can't add this product");
	}
	
	else
	{
            
		stores.get(index).getProducts().add(temp);
		return true;
	}
	
	return false;
}
    public boolean addStore(String storeName)
{
	
	Store temp=new Store();
	temp.setname(storeName);
	temp.setProducts(null);
	stores.add(temp);
	
	return true;
}
     public void suggesst()
    {
        ArrayList<String> requests =null;
        String suggests = null;
        System.out.println("enter your suggesstin ");
        Scanner cin=new Scanner(System.in);
        suggests=cin.next();
        requests.add(suggests);
        System.out.println("Thanks for suggesst");
        
    }
    
}
