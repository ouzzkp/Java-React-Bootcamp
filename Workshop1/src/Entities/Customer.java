package Entities;

import Abstract.IEntity;

public class Customer implements IEntity {
	private int Id;
	private String firstName;
	private String lastName;
	private String dateOfBirth;
	private String nationaltyId;

	public Customer(int id, String firstName, String lastName, String dateOfBirth, String nationaltyId) {

		this.Id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.nationaltyId = nationaltyId;
	}

	public Customer() {

	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getNationaltyId() {
		return nationaltyId;
	}

	public void setNationaltyId(String nationaltyId) {
		this.nationaltyId = nationaltyId;
	}
}
