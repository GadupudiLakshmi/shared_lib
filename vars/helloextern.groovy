def call (name) {
	load ('hellotest.sh')
	sh "./hellotest.sh ${name}"
}
