## Introduction

A sample automatic-qa framework for REST API testing for athlete information for the <REST API serving mockup> for Olympic Channel development and QA tests.

## Preconditions

1. The <REST API serving mockup> is running.
2. Jdk (not Jre) is installed.
3. Maven is installed.

## Running the tests

In order to run the test execute:

```
mvn clean test
```

For individual test results, please refer to:

```
{project.basedir}\target\surefire-reports
```

For testing purposes, the request target site, athlete_id and game_id can be updated in the file:

```
{project.basedir}\src\test\resources\com\ocs\config.properties
```
