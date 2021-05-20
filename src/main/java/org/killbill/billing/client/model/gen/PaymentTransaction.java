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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.joda.time.DateTime;
import org.killbill.billing.catalog.api.Currency;
import org.killbill.billing.client.model.gen.AuditLog;
import org.killbill.billing.client.model.gen.PluginProperty;
import org.killbill.billing.payment.api.TransactionStatus;
import org.killbill.billing.payment.api.TransactionType;

/**
 *           DO NOT EDIT !!!
 *
 * This code has been generated by the Kill Bill swagger generator.
 *  @See https://github.com/killbill/killbill-swagger-coden
 */
import org.killbill.billing.client.model.KillBillObject;

public class PaymentTransaction extends KillBillObject {

    private UUID transactionId = null;

    private String transactionExternalKey = null;

    private UUID paymentId = null;

    private String paymentExternalKey = null;

    private TransactionType transactionType = null;

    private BigDecimal amount = null;

    private Currency currency = null;

    private DateTime effectiveDate = null;

    private BigDecimal processedAmount = null;

    private Currency processedCurrency = null;

    private TransactionStatus status = null;

    private String gatewayErrorCode = null;

    private String gatewayErrorMsg = null;

    private String firstPaymentReferenceId = null;

    private String secondPaymentReferenceId = null;

    private List<PluginProperty> properties = null;



    public PaymentTransaction() {
    }

    public PaymentTransaction(final UUID transactionId,
                     final String transactionExternalKey,
                     final UUID paymentId,
                     final String paymentExternalKey,
                     final TransactionType transactionType,
                     final BigDecimal amount,
                     final Currency currency,
                     final DateTime effectiveDate,
                     final BigDecimal processedAmount,
                     final Currency processedCurrency,
                     final TransactionStatus status,
                     final String gatewayErrorCode,
                     final String gatewayErrorMsg,
                     final String firstPaymentReferenceId,
                     final String secondPaymentReferenceId,
                     final List<PluginProperty> properties,
                     final List<AuditLog> auditLogs) {
        super(auditLogs);
        this.transactionId = transactionId;
        this.transactionExternalKey = transactionExternalKey;
        this.paymentId = paymentId;
        this.paymentExternalKey = paymentExternalKey;
        this.transactionType = transactionType;
        this.amount = amount;
        this.currency = currency;
        this.effectiveDate = effectiveDate;
        this.processedAmount = processedAmount;
        this.processedCurrency = processedCurrency;
        this.status = status;
        this.gatewayErrorCode = gatewayErrorCode;
        this.gatewayErrorMsg = gatewayErrorMsg;
        this.firstPaymentReferenceId = firstPaymentReferenceId;
        this.secondPaymentReferenceId = secondPaymentReferenceId;
        this.properties = properties;

    }


    public PaymentTransaction setTransactionId(final UUID transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    public UUID getTransactionId() {
        return transactionId;
    }

    public PaymentTransaction setTransactionExternalKey(final String transactionExternalKey) {
        this.transactionExternalKey = transactionExternalKey;
        return this;
    }

    public String getTransactionExternalKey() {
        return transactionExternalKey;
    }

    public PaymentTransaction setPaymentId(final UUID paymentId) {
        this.paymentId = paymentId;
        return this;
    }

    public UUID getPaymentId() {
        return paymentId;
    }

    public PaymentTransaction setPaymentExternalKey(final String paymentExternalKey) {
        this.paymentExternalKey = paymentExternalKey;
        return this;
    }

    public String getPaymentExternalKey() {
        return paymentExternalKey;
    }

    public PaymentTransaction setTransactionType(final TransactionType transactionType) {
        this.transactionType = transactionType;
        return this;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public PaymentTransaction setAmount(final BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public PaymentTransaction setCurrency(final Currency currency) {
        this.currency = currency;
        return this;
    }

    public Currency getCurrency() {
        return currency;
    }

    public PaymentTransaction setEffectiveDate(final DateTime effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
    }

    public DateTime getEffectiveDate() {
        return effectiveDate;
    }

    public PaymentTransaction setProcessedAmount(final BigDecimal processedAmount) {
        this.processedAmount = processedAmount;
        return this;
    }

    public BigDecimal getProcessedAmount() {
        return processedAmount;
    }

    public PaymentTransaction setProcessedCurrency(final Currency processedCurrency) {
        this.processedCurrency = processedCurrency;
        return this;
    }

    public Currency getProcessedCurrency() {
        return processedCurrency;
    }

    public PaymentTransaction setStatus(final TransactionStatus status) {
        this.status = status;
        return this;
    }

    public TransactionStatus getStatus() {
        return status;
    }

    public PaymentTransaction setGatewayErrorCode(final String gatewayErrorCode) {
        this.gatewayErrorCode = gatewayErrorCode;
        return this;
    }

    public String getGatewayErrorCode() {
        return gatewayErrorCode;
    }

    public PaymentTransaction setGatewayErrorMsg(final String gatewayErrorMsg) {
        this.gatewayErrorMsg = gatewayErrorMsg;
        return this;
    }

    public String getGatewayErrorMsg() {
        return gatewayErrorMsg;
    }

    public PaymentTransaction setFirstPaymentReferenceId(final String firstPaymentReferenceId) {
        this.firstPaymentReferenceId = firstPaymentReferenceId;
        return this;
    }

    public String getFirstPaymentReferenceId() {
        return firstPaymentReferenceId;
    }

    public PaymentTransaction setSecondPaymentReferenceId(final String secondPaymentReferenceId) {
        this.secondPaymentReferenceId = secondPaymentReferenceId;
        return this;
    }

    public String getSecondPaymentReferenceId() {
        return secondPaymentReferenceId;
    }

    public PaymentTransaction setProperties(final List<PluginProperty> properties) {
        this.properties = properties;
        return this;
    }

    public PaymentTransaction addPropertiesItem(final PluginProperty propertiesItem) {
        if (this.properties == null) {
            this.properties = new ArrayList<PluginProperty>();
        }
        this.properties.add(propertiesItem);
        return this;
    }

    public List<PluginProperty> getProperties() {
        return properties;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PaymentTransaction paymentTransaction = (PaymentTransaction) o;
        return Objects.equals(this.transactionId, paymentTransaction.transactionId) &&
        Objects.equals(this.transactionExternalKey, paymentTransaction.transactionExternalKey) &&
        Objects.equals(this.paymentId, paymentTransaction.paymentId) &&
        Objects.equals(this.paymentExternalKey, paymentTransaction.paymentExternalKey) &&
        Objects.equals(this.transactionType, paymentTransaction.transactionType) &&
        Objects.equals(this.amount, paymentTransaction.amount) &&
        Objects.equals(this.currency, paymentTransaction.currency) &&
        Objects.equals(this.effectiveDate, paymentTransaction.effectiveDate) &&
        Objects.equals(this.processedAmount, paymentTransaction.processedAmount) &&
        Objects.equals(this.processedCurrency, paymentTransaction.processedCurrency) &&
        Objects.equals(this.status, paymentTransaction.status) &&
        Objects.equals(this.gatewayErrorCode, paymentTransaction.gatewayErrorCode) &&
        Objects.equals(this.gatewayErrorMsg, paymentTransaction.gatewayErrorMsg) &&
        Objects.equals(this.firstPaymentReferenceId, paymentTransaction.firstPaymentReferenceId) &&
        Objects.equals(this.secondPaymentReferenceId, paymentTransaction.secondPaymentReferenceId) &&
        Objects.equals(this.properties, paymentTransaction.properties) &&
        Objects.equals(this.auditLogs, paymentTransaction.auditLogs);

    }

    @Override
    public int hashCode() {
        return Objects.hash(transactionId,
                            transactionExternalKey,
                            paymentId,
                            paymentExternalKey,
                            transactionType,
                            amount,
                            currency,
                            effectiveDate,
                            processedAmount,
                            processedCurrency,
                            status,
                            gatewayErrorCode,
                            gatewayErrorMsg,
                            firstPaymentReferenceId,
                            secondPaymentReferenceId,
                            properties,
                            auditLogs, super.hashCode());
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PaymentTransaction {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
        sb.append("    transactionExternalKey: ").append(toIndentedString(transactionExternalKey)).append("\n");
        sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
        sb.append("    paymentExternalKey: ").append(toIndentedString(paymentExternalKey)).append("\n");
        sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
        sb.append("    processedAmount: ").append(toIndentedString(processedAmount)).append("\n");
        sb.append("    processedCurrency: ").append(toIndentedString(processedCurrency)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    gatewayErrorCode: ").append(toIndentedString(gatewayErrorCode)).append("\n");
        sb.append("    gatewayErrorMsg: ").append(toIndentedString(gatewayErrorMsg)).append("\n");
        sb.append("    firstPaymentReferenceId: ").append(toIndentedString(firstPaymentReferenceId)).append("\n");
        sb.append("    secondPaymentReferenceId: ").append(toIndentedString(secondPaymentReferenceId)).append("\n");
        sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
        sb.append("    auditLogs: ").append(toIndentedString(auditLogs)).append("\n");
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

