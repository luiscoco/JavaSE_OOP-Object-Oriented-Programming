# JavaSE_OOP-Object-Oriented-Programming


## How to create the build.yml file for Github actions

```yml
name: Java Build

on:
  push:
    branches:
      - main
  pull_request:
    branches:
      - main

jobs:
  build:
    runs-on: ubuntu-latest

    steps:
      - name: Set up JDK
        uses: actions/setup-java@v1
        with:
          java-version: '11'

      - name: Check out code
        uses: actions/checkout@v2

      - name: Compile Java
        run: javac -d . jva007-java-fundamentals/src/com/luxoft/jva007/enums/*.java
```
