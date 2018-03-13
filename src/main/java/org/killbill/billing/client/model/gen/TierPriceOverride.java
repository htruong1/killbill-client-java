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
import org.killbill.billing.client.model.gen.BlockPriceOverride;

/**
 *           DO NOT EDIT !!!
 *
 * This code has been generated by the Kill Bill swagger generator.
 *  @See https://github.com/killbill/killbill-swagger-coden
 */
import org.killbill.billing.client.model.KillBillObject;

public class TierPriceOverride extends KillBillObject {

    private List<BlockPriceOverride> blockPriceOverrides = null;

    public TierPriceOverride blockPriceOverrides(List<BlockPriceOverride> blockPriceOverrides) {
        this.blockPriceOverrides = blockPriceOverrides;
        return this;
    }

    public TierPriceOverride addBlockPriceOverridesItem(BlockPriceOverride blockPriceOverridesItem) {
        if (this.blockPriceOverrides == null) {
            this.blockPriceOverrides = new ArrayList<BlockPriceOverride>();
        }
        this.blockPriceOverrides.add(blockPriceOverridesItem);
        return this;
    }

    
    public List<BlockPriceOverride> getBlockPriceOverrides() {
        return blockPriceOverrides;
    }

    public void setBlockPriceOverrides(List<BlockPriceOverride> blockPriceOverrides) {
        this.blockPriceOverrides = blockPriceOverrides;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TierPriceOverride tierPriceOverride = (TierPriceOverride) o;
        return Objects.equals(this.blockPriceOverrides, tierPriceOverride.blockPriceOverrides);
    }

    @Override
    public int hashCode() {
        return Objects.hash(blockPriceOverrides);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TierPriceOverride {\n");
        
        sb.append("    blockPriceOverrides: ").append(toIndentedString(blockPriceOverrides)).append("\n");
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

