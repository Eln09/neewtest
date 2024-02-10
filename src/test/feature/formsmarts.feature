Feature: validate formsmarts page

  @Regression
  Scenario: fill formsmarts contact form
    Given user Launch formsmarts site
    Then user scrolls until contact form sample
    Then fills form with firstname,lastname,email,inquiry

    @Smoke
  Scenario Outline:fill details inform using feature file
  Given user Launch formsmarts site
  Then user scrolls until contact form sample
  Then fills form with "<firstname>","<lastname>","<email>","<inquiry>"
    Examples:
      |firstname|lastname|email|inquiry|
      |Elena|Alas|random@gmail.com|theinquirytext|
      |Elena2|Alas2|random2@gmail.com|theinquirytext2|


