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
public class brand {
    String brandname;
    int id;
    String supplier;
    
public brand()
    {
        brandname="";
        id=0;
       supplier="";
    }
 
 public brand(String brandname, int id,String sub)
 {
     this.brandname=brandname;
     this.id=id;
     this.supplier=sub;
 }
 public void setname(String name)
 {
     this.brandname=name;
 }
  public void setsupplier(String supplier)
 {
     this.supplier=supplier;
 }
    public void setid(int id)
 {
     this.id=id;
 }
  public String getname()
  {
      return brandname;
  }
    public String getsupplier()
  {
      return supplier;
  }
      public int getid()
  {
      return id;
  }
   public void addbrand()
    {
        Scanner cin=new Scanner(System.in);
        ArrayList<brand>brands=new ArrayList();
        System.out.println("enter your brand");
        String name=cin.next();
          System.out.println("enter brandID");
        int ID=cin.nextInt();
             System.out.println("enter brand supplier");
             String supplier=cin.next();
          // ArrayList<product>newproduct=new ArrayList();
             brand obj=new brand( name,ID,supplier);
             brands.add(obj);
    }
   
   
}
