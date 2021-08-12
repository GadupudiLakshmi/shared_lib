@Library ('sharedlib_test') _
pipeline {
	agent { label 'linux' }
	stages {
		stage ('test') {
			steps {
				helloextern ('name: Lakshmi');
			}
		}
	}
}
