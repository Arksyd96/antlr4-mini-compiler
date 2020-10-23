# ANTLR4 Mini-compiler
A small compiler created with ANTLR4 using Java
With the help of [**Dastamn**](https://github.com/Dastamn/)

### How to install :
1. Obtain a copy of antlr-4.x-complete.jar from the [link](https://www.antlr.org/download.html)
2. Save it somewhere you'll remember, ex : *Javalib\antlr-4.x-complete.jar*
3. Add the .jar to the `CLASSPATH` variable
4. Make grun.bat and antlr.bat
```
java org.antlr.v4.Tool %*
```
```
@ECHO OFF
SET TEST_CURRENT_DIR=%CLASSPATH:.;=%
if "%TEST_CURRENT_DIR%" == "%CLASSPATH%" ( SET CLASSPATH=.;%CLASSPATH% )
@ECHO ON
java org.antlr.v4.gui.TestRig %*
```
5. You can test manually on a prompt using
* `antlr GRAMMAR_FILE` to generate the file
* `javac [GRAMMAR_NAME]*.java` to compile all the files
* `grun GRAMMAR_NAME AXIOM [-tree] [-gui]` to compile a file
6. You can also run the main method in your IDE
