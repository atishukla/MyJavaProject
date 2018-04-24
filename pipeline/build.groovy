#!groovy

node {	
	stage('Run Shell Script') {
		sh 'pwd'
		steps.sh "script/runscript.sh"
	}	
}