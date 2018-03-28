package org.onap.dcae.mapper.storage;

import static org.junit.Assert.*;

import java.nio.file.Path;

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
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.multipart.MultipartFile;


@RunWith(SpringRunner.class)
@WebMvcTest(value = FileUploadController.class, secure = false)
public class FileSystemStorageServiceTest {
    
    
  
    StorageProperties sp = new StorageProperties();
     
    //FileSystemStorageService service = new FileSystemStorageService(sp);

    
//    
//    @Before
//    public void init() {
//        MockitoAnnotations.initMocks(this);
//    }
//    
    
    @Value("${fileService.rootPath}")
    private String location;
    
    
    @Autowired
    private MockMvc mockMvc;
    
    @Mock
    MultipartFile file;
    
    @MockBean
    private FileSystemStorageService fileSystemStorageService;
    String filename;
    
    
    @Test
    public void testFileSystemStorageService() {
        
        fileSystemStorageService.init();
        fileSystemStorageService.load(filename);
        
       
    }
    
    @Test
    public void test() {
         Path rootLocation = null;;
        sp.setLocation(location);
        FileSystemStorageService fss=new FileSystemStorageService(sp);

}
    
}