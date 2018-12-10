pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh '''
    stage(\'Compile\') {
      steps {
        // Compile the app and its dependencies
        sh \'./gradlew compileDebugSources\'
      }
    }'''
      }
    }
  }
}