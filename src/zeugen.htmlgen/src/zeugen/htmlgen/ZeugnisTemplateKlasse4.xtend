package zeugen.htmlgen

import zeugen.configuration.Schule

class ZeugnisTemplateKlasse4 {
	
	def generateHtml(Schule config){
		'''
		<!doctype html>
		<head>
		    <meta charset="utf-8">
		    <meta name="viewport" content="width=device-width, initial-scale=1.0">
		    <link rel="stylesheet" href="style.css">
		    <style>
		           <!--- Platz für CSS -->
		    </style>
		    <title>Zeugnis Klassenstufe 4</title>
		</head>
		<body>
		  <h1>«config.name»</h1>
		  <h2>Zeugnis</h2>
		</body>
		'''
	}
	
}