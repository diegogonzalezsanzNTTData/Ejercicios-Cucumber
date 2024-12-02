Feature: Validate presence of vehicles in a list

  Scenario Outline: Check if specific vehicles are present
    Given a list of vehicles <vehicles>
    And the vehicle introduce is "<vehicle>"
    When I check for the presence of vehicle
    Then it should be determined that the presence of vehicle: <result>

    Examples:
      | vehicles                   | vehicle    | result |
      | [car, bike, bus]           | bus        | true   |
      | [truck, van]               | motorcycle | false  |
      | [bicycle, scooter]         | bicycle    | true   |
      | [airplane, helicopter]     | jet        | false  |
      | [skateboard, rollerblades] | skateboard | true   |
      | [train, tram]              | tram       | true   |
      | [boat, yacht]              | ship       | false  |
