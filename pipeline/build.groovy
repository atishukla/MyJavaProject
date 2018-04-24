#!groovy

node {	
	stage('Run Shell Script') {
		dir(script) {
			sh "script/runscript.sh"
		}		
	}	
}