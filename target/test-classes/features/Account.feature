  Feature: Application Login


Scenario: Home page default login

Given User is on landing page
When User login into application with "jackob" and password "321"
Then Home page is populated
And Cards are displayed "true"





