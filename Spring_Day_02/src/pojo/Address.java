package pojo;

public class Address {
	private int cus_a_code;
	private String cus_str_add;
	public Address(int cus_a_code, String cus_str_add) {
		super();
		this.cus_a_code = cus_a_code;
		this.cus_str_add = cus_str_add;
	}
	
	
	
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}




	public int getCus_a_code() {
		return cus_a_code;
	}




	public void setCus_a_code(int cus_a_code) {
		this.cus_a_code = cus_a_code;
	}




	public String getCus_str_add() {
		return cus_str_add;
	}




	public void setCus_str_add(String cus_str_add) {
		this.cus_str_add = cus_str_add;
	}




	@Override
	public String toString() {
		return "Address [cus_a_code=" + cus_a_code + ", cus_str_add=" + cus_str_add + "]";
	}
	

}
