Feature: Search Functionality to compare courses

Background:
Given user is logged in to the Shiksha application

    @Compare
    Scenario Outline: Select Courses to compare
 
    When User clicks on Shiksha online  
    And Click on the search bar 
    And Enter the name of the <Course>
    And Clicks on Search button
    And Select courses to compare
    And Clicks on compare courses button
    And Clicks on Compare Now button
    Then Comparison between Selected Courses are displayed
    
    Examples:
    |Course|
    |Google Analytics|
    
    @Add_Budget
    Scenario: user wants to add budget
    
    When User clicks on profile icon 
    And click on profile
    And ScrollLeft for add budget button
    And Enter details
    | year | city  |
    | 2024 | Indore|
    And clicks on save button
    Then Record sucessfully added message is displayed
   
    @Edit_Profile
    Scenario Outline: User wants to edit profile details
    
    When User clicks on profile icon 
    And click on profile
    And click on three dots
    And click on edit personal details
    And Enter <name> and <achievements>
    And clicks on save button
 
    Examples:
    |name|achievements|
    | Gupta|I have played a significant role in aiding education by providing personalized learning experiences|
 
    @Select_Course
    Scenario Outline: User wants to save courses
    
    When User clicks on Study Abroad Home
    And click on Search button
    Then click on selected course

    @All_Location
    Scenario: User is unable to click on All Location
    
    When Scroll down to All Location
    Then Click on All Location
 
  