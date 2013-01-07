package lab.estudo.dao;


import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class GeraBanco {
	public static void main(String[] args){
		
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure();
		//Configuration cfg = new Configuration()
	    //.addClass(org.hibernate.auction.Item.class)
	    //.addClass(org.hibernate.auction.Bid.class)
	   // .setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLInnoDBDialect")
	    //.setProperty("hibernate.connection.datasource", "java:comp/env/jdbc/test")
	    //.setProperty("hibernate.order_updates", "true");
		
		//SchemaExport se = new SchemaExport(cfg);
		//se.create(true, true);
		
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		
		Funcionario f = new Funcionario();
		f.setId((long) 2);
		f.setNome("Maria.Silva");
		f.setEmail("mariac.@hotmail.com.br");
		f.setUsuario("mariaAAAAAA");
		f.setSenha("123456");
		
		Transaction t = s.beginTransaction();
		s.update(f);
		t.commit();
		
		s.close();
		sf.close();
		
	}

}
