#!groovy

node {	
	stage('Run Shell Script') {
		sh 'ls'
		sh 'cd script'
		sh "script/runscript.sh"
	}	
}