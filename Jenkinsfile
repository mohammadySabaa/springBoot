pipeline {
    agent any

    tools {
    maven 'maven3'
    }

    environment {
        DOCKER_IMAGE = "springBoot"
    }

    stages {
//         stage('checkout from github') {
//             steps {
//                 checkout SCM
//             }
//         }

        stage('package') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('create docker image') {
            steps {
                script {
                    docker_image = docker.build("${env.DOCKER_IMAGE}" , '-f ./Dockerfile .')
                }
            }
        }

        stage('RUN application container') {
            steps {
                sh "docker run -d -p 9092:9092 --name springBoot ${DOCKER_IMAGE}"
            }
        }
    }
}