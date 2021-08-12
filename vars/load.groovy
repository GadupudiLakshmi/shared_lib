def call (name) {
	def scriptcontents = libraryResource "../resouce/src/${name}"
	writeFile file: "${name}", text: scriptcontents
	sh "chmod a+x ./${name}"
}
