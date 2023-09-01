#!/user/bin/env groovy

def call() {
    sh 'cd Module_8-CICD_with_Jenkins/java-maven-app-master && mvn package'
}
