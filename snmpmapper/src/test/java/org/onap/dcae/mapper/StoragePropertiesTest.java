package org.onap.dcae.mapper;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.onap.dcae.mapper.storage.StorageProperties;

public class StoragePropertiesTest {
    
    StorageProperties sp= new StorageProperties();


@Test
public void testStorageProperties() {
    
    sp.setLocation("location");
    assertEquals(sp.getLocation(), "location");
    
}
}