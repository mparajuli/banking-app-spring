# Spring Boot Banking App

## Overview
This Spring Boot application provides RESTful APIs for managing banking operations such as creating accounts, depositing funds, withdrawing funds, retrieving account details, and deleting accounts.

## Features
- Create a new account
- Retrieve account details by ID
- Deposit funds into an account
- Withdraw funds from an account
- Retrieve details of all accounts
- Delete an account

## Technologies Used
- Java
- Spring Boot
- Spring Data JPA (Hibernate)
- Spring MVC
- RESTful APIs
- Maven
- MySQL

## How to Use
1. Clone the repository to your local machine.
2. Import the project into your preferred IDE.
3. Run the application by executing the main class `BankingAppApplication`.
4. Access the RESTful APIs using a tool like Postman or by integrating them into your frontend application.

## RESTful APIs
The following RESTful APIs are available:

- **Add Account**: `POST /api/accounts`
  - Request Body: Account details in JSON format
  - Response: Created account details

- **Get Account by ID**: `GET /api/accounts/{id}`
  - Path Variable: Account ID
  - Response: Account details for the specified ID

- **Deposit**: `PUT /api/accounts/{id}/deposit`
  - Path Variable: Account ID
  - Request Body: JSON object containing the amount to deposit
  - Response: Updated account details after deposit

- **Withdraw**: `PUT /api/accounts/{id}/withdraw`
  - Path Variable: Account ID
  - Request Body: JSON object containing the amount to withdraw
  - Response: Updated account details after withdrawal

- **Get All Accounts**: `GET /api/accounts`
  - Response: List of all accounts

- **Delete Account**: `DELETE /api/accounts/{id}`
  - Path Variable: Account ID
  - Response: Success message after deleting the account

## Dependencies
- Spring Web
- Spring Data JPA
- MySQL Driver
- Lombok

## Contributor
- Mausam Parajuli

