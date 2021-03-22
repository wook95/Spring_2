package com.arc.s2.robot;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/*-context.xml"})
public class RobotTest {

	@Autowired
	private Robot robot;
	private Arm_Left arm_left;
		
		
	@Test
	public void test() {
		
		
		assertNotNull(robot.getArm_left());
		//left,right이름 찍어보기
	
	
	
	}

}
