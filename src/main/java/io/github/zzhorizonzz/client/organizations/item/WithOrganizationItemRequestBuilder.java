package io.github.zzhorizonzz.client.organizations.item;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import io.github.zzhorizonzz.client.models.ClerkErrors;
import io.github.zzhorizonzz.client.models.DeletedObject;
import io.github.zzhorizonzz.client.models.Organization;
import io.github.zzhorizonzz.client.organizations.item.invitations.InvitationsRequestBuilder;
import io.github.zzhorizonzz.client.organizations.item.logo.LogoRequestBuilder;
import io.github.zzhorizonzz.client.organizations.item.memberships.MembershipsRequestBuilder;
import io.github.zzhorizonzz.client.organizations.item.metadata.MetadataRequestBuilder;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /organizations/{organization_id}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithOrganizationItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The invitations property
     */
    @jakarta.annotation.Nonnull
    public InvitationsRequestBuilder invitations() {
        return new InvitationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The logo property
     */
    @jakarta.annotation.Nonnull
    public LogoRequestBuilder logo() {
        return new LogoRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The memberships property
     */
    @jakarta.annotation.Nonnull
    public MembershipsRequestBuilder memberships() {
        return new MembershipsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The metadata property
     */
    @jakarta.annotation.Nonnull
    public MetadataRequestBuilder metadata() {
        return new MetadataRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new WithOrganization_ItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithOrganizationItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/organizations/{organization_id}", pathParameters);
    }
    /**
     * Instantiates a new WithOrganization_ItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithOrganizationItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/organizations/{organization_id}", rawUrl);
    }
    /**
     * Deletes the given organization.Please note that deleting an organization will also delete all memberships and invitations.This is not reversible.
     * @return a DeletedObject
     */
    @jakarta.annotation.Nullable
    public DeletedObject delete() {
        return delete(null);
    }
    /**
     * Deletes the given organization.Please note that deleting an organization will also delete all memberships and invitations.This is not reversible.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a DeletedObject
     */
    @jakarta.annotation.Nullable
    public DeletedObject delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("404", ClerkErrors::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, DeletedObject::createFromDiscriminatorValue);
    }
    /**
     * Fetches the organization whose ID or slug matches the provided `id_or_slug` URL query parameter.
     * @return a Organization
     */
    @jakarta.annotation.Nullable
    public Organization get() {
        return get(null);
    }
    /**
     * Fetches the organization whose ID or slug matches the provided `id_or_slug` URL query parameter.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a Organization
     */
    @jakarta.annotation.Nullable
    public Organization get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("403", ClerkErrors::createFromDiscriminatorValue);
        errorMapping.put("404", ClerkErrors::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, Organization::createFromDiscriminatorValue);
    }
    /**
     * Updates an existing organization
     * @param body The request body
     * @return a Organization
     */
    @jakarta.annotation.Nullable
    public Organization patch(@jakarta.annotation.Nonnull final WithOrganizationPatchRequestBody body) {
        return patch(body, null);
    }
    /**
     * Updates an existing organization
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a Organization
     */
    @jakarta.annotation.Nullable
    public Organization patch(@jakarta.annotation.Nonnull final WithOrganizationPatchRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("402", ClerkErrors::createFromDiscriminatorValue);
        errorMapping.put("404", ClerkErrors::createFromDiscriminatorValue);
        errorMapping.put("422", ClerkErrors::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, Organization::createFromDiscriminatorValue);
    }
    /**
     * Deletes the given organization.Please note that deleting an organization will also delete all memberships and invitations.This is not reversible.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Deletes the given organization.Please note that deleting an organization will also delete all memberships and invitations.This is not reversible.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Fetches the organization whose ID or slug matches the provided `id_or_slug` URL query parameter.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Fetches the organization whose ID or slug matches the provided `id_or_slug` URL query parameter.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Updates an existing organization
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final WithOrganizationPatchRequestBody body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Updates an existing organization
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final WithOrganizationPatchRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PATCH, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PatchRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a WithOrganizationItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithOrganizationItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithOrganizationItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PatchRequestConfiguration extends BaseRequestConfiguration {
    }
}
