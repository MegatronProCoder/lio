
runPrompt : compile 
	java -cp java com.interpreter.Lox

run : compile
	java -cp java com.interpreter.Lox $(File)
	
tool : 
	javac java/com/interpreter/tool/*.java
	java -cp java com.interpreter.tool.GenerateAst $(outputDir)

compile : 
	javac java/com/interpreter/*.java

clean :
	rm -v java/com/interpreter/*.class | rm -v java/com/interpreter/tool/*.class