#Autor: Claudia Nieto
#Email: cmarce86@yahoo.es
#language: en

@All
Feature: Validate shopping cart
  As a user of Exito
  I want to access the app
  To purchase online

  Background: Access to the main platform
    Given that I access the app of the Exito


  @CaseRegister
  Scenario Outline: Validate the registration in the app
    When I register in the app
      | <names> | <lastNames> | <documentType> | <yearBirth> | <monthBirth> | <dayBirth> | <cellPhoneNumber> | <email> |
    Then verify that the registration is successful in the app

    Examples:
      | names        | lastNames | documentType | yearBirth | monthBirth | dayBirth | cellPhoneNumber | email                   |
      | Pepito Exito | Diaz      | CC           | 1999      | 06         | 01       | 310000000       | PepitoExito@yopmail.com |


  @CaseShoppingCart
  Scenario Outline: Validate the registration in the app
    When I log in and select items to purchase
      | <email> | <password> | <productCategory> | <productName> |
    Then Verification of the items in my shopping cart

    Examples:
      | email                   | password        | productCategory | productName                                        |
      | julioprueba@yopmail.com | Julioprueba123- | Televisores     | Televisor HYUNDAI 50 Pulgadas QLED Uhd-4K Smart TV |
