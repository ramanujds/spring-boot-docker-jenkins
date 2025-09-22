pipeline {
    agent any

    tools {
        maven "maven"
    }

    stages {
        stage('Pull Repository') {
            steps {
                git branch: 'main', url: 'https://github.com/ramanujds/spring-boot-docker-jenkins'
                echo 'Repository Pulled'
            }
            }
        stage('Run unit tests') {
            steps {
                sh 'mvn test'
                echo 'Unit Tests Completed'
            }
            }
        stage('Build docker image') {
            steps {
                sh 'docker build -t springboot-app .'
                echo 'Docker Image Built'
                sh 'docker images'
            }
            }


        }
    }
}
