# elasticsearchparser 
- An alert module using elasticsearch as DB
- Process data according to a set interval  in elasticsearch and send out mail according to parsed data.
- From Google DataSet: Unique identifier https://doi.org/10.5281/zenodo.3723083 (Syslog)
- Functionality
	1. Connect to elasticsearch
	2. Fetch data from elastic search based on index name
	3. Schedule/ interval for fetching of data
	4. Parse fetched data
	5. Mail parsed data from mailing list details available on excel
	6. Logging
	7. Spring Boot Acuator
