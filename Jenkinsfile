// def code;
// pipeline{
//     agent any
//     tools{
//         nodejs "node"
//     }
//         stages{
//             stage("Build"){
//                 steps{
//                     echo 'hi'
//                 }
//             }
           
//         }
//         post{
//             always{
                
//             }
//             failure{
//                 currentBuild.delete()
//             }
//         }
// }


def code
def build_res=true
node() {
  stage('Checkout') {
    checkout scm
  }

  stage('Load') {
      sh 'echo "hi"'
    code = load 'delete.groovy'
  }
    stage('Execute'){
        try{
        sh 'echo "new"'
       
        }
        catch(Exception err){
        build_res=false
        }
    }
    stage('cleanup'){
        if(build_res==false){
            currentBuild.delete()
        }
        echo 'true'
    }

}

//   post {
//     always {

//         cleanWs()
//     }
//     success{

//     }
//     failure {
//          currentBuild.delete();
//         cleanWs()
//     }
//     cleanup{
       
//         cleanWs()
//     }
// }
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