#### Proiect Automation Testing UI & API

#### Despre proiect

Acest repository contine doua framework-uri de testare automata dezvoltate in Java:

- Framework de testare UI pentru platforma SauceDemo
- Framework de testare API pentru platforma Practice Software Testing

Tehnologii utilizate:

- Java
- Selenium WebDriver
- Rest Assured
- TestNG
- Maven
- IntelliJ IDEA
- Page Object Model (POM)
- Git & GitHub

Framework-ul include teste automate UI si API, organizate separat, cu rulare prin TestNG si generare de rapoarte dupa executie.

---
#### Instalare si Rulare teste

Pentru rularea testelor este necesara instalarea Java, Intellij si Mavem.
Apoi din IntelliJ(\src\test\resources) rulare fisier testng_ui.xml sau testng_ui.xml.

---
#### Automation Testing UI - SauceDemo

#### Despre proiect

Framework-ul UI valideaza functionalitatea de autentificare pentru platforma SauceDemo folosind Selenium WebDriver si arhitectura Page Object Model.

#### Scenarii automate implementate

Au fost automatizate urmatoarele cazuri de test pentru login:

1. Login valid cu credentiale corecte
2. Login cu parola invalida
3. Login cu username invalid
4. Login fara username
5. Login fara parola

#### Site testat

https://www.saucedemo.com/

---

#### Automation Testing API - PracticeSoftwareTesting

#### Despre proiect

Framework-ul API valideaza functionalitati REST API pentru platforma Practice Software Testing folosind Rest Assured.

#### Scenarii automate implementate

Au fost automatizate urmatoarele cazuri de test:

1. Login cu succes si generare token
2. Adaugare produs in cos folosind autentificare Bearer Token
3. Verificare detalii pentru un produs existent

#### Exemple endpoint-uri testate

- Login utilizator: `POST /users/login`
- Adaugare produs in cos: `POST /carts`
- Obtinere produs dupa ID: `GET /products/{id}`

#### Site testat

https://api.practicesoftwaretesting.com/api/documentation

---