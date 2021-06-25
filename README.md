# JWT Auth with Refresh Token using Spring Boot

This is a ready to use template code for implementing `JWT based authentication` with `refresh token` using Spring Boot.

<br />

## Documentation and Usage

* ### Authentication API

`POST` URI: `localhost:8080/auth/authenticate`

<br />

![authenticate-api](https://github.com/DevRezaur/JWT-refresh-token-spring-boot/blob/main/screenshots/authenticate-api.PNG)

---

* ### Access User Controller

`GET` URI: `localhost:8080/user/`

<br />

![user-content](https://github.com/DevRezaur/JWT-refresh-token-spring-boot/blob/main/screenshots/user-content.PNG)

---

* ### Access Admin Controller

`GET` URI: `localhost:8080/admin/`

<br />

![admin-content](https://github.com/DevRezaur/JWT-refresh-token-spring-boot/blob/main/screenshots/admin-content.PNG)

---

* ### Token Expired / Access Denied Example

`GET` URI: `localhost:8080/admin/`

<br />

![access-denied](https://github.com/DevRezaur/JWT-refresh-token-spring-boot/blob/main/screenshots/access-denied.PNG)

---

* ### Request New Token API

`POST` URI: `localhost:8080/auth/refreshtoken`

<br />

![token-refresh-api](https://github.com/DevRezaur/JWT-refresh-token-spring-boot/blob/main/screenshots/token-refresh-api.PNG)

---

* ### Refresh Token Expired Example

`POST` URI: `localhost:8080/auth/refreshtoken`

<br />

![refresh-token-expired](https://github.com/DevRezaur/JWT-refresh-token-spring-boot/blob/main/screenshots/refresh-token-expired.PNG)

---

* ### User Registration API

`POST` URI: `localhost:8080/admin/registerUser`

<br />

![user-registration](https://github.com/DevRezaur/JWT-refresh-token-spring-boot/blob/main/screenshots/user-registration.PNG)

---

* ### Admin Registration API

`POST` URI: `localhost:8080/admin/registerAdmin`

<br />

![admin-registration](https://github.com/DevRezaur/JWT-refresh-token-spring-boot/blob/main/screenshots/admin-registration.PNG)

---

* ### Logout from server API

`POST` URI: `localhost:8080/auth/logout`

<br />

![logout](https://github.com/DevRezaur/JWT-refresh-token-spring-boot/blob/main/screenshots/logout.PNG)

<br />
<br />

## Run the Project

* `Clone the repository`
* `Update maven build (Project > Maven > Update Project)`
* `Run (Project > Run As > Spring Boot App)`

<br />
<br />

Feel free to leave a star if you find this helpful :smile:
