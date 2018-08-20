package org.onap.dcae.servicedb;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "mapping_file")
public class Mapping_file {
    
    @Id
    @Column(name = "EnterpriseID")
    public String Enterprise_ID;
    
    @Column(name = "File_Name")
    public String name;
    
   
    @Column(name = "mimetype")
    private String mimetype;
    
  
    @Column(name = "mappingfilecontents")
    private byte[] Mapping_File;

   

    public Mapping_file() {
        super();
    }

    public Mapping_file(String enterprise_ID, String name, String mimetype, byte[] mapping_File) {
        super();
        Enterprise_ID = enterprise_ID;
        this.name = name;
        this.mimetype = mimetype;
        Mapping_File = mapping_File;
    }

    public String getEnterprise_ID() {
        return Enterprise_ID;
    }

    public void setEnterprise_ID(String enterprise_ID) {
        Enterprise_ID = enterprise_ID;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMimetype() {
        return mimetype;
    }

    public void setMimetype(String mimetype) {
        this.mimetype = mimetype;
    }

    public byte[] getMapping_File() {
        return Mapping_File;
    }

    public void setMapping_File(byte[] mapping_File) {
        Mapping_File = mapping_File;
    }
    
    
    

}
