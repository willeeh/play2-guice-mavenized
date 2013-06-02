play2-guice-mavenized
=====================

Play2 Project (Java) mavenized with dependency injection


This project is a prototype to have a Play 2 application mavenized with Guice as IoC.  

Instructions to install this prototype
-

If you haven't installed Play 2 yet, I suggest install it through [Homebrew][brew] typing: `brew install play`.

Then clone this project (or fork it):
`git clone https://github.com/willeeh/play2-guice-mavenized.git`

The mavenization has been based on [this plugin][maven]. You can compile, debug or run from maven:

```
cd play2-guice-mavenized
mvn clean install
mvn play2:run
#or mvn play2:debug
```

Note: if you haven't installed Play 2 through Homebrew you must set the variable PLAY2_HOME.
```
mvn clean install -DPLAY2_HOME=...
```

Finally, just open a web browser and goes to [localhost:9000][localhost] you will see a simple random number. Job done.

Dependency Injection
-
Play 2.0/2.1 can manage any dependency injection manager thanks to [this][JavaInjection]. I've chosen Guice. Help yourself looking into the code to see how I did it.

[brew]: http://mxcl.github.io/homebrew/
[maven]: http://nanoko-project.github.io/maven-play2-plugin/maven/release/index.html
[localhost]: http://localhost:9000
[JavaInjection]: https://github.com/playframework/Play20/blob/master/documentation/manual/javaGuide/main/inject/JavaInjection.md
