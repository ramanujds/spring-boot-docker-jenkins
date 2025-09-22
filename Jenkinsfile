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

        stage('Push to DockerHub') {
            steps {
                withCredentials([string(credentialsId: 'dockerhub_token', variable: 'dockerhub_token')]) {
                    sh 'docker login -u ram1uj -p $dockerhub_token'
                }
                sh 'docker tag springboot-app ram1uj/springboot-app:latest'
                sh 'docker push ram1uj/springboot-app:latest'
                echo 'Docker Image Pushed to DockerHub'

                }


        }
        }

}
