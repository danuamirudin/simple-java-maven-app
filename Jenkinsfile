pipeline {
  agent {
    node {
      label '10.80.80.10'
    }

  }
  stages {
    stage('build') {
      steps {
        sh 'npm install'
      }
    }
  }
}