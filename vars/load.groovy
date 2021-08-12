def call (name) {
	sh "pwd"
	sh "ls -ltr"
	sh "ls -ltr resources/src"
	def scriptcontents = libraryResource "src/${name}"
	writeFile file: "${name}", text: scriptcontents
	sh "chmod a+x ./${name}"
}
