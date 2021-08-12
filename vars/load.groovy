def call (name) {
	sh "pwd"
	sh "ls -ltr"
	def scriptcontents = libraryResource "resource/src/${name}"
	writeFile file: "${name}", text: scriptcontents
	sh "chmod a+x ./${name}"
}
