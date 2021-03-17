$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FeatureFiles/LoginSteps.feature");
formatter.feature({
  "name": "To Validate the entire login Page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To Validate the Login Page using Valid Credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User in Facebook Login Page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.user_in_Facebook_Login_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Pass the Credentials in username and password",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.user_Pass_the_Credentials_in_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Click the Login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_Click_the_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters in Main Page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.user_enters_in_Main_Page()"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat org.loginsteps.test.LoginSteps.user_enters_in_Main_Page(LoginSteps.java:38)\r\n\tat ✽.user enters in Main Page(file:src/test/resources/FeatureFiles/LoginSteps.feature:7)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
});