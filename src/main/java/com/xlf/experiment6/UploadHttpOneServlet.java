package com.xlf.experiment6;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.Part;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/uploadHttpOneServlet")
@MultipartConfig
public class UploadHttpOneServlet extends HttpServlet {
    private static final String UPLOAD_DIR = "uploadFiles";

    @Override
    protected void doPost(HttpServletRequest request, jakarta.servlet.http.HttpServletResponse response) throws ServletException, IOException {
        String uploadPath = getServletContext().getRealPath("") + File.separator + UPLOAD_DIR;

        File uploadDir = new File(uploadPath);
        if (!uploadDir.exists()) {
            uploadDir.mkdir();
        }

        String description = request.getParameter("description");
        Part filePart = request.getPart("file");
        String fileName = filePart.getSubmittedFileName();

        filePart.write(uploadPath + File.separator + fileName);

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h3>输入的文件描述：" + description + "</h3>");
        out.println("<p>上传文件的原始名称：" + fileName + "</p>");
        out.println("<p>文件上传到：" + uploadPath + File.separator + fileName + "</p>");
        out.println("</body></html>");
    }
}
