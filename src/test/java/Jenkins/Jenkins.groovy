#!/usr/bin/env groovy
package Jenkins

pipeline {
    agent {
        node {
            label 'docker'
        }
    }

}