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
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.joda.time.LocalDate;
import org.killbill.billing.client.model.gen.PhasePriceOverride;

/**
 *           DO NOT EDIT !!!
 *
 * This code has been generated by the Kill Bill swagger generator.
 *  @See https://github.com/killbill/killbill-swagger-coden
 */
import org.killbill.billing.client.model.KillBillObject;

public class InvoiceDryRun extends KillBillObject {

    private String dryRunType = null;

    private String dryRunAction = null;

    private String phaseType = null;

    private String productName = null;

    private String productCategory = null;

    private String billingPeriod = null;

    private String priceListName = null;

    private UUID subscriptionId = null;

    private UUID bundleId = null;

    private LocalDate effectiveDate = null;

    private String billingPolicy = null;

    private List<PhasePriceOverride> priceOverrides = null;

    public InvoiceDryRun dryRunType(String dryRunType) {
        this.dryRunType = dryRunType;
        return this;
    }

    
    public String getDryRunType() {
        return dryRunType;
    }

    public void setDryRunType(String dryRunType) {
        this.dryRunType = dryRunType;
    }

    public InvoiceDryRun dryRunAction(String dryRunAction) {
        this.dryRunAction = dryRunAction;
        return this;
    }

    
    public String getDryRunAction() {
        return dryRunAction;
    }

    public void setDryRunAction(String dryRunAction) {
        this.dryRunAction = dryRunAction;
    }

    public InvoiceDryRun phaseType(String phaseType) {
        this.phaseType = phaseType;
        return this;
    }

    
    public String getPhaseType() {
        return phaseType;
    }

    public void setPhaseType(String phaseType) {
        this.phaseType = phaseType;
    }

    public InvoiceDryRun productName(String productName) {
        this.productName = productName;
        return this;
    }

    
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public InvoiceDryRun productCategory(String productCategory) {
        this.productCategory = productCategory;
        return this;
    }

    
    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public InvoiceDryRun billingPeriod(String billingPeriod) {
        this.billingPeriod = billingPeriod;
        return this;
    }

    
    public String getBillingPeriod() {
        return billingPeriod;
    }

    public void setBillingPeriod(String billingPeriod) {
        this.billingPeriod = billingPeriod;
    }

    public InvoiceDryRun priceListName(String priceListName) {
        this.priceListName = priceListName;
        return this;
    }

    
    public String getPriceListName() {
        return priceListName;
    }

    public void setPriceListName(String priceListName) {
        this.priceListName = priceListName;
    }

    public InvoiceDryRun subscriptionId(UUID subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    
    public UUID getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(UUID subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public InvoiceDryRun bundleId(UUID bundleId) {
        this.bundleId = bundleId;
        return this;
    }

    
    public UUID getBundleId() {
        return bundleId;
    }

    public void setBundleId(UUID bundleId) {
        this.bundleId = bundleId;
    }

    public InvoiceDryRun effectiveDate(LocalDate effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
    }

    
    public LocalDate getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(LocalDate effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public InvoiceDryRun billingPolicy(String billingPolicy) {
        this.billingPolicy = billingPolicy;
        return this;
    }

    
    public String getBillingPolicy() {
        return billingPolicy;
    }

    public void setBillingPolicy(String billingPolicy) {
        this.billingPolicy = billingPolicy;
    }

    public InvoiceDryRun priceOverrides(List<PhasePriceOverride> priceOverrides) {
        this.priceOverrides = priceOverrides;
        return this;
    }

    public InvoiceDryRun addPriceOverridesItem(PhasePriceOverride priceOverridesItem) {
        if (this.priceOverrides == null) {
            this.priceOverrides = new ArrayList<PhasePriceOverride>();
        }
        this.priceOverrides.add(priceOverridesItem);
        return this;
    }

    
    public List<PhasePriceOverride> getPriceOverrides() {
        return priceOverrides;
    }

    public void setPriceOverrides(List<PhasePriceOverride> priceOverrides) {
        this.priceOverrides = priceOverrides;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InvoiceDryRun invoiceDryRun = (InvoiceDryRun) o;
        return Objects.equals(this.dryRunType, invoiceDryRun.dryRunType) &&
        Objects.equals(this.dryRunAction, invoiceDryRun.dryRunAction) &&
        Objects.equals(this.phaseType, invoiceDryRun.phaseType) &&
        Objects.equals(this.productName, invoiceDryRun.productName) &&
        Objects.equals(this.productCategory, invoiceDryRun.productCategory) &&
        Objects.equals(this.billingPeriod, invoiceDryRun.billingPeriod) &&
        Objects.equals(this.priceListName, invoiceDryRun.priceListName) &&
        Objects.equals(this.subscriptionId, invoiceDryRun.subscriptionId) &&
        Objects.equals(this.bundleId, invoiceDryRun.bundleId) &&
        Objects.equals(this.effectiveDate, invoiceDryRun.effectiveDate) &&
        Objects.equals(this.billingPolicy, invoiceDryRun.billingPolicy) &&
        Objects.equals(this.priceOverrides, invoiceDryRun.priceOverrides);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dryRunType, dryRunAction, phaseType, productName, productCategory, billingPeriod, priceListName, subscriptionId, bundleId, effectiveDate, billingPolicy, priceOverrides);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InvoiceDryRun {\n");
        
        sb.append("    dryRunType: ").append(toIndentedString(dryRunType)).append("\n");
        sb.append("    dryRunAction: ").append(toIndentedString(dryRunAction)).append("\n");
        sb.append("    phaseType: ").append(toIndentedString(phaseType)).append("\n");
        sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
        sb.append("    productCategory: ").append(toIndentedString(productCategory)).append("\n");
        sb.append("    billingPeriod: ").append(toIndentedString(billingPeriod)).append("\n");
        sb.append("    priceListName: ").append(toIndentedString(priceListName)).append("\n");
        sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
        sb.append("    bundleId: ").append(toIndentedString(bundleId)).append("\n");
        sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
        sb.append("    billingPolicy: ").append(toIndentedString(billingPolicy)).append("\n");
        sb.append("    priceOverrides: ").append(toIndentedString(priceOverrides)).append("\n");
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

