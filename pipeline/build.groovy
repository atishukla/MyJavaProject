#!groovy

node {	

	stage 'Checkout'
    checkout scm


	stage 'Run Shell Script' 	
	steps.sh 'script/runscript.sh'		
		
}