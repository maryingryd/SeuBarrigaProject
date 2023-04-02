package Framework.Utils;

import java.util.Locale;

import com.github.javafaker.Faker;

public class FakersGeneration {

	private Faker faker;
	private String emailAndress;
	private String fullName;
	private String password;

	public FakersGeneration() {
		faker = new Faker(new Locale("pt-BR"));
	}

	public String getFullName() {
		fullName = faker.name().fullName();
		return fullName;
	}

	public String getEmailAddress() {
		emailAndress = faker.internet().emailAddress();
		return emailAndress;
	}

	public String getPassword() {
		password = faker.internet().password();
		return password;
	}

}
