def call(String project, String imageTag, String dockerHubUser){
  echo "Building Phase"
  sh "docker build -t ${dockerHubUser}/${project}:${imageTag} . "
  echo " Build Successfull "
}
