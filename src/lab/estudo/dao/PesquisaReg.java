package lab.estudo.dao;


import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class PesquisaReg {
	public static void main(String[] args){
		
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure();
	
		//SchemaExport se = new SchemaExport(cfg);
		//se.create(true, true);
		
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		
		Funcionario f = (Funcionario) s.load(Funcionario.class, 1L);
		
		System.out.println("NOME : "+f.getNome());
		System.out.println("EMAIL : "+f.getEmail());

		
	}

}
