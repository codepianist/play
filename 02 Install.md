## Install Play

    
- Install sbt:
    - [http://www.scala-sbt.org/release/docs/Installing-sbt-on-Linux.html](Installing-sbt-on-Linux.html)
```
echo "deb https://dl.bintray.com/sbt/debian /" | sudo tee -a /etc/apt/sources.list.d/sbt.list
sudo apt-key adv --keyserver hkp://keyserver.ubuntu.com:80 --recv 2EE0EA64E40A89B84B2DF73499E82A75642AC823
sudo apt-get update
sudo apt-get install sbt
```
<b/>

- Install Play:
```
sbt new playframework/play-scala-seed.g8
sbt new playframework/play-java-seed.g8
```