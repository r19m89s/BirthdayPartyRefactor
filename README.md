# BirthdayPartyRefactory
I have refactored the included code base located here: https://github.com/jtj/BirthdayPartyRefactor by performing the following:
 - Functionality added to increase maintainability:
    - Created classes for each of the following objects:
      - CakeOrder
      - BalloonsOrder
      - Order
    - Rewrote functionality constructing objects from printing objects to storing built objects.
    - Redefined the Order parameters to be passed as arrays.
- Added the following tests:
    - Validating correct construction of the BalloonsOrder
    - Validating correct construction of the CakeOrder
    - Validating correct construction of the total order.
    - Isolated validation of the individual sub-objects to aid with readability. 
