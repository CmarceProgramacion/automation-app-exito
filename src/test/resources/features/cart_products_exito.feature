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
      | julioprueba@yopmail.com | Julioprueba123- |


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
    When I select items to purchase
      | <productCategory> | <productName> | <country> | <store> |
    Then Verification of the items in my shopping cart
      | <productName> |

    Examples:
      | productCategory | productName                                           | country | store                  |
      | Televisores     | Televisor HISENSE 43 Pulgadas LED Fhd Smart TV 43A4HV | Pereira | Exito Pereira Victoria |