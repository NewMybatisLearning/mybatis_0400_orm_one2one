package mybatis_0400_relationmanagement;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.ymd.learn.model.Teacher;

public class TeacherTest {

	SqlSession sqlSession = null;
	
	@Before
	public void setup() throws IOException {
		String resource = "mybatis-configuration.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		sqlSession = sqlSessionFactory.openSession();
	}
	
	@Test
	public void testTeacher() {
		Teacher teacher = sqlSession.selectOne("mapper.getTeacherByClassId", 1);
		System.out.println(teacher);
	}
	
	@Test
	public void testTeacher2() {
		Teacher teacher = sqlSession.selectOne("mapper.getTeacherByClassId2", 1);
		System.out.println(teacher);
	}
	
	
	
	
}
