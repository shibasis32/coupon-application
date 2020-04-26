/**
 * 
 */
package com.personal.couponApplication.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.personal.couponApplication.entity.Coupon;
import com.personal.couponApplication.entity.Customer;
import com.personal.couponApplication.model.request.UserDetailRequest;
import com.personal.couponApplication.model.response.CouponDetails;
import com.personal.couponApplication.model.response.UserDetailsResponse;
import com.personal.couponApplication.modeler.CustomerModeler;
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

	@Autowired
	private CustomerModeler customerModeler;

	/**
	 * This method will fetch the coupon Details from the DB.
	 * 
	 * @param request
	 * @return
	 */
	public CouponDetails getCoupon(UserDetailRequest request) {
		CouponDetails details = new CouponDetails();

		Optional<Coupon> couponResult = couponRepository.findByMobile(request.getPhoneNumber());
		if (couponResult.isPresent()) {
			Coupon coupon = couponResult.get();
			details.setCouponNumber(coupon.getCouponNumber());
			details.setMessage("Coupon Code successful");
			details.setCreatedDate(coupon.getCreatedDate().toLocaleString());
			details.setExpiryDate(coupon.getExpiryDate().toLocaleString());
			details.setMobile(coupon.getMobile());
			details.setModifiedBy(coupon.getModifiedBy());
			details.setModifiedDate(coupon.getModifiedDate());
			details.setStatus(coupon.getStatus());
		}
		return details;
	}

	public UserDetailsResponse registerUser(UserDetailRequest request) {
		UserDetailsResponse response = new UserDetailsResponse();
		Customer modeledCustomer = customerModeler.modelCustomer(request);

		try {
			Boolean isIdExists = customerRepo.existsById(modeledCustomer.getMobile());
			if (isIdExists == false) {
				try {
					customerRepo.save(modeledCustomer);
					response.setMessage("Successfully registered");
					response.setStatus("200");
					response.setErrorMessage("No Errors");
					Coupon modeledCoupon = customerModeler.modelCoupon(modeledCustomer);
					couponRepository.save(modeledCoupon);
				} catch (Exception e) {
					System.out.println(e.getMessage());
					response.setMessage("Error while registering the user");
					response.setStatus(HttpStatus.SERVICE_UNAVAILABLE.toString());
					response.setErrorMessage(e.getMessage());
				}
				
			} else {
				response.setMessage("User is already registered");
				response.setStatus("200");
				response.setErrorMessage("No Errors");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			response.setMessage("Error while registering the user");
			response.setStatus(HttpStatus.SERVICE_UNAVAILABLE.toString());
			response.setErrorMessage(e.getMessage());
		}
		/*
		 * if (custom != null) { message = "Successfully registered"; } else { message =
		 * "Error while registering the user in DB"; }
		 */
		return response;
	}

}
