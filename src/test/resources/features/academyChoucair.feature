#Autor: AAR
  @stories
  Feature:Utest.com
    I want to register as a user in U Test, the largest community of testers in the world

  @Scenario1:
  Scenario: Register on the webside
    Given Alejo wants to register on the uTest site
    When  he enters the data to register on the page
    |strName |strLastName | strEmail | strCity| strZip| stPassword|strConfirmPassword|
    | Alejandro | Aguirre Ruiz | aguirreruiz200145@gmail.com | Medellin | 050036 | Alejandroaguirre258 |Alejandroaguirre258 |
    Then successful registration
      | reference |
      | Welcome to the world's largest community of freelance software testers! |