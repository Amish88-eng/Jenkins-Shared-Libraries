def call(String Giturl , String Gitbranch){
  echo "Pulled Source code from Github"
  git url: "${Giturl}" , branch: "${Gitbranch}" 
  echo " Clone Code Successfull"
}
