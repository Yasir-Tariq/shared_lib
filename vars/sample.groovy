def call() {

pipeline {
    agent any
    stages {
        stage('One') {
                steps {
                        echo 'This is stage one'
                }
        }
	    stage('Two'){

		steps {
			input('Do you want to proceed?')
      echo 'This is stage two'
        }
	    }
      stage('Three'){

    		steps {
          echo 'This is stage Three'
            }
	    }
    }
}
}
