package web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.ImcMetierImpl;

public class ControleurServlet extends HttpServlet {

    private ImcMetierImpl metier;

    @Override
    public void init() throws ServletException {
        metier = new ImcMetierImpl(); // Initialize metier in init method
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse rep)
            throws ServletException, IOException {
        req.setAttribute("ImcModel", new ImcModel());
        req.getRequestDispatcher("VueImc.jsp").forward(req, rep);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse rep)
            throws ServletException, IOException {

        /* Read data from the request */
        int poids = Integer.parseInt(req.getParameter("poids"));
        double taille = Double.parseDouble(req.getParameter("taille"));

        /* Store data in the model */
        ImcModel model = new ImcModel();
        model.setPoids(poids);
        model.setTaille(taille);

        /* Call business logic to calculate BMI */
        double res = metier.calculerImc(poids, taille);

        /* Store the result in the model */
        model.setImc(res);

        /* Store the model in the request object */
        req.setAttribute("ImcModel", model);

        /* Forward the request to the JSP view */
        req.getRequestDispatcher("VueImc.jsp").forward(req, rep);
    }
}
