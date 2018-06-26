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
import org.killbill.billing.client.model.gen.Tier;

/**
 *           DO NOT EDIT !!!
 *
 * This code has been generated by the Kill Bill swagger generator.
 *  @See https://github.com/killbill/killbill-swagger-coden
 */
import org.killbill.billing.client.model.KillBillObject;

public class Usage {

    private String billingPeriod = null;

    private List<Tier> tiers = null;


    public Usage() {
    }

    public Usage(final String billingPeriod,
                     final List<Tier> tiers) {
        this.billingPeriod = billingPeriod;
        this.tiers = tiers;

    }


    public Usage setBillingPeriod(final String billingPeriod) {
        this.billingPeriod = billingPeriod;
        return this;
    }

    public String getBillingPeriod() {
        return billingPeriod;
    }

    public Usage setTiers(final List<Tier> tiers) {
        this.tiers = tiers;
        return this;
    }

    public Usage addTiersItem(final Tier tiersItem) {
        if (this.tiers == null) {
            this.tiers = new ArrayList<Tier>();
        }
        this.tiers.add(tiersItem);
        return this;
    }

    public List<Tier> getTiers() {
        return tiers;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Usage usage = (Usage) o;
        return Objects.equals(this.billingPeriod, usage.billingPeriod) &&
        Objects.equals(this.tiers, usage.tiers);

    }

    @Override
    public int hashCode() {
        return Objects.hash(billingPeriod,
                            tiers);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Usage {\n");
        
        sb.append("    billingPeriod: ").append(toIndentedString(billingPeriod)).append("\n");
        sb.append("    tiers: ").append(toIndentedString(tiers)).append("\n");
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

