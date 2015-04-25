class GroovyKids {

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

	def readln(String message ){
	   readLine(message).toString()
	}

	def readnum(String message){
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
        
    def readnumF( String message) {
	   readLine(message).toFloat()
	}
	
	def readsecretln(String message) {
	   readPassword(message).toString()
	}
        
    def banner (String message) {
        figletBanner message
    }
    
}