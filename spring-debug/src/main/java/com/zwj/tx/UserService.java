package com.zwj.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by zhangwenjie on 2019/7/25.
 */
@Service
public class UserService {

	@Autowired
	private UserDao userDao;

	@Transactional
	public void insert(){
		userDao.insertUser();
		System.out.println("插入完成");
		throw new RuntimeException();
	}

}
