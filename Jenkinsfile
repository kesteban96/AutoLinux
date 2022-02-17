pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
                git branch: 'main', credentialsId: '90d8486d-92e6-4200-9f88-a496801393cd', url: 'https://github.com/kesteban96/AutomationGoogleJenkins'
            }
        }
    }
}
