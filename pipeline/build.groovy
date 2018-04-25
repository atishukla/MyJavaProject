#!groovy	

node() {
	stage 'Checkout SCM' {checkout scm}

	stage 'Run Shell script' {
		sh 'script/runscript.sh'
	}
}
