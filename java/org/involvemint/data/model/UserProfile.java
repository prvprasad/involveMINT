package org.involvemint.data.model;

import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "userProfile")
public class UserProfile {
	private String emailId;
	private String password;
	private String firstName;
	private String lastName;
	private Date dob;
	private byte[] image;
	private String secQuestion1;
	private String secAnswer1;
	private String secQuestion2;
	private String secAnswer2;
	private String secQuestion3;
	private String secAnswer3;
	private String keepLogin;
	private String secToken;
	private Organization org;
	private Address address;
	private List<UserProjectTypes> userProjTypes;
	private List<UserProjectCauses> userProjCauses;

	@XmlElement
	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@XmlElement
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@XmlElement
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@XmlElement
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@XmlElement
	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	@XmlElement
	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	@XmlElement
	public String getSecQuestion1() {
		return secQuestion1;
	}

	public void setSecQuestion1(String secQuestion1) {
		this.secQuestion1 = secQuestion1;
	}

	@XmlElement
	public String getSecAnswer1() {
		return secAnswer1;
	}

	public void setSecAnswer1(String secAnswer1) {
		this.secAnswer1 = secAnswer1;
	}

	@XmlElement
	public String getSecQuestion2() {
		return secQuestion2;
	}

	public void setSecQuestion2(String secQuestion2) {
		this.secQuestion2 = secQuestion2;
	}

	@XmlElement
	public String getSecAnswer2() {
		return secAnswer2;
	}

	public void setSecAnswer2(String secAnswer2) {
		this.secAnswer2 = secAnswer2;
	}

	@XmlElement
	public String getSecQuestion3() {
		return secQuestion3;
	}

	public void setSecQuestion3(String secQuestion3) {
		this.secQuestion3 = secQuestion3;
	}

	@XmlElement
	public String getSecAnswer3() {
		return secAnswer3;
	}

	public void setSecAnswer3(String secAnswer3) {
		this.secAnswer3 = secAnswer3;
	}

	@XmlElement
	public String getKeepLogin() {
		return keepLogin;
	}

	public void setKeepLogin(String keepLogin) {
		this.keepLogin = keepLogin;
	}

	@XmlElement
	public String getSecToken() {
		return secToken;
	}

	public void setSecToken(String secToken) {
		this.secToken = secToken;
	}

	@XmlElement(name="Organization")
	public Organization getOrg() {
		return org;
	}

	public void setOrg(Organization org) {
		this.org = org;
	}

	@XmlElement(name="Address")
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@XmlElement(name="ProjTypes")
	public List<UserProjectTypes> getUserProjTypes() {
		return userProjTypes;
	}

	public void setUserProjTypes(List<UserProjectTypes> userProjTypes) {
		this.userProjTypes = userProjTypes;
	}
	
	@XmlElement(name="ProjCauses")
	public List<UserProjectCauses> getUserProjCauses() {
		return userProjCauses;
	}

	public void setUserProjCauses(List<UserProjectCauses> userProjCauses) {
		this.userProjCauses = userProjCauses;
	}
}
