package documents.domainmodel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import com.fasterxml.jackson.datatype.jdk8.*;

@Entity
@Table(name="funding_bodies")
public class FundingBody {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="address")
	private String address;
	
	@Column(name="number")
	private int number;
	
	@Column(name="zipCode")
	private String zipCode;
	
	@Column(name="city_country")
	private String cityCoutry;
	
	@Column(name="telephone")
	private String telephone;
	
	@Column(name="fax")
	private String fax;
	
	@Column(name="email")
	private String email;
	
	
	public FundingBody(int id, String name, String address, int number, String zipCode, String cityCoutry,
			String telephone, String fax, String email) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.number = number;
		this.zipCode = zipCode;
		this.cityCoutry = cityCoutry;
		this.telephone = telephone;
		this.fax = fax;
		this.email = email;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}


	public String getZipCode() {
		return zipCode;
	}


	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}


	public String getCityCoutry() {
		return cityCoutry;
	}


	public void setCityCoutry(String cityCoutry) {
		this.cityCoutry = cityCoutry;
	}


	public String getTelephone() {
		return telephone;
	}


	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}


	public String getFax() {
		return fax;
	}


	public void setFax(String fax) {
		this.fax = fax;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public FundingBody() {
	}
}
