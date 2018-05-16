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

package org.wso2.internal.apps.license.manager.datahandler;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.wso2.internal.apps.license.manager.connector.DatabaseConnectionPool;
import org.wso2.internal.apps.license.manager.util.SqlRelatedConstants;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Handles the data transferring operations related to licenses.
 */
public class LicensesDataHandler {

    private static final Logger log = LoggerFactory.getLogger(LicensesDataHandler.class);

    /**
     * Select all the licenses available from LM_LICENSE table.
     *
     * @return json array of licenses
     * @throws SQLException if the sql execution fails
     */
    public JsonArray selectAllLicense() throws SQLException {

        DatabaseConnectionPool dbConnectionPool = DatabaseConnectionPool.getDbConnectionPool();
        Connection connection = dbConnectionPool.getDataSource().getConnection();

        JsonArray resultArray = new JsonArray();
        String query = SqlRelatedConstants.SELECT_ALL_LICENSES;
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        ResultSet rs = preparedStatement.executeQuery();
        while (rs.next()) {
            JsonObject licenseJson = new JsonObject();
            licenseJson.addProperty("LICENSE_ID", rs.getInt("LICENSE_ID"));
            licenseJson.addProperty("LICENSE_KEY", rs.getString("LICENSE_KEY"));
            licenseJson.addProperty("LICENSE_NAME", rs.getString("LICENSE_NAME"));
            resultArray.add(licenseJson);
        }
        if (log.isDebugEnabled()) {
            log.debug("Licenses are retrieved from the LM_LICENSE table.");
        }
        return resultArray;
    }
}
