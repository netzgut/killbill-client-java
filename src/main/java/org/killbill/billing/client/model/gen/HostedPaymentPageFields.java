/*
 * Copyright 2010-2014 Ning, Inc.
 * Copyright 2014-2020 Groupon, Inc
 * Copyright 2020-2021 Equinix, Inc
 * Copyright 2014-2021 The Billing Project, LLC
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
import java.util.ArrayList;
import java.util.List;
import org.killbill.billing.client.model.gen.PluginProperty;

/**
 *           DO NOT EDIT !!!
 *
 * This code has been generated by the Kill Bill swagger generator.
 *  @See https://github.com/killbill/killbill-swagger-coden
 */
import org.killbill.billing.client.model.KillBillObject;

public class HostedPaymentPageFields {

    private List<PluginProperty> formFields = null;


    public HostedPaymentPageFields() {
    }

    public HostedPaymentPageFields(final List<PluginProperty> formFields) {
        this.formFields = formFields;

    }


    public HostedPaymentPageFields setFormFields(final List<PluginProperty> formFields) {
        this.formFields = formFields;
        return this;
    }

    public HostedPaymentPageFields addFormFieldsItem(final PluginProperty formFieldsItem) {
        if (this.formFields == null) {
            this.formFields = new ArrayList<PluginProperty>();
        }
        this.formFields.add(formFieldsItem);
        return this;
    }

    public List<PluginProperty> getFormFields() {
        return formFields;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HostedPaymentPageFields hostedPaymentPageFields = (HostedPaymentPageFields) o;
        return Objects.equals(this.formFields, hostedPaymentPageFields.formFields);

    }

    @Override
    public int hashCode() {
        return Objects.hash(formFields);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HostedPaymentPageFields {\n");
        
        sb.append("    formFields: ").append(toIndentedString(formFields)).append("\n");
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

