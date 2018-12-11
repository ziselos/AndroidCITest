pipeline {
  agent any
  stages {
    stage('Commit') {
      steps {
        echo 'Commit happens'
        bash ./gradlew assembleDebug
      }
    }
  }
}
