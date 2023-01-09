
package del.org;
//ABTRACT CLASS TYPE
public class ClientInfo extends DataLogin {

	@Override
	 void password() {

		System.out.println("Employee password is 12345df");
	}

	@Override
	 void id() {

		System.out.println("Emplyee id is 67545");
	}

	public static void main(String[] args) {
		
		ClientInfo s=new ClientInfo();
		s.userName();
		s.password();
		s.id();
		
	}
}
