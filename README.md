# elasticsearchparser 
- An alert module using elasticsearch as DB
- Process data according to a set interval  in elasticsearch and send out mail according to parsed data.
- Data Set: https://datasetsearch.research.google.com/search?src=0&query=syslogs&docid=L2cvMTFqOTl4emgxaA%3D%3D&filters=WyJbXCJpc19hY2Nlc3NpYmxlX2Zvcl9mcmVlXCIsW11dIl0%3D&property=aXNfYWNjZXNzaWJsZV9mb3JfZnJlZQ%3D%3D
- Functionality
	1. Connect to elasticsearch
	2. Fetch data from elastic search based on index name
	3. Schedule/ interval for fetching of data
	4. Parse fetched data
	5. Mail parsed data from mailing list details available on excel
	6. Logging
	7. Spring Boot Acuator
