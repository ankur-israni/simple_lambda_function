***********************
A) Deployment
***********************
1) run mvn clean install
2) deploy the generated jar file in aws lambda. The generated jar file is a FAT jar, contains this code and its dependencies.
3) There are 3 seperate lamba functions created in AWS
    - BookAddLambda
    - BookAllLambda
    - EmployeefindByIdLambda


*********************************
B) Employee Lambda > findById
*********************************
Testing
******************
Local testing
-------------------
Cannot be tested locally as there is no spring boot or any other server for this.

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
C) Book Lambda > BookAll
*********************************
Testing
******************
Local testing
-------------------
cannot be tested locally as there is no spring boot or any other server for this.

Test on AWS
---------------------------------
input: (takes json request)
--------------------------------
""

output: (gives json response)
---------------------------------
[
  {
    "id": 1,
    "name": "The Great Gatsby",
    "author": "F. Scott Fitzgerald"
  },
  {
    "id": 2,
    "name": "The Sound and the Fury",
    "author": "William Faulkner"
  },
  {
    "id": 3,
    "name": "To the Lighthouse",
    "author": "Virginia Woolf"
  }
]




*********************************
D) Book Lambda > BookAdd
*********************************
Testing
******************
Local testing
-------------------
cannot be tested locally as there is no spring boot or any other server for this.

Test on AWS
---------------------------------
input: (takes json request)
--------------------------------
{
  "id": "10",
  "name": "chronicles of ankur",
  "author": "ankur israni"
}

output: (gives json response)
---------------------------------
"SUCCESS"
or
"FAILURE"





