def call (Map config = [:]) {
	def scriptcontents = libraryResource "jenkins/shared_lib/resource/${config.name} "
	writeFile file: "${config.name}", text: scriptcontents
	sh "chmod a+x ./${config.name}"
}
