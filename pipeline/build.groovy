#!groovy

node {	
	stage('Run Shell Script') {
		sh 'ls'
		sh "script/runscript.sh"
	}	
}