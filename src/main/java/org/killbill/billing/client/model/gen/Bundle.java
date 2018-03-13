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
import org.killbill.billing.client.model.gen.BundleTimeline;
import org.killbill.billing.client.model.gen.Subscription;

/**
 *           DO NOT EDIT !!!
 *
 * This code has been generated by the Kill Bill swagger generator.
 *  @See https://github.com/killbill/killbill-swagger-coden
 */
import org.killbill.billing.client.model.KillBillObject;

public class Bundle extends KillBillObject {

    private UUID accountId = null;

    private UUID bundleId = null;

    private String externalKey = null;

    private List<Subscription> subscriptions = null;

    private BundleTimeline timeline = null;

    public Bundle accountId(UUID accountId) {
        this.accountId = accountId;
        return this;
    }

    
    public UUID getAccountId() {
        return accountId;
    }

    public void setAccountId(UUID accountId) {
        this.accountId = accountId;
    }

    public Bundle bundleId(UUID bundleId) {
        this.bundleId = bundleId;
        return this;
    }

    
    public UUID getBundleId() {
        return bundleId;
    }

    public void setBundleId(UUID bundleId) {
        this.bundleId = bundleId;
    }

    public Bundle externalKey(String externalKey) {
        this.externalKey = externalKey;
        return this;
    }

    
    public String getExternalKey() {
        return externalKey;
    }

    public void setExternalKey(String externalKey) {
        this.externalKey = externalKey;
    }

    public Bundle subscriptions(List<Subscription> subscriptions) {
        this.subscriptions = subscriptions;
        return this;
    }

    public Bundle addSubscriptionsItem(Subscription subscriptionsItem) {
        if (this.subscriptions == null) {
            this.subscriptions = new ArrayList<Subscription>();
        }
        this.subscriptions.add(subscriptionsItem);
        return this;
    }

    
    public List<Subscription> getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(List<Subscription> subscriptions) {
        this.subscriptions = subscriptions;
    }

    public Bundle timeline(BundleTimeline timeline) {
        this.timeline = timeline;
        return this;
    }

    
    public BundleTimeline getTimeline() {
        return timeline;
    }

    public void setTimeline(BundleTimeline timeline) {
        this.timeline = timeline;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Bundle bundle = (Bundle) o;
        return Objects.equals(this.accountId, bundle.accountId) &&
        Objects.equals(this.bundleId, bundle.bundleId) &&
        Objects.equals(this.externalKey, bundle.externalKey) &&
        Objects.equals(this.subscriptions, bundle.subscriptions) &&
        Objects.equals(this.timeline, bundle.timeline);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId, bundleId, externalKey, subscriptions, timeline);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Bundle {\n");
        
        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    bundleId: ").append(toIndentedString(bundleId)).append("\n");
        sb.append("    externalKey: ").append(toIndentedString(externalKey)).append("\n");
        sb.append("    subscriptions: ").append(toIndentedString(subscriptions)).append("\n");
        sb.append("    timeline: ").append(toIndentedString(timeline)).append("\n");
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

