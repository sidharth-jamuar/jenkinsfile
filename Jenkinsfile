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
                     code= load 'delete.groovy'
                      code.deleteBuilds();
                }
            }
           
        }
}