pipeline {
    agent any

    stages {
        stage ('Compile Stage') {

            steps {
                
                    echo 'mvn clean compile'
                
            }
        }

        stage ('Testing Stage') {

            steps {
                
                    echo 'mvn test'
                
            }
        }


        stage ('Deployment Stage') {
            steps {
               
                    echo 'mvn install'
                
            }
        }
    }
}
