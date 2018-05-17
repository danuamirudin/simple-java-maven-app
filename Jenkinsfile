pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        sh 'npm install'
        sh 'apt install openstack -y'
      }
    }
  }
}