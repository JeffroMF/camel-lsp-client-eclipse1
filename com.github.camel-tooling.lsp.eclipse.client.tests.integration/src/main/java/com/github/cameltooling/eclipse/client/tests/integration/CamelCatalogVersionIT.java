/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.cameltooling.eclipse.client.tests.integration;

import org.osgi.service.prefs.BackingStoreException;

import com.github.cameltooling.eclipse.preferences.CamelLanguageServerPreferenceManager;

public class CamelCatalogVersionIT extends AbtractPreferencesIT {

	private static final String A_CAMEL_CATALOG_VERSION_WITHOUT_JGROUPSRAFT_COMPONENT = "2.22.0";

	protected void setBackPreference() throws BackingStoreException {
		new CamelLanguageServerPreferenceManager().setCamelCatalogVersion("");
	}
	
	protected void updatePreference() throws BackingStoreException {
		new CamelLanguageServerPreferenceManager().setCamelCatalogVersion(A_CAMEL_CATALOG_VERSION_WITHOUT_JGROUPSRAFT_COMPONENT);
	}

}
