pipeline{
    agent any
    tools{
        nodejs "node"
    }
        stages{
            stage("Build"){
                steps{
                    sh 'node -v'
                    sh './delete.groovy'
                }
            }
        }
}