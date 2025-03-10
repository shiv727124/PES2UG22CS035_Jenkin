pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building the application...'
                sh 'g++ -o hello_exec hello.cpp' // Compile the C++ file
            }
        }
        
        stage('Test') {
            steps {
                echo 'Testing the application...'
                sh './hello_exec'  // Run the compiled executable
            }
        }
        
        stage('Deploy') {
            steps {
                echo 'Deploying the application...'
            }
        }
    }

    post {
        failure {
            echo 'Pipeline failed! Please check the logs.'
        }
    }
}
