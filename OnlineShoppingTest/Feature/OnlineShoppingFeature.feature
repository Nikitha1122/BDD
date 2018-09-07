Feature: Test Online shop services

@niki
Scenario: User wants to test Services of Online Shop

When User give call to'/sayHello' Service
Then user should receive service status 'OK' And response message 'Hello World From RestFulwebService'

When user submit valid product details
Then product detalis successfully added

When user enters product code
Then product details should be displayed

When user calls 'viewAll' Service
Then all products should be displayed