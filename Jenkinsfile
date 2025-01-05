pipeline {
    agent any
    options {
        timeout(time: 1, unit: 'MINUTES')
    }
    tools {
        maven 'MAVEN-3.9.9'
    }
    triggers {
        pollSCM(* * * * *)
    }
    stages {
        stage('pull') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/shalu-233/Calculator.git'
            }
        }
        stage('build') {
            steps {
                sh 'maven clean package'
            }
        }
    }
}
