# Asynchronous Language Detection System
```
You are required to implement a web-based services capable of identifying the language
classification of a submitted body of text. As illustrated below, the system is asynchronous, as
the length of time required to dynamically determine a language may be prohibitively expensive
for a synchronous mode of messaging. Users should be able to specify some text in a web form
that, when submitted, is placed in a message queue. The web clients should periodically poll
the web server with a Job# to ask if the language detection task has been completed. A worker
process(es) should remove tasks from the queue and make a request on a language detection
system that uses n-grams to identify a language type. Once completed, the task should be placed
in an out-queue (a map) and returned to the client when they next poll the server.
```
![JSPtomcat](C:\Users\Administrator\Desktop\aoop.png)

![JSPtomcat](C:\Users\Administrator\Desktop\AOOP-Assignement\aoop.png)

# Requirements
```
The project must be submitted as a Zip archive (not a 7z, rar or WinRar file). 

The name of the Zip archive should be {id}.zip where {id} is your GMIT student number.
```

# The Zip archive should have the following structure (do NOT submit the assignment as an Eclipse project):
```

ngrams.war: A Java Web Application Archive  containing your API and JSP/Servlets. 

src: A directory that contains the packaged source code for your application.

README.txt: A text file detailing the main features of your application. Marks will only be given for features that are described in the README.

design.png: A UML class diagram of your API design. 

docs: A directory containing the JavaDocs for your application. 
```
