package cn.zhr.test;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;

import cn.zhr.base.BaseTest;
import cn.zhr.entity.User;
import cn.zhr.service.UserService;

public class UserTest extends BaseTest {

	@Resource
	private UserService userService;

	@Before
	public void before() {
		System.out.println("========Start========");
	}

	@Test
	public void test1() {
		User selectByPrimaryKey = userService.selectByPrimaryKey(1);
		System.out.println(selectByPrimaryKey);
	}
}
