/*-
 * ============LICENSE_START=======================================================
 * ONAP : DCAE
 * ================================================================================
 * Copyright 2019 TechMahindra
 * ================================================================================
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ============LICENSE_END=========================================================
 */

package org.onap.universalvesadapter.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;

import org.springframework.util.ResourceUtils;

public class FileUtils {
	public static String readFileFromClassPath(String configFileName) throws IOException {
		String content = null;
		File file = null;

		try {
			file = ResourceUtils.getFile("classpath:"+configFileName);
			content = new String(Files.readAllBytes(file.toPath()));
		} catch (FileNotFoundException e) {
			throw e;

		} catch (IOException e) {
			throw e;
		}

		return content;

	}
	
	public static String readFile(String configFileName) throws IOException {
		String content = null;
		File file = null;

		try {
			file = ResourceUtils.getFile(configFileName);
			content = new String(Files.readAllBytes(file.toPath()));
		} catch (FileNotFoundException e) {
			return readFileFromClassPath(configFileName);

		} catch (NoSuchFileException e) {
			return readFileFromClassPath(configFileName);

		}catch (IOException e) {
			throw e;
		}

		return content;

	}
}
