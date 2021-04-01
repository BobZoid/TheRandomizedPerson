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
                node {
                    git '…'
                    def newApp = docker.build "bobzoid/random-person:${env.BUILD_TAG}"
                    newApp.push()
                }

            }
            post {
                success {
                    archiveArtifacts 'target/*.jar'
                }
            }
        }
    }
}
