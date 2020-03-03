pipeline{
agent any
stages{
stage('version'){
steps{
step
sh 'mvn -version'
}
}
stage('clean'){
steps{
step
sh 'mvn clean'
}
}
stage('test'){
steps{
step
sh 'mvn test'
}
}
stage('install'){
steps{
step
sh 'mvn package'
}
}
}}
