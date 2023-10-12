package com.glo.Problems;

public class Problem8 {

	public static void main(String[] args) {
		
		String title="WELCOME";
		String content="THIS IS A HTML PAGE USING TEXTBLOCKS";
		
		String htmlTemplate = """
	            <html>
	            <head>
	            <title>%s</title>
	            </head>
	            <body>
	                <h1>%s</h1>
	            </body>
	            </html>
	            """;
		String s=String.format(htmlTemplate, title,content);
		System.out.println(s);
	}

}
