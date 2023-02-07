job('ejemplo2-job-DSL') {
 description('Jobs DSL de ejemplo para el curso de Jenkins')
  scm{
    git('https://github.com/ingbarreto/jenkins.job.parametrizado.git', 'main' ) { node ->
      node / gitConfigName('luis_angel')
      node / gitConfigEmail('lahb@outlook.com')
     }
  }
  parameters {
        stringParam('nombre', defaultValue = 'Luis_Angel', description = 'Parametro de cadena para el Job Booleano')
        choiceParam('planeta', ['Mercurio', 'Venus', 'Tierra', 'Marte', 'Jupiter', 'Saturno', 'Urano', 'Neptuno'])
        booleanParam('agente', false)
    }
  triggers {
  		cron('H/7 * * * *')
  }
  steps {
  		shell("bash jobscript.sh")
  }
  publishers {
  		mailer('luisangelhernandezbarreto@gmail.com', true, true)
  }  
}
