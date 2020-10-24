#!/usr/bin/env groovy

def call(String command) {
	if (command == "build") 
	{
		pipeline {
			agent any
			stages 
			{
				stage("Build") 
				{
					steps 
					{
						echo "Build is executed"
					}
				}	
			}
		}	
	}
	else if (command == "deploy"){
	{
		pipeline {
			agent any
			stages 
			{
				stage("deploy") 
				{
					steps 
					{
						echo "deploy is executed"
					}
				}	
			}
		}	
	}
}
