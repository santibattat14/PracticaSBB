ficheroJar := catalogo.jar

limpiar:
	rm -f $(ficheroJar)	
	rm -rf bin
compilar:limpiar

	mkdir bin
	find . -name "*.java" | xargs javac -cp bin -d bin

jar:compilar
	jar cvfm $(ficheroJar) manifest.txt -C bin .

jar:ejecutar
	java -cp catalogo.jar aplicacion.Principal add Mercedes azul 345 5