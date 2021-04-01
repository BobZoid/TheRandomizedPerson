pipeline {
    tools {
        maven "maven"
        dockerTool "docker"
    }
    agent { dockerfile true }

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
                sh 'docker build .'
            }
            post {
                success {
                    archiveArtifacts 'target/*.jar'
                }
            }
        }
    }
}
