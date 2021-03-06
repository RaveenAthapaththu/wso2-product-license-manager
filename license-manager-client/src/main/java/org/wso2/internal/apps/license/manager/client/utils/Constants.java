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
package org.wso2.internal.apps.license.manager.client.utils;

/**
 * Contains the constants for License Manager application
 */
public class Constants {

    public static final String DOWNLOAD_ENDPOINT = "/license/textToDownload";
    // Constants for accessing configuration details.
    static final String CONFIG_FILE_NAME = "config.properties";
    static final String MICRO_SERVICE_URL = "micro_service_url";
    static final String MICRO_SERVICE_USERNAME = "micro_service_username";
    static final String MICRO_SERVICE_PASSWORD = "micro_service_password";
    static final String KEYSTORE_FILE_NAME = "sso_keystore_file_name";
    static final String KEYSTORE_PASSWORD = "sso_keystore_password";
    static final String CERTIFICATE_ALIAS = "sso_certificate_alias";
    static final String SSO_REDIRECT_URL = "sso_redirect_url";
    static final String ALLOWED_USER_ROLE = "allowed_user_role";
    static final String TRUST_STORE_SERVICE_NAME = "trust_store_service_name";
    static final String TRUST_STORE_SERVICE_PASSWORD = "trust_store_service_password";
    static final String FTP_SERVER_ADDRESS = "ftp_server_address";
    static final String FTP_SERVER_USERNAME = "ftp_server_username";
    static final String FTP_SERVER_PASSWORD = "ftp_server_password";
    static final String FTP_SERVER_PORT = "ftp_server_port";

}
