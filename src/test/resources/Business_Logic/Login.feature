Feature: Login functionality

Background: User cancelled initial login window
Given User provide browser name as "Chrome" and exe location as "D:\\Automation Support\\Chromedriver.exe"
Given User enter url as "https://www.flipkart.com"
Given User cancelled initial login window

@smokeTest
Scenario: Login functionality with valid credential
When user navigate on login tab
When user click on MyProfile
When user enter "7498783899" as username
When user enter "kishor" as password
When user click on Login button
Then Application shows user profile to user