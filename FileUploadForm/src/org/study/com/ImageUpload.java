package org.study.com;
import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.study.com.hibernate.DAO.FilesDAO;
import org.study.com.hibernate.entity.Files;
@WebServlet("/ImageUpload")
public class ImageUpload extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public String path = "D:\\Upload\\";
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//This is implemented because if an application has more functionality
		//then we are having multiple methods then we use this in the servlet dopost
		//in index.jsp <action ="ImageUpload?action=filesUpload"> if action = "fileUpload" perform
		//fileUpload method 
		String action = request.getParameter("action");
		switch(action) {
		case "filesUpload":
			filesUpload(request, response);
			break;
			default :
				request.getRequestDispatcher("index.jsp").forward(request, response);
		}
		
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		switch(action) {
		case "listingImages":
			listingImages(request, response);
			break;
			default :
				request.getRequestDispatcher("index.jsp").forward(request, response);
		}
		
	}
	private void listingImages(HttpServletRequest request, HttpServletResponse response) {
		//Information of files are available here 
		List<Files> files = new FilesDAO().listFiles();
		request.setAttribute("files", files);
		request.setAttribute(path, path);
		try {
			request.getRequestDispatcher("listFiles.jsp").forward(request, response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void filesUpload(HttpServletRequest request, HttpServletResponse response) {
		//Use this for file upload to disk
				ServletFileUpload upload = new ServletFileUpload(new DiskFileItemFactory());
				//If you have multiple files then we use List<>
				try {
					List<FileItem> images = upload.parseRequest(request);
					for(FileItem image : images) {
						//By using the below sysout image.getName() we will get the complete path of the folder
						// and with the file name to get only file name not the path then we do string manipulation
						//System.out.println(image.getName());
						
						String name = image.getName();
						try {
							name = name.substring(name.lastIndexOf("\\")+1);
						} catch (Exception e) {
							// TODO: handle exception
						}
						//Upload to Where
						//This is used to store the file in to the local disk
							//image.write(new File("D:\\Upload\\" + name));
							//This is to use to add to db
							System.out.println(name);
							//To avoid redundent files we do the below 
							File file = new File(path+name);
							if(!file.exists()) {
								new FilesDAO().addFileDetails(new Files(name));
								try {
									image.write(file);
								} catch (Exception e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
							//We get the view of the upload
							
							/*new FilesDAO().addFileDetails(new Files(name));
							try {
								image.write(new File(path + name));
							} catch (Exception e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}*/
					}
				} catch (FileUploadException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				listingImages(request, response);
		}
	}


