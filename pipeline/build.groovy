#!groovy

node {
	
	stage('Run Shell Script') {
		steps.sh "echo 'Test me ...'"
		
	}	
}