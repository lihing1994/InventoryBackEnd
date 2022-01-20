# Introduction
The goal of this project is to implement the back-end for a inventory tracking web. The back-end is implement using Spring Boot, a Java back-end framework, and MySQL database. The back-end supports five functionalities,shown below, by exposing the RESTful APIs for each of function to the front-end.
- Creating a inventory 
- Removing a inventory
- Edit a inventory
- Show all inventories 
- Export all inventories as CSV file


## Recommend setting
In order to run this project propriety, following are the recommended setting for your computer
- Java version: 17.0.1 or above
- VS Code version: 1.63 or above
- MySQL version: 8.0.20
- MySQL Workbench
- Extenstion for VS Code: Spring Boot Dashboard, Project Manager for Java, Maven for Java, Language Support for Java, and REST client.

## Run the project
- Step1. Import the spring boot project to your VS Code. You may refer the **[link](https://www.youtube.com/watch?v=XJeT0ErXBHo)** to see how to import the project to VS Code and run it. 
- Step2. Import the SQL database to your MySQL workbench. You may refer the **[link](https://www.youtube.com/watch?v=Jvul-wr-_Bg)** to see the details how to import the SQL database to your MySQL Workbench
- Step3. Open the project and find the **application.properties** file under the resource folder. Then, change the **user name** and **password** corresponding to the setting in your system.(i.e, user name and password for your MySQL server)![Screen Shot 2022-01-19 at 6 17 35 PM](https://user-images.githubusercontent.com/25276186/150259565-e76307f3-79e7-4544-ad6e-b00707ece3c1.png)

## Functionality
- Now you may go to the **sample.http** file under the project folder and check each functionality of the back-end by clicking the **send request** on top of each RESTful APIs.![Screen Shot 2022-01-19 at 6 27 02 PM](https://user-images.githubusercontent.com/25276186/150261257-52f42ebd-9fed-41df-a7b1-d41412ee0621.png)
 
