/*
 * Copyright 2010-2014 Ning, Inc.
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

package org.killbill.billing.client.model;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

import javax.annotation.Nullable;

import org.joda.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Credit extends KillBillObject {

    private BigDecimal creditAmount;
    private UUID invoiceId;
    private String invoiceNumber;
    private LocalDate effectiveDate;
    private UUID accountId;
    private String description;
    private String itemDetails;
    private String currency;

    public Credit() {}

    @JsonCreator
    public Credit(@JsonProperty("creditAmount") final BigDecimal creditAmount,
                  @JsonProperty("currency") final String currency,
                  @JsonProperty("invoiceId") final UUID invoiceId,
                  @JsonProperty("invoiceNumber") final String invoiceNumber,
                  @JsonProperty("effectiveDate") final LocalDate effectiveDate,
                  @JsonProperty("accountId") final UUID accountId,
                  @JsonProperty("description") final String description,
                  @JsonProperty("itemDetails") final String itemDetails,
                  @JsonProperty("auditLogs") @Nullable final List<AuditLog> auditLogs) {
        super(auditLogs);
        this.creditAmount = creditAmount;
        this.currency = currency;
        this.invoiceId = invoiceId;
        this.invoiceNumber = invoiceNumber;
        this.effectiveDate = effectiveDate;
        this.description = description;
        this.itemDetails = itemDetails;
        this.accountId = accountId;
    }

    public BigDecimal getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(final BigDecimal creditAmount) {
        this.creditAmount = creditAmount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(final String currency) {
        this.currency = currency;
    }

    public UUID getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(final UUID invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(final String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public LocalDate getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(final LocalDate effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public UUID getAccountId() {
        return accountId;
    }

    public void setAccountId(final UUID accountId) {
        this.accountId = accountId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public String getItemDetails() {
        return itemDetails;
    }

    public void setItemDetails(final String itemDetails) {
        this.itemDetails = itemDetails;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Credit{");
        sb.append("creditAmount=").append(creditAmount);
        sb.append("currency=").append(currency);
        sb.append(", invoiceId='").append(invoiceId).append('\'');
        sb.append(", invoiceNumber='").append(invoiceNumber).append('\'');
        sb.append(", effectiveDate=").append(effectiveDate);
        sb.append(", description=").append(description);
        sb.append(", itemDetails=").append(itemDetails);
        sb.append(", accountId='").append(accountId).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        final Credit credit = (Credit) o;

        if (accountId != null ? !accountId.equals(credit.accountId) : credit.accountId != null) {
            return false;
        }
        if (creditAmount != null ? creditAmount.compareTo(credit.creditAmount) != 0 : credit.creditAmount != null) {
            return false;
        }
        if (currency != null ? !currency.equals(credit.currency) : credit.currency != null) {
            return false;
        }
        if (effectiveDate != null ? effectiveDate.compareTo(credit.effectiveDate) != 0 : credit.effectiveDate != null) {
            return false;
        }
        if (invoiceId != null ? !invoiceId.equals(credit.invoiceId) : credit.invoiceId != null) {
            return false;
        }
        if (invoiceNumber != null ? !invoiceNumber.equals(credit.invoiceNumber) : credit.invoiceNumber != null) {
            return false;
        }
        if (description != null ? !description.equals(credit.description) : credit.description != null) {
            return false;
        }
        if (itemDetails != null ? !itemDetails.equals(credit.itemDetails) : credit.itemDetails != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = creditAmount != null ? creditAmount.hashCode() : 0;
        result = 31 * result + (currency != null ? currency.hashCode() : 0);
        result = 31 * result + (invoiceId != null ? invoiceId.hashCode() : 0);
        result = 31 * result + (invoiceNumber != null ? invoiceNumber.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (itemDetails != null ? itemDetails.hashCode() : 0);
        result = 31 * result + (effectiveDate != null ? effectiveDate.hashCode() : 0);
        result = 31 * result + (accountId != null ? accountId.hashCode() : 0);
        return result;
    }
}
