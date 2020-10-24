#!/usr/bin/env groovy

def call(String command) {
	if (command == "build") 
	{	
		echo "Build is executed"
			
	}
	else if (command == "deploy")
	{
		echo "deploy is executed"				
	}
}
