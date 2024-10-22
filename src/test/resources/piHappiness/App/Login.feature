Feature: Login to piHappiness Application

@Test
  Scenario Outline: Login with different credentials
    Given User is on the login page
    When User enters "<username>" and "<password>"
    Then User should be redirected to the homepage or get an error message

    Examples:
      | username      | password      |
      | marteena.kezia@paraminfo.com    | wqmb4747DC    |
      | invalid_user  | invalid_pass  |
    