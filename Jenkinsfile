pipeline {
    agent any

    tools {
    maven 'maven3'
    }

    environment {
        DOCKER_IMAGE = "springBoot"
    }

        stage('RUN application container') {
            steps {
                sh "docker run -d -p 9092:9092 --name springBoot ${DOCKER_IMAGE}"
            }
        }
}
    