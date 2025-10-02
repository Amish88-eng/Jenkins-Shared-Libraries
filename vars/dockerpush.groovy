def call(String project, String imageTag, String dockerHubUser) {
    withCredentials([usernamePassword(
        credentialsId: "docker_hub_Cred",
        usernameVariable: "DOCKERHUB_USER",
        passwordVariable: "DOCKERHUB_PASS"
    )]) {
        sh """
            echo "Logging into Docker Hub..."
            docker login -u $DOCKERHUB_USER -p $DOCKERHUB_PASS
            docker push ${dockerHubUser}/${project}:${imageTag}
        """
    }
}
