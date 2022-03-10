CLASSPATH = lib/*:.

TryCommonMark.class: TryCommonMark.java
		javac -g -cp $(CLASSPATH) TryCommonMark.java

MarkdownParseTest.class: MarkdownParseTest.java
		javac -cp $(CLASSPATH) MarkdownParse.java

MarkdownParse.class: MarkdownParse.java
		javac -cp $(CLASSPATH) MarkdownParse.java

test: MarkdownParse.class MarkdownParseTest.class
		java -cp $(CLASSPATH) org.junit.runner.JUnitCore MarkdownParseTest