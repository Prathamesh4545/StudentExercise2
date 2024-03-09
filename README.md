# StudentExercise2

In this Exercise i'am creating student entity and perform CRUD operation as per the task, In same way i'am handling multiple queries just like fatching data, inserting data, all info of student 
using api's(Application Programming Interface), also i can used multiple annotation which is helpfully to easily perform opertion or give quickly response/output.

If you want to used my code please make sure to do the changes which below the line.

# 1st change will be in application.proporties file 
  It will be located on src/main/resources folder.
  Then 1st change will be you database driver change the driver as per your database
  # org.postgresql.Driver
  2nd change will be your database url
  # jdbc:postgresql://localhost:5432/practiceDB
  3rd change will be your databse username
  # postgres
  4th change will be your database password
  # ----

# 2nd change will be in pom.xml file
  Inside the pom.xml file you can change the dependency 
  as per my code the dependency will be org.postgresql
  you can change the dependency as per your database, 
  1st you can go on google chrome 
  2nd search the maven repository
  3rd click the 1st link after search your database name over search-bar
  4th check which best version and then click that
  5th you show this type of dependency copy that dependency and paste it in a code 
  
    <!-- https://mvnrepository.com/artifact/org.postgresql/postgresql -->
		<dependency>
			<groupId>org.postgresql</groupId>
			<artifactId>postgresql</artifactId>
			<version>42.6.0</version>
		</dependency>
# 3rd and than run the code in your IDE(Integreated Developement Enviroment) 
As per me i'am using multiple ide which is 
1) Eclipse IDE
2) Intellij Idea
3) STS (Spring Tool Suite)

# 4th althouge one thing will be missing which is lombok 
  # This is only whenever you are using STS IDE
  i'am using lombok, so we don't need to write code. It will directly get code as per annotation.
  so if after you run the application any error occour in lombok you can add lombok executable jar file in your sts(spring tool suite) IDE

# 5th Solution in Postman urls
  # Note :- Id will be set automatic so you can using as per your requirment for now i'am using 202 for id.
  1. Add Student
       # Post Request :-  localhost:8080/addStudent
           {
              "name": "Suraj",
              "age": 23,
              "address": "Pune",
              "joiningCourse": "Java Full Stack"
          }
  2. Get All Student Details
     # Get Request :- localhost:8080/getAllStudent
  3. Find Student By Id
     # Get Request :- localhost:8080/student/202
       
  4. Update Studnet By Id
     # Put Request :- localhost:8080/student/update/202
         {
              "name": "Suraj",
              "age": 24,
              "address": "Pune",
              "joiningCourse": "Java Full Stack"
          }
  5. Delete Student By Id
     # Delete Request :- localhost:8080/student/delete/202
