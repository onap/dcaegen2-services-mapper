package org.onap.dcae.mapper;

import static org.junit.Assert.*;

import org.junit.Test;
import org.onap.dcae.mapper.storage.StorageFileNotFoundException;

public class StorageFileNotFoundExceptionTest {
    
    StorageFileNotFoundException sfnfe = new StorageFileNotFoundException("message");
    StorageFileNotFoundException sfnfe1 = new StorageFileNotFoundException("message", sfnfe);

    @Test
    public void test() {
       
    }

}
