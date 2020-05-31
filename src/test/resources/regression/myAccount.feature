Feature: MyAccount

      @1
      Scenario Outline: Profile
        Given user logged on to home page
        And click on profile tab
        And Enter "<First Name>" "<Last Name>"
        And Enter "<Gender>" "<DOB>" "<Phone Number>"
        And click on update
        Then Profile should update
        Examples:
          | First Name    | Last Name | Gender |DOB|Phone Number|
          |blacklabel     | whisky    |M    |01.01.1990|2489635216|
        @2
        Scenario: Shipping Adddress
        #  Given user logged on to home page
          Given user on the profile page
          And click on Shipping Address
          And Enter First Name Last Name
          And shipping address and postal code
          And select country state and city
          And click on Add Address
          Then address should add sucessfully
          @3
          Scenario: Wishlist
            Given user on home
            And hover to desired product
            And click on wishlist button
            When clicked product added to wishlist
            Then desired products should appear in wishlist page





