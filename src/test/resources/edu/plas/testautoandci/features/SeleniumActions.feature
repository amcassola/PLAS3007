@actions
Feature: Selenium Actions

  Background:
    Given I navigate to http://40.127.132.250:8090/

  Scenario Outline: Parking selection
    When <option_text> is selected
    Then <option_text> and <code> are displayed
  Examples:
    | option_text               | code |
    | Short-Term Parking        | STP  |
    | Economy Parking           | EP   |
    | Long-Term Surface Parking | LTS  |
    | Long-Term Garage Parking  | LTG  |
    | Valet Parking             | VP   |

  Scenario: Hover over 'Hover over me!'
    When the 'Hover over me!' element is hovered over
    Then Some additional text is displayed
    When the 'Hover over me!' element is hovered away from
    Then No additional text is displayed

  Scenario: Click 'Click me to Google!'
    When the 'Click Me to Google!' link is clicked
    Then the Google Search window is opened
    When the Google Search window is closed
    Then the 'Click Me to Google!' is underlined

  Scenario: IFraming
    Then the first level IFrame contains the text 'This page is displayed in an iframe'
    And the second level IFrame contains the text 'This page is displayed in an iframe with another iframe'
    And there are '6' horizontal rule lines in the main HTML document

  Scenario Outline: Accepting Alerts
    When the 'Press me, press me!' button is clicked
    Then an alert is displayed
    When I <action> the alert
    Then '<text>' is displayed
  Examples:
    | action  | text                |
    | accept  | You pressed OK!     |
    | dismiss | You pressed Cancel! |

  Scenario: Dragging and dropping
    When the image is dragged and dropped into the box
    Then the image is displayed inside the box
