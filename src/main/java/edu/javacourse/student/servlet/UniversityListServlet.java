package edu.javacourse.student.servlet;


import edu.javacourse.student.domain.University;
import edu.javacourse.student.service.UniversityService;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "UniversityListServlet", urlPatterns = "/universityList")
public class UniversityListServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext stx = getServletContext();
        WebApplicationContext webCtx = WebApplicationContextUtils.getWebApplicationContext(stx);
        UniversityService service = webCtx.getBean(UniversityService.class);
        List<University> listOfAllUniversities = service.findAllUniversities();
        listOfAllUniversities.forEach(m-> System.out.println(
                m.getUniversityId()+ ": "+ m.getUniversityName() + m.getFaculties().size()));




        getServletContext().getRequestDispatcher("/universityList.jsp").forward(req, resp);
    }
}
