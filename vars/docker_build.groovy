def call(String project, String imageTag, String dockerhubuser){
  echo "Building Phase"
  sh "docker build -t ${dockerhubuser}/${Project}:${imageTag} . "
  echo " Build Successfull "
}
