subdb2
======

ci:
https://travis-ci.org/marekpulka/subdb2 [![Build Status](https://travis-ci.org/marekpulka/subdb2.svg?branch=master)](https://travis-ci.org/marekpulka/subdb2)

https://codeship.com/projects/88423


Build
----
mvn clean site verify
local:
mvn clean site verify -Denv=dev (will run Sonar)

TODO
----
-solve blame info in Sonar
[WARNING] Missing blame information for the following files:
[WARNING]   * pom.xml
[WARNING] This may lead to missing/broken features in SonarQube

- make profiles for build: local (incl Sonar), public

- performance regression
- move this TODO to better backlog management service
- try to add project to www.openhub.net
- integrate Docker
- site main page
- other site plugins
- investigate dbunit/sqlunit for embedded external database preparation
- investigate dbunit output feature
- http://nosql-database.org/ grafowa baza Neo4J
