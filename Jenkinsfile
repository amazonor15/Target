pipeline{
    agent any
    stages{
        stage('version'){
         steps{
            zsh 'mvn -version'
            
        }   
        }
         stage('clean'){
         steps{
            zsh 'mvn clean'
            
        }   
        }
         stage('install'){
         steps{
            zsh 'mvn package'
            
        }   
        }  
    }

    
}