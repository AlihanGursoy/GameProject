
public class CustomerManager {
	public void register(Customer customer) {
		System.out.println(customer.getFirstName() + " kay�t olundu.");
	}
	
	public void login(Customer customer){
		System.out.println(customer.getFirstName() + " giri� yap�ld�.");
	}
	
	public void update(Customer customer) {
		System.out.println(customer.getFirstName() + " g�ncelleme yap�ld�.");
	}
	
	public void delete(Customer customer) {
		System.out.println(customer.getFirstName() + " hesab�n�z silindi.");
	}
}
