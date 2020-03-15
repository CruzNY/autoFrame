$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("NewCustomer.feature");
formatter.feature({
  "line": 2,
  "name": "Create a new user",
  "description": "",
  "id": "create-a-new-user",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@run"
    }
  ]
});
formatter.before({
  "duration": 12337700700,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Navigate to page and create a new user",
  "description": "",
  "id": "create-a-new-user;navigate-to-page-and-create-a-new-user",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User navigates to the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enters login id",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "User enters password",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User clicks on the login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User verifies login page is displayed",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User click on \"New Customer\" link",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User enters name",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User selects gender",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User enteres date of birth",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User enters address",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User enteres city",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User enteres state",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User enteres pin",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User enteres mobile number",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User enteres email",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User enteres password",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "User click on \"Submit\" button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_navigates_to_the_login_page()"
});
formatter.result({
  "duration": 1527210000,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_enters_login_id()"
});
formatter.result({
  "duration": 1179705500,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_enters_password()"
});
formatter.result({
  "duration": 263492100,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_clicks_on_the_login_button()"
});
formatter.result({
  "duration": 631447500,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_verifies_login_page_is_displayed()"
});
formatter.result({
  "duration": 47142500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "New Customer",
      "offset": 15
    }
  ],
  "location": "LoginSteps.user_click_on_something_link(String)"
});
formatter.result({
  "duration": 408972800,
  "status": "passed"
});
formatter.match({
  "location": "NewCustomerSteps.user_enters_name()"
});
formatter.result({
  "duration": 437160300,
  "status": "passed"
});
formatter.match({
  "location": "NewCustomerSteps.user_selects_gender()"
});
formatter.result({
  "duration": 607367000,
  "status": "passed"
});
formatter.match({
  "location": "NewCustomerSteps.user_enteres_date_of_birth()"
});
formatter.result({
  "duration": 585599500,
  "status": "passed"
});
formatter.match({
  "location": "NewCustomerSteps.user_enters_address()"
});
formatter.result({
  "duration": 1124592700,
  "status": "passed"
});
formatter.match({
  "location": "NewCustomerSteps.user_enteres_city()"
});
formatter.result({
  "duration": 343357700,
  "status": "passed"
});
formatter.match({
  "location": "NewCustomerSteps.user_enteres_state()"
});
formatter.result({
  "duration": 253116600,
  "status": "passed"
});
formatter.match({
  "location": "NewCustomerSteps.user_enteres_pin()"
});
formatter.result({
  "duration": 248114500,
  "status": "passed"
});
formatter.match({
  "location": "NewCustomerSteps.user_enteres_mobile_number()"
});
formatter.result({
  "duration": 273701200,
  "status": "passed"
});
formatter.match({
  "location": "NewCustomerSteps.user_enteres_email()"
});
formatter.result({
  "duration": 337485100,
  "status": "passed"
});
formatter.match({
  "location": "NewCustomerSteps.user_enteres_password()"
});
formatter.result({
  "duration": 259514000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Submit",
      "offset": 15
    }
  ],
  "location": "NewCustomerSteps.user_click_on_something_button(String)"
});
formatter.result({
  "duration": 649895900,
  "status": "passed"
});
formatter.after({
  "duration": 1028186600,
  "status": "passed"
});
});