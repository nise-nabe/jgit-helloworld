jgit-helloworld
===============

```
 $ test -e helloworld; echo $?
 1
 $ gradle jar
 $ java -jar build/libs/jgit-helloworld.jar
 $ test -e helloworld; echo $?
 0
```
