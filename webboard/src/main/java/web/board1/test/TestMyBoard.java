package web.board1.test;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:src/main/webapp/WEB-INF/**/applicationContext.xml"
})

public class TestMyBoard {

	
	@Autowired
	private DataSource ds;
	
	@Autowired
	private SqlSession session;
	
	@Test
	public void testSqlSession() throws Exception {
		Assert.assertNotNull(ds.getConnection());
		Assert.assertNotNull(session);
		
	}
	
}
