/*
 * Copyright (c) 2018, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.internal.apps.license.manager.impl;

import com.google.gson.JsonArray;
import org.wso2.internal.apps.license.manager.datahandler.LicensesDataHandler;
import org.wso2.internal.apps.license.manager.exception.LicenseManagerDataException;

import java.sql.SQLException;

/**
 * Implementation of the API service to list out all the licenses available in the database.
 */
public class GetAllLicensesApiServiceImpl {

    /**
     * Get the all the licenses available as a list of json array.
     *
     * @return list of licenses
     * @throws LicenseManagerDataException if the SFTP connection fails
     */
    public JsonArray getListOfAllLicenses() throws LicenseManagerDataException {

        JsonArray listOfLicensesAsJson;
        try {
            LicensesDataHandler licensesDataHandler = new LicensesDataHandler();
            listOfLicensesAsJson = licensesDataHandler.selectAllLicense();
        } catch (SQLException e) {
            throw new LicenseManagerDataException("Failed to retrieve data from the database.", e);
        }
        return listOfLicensesAsJson;
    }
}
