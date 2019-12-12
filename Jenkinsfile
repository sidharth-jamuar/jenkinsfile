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
  stage('Cleanup') {
    try{
    code.deleteBuilds()
    }
    catch(Exception err){
        currentBuild.result="FAILURE"
        currentBuild.delete();
    }
  }
  post {
    always {

        cleanWs()
    }
    success{

    }
    failure {
        
        cleanWs()
    }
    cleanup{
       
        cleanWs()
    }
}
}
