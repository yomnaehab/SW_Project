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
public class product {
    String productname;
    int productid;
    float price;
    int quantity;
    String supplier;
    
 product()
{
productid=0;
productname="";
supplier="";
price=0;
quantity=0;

}
 public product(String productname, int productid, float price,int quantity, String supplier)
{
    this.productid= productid;
      this.productname=productname;
    this.supplier=supplier;
     this.price=price;
      this.quantity=quantity;

}
 public int getproductid() {
	return productid;
}
          public String getproductname() {
	return productname;
}
 public float getprice() {
	return price;
}
  public int getquantity() {
	return quantity;
}
  public String getsupplier()
  {
      return supplier;
  }
    public void setproductname(String name) {
	this.productname = name;
}
    public void setproductid(int id) {
	this.productid = id;
}
    public void setprice(float price) {
	this.price = price;
}
    public void setquantity(int q) {
	this.quantity = q;
}
public void setsupplier(String supplier) {
	this.supplier = supplier;
}
   // public static int size; 
    ArrayList <product> allproducts;
    public ArrayList<product> getProducts() {
	 for(int i=0;i<allproducts.size();i++){
	allproducts.get(i);
    }
    return allproducts;
}
public void setProducts(ArrayList<product> products) {
	 for(int i=0;i<products.size();i++){
	allproducts.add(new  product());
  }
}
//    Scanner cin=new Scanner(System.in);
//    public void storeproducts(String pro) 
//    { System.out.println("enter your products");
//        for(int i=0;i<size;i++)
//        {
//            pro=cin.next();
//        }
//        allproducts.add(pro);
//    }
    
}
