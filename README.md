# Java Servlet Template

This is a basic java servlet web app that may be used as a starting point for
creating a java web app. This web app demonstrates the following features:

- Handling GET requests
- Handling POST requests 
- Using forms
- Serving dynamic content

## Get started

*It's assumed you are working in a Grader Than Workspace*

1) Download the source by opening your terminal and running the command
   below. This will download the project in your current working directory in a
   folder named "java-servlet-template".
   ```shell
   git clone https://github.com/HWilliams64/java-servlet-template.git
   ```
2) Open your IDE Workspace in the projects root directory (the folder named "java-servlet-template"). 
3) Open your terminal and run the command below. This will run the
   web app on a jetty server. 
   ```shell
   ./gradlew appRun
   ```
4) Now the server is running.

## Opening the web page

The easiest way to navigate to the web page is to use the FireFox browser in
the Grader Than Desktop. 

1) Copy your workspace's URL.
2) press ctrl-shift-p to open the command palette. A text field will appear in
   the top middle of the screen. [Read more on how to open the command Palette.](https://code.visualstudio.com/docs/getstarted/userinterface#_command-palette)
3) Type `Simple Browser: Show` in the command palette text field.
4) Paste the URL you copied from step 1. Before pressing ENTER, replace the word
   'ide' in the URL with 'desktop'. (The word 'ide' can be found before `/?folder=`)
5) Drag the IDE tab named "Simple Browser" to the right to split the screen. 
6) In the Simple Browser open FireFox
7) Type the following URL into FireFox browser `localhost:8080`

## Updating the webapp

When every you make an update to your source code you need to restart the server. To restart the
server do the following:

1) In the terminal shell you used to start the server press enter twice. This
   will terminate the server. If this does not work press ctrl-c.
2) Start the server again by running the following command:
   ```shell
   ./gradlew appRun
   ```
