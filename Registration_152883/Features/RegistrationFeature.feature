Feature: Registration Feature

@register
Scenario: user is trying to register without entering details
Given user is on personal details  registration page
Then  personal details page should load with tile 'Personal Details'

    When user will click on next without entering First Name
    Then 'Please fill the First Name' message should display
    
    When user will click on next without entering Last Name
    Then 'Please fill the Last Name' message should display
    
    When user will click on next without entering Email
    Then 'Please fill the Email' message should display
    
    When user will click on next without entering Contact no.
    Then 'Please fill the Contact No.' message should display
    
    When user will click on next without entering valid Contact no. 
    Then 'Please enter valid Contact no.' message should display
    
    When user will click on next without entering address line 1.  
    Then 'Please fill the address line 1' message should display
    
    When user will click on next without entering addressline 2. 
    Then 'Please fill the address line2' message should displays
    
    When user will click on next without selcting City
    Then 'Please select city' message should display
    
    When user will click on next without selecting State
    Then 'Please select state' message should display
    
     When user will click on next by entering all valid details 
    Then 'Personal details are validated accepted successfully.' message should display
    And navigates to the 'Educational Details' page
    
     When user is on educational details page
    Then  registration page should load with tile 'Education Details'
    
    When user will click on register me without selecting graduation
    Then 'Please Select Graduation' message should dispaly
    
    When user clicks on register me without entering percentage
    Then 'Please fill Percentage detail' message should display
    
     When user clicks on register me without entering passing year
    Then 'Please fill Passing Year' message should display
    
     When user clicks on register me without entering project name
    Then 'Please fill Project Name' message should display
    
     When user clicks on register me without selecting technologies used
    Then 'Please Select Technologies Used' message should display
    
     When user clicks on register me without entering other technologies
    Then 'Please fill othe Technologies Used' message should display
    
     When user clicks on register me with valid details
     Then 'Your Registration Has succesfully done plz check you registerd email for account activation link!!!' message should dispaly
    
   
    

