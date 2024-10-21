#Author : Ameni
Feature: Practice Automation login page

Scenario: login with valid credentials 
Given Admin is on login page
When Admin enter correct user name and correct password
Then Admin is directed to the homepage 