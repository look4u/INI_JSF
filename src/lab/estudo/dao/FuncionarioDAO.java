package lab.estudo.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

import lab.estudo.dao.Funcionario;


public class FuncionarioDAO {
	
	public List<Funcionario> buscaPorNome(String nome){
		
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure();
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		
		Criteria c = s.createCriteria(Funcionario.class);
		c.add(Restrictions.ilike("nome",nome,MatchMode.ANYWHERE));
				
		return c.list();
	}

}
