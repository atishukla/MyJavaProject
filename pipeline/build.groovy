#!groovy

	

	stage 'Checkout' {

		node {
			checkout scm
		}    	
	}


	stage 'Run Shell Script' {
		sh 'script/runscript.sh'	
	}			
		
