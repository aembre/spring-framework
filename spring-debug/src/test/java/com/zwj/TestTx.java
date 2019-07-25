package com.zwj;

import com.zwj.tx.MainConfig;
import com.zwj.tx.UserService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by zhangwenjie on 2019/7/25.
 */
public class TestTx {

	@Test
	public void testTx(){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
		UserService userService = context.getBean(UserService.class);
		userService.insert();
		context.close();
	}

}
