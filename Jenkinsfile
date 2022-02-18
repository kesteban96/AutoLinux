pipeline {
    agent any

    stages {
        stage('Test') {
            steps {
                echo 'Inicica Ejecución'
                git branch: 'main', credentialsId: '90d8486d-92e6-4200-9f88-a496801393cd', url: 'https://github.com/kesteban96/AutomationGoogleJenkins'
                bat "gradlew clean build test --tests AutentificacionRunner"
            }
        }
    }
}