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
package org.onap.universalvesadapter.controller;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.onap.universalvesadapter.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=Application.class)
@AutoConfigureMockMvc
@Ignore
public class VesControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void startShouldReturnApplicationStartedMessage() throws Exception {

         MvcResult mvcResult = this.mockMvc.perform(get("/start")).andDo(print()).andExpect(status().isOk())
                .andReturn();//Expect(jsonPath("$.content").value("Application started"));
         assertEquals("Application started", mvcResult.getResponse().getContentAsString());
    }

    @Test
    public void stopShouldReturnApplicationStoppingMessage() throws Exception {
        
        MvcResult mvcResult = this.mockMvc.perform(get("/stop")).andDo(print()).andExpect(status().isOk())
        .andReturn();//.andExpect(jsonPath("$.content").value("Application will be stopped soon"));
        assertEquals("Application will be stopped soon", mvcResult.getResponse().getContentAsString());
    }



}
