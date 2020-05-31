
Feature: Login and Registration
  @successlogin
  Scenario Outline: Success login

    Given user is in login page
    When he login with email "<email>" and password "<password>"
    Then the login should be successful

    Examples:

      |email                         |password|
      |anikethbattalwar02@gmail.com  |abc1234 |
      |anikethb02@gmail.com          |test123 |

 @failurelogin
  Scenario Outline: Failure login with Invalid email and password

   Given user is in login page
   When he login with email "<email>" and password "<password>"
   Then the error message is shown "<Message>"



   Examples:
     |email                |password|Message |
     |abc@gmail.com        |abc123  | Error: |
     |abc@gmail.com        |xyz123  | Error: |
     |anikethb02@gmail.com |abc123  | Error: |
     |aniketh@gmail.com    |abc1234 | Error: |
     |                     |        | Error: |

   @forgotpass
   Scenario Outline: Forgot password
     Given user is in login page
     When he clicks on forgot password link
     And he navigates to forgot password page
     And enter and send the email "<Email>"
     Then the email should be sent and success message shown "<message>"


     Examples:
       |Email                |message |
       |anikethb02@gmail.com |Success:|

    @forgotpassfail
     Scenario Outline: Forgot password failure
       Given user is in login page
       When he clicks on forgot password link
       And he navigates to forgot password page
       And enter and send the email "<Email>"
       Then the email should be not sent and error message shown "<Emessage>"

       Examples:
         |Email        |Emessage|
         |abc@gmail.com|Error:  |

#    ==================Registration Page =========================

        @registrationSuccess
        Scenario Outline: user registration success

          Given user is in login page
          When he enters the "<fname>" "<lname>" "<emailadd>" "<password>" "<confirmpassword>" "<gender>"
          And accepts the terms and policy
          Then the user account should be created successfully

          Examples:
            |fname  |lname  |emailadd        |password  |confirmpassword |gender  |
#            |Alex   |Jackson|alex@gmail.com  |alex123   |alex123         |Male    |
            |Eric   |Jackson|eric@gmail.com  |eric123   |eric123         |Male    |

          @registrationfail
            Scenario Outline: User registration failure 1

            Given user is in login page
            When he enters the "<fname>" "<lname>" "<emailadd>" "<password>" "<confirmpassword>" "<gender>"
            And accepts the terms and policy
            Then the user account should not be created and error message is shown "<Errmsg>"


            Examples:
              |fname  |lname  |emailadd        |password  |confirmpassword |gender  |Errmsg                                             |
              |       |fery   |fery@gmail.com  |fery123   |fery123         | Female |Error:The first name field is required.×           |
              |Max    |       |fery@gmail.com  |fery123   |fery123         | Female |Error:The last name field is required.×            |
              |Max    |fery   |                |fery123   |fery123         | Female |Error:The email field is required.×                |
              |Max    |fery   |maxfery1234     |fery123   |fery123         | Female |Error:The email must be a valid email address.×    |
              |Max    |fery   |fery@gmail.com  |          |fery123         | Female |Error:The password field is required.×             |
              |Max    |fery   |fery@gmail.com  |fery123   |                | Female |Error:The re password field is required.×          |
              |Max    |fery   |fery@gmail.com  |fery123   |tery123         | Female |Error:The re password and password must match.×    |
              |Max    |fery   |fery@gmail.com  |fery123   |fery123         |        |Error:The customers gender field is required.×     |
              |       |       |                |          |                |        |Error:The first name field is required.×           |
              |Alex   |Jackson|alex@gmail.com  |alex123   |alex123         | Male   |Error:Email already exist!×                        |










