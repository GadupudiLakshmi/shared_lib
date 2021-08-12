def call (name) {
	def scriptcontents = libraryResource "${name} "
	writeFile file: "${name}", text: scriptcontents
	sh "chmod a+x ./${name}"
}
