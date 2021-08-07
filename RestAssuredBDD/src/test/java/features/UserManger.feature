Feature: Validate User Management with reqres Api's

Scenario: Verify the user information is updated using Update API
	Given Update API payload
	When user calls "updateApi" to update the infromation
	Then the API is success with status code 200
	And status in the response is id