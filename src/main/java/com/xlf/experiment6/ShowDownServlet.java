package com.xlf.experiment6;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/showDownServlet")
public class ShowDownServlet extends HttpServlet {
    private static final String UPLOAD_DIR = "uploadFiles";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uploadPath = getServletContext().getRealPath("") + File.separator + UPLOAD_DIR;
        File uploadDir = new File(uploadPath);

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h3>显示下载文件</h3>");
        out.println("<table border='1'><tr><th>文件名称</th><th>下载操作</th></tr>");

        if (uploadDir.exists() && uploadDir.isDirectory()) {
            for (File file : uploadDir.listFiles()) {
                out.println("<tr><td>" + file.getName() + "</td>");
                out.println("<td><a href='downloadFileServlet?fileName=" + file.getName() + "'>下载</a></td></tr>");
            }
        }

        out.println("</table>");
        out.println("</body></html>");
    }
}
