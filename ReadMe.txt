#Description: Design In-Memory storage for recently played songs that can accommodate N song per user.
			  It should able to fetch recently played song and eliminate least recently played song when
			  storage becomes full.
			 
#Project Structure:
	Main Package
		Common	
			baseClass : which is used to add element in Queue i.e. original song list S1, S2 and S3
			commonMethods : used to enQueue and deQueue the elements in Queue and to show
	
	Test Package
		testCase
			songsPlayed : class is used to tests the login for newly played songs i.e S4, S2 and finally S1
			
	MAVEN Dependency : Added only required jars
	
	POM.xml
		
	TestNG.xml
	
#Pre-requisite:
	MAVEN installation
	Import project

#Command for execution:
	Navigate to particular project path
	Open command line and hit mvn test command
	
#Note: I have solved above problem using Queue.