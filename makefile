CLASSPATH = lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar:lib/commonmark-0.18.1.jar:.

MarkdownParseTest.class: MarkdownParseTest.java
		javac -cp .:lib/junit-4.13.2.jar:lib/hancreset-core-1.3.jar MarkdownParse.java

MarkdownParse.class: MarkdownParse.java
		javac -cp .:lib/junit-4.13.2.jar:lib/hancrest-core-1.3.jar MarkdownParse.java

test: MarkdownParse.class MarkdownParseTest.class
		java -cp .:lib/junit-4.13.2.jar:lib/hancrest-core-1-3.jar org.junit.runner.JUnitCore MarkdownParseTest