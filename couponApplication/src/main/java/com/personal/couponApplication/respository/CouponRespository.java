package com.personal.couponApplication.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.personal.couponApplication.entity.Coupon;

@Repository("couponRepo")
public interface CouponRespository extends JpaRepository<Coupon, Integer> {

	Coupon findByMobile(String mobile);
}
