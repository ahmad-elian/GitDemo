  Feature: Application Login
  


@ahmad
Scenario: Home page default login

Given User is on landing page
When User login into application with "jackob" and password "321"
Then Home page is populated
And Cards are displayed "true"


Scenario: Home page default login
Given User is on landing page
When User login into application with "john" and password "123"
Then Home page is populated
And Cards are displayed "false"


Scenario: Home page default login
Given User is on landing page
When User sign up with following details
   | ahmad | ahmadd113 | ahmad.elian.20@gmail.com | Jordan | 4444 |

Then Home page is populated
And Cards are displayed "false"


@Mobiletest
Scenario Outline: Home page default login
Given User is on landing page
When User login using <Username> and <Password>
Then Home page is populated
And Cards are displayed "false"

Examples: 
|Username|Password|
|ahmad   |123     |
|abe     |7777777 |
|dubby   |jfkdsljf|



