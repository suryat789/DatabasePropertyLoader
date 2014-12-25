package dev.surya.utils;

import org.apache.commons.dbcp.BasicDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesDataSourceFactory {
	public static DataSource createDataSource(String propertyFilename) throws Exception {
		Properties properties = new Properties();
		InputStream in = PropertiesDataSourceFactory.class.getClassLoader().getResourceAsStream(propertyFilename);
		properties.load(in);
		in.close();

		return BasicDataSourceFactory.createDataSource(properties);
	}
}