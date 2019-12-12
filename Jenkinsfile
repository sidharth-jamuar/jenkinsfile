// def code;
// pipeline{
//     agent any
//     tools{
//         nodejs "node"
//     }
//         stages{
//             stage("Build"){
//                 steps{
//                      code= load 'delete.groovy';
//                       code.deleteBuilds();
//                 }
//             }
           
//         }
// }


// def code

// node() {
//   stage('Checkout') {
//     checkout scm
//   }

//   stage('Load') {
//       sh 'echo "hi"'
//     code = load 'delete.groovy'
//   }
//     stage('Execute'){
//         sh 'echo "new"'
//     }
//   stage('Cleanup') {
//     code.deleteBuilds()
//   }
//   post {
//     always {
// deleteDir()
//         cleanWs()
//     }
//     success{

//     }
//     failure {
//         deleteDir()
//         cleanWs()
//     }
//     cleanup{
//         deleteDir()
//         cleanWs()
//     }
// }
// }

pipeline {
    agent any
    stages {
        stage('Example') {
            steps {
                echo 'Hello World'
            }
        }
    }
    post {
        always {
            cleanWs()
            deleteDir()
        }
    }
}
