pipeline {
    agent any
    stages{
        stage('checking'){
            steps {
                git branch: 'master', url: 'https://github.com/viettrung2103/w6-jenkin-pipeline-docker-timecal.git'

            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean install'
            }
        }


        stage('Deploy') {
            steps {
                echo 'Deploy stage completed'
            }
        }
    }
}
