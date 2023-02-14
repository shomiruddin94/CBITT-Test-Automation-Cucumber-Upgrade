Feature: Search

Description: ICRP Search Database

@Smoke @uddins2
Scenario: User searchs by search term
Given user on ICRP home page
When user clicks ICRP data
And user clicks search database 
And user searchs by "Cost" in search terms
And user selects any of the keywords  
And user clicks search
Then study titled "Glioma organoids as patient avatars to improve precision medicine" is displayed

#failed
@Smoke @uddins2 
Scenario: User searches with default parameters 
Given user on ICRP home page 
When user clicks ICRP data
And user clicks search database
And user clicks search
Then "Total Base Projects: 6,156 /" and "Total Projects: 6,783" displays


@Smoke @uddins2 
Scenario: User searches by Institution
Given user on ICRP home page 
When user clicks ICRP data
And user clicks search database
And user searchs "University of Colorado Denver"
And user clicks search
Then projects with institution as "University of Colorado Denver" display

@Smoke @uddins2 
Scenario: User searches by funding organization
Given user on ICRP home page
When user clicks ICRP data
And user clicks search database
And user selects Alexs Lemonade Stand Foundation
And user clicks search
Then projects funded by Alexs Lemonade Stand Foundation displays

@Smoke @uddins2
Scenario: User searchs by cancer type 
Given user on ICRP home page
When user clicks ICRP data
And user clicks search database
And user selects cancer type as brain tumor
And user clicks search
Then projects with cancer type as Brain Tumor display

#failed
@Smoke @uddins 
Scenario: User resets search
Given user on ICRP home page
When user clicks ICRP data
And user clicks search database
#And user selects exact phrase provided 
#Then exact phrase provided is selected
When user clicks reset 
#Then exact phrase provided is unselected

#failed
@Smoke @uddins2 
Scenario: User clears search 
Given user on ICRP home page
When user clicks ICRP data
And user clicks search database
And user clicks clear  
And user clicks search
Then all projects are displayed 

@Smoke @uddins2 
Scenario: user searchs by common scientific outline research area
Given user on ICRP home page
When user clicks ICRP data
And user clicks search database
And user selects normal functioning 
And user clicks search
Then projects with research area as normal functioning display
