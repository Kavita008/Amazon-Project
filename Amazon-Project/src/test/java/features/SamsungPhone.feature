Feature:Filter Samsung phones by camera resolution, model year, and price range



@SmokeTest
Scenario:Verify Samsung phones with specific specifications
    Given the user navigate to Amazon Uk homepage
    Then the user click on all button
    And the user navigate to Electronics & Computers
    When the user navigate to Phones and Accessories
    Then the user should land on "Smartphones"  Page
    And the user click on Mobile Phones & Smartphones
    And the user click on samsung box under featured brands
    And user apply filter for Model Year 2023
    And user apply filter for Camera Resolution 20 MP and above
    And user apply filter for Price Range between £50 - £100 under Price
    And user click on go
    Then user should see a "Results" that match the criteria






