package org.onap.dcae;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import org.apache.catalina.startup.ClassLoaderFactory.Repository;
import org.onap.dcae.servicedb.Mapping_file;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class snmpmapperController {
    
    /*@Autowired
    private UploadPageSample1Service upss;*/
  
	@Value("${spring.datasource.url}")
	String url;
	@Value("${spring.datasource.username}")
	String user;
	@Value("${spring.datasource.password}")
	String pwd;
	
	static String enterpriseid;
    static Mapping_file mapping;
    
    @GetMapping("/")
    public String index() {
        return "uploadform.html";
    }

    
 // This Method Is Used To Get Or Retrieve The Uploaded File And Save It In The Db
    @RequestMapping(value = "uploadFile", method = RequestMethod.POST)
    public String saveUploadedFileInDatabase(HttpServletRequest request, final @RequestParam MultipartFile[] mapper) throws IllegalStateException, IOException, SQLException {

        // Reading File Upload Form Input Parameters        
        enterpriseid = request.getParameter("eid");

        // Logging The Input Parameter (i.e. File Description) For The Debugging Purpose
        System.out.println("\nEnterPrise ID Is = " + enterpriseid + "\n");

        // Determine If There Is An File Upload. If Yes, Attach It To The Client Email              
        if ((mapper != null) && (mapper.length > 0) && (!mapper.equals(""))) {
            for (MultipartFile aFile : mapper) {
                if(aFile.isEmpty()) {
                    continue;
                } else {
                    System.out.println("MappingFile Name = " + aFile.getOriginalFilename() + "\n");
                    if (!aFile.getOriginalFilename().equals("")) {
                        mapping = new Mapping_file();
                        mapping.setEnterprise_ID(enterpriseid);
                        mapping.setMapping_File(aFile.getBytes());
                        mapping.setMimetype(aFile.getContentType());
                        mapping.setName(aFile.getOriginalFilename());
                        
                        
                       
                        /*InputStream inputStream =  new BufferedInputStream(aFile.getInputStream());*/
                        
                        System.out.println("1");
                        try (Connection con = DriverManager.getConnection(url, user, pwd)) {
                            
                            System.out.println("2");
                            /*CopyManager cm = new CopyManager((BaseConnection) con);*/
                            PreparedStatement pstmt=con.prepareStatement("INSERT INTO mapping_file(enterpriseid, mappingfilecontents, mimetype,  File_Name) VALUES (?, ?, ?, ?)");
                            pstmt.setString(1, enterpriseid);
                            System.out.println("3");
                            pstmt.setBytes(2, aFile.getBytes());
                            pstmt.setString(3, aFile.getContentType());
                            pstmt.setString(4, aFile.getOriginalFilename());
                            
                           
                            System.out.println("4");
                            pstmt.executeUpdate();
                            
                            
                            
                            
                            
                            
                            /*String fileName = "D:\\configFiles\\TestFile.txt";*/

                            /*try (FileInputStream fis = new FileInputStream(fileName);
                                    InputStreamReader isr = new InputStreamReader(fis, 
                                            StandardCharsets.UTF_8)) {*/

                               
                                
                                
                            }
                        
                          
               
                    }
                }
                System.out.println("File Is Successfully Uploaded & Saved In The Database\n");
            }
        } else {
            // Do Nothing
        }
     
        return  "success.html";   
    }
    
}
