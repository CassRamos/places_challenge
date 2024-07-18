<h1 align="center"> Places API </h1>
<p align="center">
  <a href="#-tecnologies">Tecnologies</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#-project">Project</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#memo-license">License</a>
  <p align="center">
  <img alt="License" src="https://img.shields.io/static/v1?label=license&message=MIT&color=49AA26&labelColor=000000">
</p>
</p>

<br>

## 🚀 Tecnologies

A simple project using reactive API principles, automated tests, and Slugify to generate slugs

- Java & Spring Boot
- Slugify
- R2DBC
- Postman 
- Git & Github 

 <br>

## 💻 Project

This project simulates a basic places API.

<br>

## :memo: License


This project is under license from MIT

<br>

## Endpoints 
<p>To test the application endpoints you can use the Postman, HttpPie, Insomnia...</p>

<br>

### Register a place
 - <p> To register a place, you'll use: </p>
 
```sh
curl -X POST http://localhost:8080/places \
     -H "Content-Type: application/json" \
     -d {
          "name": "New place",
          "state": "Rio de Janeiro"
        }
```

<p> this should be the received response: </p>

```json
{
  "name": "New place",
  "slug": "new-place",
  "state": "Rio de Janeiro",
  "createdAt": "2024-07-17T23:38:29.6371618",
  "updatedAt": "2024-07-17T23:38:29.6371618"
}
```

<br>

<p>Thanks for your attention, see you next time 💜</p>

