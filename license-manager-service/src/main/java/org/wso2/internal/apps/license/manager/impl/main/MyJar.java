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

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.wso2.internal.apps.license.manager.impl.main;

import java.io.File;
import java.io.Serializable;

/**
 * @author pubudu
 */
public class MyJar implements Serializable {

    private String projectName, type, version, product, vendor, description, url;
    private File jarFile, extractedFolder;
    private MyJar parent;
    private boolean isBundle = false;
    private boolean isValidName = false;

    public void setIsBundle(boolean isBundle) {
        this.isBundle = isBundle;
    }

    public boolean isBundle() {
        return isBundle;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public MyJar getParent() {
        return parent;
    }

    public void setParent(MyJar parent) {
        this.parent = parent;

    }

    public File getExtractedFolder() {
        return extractedFolder;
    }

    public void setExtractedFolder(File extractedFolder) {
        this.extractedFolder = extractedFolder;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;

    }

    public File getJarFile() {
        return jarFile;

    }

    public void setJarFile(File jarFile) {
        this.jarFile = jarFile;

    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;

    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;

    }

    public void print() {
        System.out.println("jarFile = " + jarFile.getName());
        System.out.println("version = " + version);
        System.out.println("type = " + type);
        System.out.println("product = " + product);
        System.out.println("projectName = " + projectName);
        System.out.println("extractedFolder = " + extractedFolder);
        String s = (parent == null) ? null : parent.getJarFile().getName();
        System.out.println("parent = " + s);
        System.out.println("url = " + url);
        System.out.println("description = " + description);
        System.out.println("vendor = " + vendor);
        System.out.println("");
    }

    public boolean isValidName() {
        return this.isValidName;
    }

    public void setValidName(boolean validName) {
        this.isValidName = validName;
    }
}
