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

# Requirements
```
Eclipse IDE which can be downloaded at https://www.eclipse.org/downloads/

A working version of Java, with no modules

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

# Steps
```

Open CMD

Clone with HTTPS

git clone https://github.com/smoran98/AOOP-Assignement.git

Open with Eclipse IDE

Open a browser of your choice, preferably not Microsoft Edge and type: localhost:8080/ngrams and you should see "Language Detection System"

Enter a one of the three options and type in the textarea below, then Click "Process"

http://localhost:8080/ngrams/doProcess should have loaded, with a job request being processed
 
```

# **I was unable to generate a proper a JavaDocs**

