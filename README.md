# CI/CD Pipeline Configuration with Jenkinsfile

This project demonstrates the setup and configuration of a CI/CD pipeline in Jenkins using a Jenkinsfile. 

# Project Structure

![img](https://github.com/Vio-ss/Task-6/assets/77194486/92276cc8-270c-4634-9e80-75cbb0d83c43)

## Overview

Jenkins is a powerful automation server used for building, testing, and deploying software. With Jenkins pipelines, you can define the entire software delivery process as code. In this project, we'll create a CI/CD pipeline that integrates code from a Git repository, builds the application using Maven, and runs tests.

## Pipeline Steps

### 1. Checkout Source Code

This step checks out the source code from the Git repository.

### 2. Build

This step compiles the application using Maven.

### 3. Test

This step runs automated tests on the application using Maven.

### 4. Verify

This step performs additional verification tasks using Maven.

### 5. Deploy

This step deploys the application (placeholder).

## Getting Started

To get started with the project, follow these instructions:

### Prerequisites

- Install Jenkins on your system.

### Installation

1. Create a new Jenkins pipeline job.

2. Configure the pipeline to use the provided Jenkinsfile or paste the pipeline script directly into the pipeline script section.

3. Save and run the pipeline job.

## Jenkinsfile Configuration

```groovy
pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/Vio-ss/Task-6'
            }
        }
        stage('Build') {
            steps {
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/Vio-ss/Task-6']])
                bat "mvn clean package"
            }
        }
        stage('Test') {
            steps {
                bat "mvn test"
            }
        }
        stage('Verify') {
            steps {
                bat "mvn verify"
            }
        }
        stage('Deploy') {
            steps {
                echo "Deploy"
            }
        }
    }
    post {
        always {
            deleteDir()
        }
    }
}
