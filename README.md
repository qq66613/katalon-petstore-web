# Web-Final-Project-Katalon
Final-Project-Katalon


# Web Automation Testing — Katalon Studio

## Project Overview
Web UI automation testing project using Katalon Studio on the PetStore demo website. This project covers authentication, product browsing, cart management, and checkout functionality. Test cases are developed using Manual and Script modes without using Record Web.

**Application Under Test:** https://petstore.octoperf.com/actions/Catalog.action

## How to Run
1. Clone this repository.
2. Open the project in Katalon Studio.
3. Configure the required execution profile and test data.
4. Open `Test Suites` and select the available Web test suite.
5. Run the test suite and review the execution results.

## Test Suite
- **Test Suite:** Web automation test suite
- **Execution:** Katalon Studio
- **Report:** `Web_Automation_Report/`

## Test Coverage

| Test Case | Coverage |
|---|---|
| TC_WEB_001 | Login with null password |
| TC_WEB_002 | Login with incorrect credentials |
| TC_WEB_003 | Login with valid credentials |
| TC_WEB_004 | Login with valid credentials using loop |
| TC_WEB_005 | Login using Data-Driven Testing |
| TC_WEB_006 | View Product |
| TC_WEB_007 | Add Product to Cart |
| TC_WEB_008 | Checkout |

**Total:** 8 test cases covering positive, negative, and data-driven scenarios.