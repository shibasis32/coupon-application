/**
 * 
 */
package com.personal.couponApplication.modeler;

import java.util.Calendar;
import java.util.Date;

import org.springframework.stereotype.Component;

import com.personal.couponApplication.entity.Coupon;
import com.personal.couponApplication.entity.Customer;
import com.personal.couponApplication.model.request.UserDetailRequest;

/**
 * This class will be used to model the request values to the entity values.
 *
 */
@Component
public class CustomerModeler {

	/**
	 * This method will be used to model the request data to entity data.
	 * @param request
	 * @return
	 */
	public Customer modelCustomer(UserDetailRequest request) {
		Customer customer = new Customer();
		customer.setArea(request.getArea());
		customer.setCity(request.getCity());
		customer.setEmailId(request.getEmailId());
		customer.setMobile(request.getPhoneNumber());
		customer.setUserName(request.getUserName());
		customer.setCreatedDate(new Date());
		customer.setModifiedDate(new Date());
		customer.setModifiedBy(request.getUserName());
		return customer;
	}

	/**
	 * This method will be use to model the request customer data into coupon data.
	 * @param modeledCustomer
	 * @return
	 */
	@SuppressWarnings("deprecation")
	public Coupon modelCoupon(Customer modeledCustomer) {
		Coupon coupon = new Coupon();
		Date createdDate = new Date();
		Date expiryDate = new Date();
		expiryDate.setMonth(createdDate.getMonth()+ 1); 
		coupon.setMobile(modeledCustomer.getMobile());
		coupon.setCreatedDate(createdDate);
		coupon.setExpiryDate(expiryDate);
		coupon.setStatus("Active");
		//coupon.setModifiedBy();
		return coupon;
	}

}
