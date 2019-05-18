package kr.or.connect.daoexam.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.or.connect.daoexam.config.ApplicationConfig;
import kr.or.connect.daoexam.dao.RoleDao;
import kr.or.connect.daoexam.dto.Role;

public class JDBCTest {
	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		RoleDao dao = ac.getBean(RoleDao.class);
		
		Role role = new Role();
		
		
//		role.setDescription("PROGRAMER");
//		role.setRoleId(900);
//		int count = dao.insert(role);
//		System.out.println(count + "건 입력하였습니다.");
		
		
//		role.setDescription("DESIGNER");
//		role.setRoleId(101);
//		int count = dao.update(role);
//		System.out.println(count + "건 수정하였습니다.");
		
		
//		int count = dao.deleteById(200);
//		System.out.println(count + "건 삭제하였습니다.");
		
		
		role = dao.selectById(600);
		System.out.println(role);
	}
}
