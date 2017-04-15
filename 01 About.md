# Play 

## 1. About

### Play 1:
- Started in 2008, Released in 2009, inspired by Django and Rails.
- Play 2 was released in 2012. Play 1 vs. Play 2:

|                                   |    Play 1   |               Play 2               |
|-----------------------------------|:-----------:|:----------------------------------:|
| Build Tool/ Dependency Management |     Ivy     |                 SBT                |
| Inspirations                      |  Rails Like |         Entirely different         |
| Templates                         |    Groovy   |                Scala               |
| Written                           |     Java    |                Scala               |
| Foccus                            | Produtivity |             Scalability            |
| Characteristics                   | Sccafolding | Stateless, Asynchronous, Immutable |


### Play 2:
- Foccus on stateless, Sessions are limited to Cookies based Strings.
- Modular, Plugable: Play 2 avoids to bind persistence with a Relational Database. Its just a plugin.
<br/>
- Divided in 2 parts: Play Executable and Play Framework.

|                 Play Executable                |                        Play Framework                       |
|:----------------------------------------------:|:-----------------------------------------------------------:|
| Command Line: Generate, Test,  Deploy, Package |                        Core in Scala                        |
|           Giter 8: Project Templating          |                        JVM Libraries                        |
|                   Build Tool                   | Modular Design with Plugins:  Can be loaded and Overwritten |
|                                                |              Self hosted: Netty (Non blocking)              |
|                                                |                  Akka (Concurrency/ Actors)                 |
|                                                |                           Logback                           |
|                                                |               Client side:  CoffeScript,  LESS              |
|                                                |               Server Side: WebSockets, Events               |
|                                                |       Data Access:  jdbc, JPA, H2, Pools, Datasources       |
|                                                |                    Test: Spec2, Selenium                    |

