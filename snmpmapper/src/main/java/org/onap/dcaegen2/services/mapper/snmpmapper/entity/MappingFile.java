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
package org.onap.dcaegen2.services.mapper.snmpmapper.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "mapping_file")
public class MappingFile {
    
    @Id
    @Column(name = "EnterpriseID")
    public String Enterprise_ID;
    
    @Column(name = "File_Name")
    public String name;
    
   
    @Column(name = "mimetype")
    private String mimetype;
    
  
    @Column(name = "mappingfilecontents")
    private byte[] Mapping_File;

   

    public MappingFile() {
        super();
    }

    public MappingFile(String enterprise_ID, String name, String mimetype, byte[] mapping_File) {
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
