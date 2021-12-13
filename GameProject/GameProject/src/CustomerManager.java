
public class CustomerManager {
	public void register(Customer customer) {
		System.out.println(customer.getFirstName() + " kayýt olundu.");
	}
	
	public void login(Customer customer){
		System.out.println(customer.getFirstName() + " giriþ yapýldý.");
	}
	
	public void update(Customer customer) {
		System.out.println(customer.getFirstName() + " güncelleme yapýldý.");
	}
	
	public void delete(Customer customer) {
		System.out.println(customer.getFirstName() + " hesabýnýz silindi.");
	}
}
