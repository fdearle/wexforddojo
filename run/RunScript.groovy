#!/usr/bin/env groovy

import com.github.lalyos.jfiglet.FigletFont
import org.codehaus.groovy.GroovyException
import org.codehaus.groovy.control.MultipleCompilationErrorsException

private String readLine(String format, Object... args) throws IOException {
    if (System.console() != null) {
        return System.console().readLine(format, args);
    }
    System.out.print(String.format(format, args));
    BufferedReader reader = new BufferedReader(new InputStreamReader(
            System.in));
    return reader.readLine();
}

private char[] readPassword(String format, Object... args)
        throws IOException {
    if (System.console() != null)
        return System.console().readPassword(format, args);
    return this.readLine(format, args).toCharArray();
}

private void figletBanner(String message) {
    String asciiArt = FigletFont.convertOneLine(message)
    println asciiArt
}

if(args) {
	def binding = new Binding()
	binding.readln = { message ->
	   readLine(message).toString()
	}

	binding.readnum = { String message ->
           int result
           boolean success = false
           while (!success) {
            def entered = readLine(message)
            
            try {
                result = entered.toInteger()
                success = true
            } catch (e) {
                println "You entered $entered which is not a number"
            }
               
           }
           result
	}
        binding.readnumF = { message ->
	   readLine(message).toFloat()
	}
	binding.readsecretln = { message ->
	   readPassword(message).toString()
	}
        
        binding.banner = { message ->
            figletBanner message
        }

	def shell = new GroovyShell(binding)
    def scriptFile = new File(args[0])
    def scriptName = scriptFile.toPath().fileName.toString()
    try {
        shell.evaluate(scriptFile)
    } catch (MultipleCompilationErrorsException mce) {
        System.err.println "${mce.class} ${mce.message}"

    } catch (Exception e) {
        System.err.println "${e.class} ${e.message}"
        def stackTrace = e.stackTrace

        def element = stackTrace.find { element ->
            element.fileName == scriptName
        }

        if (element)
            println "At line: ${element.lineNumber} of ${element.fileName}"

    }
}
else
	println "Usage: RunScript <script>"
