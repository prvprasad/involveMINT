package org.involvemint.data.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "organization")
public class Organization {
	private Integer orgPk;
	private String orgType;
	private String orgName;
	private String orgDesc;
	private String phone;
	private String emailId;
	private String websiteURL;
	private byte[] image;
	private String imageURL;
	private Integer addressPk;
	
	private Address address;

	@XmlElement
	public Integer getOrgPk() {
		return orgPk;
	}

	public void setOrgPk(Integer orgPk) {
		this.orgPk = orgPk;
	}

	@XmlElement
	public String getOrgType() {
		return orgType;
	}

	public void setOrgType(String orgType) {
		this.orgType = orgType;
	}

	@XmlElement
	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	@XmlElement
	public String getOrgDesc() {
		return orgDesc;
	}

	public void setOrgDesc(String orgDesc) {
		this.orgDesc = orgDesc;
	}

	@XmlElement
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@XmlElement
	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@XmlElement
	public String getWebsiteURL() {
		return websiteURL;
	}

	public void setWebsiteURL(String websiteURL) {
		this.websiteURL = websiteURL;
	}

	@XmlElement
	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	@XmlElement
	public String getImageURL() {
		return imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}

	@XmlElement
	public Integer getAddressPk() {
		return addressPk;
	}

	public void setAddressPk(Integer addressPk) {
		this.addressPk = addressPk;
	}

	@XmlElement(name="Address")
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}
