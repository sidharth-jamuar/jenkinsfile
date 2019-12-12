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
def code

node() {
  stage('Checkout') {
    checkout scm
  }

  stage('Load') {
      sh 'echo "hi"'
    code = load 'delete.groovy'
  }

  stage('Execute') {
    code.deleteBuilds()
  }
}
