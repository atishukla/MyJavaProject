#!groovy

node {	
	stage('Run Shell Script') {
		steps.sh "./script/runscript.sh"
	}	
}