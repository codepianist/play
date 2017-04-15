# Play

- application.conf
```
some.prop= Hi there
```

- From code
```
val hi= Play.current.configuration.getString("some.prop")
```