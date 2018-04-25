#!groovy	

node() {
	checkout scm

	stage ('Run Shell script') {
		sh 'script/runscript.sh'
	}
}
