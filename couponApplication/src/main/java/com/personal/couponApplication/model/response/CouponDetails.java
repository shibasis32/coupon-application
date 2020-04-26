package com.personal.couponApplication.model.response;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Id;

/**
 * This is a response class containing the coupon details.
 * 
 * @author mks
 *
 */
public class CouponDetails {

	private String message;

	private String mobile;

	private UUID couponNumber;

	private String expiryDate;

	private String status;

	private String createdDate;

	private Date modifiedDate;

	private String modifiedBy;

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message
	 *            the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * @param mobile
	 *            the mobile to set
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/**
	 * @return the couponNumber
	 */
	public UUID getCouponNumber() {
		return couponNumber;
	}

	/**
	 * @param uuid
	 *            the couponNumber to set
	 */
	public void setCouponNumber(UUID uuid) {
		this.couponNumber = uuid;
	}

	/**
	 * @return the expiryDate
	 */
	public String getExpiryDate() {
		return expiryDate;
	}

	/**
	 * @param expiryDate
	 *            the expiryDate to set
	 */
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the createdDate
	 */
	public String getCreatedDate() {
		return createdDate;
	}

	/**
	 * @param createdDate
	 *            the createdDate to set
	 */
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	/**
	 * @return the modifiedDate
	 */
	public Date getModifiedDate() {
		return modifiedDate;
	}

	/**
	 * @param modifiedDate
	 *            the modifiedDate to set
	 */
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	/**
	 * @return the modifiedBy
	 */
	public String getModifiedBy() {
		return modifiedBy;
	}

	/**
	 * @param modifiedBy
	 *            the modifiedBy to set
	 */
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	@Override
	public String toString() {
		return "CouponDetails [message=" + message + ", mobile=" + mobile + ", couponNumber=" + couponNumber
				+ ", expiryDate=" + expiryDate + ", status=" + status + ", createdDate=" + createdDate
				+ ", modifiedDate=" + modifiedDate + ", modifiedBy=" + modifiedBy + "]";
	}

}
