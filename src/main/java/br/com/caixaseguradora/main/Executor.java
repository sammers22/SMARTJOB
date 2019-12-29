package br.com.caixaseguradora.main;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

//@Component
public class Executor {
	
	ApplicationContext context = new ClassPathXmlApplicationContext(jobArqXml());

	//@Scheduled(fixedDelay = 10000)
	public void run() {
		try {
			Job job = (Job) context.getBean("certificadoJob");
			JobParameters param = new JobParametersBuilder()
					.addString("dtaAverbacaoInicial", "'2015-08-01'")
					.addString("dtaAverbacaoFinal", "'2015-08-31'").toJobParameters();
			JobExecution execution = getJobExecution(job, param);
			System.out.println("Exit Status : " + execution.getStatus());
			System.out.println("Exit Status : " + execution.getAllFailureExceptions());

		} catch (Exception e) {
			e.printStackTrace();

		}
		System.out.println("Done");

	}
	
	private String[] jobArqXml() {
		//String[] springConfig = { "spring/batch/jobs/job-extract-certificado.xml" };
		String[] springConfig = { "spring/batch/jobs/job-extract-contratos-averbados.xml" };
		return springConfig;
	}
	
	public JobExecution getJobExecution(Job job, JobParameters param) {
		
		JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");
		try {
			return jobLauncher.run(job, param);
		} catch (JobExecutionAlreadyRunningException e) {
			e.printStackTrace();
		} catch (JobRestartException e) {
			e.printStackTrace();
		} catch (JobInstanceAlreadyCompleteException e) {
			e.printStackTrace();
		} catch (JobParametersInvalidException e) {
			e.printStackTrace();
		}
		return null;
	}
}
