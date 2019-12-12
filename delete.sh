def job = Jenkins.instance.getItem("multi-step-pipeline")	
	job.getBuilds().each {
	if(it.result == Result.FAILURE){
	// Delete failed job
	it.delete()
	}
	}
