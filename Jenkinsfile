pipeline {
  agent { docker { image 'openjdk:8' } }
  stages {
    stage('Commit') {
      steps {
         bash '''#!/bin/bash
                 gradlew test'''
      }
    }
  }
}
