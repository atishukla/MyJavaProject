#!groovy

node {	
	stage('Run Shell Script') {
		sh 'ls -la'
		steps.sh "script/runscript.sh"
	}	
}