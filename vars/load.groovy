def call (name) {
	def scriptcontents = libraryResource "shared_lib/resource/${name} "
	writeFile file: "${name}", text: scriptcontents
	sh "chmod a+x ./${name}"
}
