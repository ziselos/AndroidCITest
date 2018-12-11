pipeline {
  agent { docker { image 'openjdk:8' } }
  stages {
    stage('Commit') {
      steps {
        echo 'Commit happens'
        bash './gradlew assembleDebug'
      }
    }
  }
}
