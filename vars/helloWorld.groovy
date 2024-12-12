def call(string repoUrl,string branch = 'main') {
    checkout([$class: 'GitSCM',
      branches: [[name: "*/${branch}"]],
      userRemoteConfigs: [[url: repoUrl]]
    ])
}
