/**
 * 
 */
package com.personal.couponApplication.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.personal.couponApplication.model.request.UserDetailRequest;
import com.personal.couponApplication.model.response.CouponDetails;
import com.personal.couponApplication.service.CouponService;

/**
 * @author mks
 * This is a controller class which will map the request to
 * the specific method.
 *
 */
@RestController

public class CouponController {

	@Autowired
	private CouponService couponService;
	
	/**
	 * This method will get the coupon details.
	 * @param request
	 * @return
	 */
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/getCoupon")
	public ResponseEntity<CouponDetails> getCoupon(@RequestBody UserDetailRequest request) {
		CouponDetails response = couponService.getCoupon(request);
		return new ResponseEntity<CouponDetails>(response, HttpStatus.OK);
	}
	
	/**
	 * This method will register the user.
	 * 
	 */
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/registerUser")
	public ResponseEntity<String> registerUser(@RequestBody UserDetailRequest request) {
		String message = couponService.registerUser(request);
		return new ResponseEntity<String>(message, HttpStatus.OK);
	}
}
