/**
 * 
 */
package com.personal.couponApplication.entity;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;

/**
 * @author mks
 *
 */
@Table(name = "TB_CPN_COUPON_DETAILS")
@Entity
public class Coupon {

	@Id
	@Column(name = "MOBILE")
	private String mobile;

	@Column(name = "COUPON_NO")
	/*@GeneratedValue(generator = "UUID")
	@GenericGenerator(
		name = "UUID",
		strategy = "org.hibernate.id.UUIDGenerator"
	)*/
	private UUID couponNumber;

	@Column(name = "EXP_DATE")
	private Date expiryDate;

	@Column(name = "STATUS")
	private String status;

	@Column(name = "CREATE_DATE")
	private Date createdDate;

	@Column(name = "MODIFY_DATE")
	private Date modifiedDate;

	@Column(name = "MODIFY_BY")
	private String modifiedBy;

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
	 * @param couponNumber
	 *            the couponNumber to set
	 */
	public void setCouponNumber(UUID couponNumber) {
		this.couponNumber = couponNumber;
	}
	
	@PrePersist
	protected void onCreate() {
	    // set the uid 
		setCouponNumber(java.util.UUID.randomUUID());

	}

	/**
	 * @return the expiryDate
	 */
	public Date getExpiryDate() {
		return expiryDate;
	}

	/**
	 * @param expiryDate
	 *            the expiryDate to set
	 */
	public void setExpiryDate(Date expiryDate) {
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
	public Date getCreatedDate() {
		return createdDate;
	}

	/**
	 * @param createdDate
	 *            the createdDate to set
	 */
	public void setCreatedDate(Date createdDate) {
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
		return "Coupon [mobile=" + mobile + ", couponNumber=" + couponNumber + ", expiryDate=" + expiryDate
				+ ", status=" + status + ", createdDate=" + createdDate + ", modifiedDate=" + modifiedDate
				+ ", modifiedBy=" + modifiedBy + "]";
	}

}
