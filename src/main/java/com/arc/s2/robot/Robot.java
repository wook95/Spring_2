package com.arc.s2.robot;




public class Robot {

	
	private int age;
	private String name;
	private int price;
	
	
	public Robot(int age, String name,int price) {
		
		this.age=age;
		this.name = name;
		this.price=price;
		
		// TODO Auto-generated constructor stub
	}
	

	private Arm_Left arm_left;

	private Arm_Right arm_Right;

	public Arm_Left getArm_left() {
		return arm_left;
	}

	public void setArm_left(Arm_Left arm_left) {
		this.arm_left = arm_left;
	}

	public Arm_Right getArm_Right() {
		return arm_Right;
	}

	public void setArm_Right(Arm_Right arm_Right) {
		this.arm_Right = arm_Right;
	}









	
	
}
