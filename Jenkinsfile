pipeline {
    agent any
    
  
    
    stages {
    	 
	 
	   stage ('Build & Unit test'){
		    steps {
			withMaven(globalMavenSettingsConfig: '', jdk: '', maven: 'Maven', mavenSettingsConfig: '', traceability: true) {
   				sh 'mvn clean install'
			}
			}
   	    }
	
	   stage ('Integration Test'){
	        steps {
    			sh 'mvn clean verify';
			
      		}
        }	
    }
}
