def call (name) {
	def scriptcontents = libraryResource "resource/src/${name}"
	writeFile file: "${name}", text: scriptcontents
	sh "chmod a+x ./${name}"
}
