pipeline {
    agent any
    
    stages {
        stage('Build') {
            steps {
                intentional errorlsadasdasf in for while eles if  if if 
                echo 'Cloning the repository...'
                git 'https://github.com/dantesbane/PES2UG21CS275_jenkins'
                script {
                    // Assuming your .cpp file is located at the root of the repository
                    sh 'g++ -o output_file_name your_cpp_file.cpp'
                }
            }
        }
        
        stage('Test') {
            steps {
                echo 'Running tests...'
                // Add test commands here, e.g., 'mvn test'
            }
        }
        
        stage('Deploy') {
            steps {
                echo 'Deploying the application...'
                // Add deployment commands here, e.g., 'kubectl apply -f deployment.yaml'
            }
        }
    }
    
    post {
        success {
            echo 'Pipeline executed successfully!'
            // Add any post-success actions here
        }
        failure {
            echo 'Pipeline execution failed!'
            // Add any post-failure actions here
        }
    }
}
