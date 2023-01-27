package encapsulation;
class account{
	private long acno;
	private String name,gmail;
	private long amount;
	
	// gets and sets
	public long getacno() {
		return acno;
	}
	public void setacno(long acno) {
		this.acno = acno;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name= name;
	}
	public String getgmail() {
		return gmail;
	}
	public void setgmail(String gmail) {
		this.gmail= gmail;
	}
	public long getamount() {
		return amount;
	}
	public void setamount(long amount) {
		this.amount=amount;
	}
}

public class susobhan {
	
	public static void main(String args[]) {
		
		account ac = new account();
		ac.setacno(123456789);
		ac.setname("susobhanlal");
		ac.setgmail("susobhanlal2017@gmail.com");
		ac.setamount(213456789);
		System.out.print("the accono"+ac.getacno()+"  the name "+ac.getname()+" the gamil"+ac.getgmail()+"  the amount is "+ac.getamount());
	}

}
