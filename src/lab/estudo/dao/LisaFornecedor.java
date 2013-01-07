package lab.estudo.dao;


import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class LisaFornecedor {
	public static void main(String[] args){
		
		//AnnotationConfiguration cfg = new AnnotationConfiguration();
		//cfg.configure();
	
		//SchemaExport se = new SchemaExport(cfg);
		//se.create(true, true);
		
		
		//SessionFactory sf = cfg.buildSessionFactory();
		//Session s = sf.openSession();
		
		FuncionarioDAO f = new FuncionarioDAO();
		
		List<Funcionario> listFunc =  f.buscaPorNome("Clauvv");
		
		for (Funcionario ff : listFunc) {
			System.out.println("NOME : "+ff.getNome());
			System.out.println("EMAIL : "+ff.getEmail());
		}

		
	}

}
