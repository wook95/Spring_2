package com.arc.s2.robot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Robot {

	
	@Autowired
	@Qualifier("al")
	private Arm arm_left;
	
	@Autowired
	@Qualifier("ar")
	private Arm arm_Right;

	public Arm getArm_left() {
		return arm_left;
	}

	public void setArm_left(Arm arm_left) {
		this.arm_left = arm_left;
	}

	public Arm getArm_Right() {
		return arm_Right;
	}

	public void setArm_Right(Arm arm_Right) {
		this.arm_Right = arm_Right;
	}







	
	
}
