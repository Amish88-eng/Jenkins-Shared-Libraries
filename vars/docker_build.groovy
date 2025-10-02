def call(String project, String imageTag, String dockerHubUser){
  echo "Building Phase"
  sh "docker build -t ${dockerHubUser}/${Project}:${imageTag} . "
  echo " Build Successfull "
}
