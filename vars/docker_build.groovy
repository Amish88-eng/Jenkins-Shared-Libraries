def call(String Project_name, String imageTag, String Dockerhub){
  echo "Building Phase"
  sh "docker build -t ${Dockerhub}/${Project_name}:${imageTag} . "
}
