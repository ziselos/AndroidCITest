pipeline {
  agent any
  stages {
    stage('Commit') {
      steps {
        echo 'Commit happens'
        "./gradlew assembleDebug"
      }
    }
  }
}
