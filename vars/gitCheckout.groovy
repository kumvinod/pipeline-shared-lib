def call(Map stageParams){
	checkout([
		$class:'GitSCM',
		branches:[[name:stageParams.branch]],
		useRemoteConfigs:[[url:stageParams.url]]
	])
}
