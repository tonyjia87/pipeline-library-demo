def call(String repoUrl,String branch) {
    def workingDir = "${env.WORKSPACE}"
    sh "git clone ${repoUrl} ${workingDir}"
    sh "git checkout ${branch}"
    return workingDir
}


def clear() {
    def workingDir = "${env.WORKSPACE}"
    echo "WORKSPACE: ${workingDir}"
    deleteDir()
}