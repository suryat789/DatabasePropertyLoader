package dev.surya.test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
public abstract class AbstractDatabaseConfigurationTest {

	protected static final String APPLICATION_KEY_ONE = "ValueOne";
	protected static final String APPLICATION_KEY_TWO = "ValueTwo";
	
	@Autowired
	protected JdbcTemplate jdbcTemplate;

	@BeforeClass
	public static void setUpTestSuite() throws Exception {
	}

	@AfterClass
	public static void cleanUpTestSuite() throws Exception {
	}
}