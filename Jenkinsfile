pipeline {
    agent {
        docker {
            image 'maven:3-alpine' 
            args '-v /root/.m2:/root/.m2' 
        }
    }
    stages {
        stage('Build & SonarQube') { 
            steps {
    	//        withSonarQubeEnv('http://admin:admin@localhost:19000') {
                sh 'mvn -B -DskipTests clean package' 
		}
            }
        }
    }
}
