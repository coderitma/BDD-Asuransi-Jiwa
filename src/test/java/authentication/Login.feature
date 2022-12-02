Feature: Authentication 02

  Scenario: Auth 02
    Given masuk ke halaman login "https://demo.guru99.com/insurance/v1/index.php"
    When mengisi email "yanzen@mail.com"
    And mengisi password "123qwe"
    And klik login
    Then berada di halaman dashboard "Broker Insurance WebPage"