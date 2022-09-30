Feature: Manage Address functionality
Background: User cancelled initial login window
Given User provide browser name as "Chrome" and exe location
Given User enter url as
Given User cancelled initial login window
When user navigate on login tab
When user click on MyProfile
When user enter "7498783899" as username
When user enter "kishor" as password
When user click on Login button

@RegressionTest
Scenario:  Manage Address functionality with valid credential
When user navigate on user tab
When user click on user MyProfile
When user navigates on user tab
When user click on manage address
Then Application shows user address to user