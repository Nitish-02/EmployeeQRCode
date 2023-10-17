package com.apptad.employeeqrrecord;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class EmployeeQrRecordApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeQrRecordApplication.class, args);
	}

}
