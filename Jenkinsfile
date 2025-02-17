pipeline {
    agent any

    tools {
        gradle 'G1'
    }

    stages {
        stage('Build') {
            steps {
                sh './gradlew clean build'
            }
        }
        stage('Test') {
            steps {
                sh './gradlew test'
            }
        }
        stage('Deploy') {
            steps {
                sh './gradlew herokuDeploy'
            }
        }
    }
}
