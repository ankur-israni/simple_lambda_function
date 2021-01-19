Deployment
***********************
1) run mvn clean install
2) deploy the generated jar file in aws lambda. The generated jar file is a FAT jar, contains this code and its dependencies.

*********************************
Employee Lambda
*********************************
Testing
******************
Local testing
-------------------
cannot be tested locally as there is no spring boot or any other server for this.

Test on AWS
-------------
input: (does not take json request, simply an integer)
--------------------------------------------------------
1

output: (gives json response of 'Employee' object)
--------------------------------------------------------
{
  "id": 1,
  "name": "ankur",
  "address": "plano"
}

*********************************
Book Lambda
*********************************
Testing
******************
Local testing
-------------------
cannot be tested locally as there is no spring boot or any other server for this.

Test on AWS
-------------
input: (takes json request)
----------


output:
-----------


