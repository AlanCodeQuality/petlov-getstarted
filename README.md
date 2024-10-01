![poster](.github/cover.png)

## 🤘 About

PetLov project for test automation training with Java and JUnit 5.

## 💻 Technologies
- Selenium WebDriver 4.20.0
- JDK 21
- JUnit 5

# Test and Automation Project for the PetLov Platform 🐾

## Description 📋

This project aims to ensure the quality and functionality of the PetLov platform through automated tests. Using Selenium WebDriver and Selenide, tests were developed to verify the site's slogan and the functionality of the donation point registration.

## Technologies Used 🛠️

- **Java:** Programming language used for developing the tests.
- **Selenium WebDriver:** Tool for browser automation.
- **Selenide:** Library that simplifies writing automation tests.
- **JUnit:** Testing framework used to run the tests.
- **Maven:** Dependency management and build system.

## Project Structure 📁

The project is divided into three main packages, each containing its respective test classes:

### Package `br.com.rocketskills.petlov`

- **Slogan.java:** Tests if the site's slogan is displayed correctly. Uses Selenium WebDriver to open the page and check the text of the `<h1>` element.

- **selenium.java:** Tests the process of registering a donation point. It includes the following steps:
  1. Navigate to the registration page.
  2. Fill out the registration form with mock data.
  3. Verify the success message after form submission.
  Uses Selenium WebDriver for interaction with the page.

- **CadastroSelenide.java:** Tests the process of registering a donation point using Selenide. Includes the following tests:
  - `happyPath`: Verifies the registration flow with valid data.
  - `invalidEmail`: Verifies the platform's response when an invalid email is provided.
  Uses Selenide for page interaction and result validation.

## Environment Setup ⚙️

### Prerequisites ✅

- Java 17 or higher.
- Maven.
- Chrome browser and ChromeDriver (or other compatible browser and driver).

### Installation 🚀

1. Clone this repository:

    ```bash
    git clone https://github.com/your-username/your-repository.git
    ```

2. Navigate to the project directory:

    ```bash
    cd your-repository
    ```

3. Install Maven dependencies:

    ```bash
    mvn install
    ```

## Running the Tests 🧪

To run the tests with JUnit:

```bash
mvn test



