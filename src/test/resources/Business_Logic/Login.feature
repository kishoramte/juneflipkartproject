Feature: Login functionality

Background: User cancelled initial login window
Given User provide browser name as "Chrome" and exe location
Given User enter url as
Given User cancelled initial login window


Scenario: Login functionality with valid credential
When user navigate on login tab
When user click on MyProfile
When user enter "7498783899" as username
When user enter "kishor" as password
When user click on Login button
Then Application shows user profile to user