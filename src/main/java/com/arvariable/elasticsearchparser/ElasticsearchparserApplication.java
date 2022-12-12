package com.arvariable.elasticsearchparser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ElasticsearchparserApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElasticsearchparserApplication.class, args);
	}
/* ToDo
	1. Connect to elasticsearch
	2. Fetch data from elastic search based on index name
	3. Schedule/ interval for fetching of data
	4. Parse fetched data
	5. Mail parsed data from mailing list details available on excel
	6. Logging
	7. Spring Boot Acuator
*/ 

}
