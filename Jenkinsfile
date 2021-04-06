pipeline {
    tools {
        maven "Maven 3.6.3"
        dockerTool 'Docker'
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
                            sh 'docker build -t bobzoid/the-random-person:1.2 .'
                            sh 'docker push bobzoid/the-random-person:1.2'
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
