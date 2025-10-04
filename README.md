# 🚀 Selenium Automation Testing Practice

<div align="center">

![Selenium](https://img.shields.io/badge/Selenium-43B02A?style=for-the-badge&logo=selenium&logoColor=white)
![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)
![TestNG](https://img.shields.io/badge/TestNG-FF6C37?style=for-the-badge&logo=testing-library&logoColor=white)

A comprehensive automation testing framework built with Selenium WebDriver, Java, and Maven, implementing industry-standard design patterns and best practices.

[Features](#-features) • [Getting Started](#-getting-started) • [Usage](#-usage) • [Project Structure](#-project-structure) • [Contributing](#-contributing)

</div>

---

## 📋 Table of Contents

- [About the Project](#-about-the-project)
- [Features](#-features)
- [Technologies Used](#-technologies-used)
- [Design Patterns](#-design-patterns)
- [Getting Started](#-getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
- [Usage](#-usage)
- [Project Structure](#-project-structure)
- [Testing](#-testing)
- [Reporting](#-reporting)
- [CI/CD](#-cicd)
- [Roadmap](#-roadmap)
- [Contributing](#-contributing)
- [License](#-license)
- [Contact](#-contact)

---

## 🎯 About the Project

This project serves as a practical implementation of professional test automation practices using Selenium WebDriver with Java. Built following a comprehensive course curriculum, it demonstrates how to create a scalable, maintainable Test Automation Framework (TAF) from scratch.

The framework is designed to help QA engineers and developers learn and implement enterprise-level automation testing solutions, covering everything from basic Selenium operations to advanced framework architecture.

### 🎓 Course Curriculum

The project implements concepts from a comprehensive course covering:

- **Foundation:** Core Selenium WebDriver operations and Java fundamentals
- **TestNG Mastery:** Complete coverage of TestNG features including annotations, assertions, grouping, parameterization, parallel execution, XML configuration, listeners, and retry mechanisms
- **Data Management:** Data-driven testing approaches using Properties files, JSON, and Excel
- **Reporting & Monitoring:** Integration with Allure Framework for detailed test reporting with logs, screenshots, and video recording
- **DevOps Integration:** CI/CD pipeline setup using GitHub Actions
- **Version Control:** Git and GitHub workflow best practices
- **Architecture:** Implementation of SOLID principles and professional design patterns

---

## ✨ Features

- **Robust Framework Architecture:** Built on proven design patterns for scalability and maintainability
- **Comprehensive TestNG Integration:** Full utilization of TestNG capabilities
- **Data-Driven Testing:** Support for multiple data sources (Properties, JSON, Excel)
- **Rich Reporting:** Allure Reports with screenshots, logs, and video evidence
- **Parallel Execution:** Run tests concurrently for faster feedback
- **CI/CD Ready:** Pre-configured GitHub Actions workflows
- **Cross-Browser Support:** Extensible architecture for multiple browser testing
- **Page Object Model:** Clean separation of test logic and page elements
- **Retry Mechanism:** Automatic retry for flaky tests
- **Configurable:** Easy configuration management through external files

---

## 🛠️ Technologies Used

| Technology                                                                                                                  | Purpose                       | Version |
| --------------------------------------------------------------------------------------------------------------------------- | ----------------------------- | ------- |
| ![Java](https://img.shields.io/badge/Java-ED8B00?style=flat-square&logo=openjdk&logoColor=white)                            | Programming Language          | 21+     |
| ![Selenium](https://img.shields.io/badge/Selenium-43B02A?style=flat-square&logo=selenium&logoColor=white)                   | Web Automation Framework      | Latest  |
| ![Maven](https://img.shields.io/badge/Maven-C71A36?style=flat-square&logo=apache-maven&logoColor=white)                     | Build & Dependency Management | Latest  |
| ![TestNG](https://img.shields.io/badge/TestNG-FF6C37?style=flat-square&logo=testing-library&logoColor=white)                | Testing Framework             | Latest  |
| ![Allure](https://img.shields.io/badge/Allure-00C7B7?style=flat-square&logo=qameta&logoColor=white)                         | Test Reporting                | Latest  |
| ![GitHub Actions](https://img.shields.io/badge/GitHub_Actions-2088FF?style=flat-square&logo=github-actions&logoColor=white) | CI/CD Pipeline                | Latest  |

### Additional Tools

- **ChromeDriver:** Browser automation driver
- **Apache POI:** Excel file handling
- **Jackson/Gson:** JSON parsing
- **SLF4J/Log4j:** Logging framework

---

## 🏗️ Design Patterns

This framework implements industry-standard design patterns for maintainability and scalability:

### 🎨 Page Object Model (POM)

Encapsulates web page elements and actions, providing a clean separation between test code and page-specific code.

### 🏭 Factory Pattern

Manages object creation for browsers, drivers, and data providers, promoting loose coupling and flexibility.

### 🎭 Facade Pattern

Provides simplified interfaces to complex subsystems, making the framework easier to use and understand.

### 👑 Singleton Pattern

Ensures single instances of critical components like configuration managers and driver instances.

### 🤖 Bot Pattern

Implements high-level test actions by combining multiple low-level operations.

### 📐 SOLID Principles

- **S**ingle Responsibility Principle
- **O**pen/Closed Principle
- **L**iskov Substitution Principle
- **I**nterface Segregation Principle
- **D**ependency Inversion Principle

---

## 🚀 Getting Started

### Prerequisites

Before you begin, ensure you have the following installed:

- **Java Development Kit (JDK) 21 or higher**

  ```bash
  java -version
  ```

  Download from [Oracle](https://www.oracle.com/java/technologies/downloads/) or [OpenJDK](https://openjdk.org/)

- **Apache Maven 3.6+**

  ```bash
  mvn -version
  ```

  Download from [Maven Official Site](https://maven.apache.org/download.cgi)

- **Google Chrome Browser**
  Download from [Google Chrome](https://www.google.com/chrome/)

- **Git**
  ```bash
  git --version
  ```
  Download from [Git Official Site](https://git-scm.com/downloads)

### Installation

1. **Clone the repository**

   ```bash
   git clone https://github.com/mhmd-ashrf-saad/Selenium.git
   ```

2. **Navigate to the project directory**

   ```bash
   cd Selenium
   ```

3. **Install dependencies**

   ```bash
   mvn clean install
   ```

   This command will:

   - Download all required dependencies
   - Compile the project
   - Run initial verification tests

4. **Verify installation**
   ```bash
   mvn verify
   ```

---

## 💻 Usage

### Running Tests

#### Run all tests

```bash
mvn test
```

#### Run specific test suite

```bash
mvn test -DsuiteXmlFile=testng.xml
```

#### Run tests in parallel

```bash
mvn test -Dthreads=4
```

#### Run specific test groups

```bash
mvn test -Dgroups=smoke
```

#### Run with specific browser

```bash
mvn test -Dbrowser=chrome
```

### Configuration

Update test configurations in `src/test/resources/config.properties`:

```properties
browser=chrome
headless=false
implicitWait=10
explicitWait=20
baseURL=https://example.com
```

---

## 📁 Project Structure

```
Selenium/
├── 📄 pom.xml                      # Maven configuration and dependencies
├── 📄 testng.xml                   # TestNG suite configuration
├── 📄 README.md                    # Project documentation
├── 📄 .gitignore                   # Git ignore rules
│
├── 📂 src/
│   ├── 📂 main/
│   │   ├── 📂 java/
│   │   │   └── 📂 com.automation/
│   │   │       ├── 📂 pages/           # Page Object classes
│   │   │       ├── 📂 utils/           # Utility classes
│   │   │       ├── 📂 config/          # Configuration managers
│   │   │       ├── 📂 factories/       # Factory pattern implementations
│   │   │       └── 📂 base/            # Base classes
│   │   │
│   │   └── 📂 resources/
│   │       ├── 📄 config.properties    # Configuration properties
│   │       ├── 📄 log4j2.xml          # Logging configuration
│   │       └── 📂 testdata/            # Test data files
│   │
│   └── 📂 test/
│       ├── 📂 java/
│       │   └── 📂 com.automation/
│       │       ├── 📂 tests/           # Test classes
│       │       │   └── BrowserActions.java
│       │       └── 📂 listeners/       # TestNG listeners
│       │
│       └── 📂 resources/
│           ├── 📂 testdata/            # Test-specific data
│           └── 📂 suites/              # TestNG XML files
│
├── 📂 .github/
│   └── 📂 workflows/
│       └── 📄 ci.yml                   # GitHub Actions workflow
│
├── 📂 allure-results/                  # Allure test results
├── 📂 test-output/                     # TestNG output
└── 📂 target/                          # Maven build output
```

---

## 🧪 Testing

### Test Categories

- **Smoke Tests:** Critical path validation
- **Regression Tests:** Comprehensive feature coverage
- **Integration Tests:** End-to-end workflows
- **Data-Driven Tests:** Parameterized test scenarios

### Test Execution Flow

1. **Setup Phase:** Browser initialization, configuration loading
2. **Execution Phase:** Test steps execution with logging
3. **Assertion Phase:** Validation of expected outcomes
4. **Teardown Phase:** Browser cleanup, resource disposal
5. **Reporting Phase:** Results aggregation and report generation

---

## 📊 Reporting

### Allure Reports

Generate and view comprehensive test reports:

```bash
# Generate Allure results
mvn clean test

# Serve Allure report
mvn allure:serve
```

**Report Features:**

- Test execution timeline
- Screenshots on failure
- Video recordings
- Step-by-step logs
- Environment information
- Historical trends

### TestNG Reports

Basic HTML reports are available at: `target/surefire-reports/index.html`

---

## 🔄 CI/CD

The project includes a pre-configured GitHub Actions workflow for continuous integration.

### Workflow Features

- Automated test execution on push/pull requests
- Multi-browser testing
- Parallel test execution
- Allure report generation and publishing
- Slack/Email notifications

### Triggering CI/CD

```bash
# Push to main branch
git push origin main

# Create pull request
gh pr create --base main --head feature-branch
```

---

## 🗺️ Roadmap

- [ ] Add support for multiple browsers (Firefox, Safari, Edge)
- [ ] Implement API testing integration
- [ ] Add visual regression testing
- [ ] Enhance mobile testing capabilities
- [ ] Implement BDD with Cucumber
- [ ] Add performance testing metrics
- [ ] Docker containerization
- [ ] Cloud-based execution (Selenium Grid, BrowserStack)

---

## 🤝 Contributing

Contributions are welcome! Here's how you can help:

1. **Fork the Project**
2. **Create your Feature Branch**
   ```bash
   git checkout -b feature/AmazingFeature
   ```
3. **Commit your Changes**
   ```bash
   git commit -m 'Add some AmazingFeature'
   ```
4. **Push to the Branch**
   ```bash
   git push origin feature/AmazingFeature
   ```
5. **Open a Pull Request**

### Contribution Guidelines

- Follow existing code style and conventions
- Write meaningful commit messages
- Add tests for new features
- Update documentation as needed
- Ensure all tests pass before submitting PR

---

## 📝 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

## 📧 Contact

**Mohamed Ashraf Saad**

- GitHub: [@mhmd-ashrf-saad](https://github.com/mhmd-ashrf-saad)
- Project Link: [https://github.com/mhmd-ashrf-saad/Selenium](https://github.com/mhmd-ashrf-saad/Selenium)

---

## 🙏 Acknowledgments

- [Selenium Documentation](https://www.selenium.dev/documentation/)
- [TestNG Documentation](https://testng.org/doc/documentation-main.html)
- [Allure Framework](https://docs.qameta.io/allure/)
- [Maven Documentation](https://maven.apache.org/guides/)

---

<div align="center">

**⭐ If you find this project helpful, please consider giving it a star!**

Made with ❤️ for the Testing Community

</div>
