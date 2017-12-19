/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sw_project;

import java.util.ArrayList;

/**
 *
 * @author may
 */
public class Store {
int phoneNumber;
String type;
String address;
int ID;
private  ArrayList<product>products;
product s;
 String name;
       public int getid() {
	return ID;
}
          public int getphonenumber() {
	return phoneNumber;
}
             public String gettype() {
	return type;
}
 public String getaddress() {
	return address;
}
  public String getname() {
	return name;
}
    public void setname(String name) {
	this.name = name;
}
    public void setid(int id) {
	this.ID = id;
}
    public void settype(String type) {
	this.type = type;
}
    public void setphone(int phone) {
	this.phoneNumber = phone;
}
public void setaddress(String address) {
	this.address = address;
}
public ArrayList<product> getProducts() {
//    for(int i=0;i<products.size();i++){
//	products.get(i);
//    }
    return products;
}
public void setProducts(ArrayList<product> products) {
    product p, a;
  for(int i=0;i<products.size();i++){
      a = products.get(i);
      p = new product(a.productname, a.productid, a.price, a.quantity, a.supplier);
	this.products.add(p);
  }
}
}