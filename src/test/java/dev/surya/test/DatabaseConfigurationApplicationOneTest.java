package dev.surya.test;
import static junit.framework.Assert.assertEquals;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;

import dev.surya.model.AppConfiguration;
import dev.surya.utils.Constants;

@ContextConfiguration(locations={ "/datasource.xml","/spring.xml"})
public class DatabaseConfigurationApplicationOneTest extends AbstractDatabaseConfigurationTest {
	@Autowired
	@Qualifier("appConfig")
	private AppConfiguration appConfiguration;

	@Test
	public void testPropertiesPrinter() {
		int propertyCount = jdbcTemplate.queryForInt("select count(*) from AppConfiguration where applicationCode='" + Constants.APPLICATION_CODE +"'");
		assertEquals("Count Matched", 2, propertyCount);
		assertEquals("KeyOne Matched", APPLICATION_KEY_ONE, appConfiguration.getKeyOne());
		assertEquals("KeyTwo Matched", APPLICATION_KEY_TWO, appConfiguration.getKeyTwo());
	}
}