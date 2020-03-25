package BussinessLayer;

public interface interfaceBuss2 {

	boolean register(String firstName, String lastName, String phone, String email, String projectName, String proSkill);

	boolean login(String firstName, String email);

}
