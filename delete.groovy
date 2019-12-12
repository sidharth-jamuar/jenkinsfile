#!/usr/bin/env groovy
// def job = Jenkins.instance.getItem("multi-step-pipeline")	
// 	job.getBuilds().each {
// 	if(it.result == Result.FAILURE){
// 	// Delete failed job
// 	it.delete()
// 	}
// 	}

def deleteBuilds(){
	println 'hello'
	def job = Jenkins.instance.getItem("delete-failed-builds")	
	job.getBuilds().each {
	if(it.result == Result.FAILURE){
	// Delete failed job
	it.delete()
	}
	}

}
return this