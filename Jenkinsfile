pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World !'
            }
        }
        
        stage('Checkout GIT') {
            steps {
                echo 'Pulling...'
                git branch: 'master', url: 'https://github.com/mhassini/timesheet-devops.git'
            }
        }
    
        stage('Testing Maven') {
            steps {
                sh 'mvn -version'
            }
        }

        stage('Build Maven Project') {
            steps {
                echo 'Building Maven Project...'
                sh 'mvn clean package -DskipTests'
            }
        }
    }
}
