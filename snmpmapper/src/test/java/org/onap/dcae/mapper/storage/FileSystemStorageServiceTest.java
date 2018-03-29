/*
* ============LICENSE_START=======================================================
* ONAP : DCAE
* ================================================================================
* Copyright 2018 TechMahindra
*=================================================================================
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
* ============LICENSE_END=========================================================
*/
package org.onap.dcae.mapper.storage;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.onap.dcae.mapper.FileUploadController;
import org.onap.dcae.mapper.SnmpmapperApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.core.io.Resource;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.multipart.MultipartFile;



@RunWith(SpringRunner.class)
@SpringBootTest(classes=SnmpmapperApplication.class)
public class FileSystemStorageServiceTest {
    
    
  
    StorageProperties sp = new StorageProperties();
     @Autowired
    FileSystemStorageService fileSystemStorageService ;

    
    
    @Value("${fileService.rootPath}")
    private String location;
   
    
    
    byte[] content = null;
    
   
    
    
   
    String filename;
    
    
    @Test
    public void testFileSystemStorageServiceLoadMethod() throws IOException {
    	fileSystemStorageService.init();
    	saveFile();
        
        Path filePath = fileSystemStorageService.load("TestFile.txt");
      
        assertEquals(Paths.get(location), filePath.getParent());
       
       
    }
    
   
    
    @Test
    public void storeTest() throws IOException
    {
    	fileSystemStorageService.init();
    	saveFile();
        
        assertEquals(true, Files.exists(Paths.get(location, "TestFile.txt")));
        
    	
    	
    	
    	
    }

	private void saveFile() throws IOException {
		Files.deleteIfExists(Paths.get(location, "TestFile.txt"));
    	content = "randomString".getBytes();
    	MultipartFile file=new MockMultipartFile("TestFile.txt","TestFile.txt", "text/plain", content);
    	
    	
        fileSystemStorageService.store(file);
	}
	@Test
    public void testFileSystemStorageServiceLoadAllMethod() throws IOException {
    	fileSystemStorageService.init();
    	saveFile();
        
        Stream<Path> filePath = fileSystemStorageService.loadAll();
      List<Path> listOfPaths =filePath.collect(Collectors.toList()); 
        
       assertEquals(true, listOfPaths.contains(Paths.get("TestFile.txt")));
       
       
    }
	
	 @Test
	    public void testFileSystemStorageServiceLoadResourceMethod() throws IOException {
	    	fileSystemStorageService.init();
	    	saveFile();
	        
	      
	        
	        Resource fileResource = fileSystemStorageService.loadAsResource("TestFile.txt");

	      
	        assertEquals(Paths.get(location,"TestFile.txt").getFileName().toString(), fileResource.getFilename());
	       
	       
	    }
    
}