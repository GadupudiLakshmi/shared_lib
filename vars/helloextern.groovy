def call (Map config = [:]) {
	load {name: 'hellotest.sh'}
	sh "./hellotest.sh ${config.name}"
}
