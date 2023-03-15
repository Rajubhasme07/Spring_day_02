package pojo;

import java.util.Iterator;
import java.util.List;

public class Customer {

  private int cid;
  private String cname;
  private List<Address> address;
  
  

















public Customer(List<Address> address) {
	super();
	this.address = address;
}










public Customer() {
	super();
	// TODO Auto-generated constructor stub
}





public Customer(int cid, String cname, List<Address> address) {
	super();
	this.cid = cid;
	this.cname = cname;
	this.address = address;
}





public Customer(int cid) {
	super();
	this.cid = cid;
}



public Customer(String cname) {
	super();
	this.cname = cname;
}

public void show(){  
    System.out.println(cid+" "+cname);  
    System.out.println("Address is:");  
    Iterator<Address> itr=address.iterator();
    while(itr.hasNext()){  
        System.out.println(itr.next());  
    }  
}










@Override
public String toString() {
	return "Customer [cid=" + cid + ", cname=" + cname + ", address=" + address + "]";
} 


	
	
}
