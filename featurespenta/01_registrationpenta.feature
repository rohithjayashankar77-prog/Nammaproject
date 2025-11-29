Feature: Registration Functionality
@smoke
Scenario: To verify Registration Functionality by entering valid credentials
Given user has opened the browser and launched the application
When user enters valid first name
And  user enters valid last  name
And user enters valid Email id
And  user enters valid Telephone
And  user enters valid  Password
And  user enters valid Confirm Password
And  user clicks on radio button no
And  user clicks on privacy policy check box
And  user clicks on continue button
Then user should be registered 

 

