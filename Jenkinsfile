pipeline{
    agent any
    stages{
        stage('version'){
         steps{
            sh 'mvn -version'
            
        }   
        }
         stage('clean'){
         steps{
            sh 'mvn clean'
            
        }   
        }
         stage('install'){
         steps{
            sh 'mvn package'
            
        }   
        }  
    }

    
}