def call(){
        withCredentials([usernamePassword(
                    'credentialsId':"docker_hub_Cred",
                    usernameVariable:"DOCKERHUB_USER",
                    passwordVariable:"DOCKERHUB_PASS")]){
                sh 'docker login -u $DOCKERHUB_USER -p $DOCKERHUB_PASS
                }
    sh 'docker push $DOCKERHUB_USER/note-app:latest'
}
