/**
 * 
 */
package com.personal.couponApplication.model.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author mks This class will hold the user request values coming from the
 *         request.
 */
@JsonIgnoreProperties(ignoreUnknown = false)
public class UserDetailRequest {

	private String userName;
	private String emailId;
	private String phoneNumber;
	private String city;
	private String area;

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName
	 *            the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the emailId
	 */
	public String getEmailId() {
		return emailId;
	}

	/**
	 * @param emailId
	 *            the emailId to set
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param phoneNumber
	 *            the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city
	 *            the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the area
	 */
	public String getArea() {
		return area;
	}

	/**
	 * @param area
	 *            the area to set
	 */
	public void setArea(String area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "UserDetailRequest [userName=" + userName + ", emailId=" + emailId + ", phoneNumber=" + phoneNumber
				+ ", city=" + city + ", area=" + area + "]";
	}

}
