/**
 * 
 */
package com.personal.couponApplication.service;

import java.util.Date;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.personal.couponApplication.entity.Coupon;
import com.personal.couponApplication.entity.Customer;
import com.personal.couponApplication.model.request.UserDetailRequest;
import com.personal.couponApplication.model.response.CouponDetails;
import com.personal.couponApplication.respository.CouponRespository;
import com.personal.couponApplication.respository.CustomerRepository;

/**
 * @author mks THis service class will contain the Business Logic and interact
 *         with the Repository class.
 */
@Service
@Transactional
public class CouponService {

	@Autowired
	@Qualifier("couponRepo")
	private CouponRespository couponRepository;
	
	@Autowired
	private CustomerRepository customerRepo;

	/**
	 * This method will fetch the coupon Details from the DB.
	 * 
	 * @param request
	 * @return
	 */
	public CouponDetails getCoupon(UserDetailRequest request) {
		CouponDetails details = new CouponDetails();
	
		Coupon coupon = couponRepository.findByMobile(request.getPhoneNumber());
		
		details.setCouponNumber(coupon.getCouponNumber());
		details.setMessage("Coupon Code successful");
		details.setCreatedDate(coupon.getCreatedDate());
		details.setExpiryDate(coupon.getExpiryDate());
		details.setMobile(coupon.getMobile());
		details.setModifiedBy(coupon.getModifiedBy());
		details.setModifiedDate(coupon.getModifiedDate());
		details.setStatus(coupon.getStatus());
		return details;
	}

	public String registerUser(UserDetailRequest request) {
		String message = null;
		Customer customer = new Customer();
		customer.setArea(request.getArea());
		customer.setCity(request.getCity());
		customer.setEmailId(request.getEmailId());
		customer.setMobile(request.getPhoneNumber());
		customer.setUserName(request.getUserName());
		customer.setCreatedDate(new Date());
		customer.setModifiedDate(new Date());
		customer.setModifiedBy(request.getUserName());
		Customer custom = customerRepo.save(customer);
		if(custom != null) {
			message = "Successfully registered";
		} else {
			message = "Error while registering the user in DB";
		}
		return message;
	}

}
