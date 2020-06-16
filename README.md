
# How to reproduce?

```
git clone git@github.com:landlockedsurfer/webjars-play28-example.git
```

```
sbt "run 9010"
```

# Trigger a page load for ClassGraph log messages

Open http://127.0.0.1:9010

Console shows the following ClassGraph log messages:

```
...
2020-06-16T16:27:05.690+0200	ClassGraph	Operating system: Mac OS X 10.13.6 x86_64
2020-06-16T16:27:05.690+0200	ClassGraph	Java version: 11.0.3 / 11.0.3+12-LTS (Oracle Corporation)
2020-06-16T16:27:05.690+0200	ClassGraph	Java home: /Library/Java/JavaVirtualMachines/jdk-11.0.3.jdk/Contents/Home
2020-06-16T16:27:05.700+0200	ClassGraph	ScanSpec:
2020-06-16T16:27:05.700+0200	ClassGraph	-- packageWhiteBlackList: whitelist: ["META-INF.resources.webjars"]; whitelistPrefixes: ["", "/", "META-INF.", "META-INF.resources.", "META-INF.resources.webjars."]
2020-06-16T16:27:05.700+0200	ClassGraph	-- packagePrefixWhiteBlackList: whitelistPrefixes: ["META-INF.resources.webjars."]
2020-06-16T16:27:05.701+0200	ClassGraph	-- pathWhiteBlackList: whitelist: ["META-INF/resources/webjars/"]; whitelistPrefixes: ["", "/", "META-INF/", "META-INF/resources/", "META-INF/resources/webjars/"]
2020-06-16T16:27:05.701+0200	ClassGraph	-- pathPrefixWhiteBlackList: whitelistPrefixes: ["META-INF/resources/webjars/"]
2020-06-16T16:27:05.701+0200	ClassGraph	-- classWhiteBlackList: 
...
```

# How to stop ClassGraph log messages?

Classpath log messages can be stopped by upgrading the `webjars-locator` library. 

```
libraryDependencies ++= Seq(
  guice,
//  "org.webjars" % "webjars-locator" % "0.40",  // <-- uncomment me to stop ClassGraph log messages
  "org.webjars" %% "webjars-play" % "2.8.0",
  "org.webjars" % "bootstrap" % "4.1.3"
)
```
