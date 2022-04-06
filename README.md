# CRUD SIMPLE SPEC
Description :

try for make crud simple with spring boot framework
## Tech Stack
Technology: 
- Spring Boot Framework
- Java

IDE:
-Intellij IDEA

Dependency:
- Spring Web
- Spring Data Jpa
- MySql Driver

Database:
- mysql 
    - User Column
      - id (int(11),unique),
      - first_name (varchar(45)),
      - last_name (varchar(45)),
      - start_date (date)


## Get User
Request :
- Method : GET
- Endpoint : `/user{id}`
Response :
```json 
        {
          "id" : "int(11),unique",
          "first_name" : "varchar(45)",
          "last_name" : "varchar(45)",
          "start_date" : "date"
        }
```

## Update User
Request :
- Method : PUT
- Endpoint : `/updateuser`

## List User
Request :
- Method : GET
- Endpoint : `/user`
    
Response :
```json 
      [
        {
            userId: 1,
            firstName: "Antonius ",
            lastName: "Wijaya",
            userType: "Platinum",
            startDate: "2022-04-06"
        },
        {
            userId: 1,
            firstName: "Antonius ",
            lastName: "Wijaya",
            userType: "Platinum",
            startDate: "2022-04-06"
        }
      ]

```

## Delete User
Request :
- Method : DELETE
- Endpoint : `/{id}`