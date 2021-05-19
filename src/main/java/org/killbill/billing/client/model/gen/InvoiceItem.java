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
import org.joda.time.LocalDate;
import org.killbill.billing.catalog.api.Currency;
import org.killbill.billing.client.model.gen.AuditLog;
import org.killbill.billing.client.model.gen.InvoiceItem;
import org.killbill.billing.invoice.api.InvoiceItemType;

/**
 *           DO NOT EDIT !!!
 *
 * This code has been generated by the Kill Bill swagger generator.
 *  @See https://github.com/killbill/killbill-swagger-coden
 */
import org.killbill.billing.client.model.KillBillObject;

public class InvoiceItem extends KillBillObject {

    private UUID invoiceItemId = null;

    private UUID invoiceId = null;

    private UUID linkedInvoiceItemId = null;

    private UUID accountId = null;

    private UUID childAccountId = null;

    private UUID bundleId = null;

    private UUID subscriptionId = null;

    private String productName = null;

    private String planName = null;

    private String phaseName = null;

    private String usageName = null;

    private String prettyProductName = null;

    private String prettyPlanName = null;

    private String prettyPhaseName = null;

    private String prettyUsageName = null;

    private InvoiceItemType itemType = null;

    private String description = null;

    private LocalDate startDate = null;

    private LocalDate endDate = null;

    private BigDecimal amount = null;

    private BigDecimal rate = null;

    private Currency currency = null;

    private Integer quantity = null;

    private String itemDetails = null;

    private DateTime catalogEffectiveDate = null;

    private List<InvoiceItem> childItems = null;



    public InvoiceItem() {
    }

    public InvoiceItem(final UUID invoiceItemId,
                     final UUID invoiceId,
                     final UUID linkedInvoiceItemId,
                     final UUID accountId,
                     final UUID childAccountId,
                     final UUID bundleId,
                     final UUID subscriptionId,
                     final String productName,
                     final String planName,
                     final String phaseName,
                     final String usageName,
                     final String prettyProductName,
                     final String prettyPlanName,
                     final String prettyPhaseName,
                     final String prettyUsageName,
                     final InvoiceItemType itemType,
                     final String description,
                     final LocalDate startDate,
                     final LocalDate endDate,
                     final BigDecimal amount,
                     final BigDecimal rate,
                     final Currency currency,
                     final Integer quantity,
                     final String itemDetails,
                     final DateTime catalogEffectiveDate,
                     final List<InvoiceItem> childItems,
                     final List<AuditLog> auditLogs) {
        super(auditLogs);
        this.invoiceItemId = invoiceItemId;
        this.invoiceId = invoiceId;
        this.linkedInvoiceItemId = linkedInvoiceItemId;
        this.accountId = accountId;
        this.childAccountId = childAccountId;
        this.bundleId = bundleId;
        this.subscriptionId = subscriptionId;
        this.productName = productName;
        this.planName = planName;
        this.phaseName = phaseName;
        this.usageName = usageName;
        this.prettyProductName = prettyProductName;
        this.prettyPlanName = prettyPlanName;
        this.prettyPhaseName = prettyPhaseName;
        this.prettyUsageName = prettyUsageName;
        this.itemType = itemType;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.amount = amount;
        this.rate = rate;
        this.currency = currency;
        this.quantity = quantity;
        this.itemDetails = itemDetails;
        this.catalogEffectiveDate = catalogEffectiveDate;
        this.childItems = childItems;

    }


    public InvoiceItem setInvoiceItemId(final UUID invoiceItemId) {
        this.invoiceItemId = invoiceItemId;
        return this;
    }

    public UUID getInvoiceItemId() {
        return invoiceItemId;
    }

    public InvoiceItem setInvoiceId(final UUID invoiceId) {
        this.invoiceId = invoiceId;
        return this;
    }

    public UUID getInvoiceId() {
        return invoiceId;
    }

    public InvoiceItem setLinkedInvoiceItemId(final UUID linkedInvoiceItemId) {
        this.linkedInvoiceItemId = linkedInvoiceItemId;
        return this;
    }

    public UUID getLinkedInvoiceItemId() {
        return linkedInvoiceItemId;
    }

    public InvoiceItem setAccountId(final UUID accountId) {
        this.accountId = accountId;
        return this;
    }

    public UUID getAccountId() {
        return accountId;
    }

    public InvoiceItem setChildAccountId(final UUID childAccountId) {
        this.childAccountId = childAccountId;
        return this;
    }

    public UUID getChildAccountId() {
        return childAccountId;
    }

    public InvoiceItem setBundleId(final UUID bundleId) {
        this.bundleId = bundleId;
        return this;
    }

    public UUID getBundleId() {
        return bundleId;
    }

    public InvoiceItem setSubscriptionId(final UUID subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    public UUID getSubscriptionId() {
        return subscriptionId;
    }

    public InvoiceItem setProductName(final String productName) {
        this.productName = productName;
        return this;
    }

    public String getProductName() {
        return productName;
    }

    public InvoiceItem setPlanName(final String planName) {
        this.planName = planName;
        return this;
    }

    public String getPlanName() {
        return planName;
    }

    public InvoiceItem setPhaseName(final String phaseName) {
        this.phaseName = phaseName;
        return this;
    }

    public String getPhaseName() {
        return phaseName;
    }

    public InvoiceItem setUsageName(final String usageName) {
        this.usageName = usageName;
        return this;
    }

    public String getUsageName() {
        return usageName;
    }

    public InvoiceItem setPrettyProductName(final String prettyProductName) {
        this.prettyProductName = prettyProductName;
        return this;
    }

    public String getPrettyProductName() {
        return prettyProductName;
    }

    public InvoiceItem setPrettyPlanName(final String prettyPlanName) {
        this.prettyPlanName = prettyPlanName;
        return this;
    }

    public String getPrettyPlanName() {
        return prettyPlanName;
    }

    public InvoiceItem setPrettyPhaseName(final String prettyPhaseName) {
        this.prettyPhaseName = prettyPhaseName;
        return this;
    }

    public String getPrettyPhaseName() {
        return prettyPhaseName;
    }

    public InvoiceItem setPrettyUsageName(final String prettyUsageName) {
        this.prettyUsageName = prettyUsageName;
        return this;
    }

    public String getPrettyUsageName() {
        return prettyUsageName;
    }

    public InvoiceItem setItemType(final InvoiceItemType itemType) {
        this.itemType = itemType;
        return this;
    }

    public InvoiceItemType getItemType() {
        return itemType;
    }

    public InvoiceItem setDescription(final String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public InvoiceItem setStartDate(final LocalDate startDate) {
        this.startDate = startDate;
        return this;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public InvoiceItem setEndDate(final LocalDate endDate) {
        this.endDate = endDate;
        return this;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public InvoiceItem setAmount(final BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public InvoiceItem setRate(final BigDecimal rate) {
        this.rate = rate;
        return this;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public InvoiceItem setCurrency(final Currency currency) {
        this.currency = currency;
        return this;
    }

    public Currency getCurrency() {
        return currency;
    }

    public InvoiceItem setQuantity(final Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public InvoiceItem setItemDetails(final String itemDetails) {
        this.itemDetails = itemDetails;
        return this;
    }

    public String getItemDetails() {
        return itemDetails;
    }

    public InvoiceItem setCatalogEffectiveDate(final DateTime catalogEffectiveDate) {
        this.catalogEffectiveDate = catalogEffectiveDate;
        return this;
    }

    public DateTime getCatalogEffectiveDate() {
        return catalogEffectiveDate;
    }

    public InvoiceItem setChildItems(final List<InvoiceItem> childItems) {
        this.childItems = childItems;
        return this;
    }

    public InvoiceItem addChildItemsItem(final InvoiceItem childItemsItem) {
        if (this.childItems == null) {
            this.childItems = new ArrayList<InvoiceItem>();
        }
        this.childItems.add(childItemsItem);
        return this;
    }

    public List<InvoiceItem> getChildItems() {
        return childItems;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InvoiceItem invoiceItem = (InvoiceItem) o;
        return Objects.equals(this.invoiceItemId, invoiceItem.invoiceItemId) &&
        Objects.equals(this.invoiceId, invoiceItem.invoiceId) &&
        Objects.equals(this.linkedInvoiceItemId, invoiceItem.linkedInvoiceItemId) &&
        Objects.equals(this.accountId, invoiceItem.accountId) &&
        Objects.equals(this.childAccountId, invoiceItem.childAccountId) &&
        Objects.equals(this.bundleId, invoiceItem.bundleId) &&
        Objects.equals(this.subscriptionId, invoiceItem.subscriptionId) &&
        Objects.equals(this.productName, invoiceItem.productName) &&
        Objects.equals(this.planName, invoiceItem.planName) &&
        Objects.equals(this.phaseName, invoiceItem.phaseName) &&
        Objects.equals(this.usageName, invoiceItem.usageName) &&
        Objects.equals(this.prettyProductName, invoiceItem.prettyProductName) &&
        Objects.equals(this.prettyPlanName, invoiceItem.prettyPlanName) &&
        Objects.equals(this.prettyPhaseName, invoiceItem.prettyPhaseName) &&
        Objects.equals(this.prettyUsageName, invoiceItem.prettyUsageName) &&
        Objects.equals(this.itemType, invoiceItem.itemType) &&
        Objects.equals(this.description, invoiceItem.description) &&
        Objects.equals(this.startDate, invoiceItem.startDate) &&
        Objects.equals(this.endDate, invoiceItem.endDate) &&
        Objects.equals(this.amount, invoiceItem.amount) &&
        Objects.equals(this.rate, invoiceItem.rate) &&
        Objects.equals(this.currency, invoiceItem.currency) &&
        Objects.equals(this.quantity, invoiceItem.quantity) &&
        Objects.equals(this.itemDetails, invoiceItem.itemDetails) &&
        Objects.equals(this.catalogEffectiveDate, invoiceItem.catalogEffectiveDate) &&
        Objects.equals(this.childItems, invoiceItem.childItems) &&
        Objects.equals(this.auditLogs, invoiceItem.auditLogs);

    }

    @Override
    public int hashCode() {
        return Objects.hash(invoiceItemId,
                            invoiceId,
                            linkedInvoiceItemId,
                            accountId,
                            childAccountId,
                            bundleId,
                            subscriptionId,
                            productName,
                            planName,
                            phaseName,
                            usageName,
                            prettyProductName,
                            prettyPlanName,
                            prettyPhaseName,
                            prettyUsageName,
                            itemType,
                            description,
                            startDate,
                            endDate,
                            amount,
                            rate,
                            currency,
                            quantity,
                            itemDetails,
                            catalogEffectiveDate,
                            childItems,
                            auditLogs, super.hashCode());
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InvoiceItem {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    invoiceItemId: ").append(toIndentedString(invoiceItemId)).append("\n");
        sb.append("    invoiceId: ").append(toIndentedString(invoiceId)).append("\n");
        sb.append("    linkedInvoiceItemId: ").append(toIndentedString(linkedInvoiceItemId)).append("\n");
        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    childAccountId: ").append(toIndentedString(childAccountId)).append("\n");
        sb.append("    bundleId: ").append(toIndentedString(bundleId)).append("\n");
        sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
        sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
        sb.append("    planName: ").append(toIndentedString(planName)).append("\n");
        sb.append("    phaseName: ").append(toIndentedString(phaseName)).append("\n");
        sb.append("    usageName: ").append(toIndentedString(usageName)).append("\n");
        sb.append("    prettyProductName: ").append(toIndentedString(prettyProductName)).append("\n");
        sb.append("    prettyPlanName: ").append(toIndentedString(prettyPlanName)).append("\n");
        sb.append("    prettyPhaseName: ").append(toIndentedString(prettyPhaseName)).append("\n");
        sb.append("    prettyUsageName: ").append(toIndentedString(prettyUsageName)).append("\n");
        sb.append("    itemType: ").append(toIndentedString(itemType)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
        sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
        sb.append("    itemDetails: ").append(toIndentedString(itemDetails)).append("\n");
        sb.append("    catalogEffectiveDate: ").append(toIndentedString(catalogEffectiveDate)).append("\n");
        sb.append("    childItems: ").append(toIndentedString(childItems)).append("\n");
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

