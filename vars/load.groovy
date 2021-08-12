def call (name) {
	def scriptcontents = libraryResource "Jenkins/shared_lib/resource/${name} "
	writeFile file: "${name}", text: scriptcontents
	sh "chmod a+x ./${name}"
}
