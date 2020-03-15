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
  "duration": 11704746800,
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
  "location": "CommonSteps.user_navigates_to_the_login_page()"
});
formatter.result({
  "duration": 1438385100,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_enters_login_id()"
});
formatter.result({
  "duration": 350676900,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_enters_password()"
});
formatter.result({
  "duration": 439155100,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_clicks_on_the_login_button()"
});
formatter.result({
  "duration": 482219300,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_verifies_login_page_is_displayed()"
});
formatter.result({
  "duration": 43457100,
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
  "duration": 335576600,
  "status": "passed"
});
formatter.match({
  "location": "NewCustomerSteps.user_enters_name()"
});
formatter.result({
  "duration": 277342300,
  "status": "passed"
});
formatter.match({
  "location": "NewCustomerSteps.user_selects_gender()"
});
formatter.result({
  "duration": 331296400,
  "status": "passed"
});
formatter.match({
  "location": "NewCustomerSteps.user_enteres_date_of_birth()"
});
formatter.result({
  "duration": 607241400,
  "status": "passed"
});
formatter.match({
  "location": "NewCustomerSteps.user_enters_address()"
});
formatter.result({
  "duration": 395525900,
  "status": "passed"
});
formatter.match({
  "location": "NewCustomerSteps.user_enteres_city()"
});
formatter.result({
  "duration": 231609100,
  "status": "passed"
});
formatter.match({
  "location": "NewCustomerSteps.user_enteres_state()"
});
formatter.result({
  "duration": 435932000,
  "status": "passed"
});
formatter.match({
  "location": "NewCustomerSteps.user_enteres_pin()"
});
formatter.result({
  "duration": 207455000,
  "status": "passed"
});
formatter.match({
  "location": "NewCustomerSteps.user_enteres_mobile_number()"
});
formatter.result({
  "duration": 255658700,
  "status": "passed"
});
formatter.match({
  "location": "NewCustomerSteps.user_enteres_email()"
});
formatter.result({
  "duration": 333786000,
  "status": "passed"
});
formatter.match({
  "location": "NewCustomerSteps.user_enteres_password()"
});
formatter.result({
  "duration": 225639900,
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
  "duration": 270284600,
  "status": "passed"
});
formatter.after({
  "duration": 60656700,
  "error_message": "org.openqa.selenium.UnhandledAlertException: unexpected alert open: {Alert text : Email Address Already Exist !!}\n  (Session info: chrome\u003d80.0.3987.132): Email Address Already Exist !!\nBuild info: version: \u00273.6.0\u0027, revision: \u00276fbf3ec767\u0027, time: \u00272017-09-27T15:28:36.4Z\u0027\nSystem info: host: \u0027ALEX-WINDOWS-PC\u0027, ip: \u0027192.168.1.9\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_241\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d80.0.3987.16 (320f6526c1632ad4f205ebce69b99a062ed78647-refs/branch-heads/3987@{#185}), userDataDir\u003dC:\\Users\\Alex\\AppData\\Local\\Temp\\scoped_dir13236_404590676}, timeouts\u003d{implicit\u003d0, pageLoad\u003d300000, script\u003d30000}, pageLoadStrategy\u003dnormal, unhandledPromptBehavior\u003ddismiss and notify, strictFileInteractability\u003dfalse, platform\u003dWINDOWS, proxy\u003dProxy(), goog:chromeOptions\u003d{debuggerAddress\u003dlocalhost:59689}, acceptInsecureCerts\u003dfalse, browserVersion\u003d80.0.3987.132, browserName\u003dchrome, javascriptEnabled\u003dtrue, platformName\u003dWINDOWS, setWindowRect\u003dtrue}]\nSession ID: ba688872d44382b652589f3c743d840b\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:118)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:586)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:643)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver$RemoteWebDriverOptions.deleteAllCookies(RemoteWebDriver.java:728)\r\n\tat steps.MasterHooks.tearDown(MasterHooks.java:17)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\r\n\tat cucumber.runtime.Runtime.runHookIfTagsMatch(Runtime.java:224)\r\n\tat cucumber.runtime.Runtime.runHooks(Runtime.java:212)\r\n\tat cucumber.runtime.Runtime.runAfterHooks(Runtime.java:206)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:46)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:100)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:89)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:41)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:542)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:770)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:464)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:210)\r\n",
  "status": "failed"
});
});