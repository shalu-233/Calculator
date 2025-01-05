pipeline {
    agent any
    options {
        timeout(time: 1, unit: 'MINUTES')
    }
    parameters {
        string(name: 'BRANCH', defaultValue: 'main')
        string(name: 'maven' , defaultValue: 'MAVEN-3.9.9')
        string(name: 'GOALS', defaultValue: 'clean package')
    }
    tools {
        maven "${params.maven}"
    }
    triggers {
        pollSCM('* * * * *')
    }
    stages {
        stage('pull') {
            steps {
                git branch: "${params.BRANCH}",
                    url: 'https://github.com/shalu-233/Calculator.git'
            }
        }
        stage('build') {
            steps {
                sh "mvn ${params.GOALS}"
            }
        }
        stage('archieve') {
            steps {
                archiveArtifacts artifacts: '**/target/*.jar'
            }
        }
    }
}
