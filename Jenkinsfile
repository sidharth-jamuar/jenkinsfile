def code;
pipeline{
    agent any
    tools{
        nodejs "node"
    }
        stages{
            stage("Build"){
                steps{
                    sh 'node -v'
                    sh 'node ./index.js'
                }
            }
            stage('load'){
                steps{
                   code= load 'delete.groovy'
                }
            }
            stage('execute'){
                steps{
                code.deleteBuilds();
                }
            }
        }
}