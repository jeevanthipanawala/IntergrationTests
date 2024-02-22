pipeline {
    agent any
    
  
    
    stages {
    	 
	 
	   stage ('Build & Unit test'){
		    steps {
			withMaven(globalMavenSettingsConfig: '', jdk: '', maven: 'Maven', mavenSettingsConfig: '', traceability: true) {
   				sh 'mvn install -DskipITs=true'
				//sh 'mvn clean verify -DskipITs=true';
		      	//junit '**/target/surefire-reports/TEST-*.xml'
		      	//archiveArtifacts  'target/*.jar'
			}
			}
   	    }
	
	   stage ('Integration Test'){
	        steps {
			withMaven(globalMavenSettingsConfig: '', jdk: '', maven: 'Maven', mavenSettingsConfig: '', traceability: true) {
				sh 'mvn -Dskip.ut=true verify'
    			
			}
      		}
        }	
    }
}
