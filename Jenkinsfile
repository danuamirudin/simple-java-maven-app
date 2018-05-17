pipeline {
  agent {
    docker {
      image 'maven:3.3.9-jdk-8'
      args '-di maven:3.3.9-jdk-8 /bin/bash'
    }

  }
  stages {
    stage('test0') {
      steps {
        sh '''echo PATH = ${PATH}

'''
        sh 'echo M2_HOME = ${M2_HOME}'
      }
    }
    stage('build') {
      steps {
        sh 'mvn -D maven.test.failure.ignore=true INSTALL'
      }
    }
    stage('report') {
      steps {
        junit 'target/surefire-reports/**/*.xml'
        archiveArtifacts 'target/*.jar.target/*.hpi'
      }
    }
  }
}