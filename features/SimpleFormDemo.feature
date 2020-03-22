@SimpleFormDemo
Feature: Fill in simple forms
Scenario Outline: Single Field Input
Given User navigates to simple form webpage
And User enters "<Message>" into "message" textbox
And User clicks on "show_message" button
Then User verifies "displayed_message" is displayed as "<Message>"


Examples: 
	|Message|
	|This is a message|