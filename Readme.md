# SauceDemo Selenium Automation Framework

A comprehensive Selenium WebDriver automation framework for testing SauceDemo e-commerce application.

## 🏗️ Framework Architecture

```
├── src/main/java
│   ├── factory/          # WebDriver Factory
│   ├── pages/            # Page Object Classes
│   ├── reports/          # Reporting Utilities
│   └── utils/            # Helper Utilities
├── src/test/java
│   ├── tests/            # Test Classes
│   ├── dataproviders/    # Test Data Providers
│   └── listeners/        # TestNG Listeners
└── src/test/resources
    ├── config.properties # Configuration
    └── log4j2.xml        # Logging Config
```

## 🚀 Features

- Page Object Model (POM)
- Data-Driven Testing
- Cross-Browser Support
- Parallel Execution
- Allure Reporting Integration
- Screenshot on Failure
- Logging with Log4j2
- CI/CD with Jenkins Pipeline

## ⚙️ Setup

```bash
git clone https://github.com/yourusername/saucedemo-automation.git
cd saucedemo-automation
mvn clean install
```

## 🧪 Running Tests

```bash
# Run all tests
mvn test

# Run smoke tests
mvn test -Dgroups=smoke

# Run with specific browser
mvn test -Dbrowser=firefox
```

## 🔧 Jenkins Setup

1. Install required Jenkins plugins:
    - Maven Integration
    - HTML Publisher
    - TestNG Results Plugin
    - Email Extension

2. Configure Jenkins:
    - Add Maven installation (Maven-3.9)
    - Add JDK installation (JDK-11)

3. Create Pipeline job pointing to this repository

## 📊 Reports

After test execution, generate and view Allure reports:
```bash
mvn allure:serve
```
- Reports data: `target/allure-results/`
- Logs: `logs/automation.log`