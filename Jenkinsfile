pipeline {
  agent {
    node {
      label 'compiler'
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