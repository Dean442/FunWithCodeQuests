#!/usr/bin/env groovy
package Jenkins

pipeline {
    agent {
        node {
            label 'docker'
        }
    }

    parameters {
        choice(choices: 'Failure\nSuccess', description: 'What results do you expect?', name: 'cfg_result')
    }

    triggers {
        parameterizedCron('''
        20 12 * * * %cfg_result=Success;
        20 7 * * * %cfg_result=Failure;
        ''')
    }

    stages {
        stage('execute') {
            steps {
                script {
                    def message = "The experiment was a  ${cfg_result}"
                    sh "echo '$message'"
                }
            }
        }
    }
}
