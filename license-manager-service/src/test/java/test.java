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

import org.testng.annotations.Test;
import org.wso2.internal.apps.license.manager.exception.LicenseManagerDataException;
import org.wso2.internal.apps.license.manager.impl.GenerateLicenseTextApiServiceImpl;

import java.io.IOException;

public class test {
    @Test
    public void testLicenseTextGeneration() throws LicenseManagerDataException, IOException {

        GenerateLicenseTextApiServiceImpl serviceImpl = new GenerateLicenseTextApiServiceImpl();
        serviceImpl.generateLicenseFile("wso2is-analytics","5.4.0", "/home/pamoda");
}

}
