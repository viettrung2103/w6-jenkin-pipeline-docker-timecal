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

        stage("Test & Coverage"){
            steps{
                bat 'mvn test jacoco:report'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                    jacoco execPattern: '**/target/jacoco.exec',
                            classPattern: '**/target/classes',
                            sourcePattern: '**/src/main/java',
                            exclusionPattern: '**/test/**'

                }
            }
        }


        stage('Deploy') {
            steps {
                echo 'Deploy stage completed'
            }
        }
    }
}
