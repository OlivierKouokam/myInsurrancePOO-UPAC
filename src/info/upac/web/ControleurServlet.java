package info.upac.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

import info.upac.dao.impl.GeneralisteDaoImpl;
import info.upac.dao.impl.MedecinDaoImpl;
import info.upac.dao.impl.PatientDaoImpl;
import info.upac.dao.impl.SpecialisteDaoImpl;
import info.upac.dao.interfac.IGeneralisteDao;
import info.upac.dao.interfac.IMedecinDao;
import info.upac.dao.interfac.IPatientDao;
import info.upac.dao.interfac.ISpecialisteDao;
import info.upac.dao.utils.SingletonHibernateUtil;
import info.upac.entities.Generaliste;
import info.upac.entities.Medecin;
import info.upac.entities.Patient;

/**
 * Servlet implementation class ControleurServlet
 */
@WebServlet(name = "cs", urlPatterns = {"/", "*.do", "*.med", "*.adm"})
public class ControleurServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	public IGeneralisteDao generalisteDao;
	public ISpecialisteDao specialisteDao;
	public IPatientDao patientDao;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControleurServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		Session session = SingletonHibernateUtil.getSessionFactory().openSession();
		generalisteDao = new GeneralisteDaoImpl();
		specialisteDao = new SpecialisteDaoImpl();
		patientDao = new PatientDaoImpl();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String path = request.getServletPath();
		String usernameParam = request.getParameter("username");
		String passwordParam = request.getParameter("password");
		String roleParam = request.getParameter("role");
		
		String nomParam = request.getParameter("nom");
		String prenomParam = request.getParameter("prenom");
		String sexeParam = request.getParameter("sexe");
		String datenaissParam = request.getParameter("datenaissance");
		String telParam = request.getParameter("telephone");
		String quartierParam = request.getParameter("quartier");
		String typePersonParam = request.getParameter("typeperson");
		String isAssure = request.getParameter("isassure");
		String matriculParam = request.getParameter("matricule");
		String categorieParam = request.getParameter("categorie");
		String adresscabinParam = request.getParameter("nomcabinet");
		String phonecabinParam = request.getParameter("phonecabinet");
		
		if (path.equals("/")) {
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
		else if (path.equals("/home.do") && request.getMethod().equals("POST")) {
			if (usernameParam.equals("admin") && passwordParam.equals("1234") && roleParam.equals("admin")) {
				request.getRequestDispatcher("index-admin.jsp").forward(request, response);
			} else if (usernameParam.equals("med") && passwordParam.equals("1234") && roleParam.equals("medecin")) {
				request.getRequestDispatcher("index-med.jsp").forward(request, response);
			}
		}
		else if (path.equals("/cherchermedecin.do") && request.getMethod().equals("POST")) {
			String motCle = request.getParameter("motCle");
			GeneralisteModel generalisteModel = new GeneralisteModel();
			generalisteModel.setMotCle(motCle);
			List<Generaliste> generalistes = generalisteDao.getGeneralistesParNoms(motCle);
			generalisteModel.setGeneralistes(generalistes);
			request.setAttribute("generalisteModel", generalisteModel);
			request.getRequestDispatcher("assign-medecin-admin.jsp").forward(request, response);
		}
		else if (path.equals("/addperson.do") && request.getMethod().equals("POST")) {
			if (typePersonParam.equals("patient")) {
				Patient p = new Patient();
				p.setNom(nomParam); 
				p.setPrenom(prenomParam);
				p.setSexe(sexeParam); 
				p.setDateNaissance(datenaissParam);
				p.setMatricule(matriculParam); 
				p.setAssure(isAssure.equals("oui"));
				p.setTypepersonne(typePersonParam); 
				//p.setCategorie(categorieParam);
				//g.setAdresseCabinet(adresscabinParam);
				//g.setPhoneCabinet(phonecabinParam);
				patientDao.savePatient(p);
				request.getRequestDispatcher("remboursement-admin.jsp").forward(request, response);
			} else if (typePersonParam.equals("medecin")){
				if (categorieParam.equals("generaliste")) {
					System.out.println("enregistrer objet Generaliste");
					Generaliste g = new Generaliste();
					g.setNom(nomParam); 
					g.setPrenom(prenomParam);
					g.setSexe(sexeParam); 
					g.setDateNaissance(datenaissParam);
					g.setMatricule(matriculParam); 
					g.setAssure(isAssure.equals("oui"));
					g.setTypepersonne(typePersonParam); 
					g.setCategorie(categorieParam);
					g.setAdresseCabinet(adresscabinParam);
					g.setPhoneCabinet(phonecabinParam);
					generalisteDao.saveGeneraliste(g);
					request.getRequestDispatcher("assign-medecin-admin.jsp").forward(request, response);
				} else if (categorieParam.equals("specialiste")){
					System.out.println("enregistrer objet Generaliste");
					
				}
			}
		} else if (path.equals("/chercherpatient.do")) {
			String motCle = request.getParameter("motCle");
			PatientModel patientModel = new PatientModel();
			patientModel.setMotCle(motCle);
			List<Patient> patients = patientDao.getPatientsParNoms(motCle);
			patientModel.setPatients(patients);
			request.setAttribute("patientModel", patientModel);
			request.getRequestDispatcher("liste-patient-med.jsp").forward(request, response);
		}
//		else { 
//			response.sendError(Response.SC_NOT_FOUND);
//		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
