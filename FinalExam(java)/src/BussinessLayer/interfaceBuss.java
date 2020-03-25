package BussinessLayer;

public interface interfaceBuss {

	boolean register(String firstName, String lastName, String phone, String email, int expInYear);

	boolean login(String firstName, String email);

}
