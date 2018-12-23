#### The infamous Dagger coffee example app built using Bazel. 
Includes a contrasting example of the same app but with manual dependency injection.

#### Prerequisites:
* JDK > 8
* [Bazel](https://github.com/bazelbuild/bazel)


#### Build and run
```bash
> bazel build //:manual_coffee_app
INFO: Analysed target //:manual_coffee_app (33 packages loaded).
INFO: Found 1 target...
Target //:manual_coffee_app up-to-date:
  bazel-bin/manual_coffee_app.jar
  bazel-bin/manual_coffee_app
INFO: Elapsed time: 14.678s, Critical Path: 14.20s
INFO: 33 processes: 22 darwin-sandbox, 11 worker.
INFO: Build completed successfully, 37 total actions

> ./bazel-bin/manual_coffee_app
~ ~ ~ heating ~ ~ ~
=> => pumping => =>
 [_]P coffee! [_]P 

> bazel build //:automatic_coffee_app 
INFO: Analysed target //:automatic_coffee_app (0 packages loaded).
INFO: Found 1 target...
Target //:automatic_coffee_app up-to-date:
  bazel-bin/automatic_coffee_app.jar
  bazel-bin/automatic_coffee_app
INFO: Elapsed time: 0.693s, Critical Path: 0.58s
INFO: 1 process: 1 worker.
INFO: Build completed successfully, 5 total actions
bazel build //:automatic_coffee_app

> ./bazel-bin/automatic_coffee_app
~ ~ ~ heating ~ ~ ~
=> => pumping => =>
 [_]P coffee! [_]P 
```




