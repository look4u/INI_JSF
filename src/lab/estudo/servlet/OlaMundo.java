package lab.estudo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet ("/OlaMundo")
public class OlaMundo extends HttpServlet {

@Override
protected void service ( HttpServletRequest req , HttpServletResponse resp )
		throws ServletException , IOException {
	
	PrintWriter writer = resp . getWriter ();
	writer . println ("<html ><body ><h1 > Olá Mundo do Clauber </h1 ></ body ></ html >");
	
	}
}
