pipeline {
    agent {
        docker {
            image 'maven:3-alpine' 
            args '-v /root/.m2:/root/.m2' 
        }
    }
    stages {
        stage('Build') { 
            steps {
    	        withSonarQubeEnv('http://localhost:19000') {
                sh 'mvn -B -DskipTests clean package sonar:sonar' 
		}
            }
        }
    }
}
