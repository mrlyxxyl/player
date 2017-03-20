package com.yx.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * User: LiWenC
 * Date: 17-3-20
 */
@WebServlet(urlPatterns = {"/player"})
public class PlayerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String type = req.getParameter("type");
        if ("flv".equals(type)) {
            req.setAttribute("video_url", "http url");
        } else if ("mp4".equals(type)) {
            req.setAttribute("video_url", "http url");
        } else {
            System.out.println("error");
        }
        req.getRequestDispatcher("show_video.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }
}
