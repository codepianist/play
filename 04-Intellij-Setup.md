04-Intellij-Setup.md

## 1- After creating a project:
- Close the IDE
- Remove the idea files .idea and *.iml
- Open project with the IDE to reload
- Set your gradle installation: /usr/share/sbt/bin/sbt-launch.jar, instead of the Default Bundled.


## User limit of inotify watches reached on Ubuntu
```
# Current value
cat /proc/sys/fs/inotify/max_user_watches
# Double it
echo 16384 | sudo tee /proc/sys/fs/inotify/max_user_watches
```

## Upgrade play-framework version:
- At /project/plugins.sbr
```
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.6.16")
```

- At /project/build.properties
```
sbt.version=0.13.15
```

// Generate project with the java-seed 
// Than new project from existing source
// sbt


public class Test extends Controller {

    public Result index(){
        return ok(index.render("Test/Hello cruel world"));
    }
    public Result create(){
        return ok(index.render("Test/Create"));
    }
    public Result save(String name){
        return ok(index.render("Test/Save "+ name));
    }
    public Result remove(Long id){
        return ok(index.render("Test/Remove "+ id));
    }

}

GET     /test/                      controllers.Test.index()
GET     /test/create                controllers.Test.create()
GET     /test/save                  controllers.Test.save(name: String)
GET     /test/remove                controllers.Test.remove(id: Long)

    <ul>
        /*@for(test: model.Test <- tests){
            <li>@test.getName </li>
        }*/
    </ul>