Feature: Media Click

  Scenario: Verify the navigation to Media page
    Given User is on Demo App Home Page
    When User click on Media Button
    Then User should be navigated to Media Page
    When User click MediaPlay button
    Then User should be taken to Media Player page