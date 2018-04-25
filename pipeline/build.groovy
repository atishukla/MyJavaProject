#!groovy	

node() {
	stage ('Check out code') {checkout scm}
	

	stage ('Run Shell script') {
		sh 'sh script/runscript.sh'
	}
}
