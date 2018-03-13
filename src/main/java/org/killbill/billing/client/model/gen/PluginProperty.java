/*
 * Copyright 2014-2018 Groupon, Inc
 * Copyright 2014-2018 The Billing Project, LLC
 *
 * The Billing Project licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */


package org.killbill.billing.client.model.gen;

import java.util.Objects;
import java.util.Arrays;

/**
 *           DO NOT EDIT !!!
 *
 * This code has been generated by the Kill Bill swagger generator.
 *  @See https://github.com/killbill/killbill-swagger-coden
 */
import org.killbill.billing.client.model.KillBillObject;

public class PluginProperty extends KillBillObject {

    private String key = null;

    private String value = null;

    private Boolean isUpdatable = false;

    public PluginProperty key(String key) {
        this.key = key;
        return this;
    }

    
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public PluginProperty value(String value) {
        this.value = value;
        return this;
    }

    
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public PluginProperty isUpdatable(Boolean isUpdatable) {
        this.isUpdatable = isUpdatable;
        return this;
    }

    
    public Boolean isIsUpdatable() {
        return isUpdatable;
    }

    public void setIsUpdatable(Boolean isUpdatable) {
        this.isUpdatable = isUpdatable;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PluginProperty pluginProperty = (PluginProperty) o;
        return Objects.equals(this.key, pluginProperty.key) &&
        Objects.equals(this.value, pluginProperty.value) &&
        Objects.equals(this.isUpdatable, pluginProperty.isUpdatable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value, isUpdatable);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PluginProperty {\n");
        
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    isUpdatable: ").append(toIndentedString(isUpdatable)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

