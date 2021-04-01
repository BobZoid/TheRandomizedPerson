pipeline {
    tools {
        maven "maven"
    }
    agent any

    stages {
        stage('Build') {
            steps {
                sh 'java --version'
                sh 'mvn clean compile'
            }
        }
        stage('Package') {
            steps {
                sh 'mvn package'
            }
            post {
                success {
                    archiveArtifacts 'target/*.jar'
                }
            }
        }
    }
}
