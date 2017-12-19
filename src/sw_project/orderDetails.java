/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sw_project;

/**
 *
 * @author may
 */
public class orderDetails {
    int ID;
    int productID;
    String productname;
    int quantity;
    float unitcost;
    float subtotal;
    public  orderDetails(int id,int productid,String productName,int q,float unitcost,float subtotal)
    {
        this.ID=id;
        this.productID=productid;
        this.productname=productName;
        this.quantity=q;
        this.unitcost=unitcost;
        this.subtotal=subtotal;
    }
    
    public static double calcPrice()
    {
        
        
    }

    orderDetails() {
        
    }
    
    
    
}
