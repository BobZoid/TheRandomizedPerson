pipeline {
    tools {
        maven "Maven 3.6.3"
        docker 'Docker'
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
                            sh 'docker build -t bobzoid/the-random-person:1.1 .'
                            sh 'docker push bobzoid/the-random-person:1.1'
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
