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


package org.killbill.billing.client.api.gen;


import org.killbill.billing.client.model.gen.CustomField;
import org.killbill.billing.client.model.gen.Tag;
import java.util.UUID;
import org.killbill.billing.client.model.CustomFields;
import java.util.List;
import org.killbill.billing.client.model.Tags;
import org.killbill.billing.util.api.AuditLevel;

import com.google.common.collect.Multimap;
import com.google.common.base.Preconditions;
import com.google.common.base.MoreObjects;
import com.google.common.collect.LinkedListMultimap;

import org.killbill.billing.client.Converter;
import org.killbill.billing.client.KillBillClientException;
import org.killbill.billing.client.KillBillHttpClient;
import org.killbill.billing.client.RequestOptions;
import org.killbill.billing.client.RequestOptions.RequestOptionsBuilder;


/**
 *           DO NOT EDIT !!!
 *
 * This code has been generated by the Kill Bill swagger generator.
 *  @See https://github.com/killbill/killbill-swagger-coden
 */
public class InvoiceItemApi {

    private final KillBillHttpClient httpClient;

    public InvoiceItemApi() {
        this(new KillBillHttpClient());
    }

    public InvoiceItemApi(final KillBillHttpClient httpClient) {
        this.httpClient = httpClient;
    }

    public CustomFields createCustomFields(final UUID invoiceItemId, final CustomFields body,  final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(invoiceItemId, "Missing the required parameter 'invoiceItemId' when calling createCustomFields");
        Preconditions.checkNotNull(body, "Missing the required parameter 'body' when calling createCustomFields");

        final String uri = "/1.0/kb/invoiceItems/{invoiceItemId}/customFields"
          .replaceAll("\\{" + "invoiceItemId" + "\\}", invoiceItemId.toString());


        final RequestOptionsBuilder inputOptionsBuilder = inputOptions.extend();
        final Boolean followLocation = MoreObjects.firstNonNull(inputOptions.getFollowLocation(), Boolean.TRUE);
        inputOptionsBuilder.withFollowLocation(followLocation);
        inputOptionsBuilder.withHeader(KillBillHttpClient.HTTP_HEADER_CONTENT_TYPE, "application/json");
        inputOptionsBuilder.withHeader(KillBillHttpClient.HTTP_HEADER_ACCEPT, "application/json");
        final RequestOptions requestOptions = inputOptionsBuilder.build();

        return httpClient.doPost(uri, body, CustomFields.class, requestOptions);
    }

    public Tags createTags(final UUID invoiceItemId, final List<String> tagDef,  final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(invoiceItemId, "Missing the required parameter 'invoiceItemId' when calling createTags");

        final String uri = "/1.0/kb/invoiceItems/{invoiceItemId}/tags"
          .replaceAll("\\{" + "invoiceItemId" + "\\}", invoiceItemId.toString());

        final Multimap<String, String> queryParams = LinkedListMultimap.create(inputOptions.getQueryParams());
        if (tagDef != null) {
            queryParams.putAll("tagDef", tagDef);
        }

        final RequestOptionsBuilder inputOptionsBuilder = inputOptions.extend();
        final Boolean followLocation = MoreObjects.firstNonNull(inputOptions.getFollowLocation(), Boolean.TRUE);
        inputOptionsBuilder.withFollowLocation(followLocation);
        inputOptionsBuilder.withQueryParams(queryParams);
        inputOptionsBuilder.withHeader(KillBillHttpClient.HTTP_HEADER_CONTENT_TYPE, "application/json");
        inputOptionsBuilder.withHeader(KillBillHttpClient.HTTP_HEADER_ACCEPT, "application/json");
        final RequestOptions requestOptions = inputOptionsBuilder.build();

        return httpClient.doPost(uri, null, Tags.class, requestOptions);
    }


    public void deleteCustomFields(final UUID invoiceItemId, final List<String> customField,  final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(invoiceItemId, "Missing the required parameter 'invoiceItemId' when calling deleteCustomFields");

        final String uri = "/1.0/kb/invoiceItems/{invoiceItemId}/customFields"
          .replaceAll("\\{" + "invoiceItemId" + "\\}", invoiceItemId.toString());

        final Multimap<String, String> queryParams = LinkedListMultimap.create(inputOptions.getQueryParams());
        if (customField != null) {
            queryParams.putAll("customField", customField);
        }

        final RequestOptionsBuilder inputOptionsBuilder = inputOptions.extend();
        inputOptionsBuilder.withQueryParams(queryParams);
        inputOptionsBuilder.withHeader(KillBillHttpClient.HTTP_HEADER_ACCEPT, "application/json");
        final RequestOptions requestOptions = inputOptionsBuilder.build();

        httpClient.doDelete(uri, requestOptions);
    }


    public void deleteTags(final UUID invoiceItemId, final List<UUID> tagDef,  final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(invoiceItemId, "Missing the required parameter 'invoiceItemId' when calling deleteTags");

        final String uri = "/1.0/kb/invoiceItems/{invoiceItemId}/tags"
          .replaceAll("\\{" + "invoiceItemId" + "\\}", invoiceItemId.toString());

        final Multimap<String, String> queryParams = LinkedListMultimap.create(inputOptions.getQueryParams());
        if (tagDef != null) {
            queryParams.putAll("tagDef", Converter.convertUUIDListToStringList(tagDef));
        }

        final RequestOptionsBuilder inputOptionsBuilder = inputOptions.extend();
        inputOptionsBuilder.withQueryParams(queryParams);
        inputOptionsBuilder.withHeader(KillBillHttpClient.HTTP_HEADER_ACCEPT, "application/json");
        final RequestOptions requestOptions = inputOptionsBuilder.build();

        httpClient.doDelete(uri, requestOptions);
    }

    public CustomFields getCustomFields(final UUID invoiceItemId,  final RequestOptions inputOptions) throws KillBillClientException {
        return getCustomFields(invoiceItemId, AuditLevel.NONE, inputOptions);
    }

    public CustomFields getCustomFields(final UUID invoiceItemId, final AuditLevel audit,  final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(invoiceItemId, "Missing the required parameter 'invoiceItemId' when calling getCustomFields");

        final String uri = "/1.0/kb/invoiceItems/{invoiceItemId}/customFields"
          .replaceAll("\\{" + "invoiceItemId" + "\\}", invoiceItemId.toString());

        final Multimap<String, String> queryParams = LinkedListMultimap.create(inputOptions.getQueryParams());
        if (audit != null) {
            queryParams.put("audit", String.valueOf(audit));
        }

        final RequestOptionsBuilder inputOptionsBuilder = inputOptions.extend();
        inputOptionsBuilder.withQueryParams(queryParams);
        inputOptionsBuilder.withHeader(KillBillHttpClient.HTTP_HEADER_CONTENT_TYPE, "application/json");
        final RequestOptions requestOptions = inputOptionsBuilder.build();

        return httpClient.doGet(uri, CustomFields.class, requestOptions);
    }

    public Tags getTags(final UUID invoiceItemId, final UUID accountId,  final RequestOptions inputOptions) throws KillBillClientException {
        return getTags(invoiceItemId, accountId, Boolean.valueOf(false), AuditLevel.NONE, inputOptions);
    }

    public Tags getTags(final UUID invoiceItemId, final UUID accountId, final Boolean includedDeleted, final AuditLevel audit,  final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(invoiceItemId, "Missing the required parameter 'invoiceItemId' when calling getTags");
        Preconditions.checkNotNull(accountId, "Missing the required parameter 'accountId' when calling getTags");

        final String uri = "/1.0/kb/invoiceItems/{invoiceItemId}/tags"
          .replaceAll("\\{" + "invoiceItemId" + "\\}", invoiceItemId.toString());

        final Multimap<String, String> queryParams = LinkedListMultimap.create(inputOptions.getQueryParams());
        if (accountId != null) {
            queryParams.put("accountId", String.valueOf(accountId));
        }
        if (includedDeleted != null) {
            queryParams.put("includedDeleted", String.valueOf(includedDeleted));
        }
        if (audit != null) {
            queryParams.put("audit", String.valueOf(audit));
        }

        final RequestOptionsBuilder inputOptionsBuilder = inputOptions.extend();
        inputOptionsBuilder.withQueryParams(queryParams);
        inputOptionsBuilder.withHeader(KillBillHttpClient.HTTP_HEADER_CONTENT_TYPE, "application/json");
        final RequestOptions requestOptions = inputOptionsBuilder.build();

        return httpClient.doGet(uri, Tags.class, requestOptions);
    }

    public void modifyCustomFields(final UUID invoiceItemId, final CustomFields body,  final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(invoiceItemId, "Missing the required parameter 'invoiceItemId' when calling modifyCustomFields");
        Preconditions.checkNotNull(body, "Missing the required parameter 'body' when calling modifyCustomFields");

        final String uri = "/1.0/kb/invoiceItems/{invoiceItemId}/customFields"
          .replaceAll("\\{" + "invoiceItemId" + "\\}", invoiceItemId.toString());


        final RequestOptionsBuilder inputOptionsBuilder = inputOptions.extend();
        inputOptionsBuilder.withHeader(KillBillHttpClient.HTTP_HEADER_CONTENT_TYPE, "application/json");
        inputOptionsBuilder.withHeader(KillBillHttpClient.HTTP_HEADER_ACCEPT, "application/json");
        final RequestOptions requestOptions = inputOptionsBuilder.build();

        httpClient.doPut(uri, body, requestOptions);
    }

}
