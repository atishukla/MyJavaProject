#!groovy

node {	

	stage 'Checkout' {
    	checkout scm
	}


	stage 'Run Shell Script' {
		sh 'script/runscript.sh'	
	}			
		
}