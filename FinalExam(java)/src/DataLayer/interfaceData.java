package DataLayer;

public interface interfaceData {

	boolean register(String firstName, String lastName, String phone, String email, int expInYear);

	boolean login(String firstName, String email);

}
