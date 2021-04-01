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
                withCredentials([usernamePassword(credentialsId: 'docker-hub', usernameVariable: 'USER', passwordVariable: 'PASS')])
                        {
                            sh 'docker login -u $USER -p $PASS'
                            sh 'docker build -t bobzoid/the-random-person:the-random-person .'
                            sh 'docker push bobzoid/the-random-person'
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
