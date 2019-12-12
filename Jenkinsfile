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
    stage('Execute'){
        sh 'echo "new"'
    }
  post {
    always {
currentBuild.delete();
        cleanWs()
    }
    success{

    }
    failure {
         currentBuild.delete();
        cleanWs()
    }
    cleanup{
       
        cleanWs()
    }
}
}


// pipeline={
//     stage('Checkout') {
//     checkout scm
//   }

//   stage('Load') {
//       sh 'echo "hi"'
//   }
//     stage('Execute'){
//         sh 'echo "new"'
//     }
// }
// postFailure={
//     currentBuild.delete()
// }
// postAlways={
//     currentBuild.delete()
// }
// node{
//     try {
//         pipeline()
//     } catch (e) {
//         postFailure()
//         throw e
//     } finally {
//         postAlways()
//     }
// }