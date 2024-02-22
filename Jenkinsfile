pipeline {
    agent any
    
  
    
    stages {
    	 
	 
	   stage ('Build & Unit test'){
		    steps {
			withMaven(globalMavenSettingsConfig: '', jdk: '', maven: 'Maven', mavenSettingsConfig: '', traceability: true) {
   				sh 'mvn test -DskipITs=true'				
			}
			}
   	    }
	
	   stage ('Integration Test'){
	        steps {
			withMaven(globalMavenSettingsConfig: '', jdk: '', maven: 'Maven', mavenSettingsConfig: '', traceability: true) {
				sh 'mvn -skip.ut=true verify'
    			
			}
      		}
        }	
    }
}
