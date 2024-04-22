package io.github.zzhorizonzz.client.organizations.item.invitations;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import io.github.zzhorizonzz.client.models.ClerkErrors;
import io.github.zzhorizonzz.client.models.OrganizationInvitation;
import io.github.zzhorizonzz.client.models.OrganizationInvitations;
import io.github.zzhorizonzz.client.organizations.item.invitations.bulk.BulkRequestBuilder;
import io.github.zzhorizonzz.client.organizations.item.invitations.item.WithInvitationItemRequestBuilder;
import io.github.zzhorizonzz.client.organizations.item.invitations.pending.PendingRequestBuilder;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /organizations/{organization_id}/invitations
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class InvitationsRequestBuilder extends BaseRequestBuilder {
    /**
     * The bulk property
     */
    @jakarta.annotation.Nonnull
    public BulkRequestBuilder bulk() {
        return new BulkRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The pending property
     */
    @jakarta.annotation.Nonnull
    public PendingRequestBuilder pending() {
        return new PendingRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Gets an item from the io.github.zzhorizonzz.client.organizations.item.invitations.item collection
     * @param invitation_id The organization invitation ID.
     * @return a WithInvitationItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithInvitationItemRequestBuilder byInvitation_id(@jakarta.annotation.Nonnull final String invitation_id) {
        Objects.requireNonNull(invitation_id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("invitation_id", invitation_id);
        return new WithInvitationItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new InvitationsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public InvitationsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/organizations/{organization_id}/invitations{?limit*,offset*,status*}", pathParameters);
    }
    /**
     * Instantiates a new InvitationsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public InvitationsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/organizations/{organization_id}/invitations{?limit*,offset*,status*}", rawUrl);
    }
    /**
     * This request returns the list of organization invitations.Results can be paginated using the optional `limit` and `offset` query parameters.You can filter them by providing the 'status' query parameter, that accepts multiple values.The organization invitations are ordered by descending creation date.Most recent invitations will be returned first.Any invitations created as a result of an Organization Domain are not included in the results.
     * @return a OrganizationInvitations
     */
    @jakarta.annotation.Nullable
    public OrganizationInvitations get() {
        return get(null);
    }
    /**
     * This request returns the list of organization invitations.Results can be paginated using the optional `limit` and `offset` query parameters.You can filter them by providing the 'status' query parameter, that accepts multiple values.The organization invitations are ordered by descending creation date.Most recent invitations will be returned first.Any invitations created as a result of an Organization Domain are not included in the results.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a OrganizationInvitations
     */
    @jakarta.annotation.Nullable
    public OrganizationInvitations get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", ClerkErrors::createFromDiscriminatorValue);
        errorMapping.put("404", ClerkErrors::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, OrganizationInvitations::createFromDiscriminatorValue);
    }
    /**
     * Creates a new organization invitation and sends an email to the provided `email_address` with a link to accept the invitation and join the organization.You can specify the `role` for the invited organization member.New organization invitations get a "pending" status until they are revoked by an organization administrator or accepted by the invitee.The request body supports passing an optional `redirect_url` parameter.When the invited user clicks the link to accept the invitation, they will be redirected to the URL provided.Use this parameter to implement a custom invitation acceptance flow.You must specify the ID of the user that will send the invitation with the `inviter_user_id` parameter.That user must be a member with administrator privileges in the organization.Only "admin" members can create organization invitations.You can optionally provide public and private metadata for the organization invitation.The public metadata are visible by both the Frontend and the Backend whereas the private ones only by the Backend.When the organization invitation is accepted, the metadata will be transferred to the newly created organization membership.
     * @param body The request body
     * @return a OrganizationInvitation
     */
    @jakarta.annotation.Nullable
    public OrganizationInvitation post(@jakarta.annotation.Nonnull final InvitationsPostRequestBody body) {
        return post(body, null);
    }
    /**
     * Creates a new organization invitation and sends an email to the provided `email_address` with a link to accept the invitation and join the organization.You can specify the `role` for the invited organization member.New organization invitations get a "pending" status until they are revoked by an organization administrator or accepted by the invitee.The request body supports passing an optional `redirect_url` parameter.When the invited user clicks the link to accept the invitation, they will be redirected to the URL provided.Use this parameter to implement a custom invitation acceptance flow.You must specify the ID of the user that will send the invitation with the `inviter_user_id` parameter.That user must be a member with administrator privileges in the organization.Only "admin" members can create organization invitations.You can optionally provide public and private metadata for the organization invitation.The public metadata are visible by both the Frontend and the Backend whereas the private ones only by the Backend.When the organization invitation is accepted, the metadata will be transferred to the newly created organization membership.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a OrganizationInvitation
     */
    @jakarta.annotation.Nullable
    public OrganizationInvitation post(@jakarta.annotation.Nonnull final InvitationsPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", ClerkErrors::createFromDiscriminatorValue);
        errorMapping.put("403", ClerkErrors::createFromDiscriminatorValue);
        errorMapping.put("404", ClerkErrors::createFromDiscriminatorValue);
        errorMapping.put("422", ClerkErrors::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, OrganizationInvitation::createFromDiscriminatorValue);
    }
    /**
     * This request returns the list of organization invitations.Results can be paginated using the optional `limit` and `offset` query parameters.You can filter them by providing the 'status' query parameter, that accepts multiple values.The organization invitations are ordered by descending creation date.Most recent invitations will be returned first.Any invitations created as a result of an Organization Domain are not included in the results.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This request returns the list of organization invitations.Results can be paginated using the optional `limit` and `offset` query parameters.You can filter them by providing the 'status' query parameter, that accepts multiple values.The organization invitations are ordered by descending creation date.Most recent invitations will be returned first.Any invitations created as a result of an Organization Domain are not included in the results.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Creates a new organization invitation and sends an email to the provided `email_address` with a link to accept the invitation and join the organization.You can specify the `role` for the invited organization member.New organization invitations get a "pending" status until they are revoked by an organization administrator or accepted by the invitee.The request body supports passing an optional `redirect_url` parameter.When the invited user clicks the link to accept the invitation, they will be redirected to the URL provided.Use this parameter to implement a custom invitation acceptance flow.You must specify the ID of the user that will send the invitation with the `inviter_user_id` parameter.That user must be a member with administrator privileges in the organization.Only "admin" members can create organization invitations.You can optionally provide public and private metadata for the organization invitation.The public metadata are visible by both the Frontend and the Backend whereas the private ones only by the Backend.When the organization invitation is accepted, the metadata will be transferred to the newly created organization membership.
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final InvitationsPostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Creates a new organization invitation and sends an email to the provided `email_address` with a link to accept the invitation and join the organization.You can specify the `role` for the invited organization member.New organization invitations get a "pending" status until they are revoked by an organization administrator or accepted by the invitee.The request body supports passing an optional `redirect_url` parameter.When the invited user clicks the link to accept the invitation, they will be redirected to the URL provided.Use this parameter to implement a custom invitation acceptance flow.You must specify the ID of the user that will send the invitation with the `inviter_user_id` parameter.That user must be a member with administrator privileges in the organization.Only "admin" members can create organization invitations.You can optionally provide public and private metadata for the organization invitation.The public metadata are visible by both the Frontend and the Backend whereas the private ones only by the Backend.When the organization invitation is accepted, the metadata will be transferred to the newly created organization membership.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final InvitationsPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a InvitationsRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public InvitationsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new InvitationsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * This request returns the list of organization invitations.Results can be paginated using the optional `limit` and `offset` query parameters.You can filter them by providing the 'status' query parameter, that accepts multiple values.The organization invitations are ordered by descending creation date.Most recent invitations will be returned first.Any invitations created as a result of an Organization Domain are not included in the results.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Applies a limit to the number of results returned.Can be used for paginating the results together with `offset`.Must be an integer greater than zero and less than 500.By default, if not supplied, a limit of 10 is used.
         */
        @jakarta.annotation.Nullable
        public Integer limit;
        /**
         * Skip the first `offset` results when paginating.Needs to be an integer greater or equal to zero.To be used in conjunction with `limit`.
         */
        @jakarta.annotation.Nullable
        public Integer offset;
        /**
         * Filter organization invitations based on their status
         */
        @jakarta.annotation.Nullable
        public GetStatusQueryParameterType status;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a Map<String, Object>
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("status", status);
            allQueryParams.put("limit", limit);
            allQueryParams.put("offset", offset);
            return allQueryParams;
        }
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
        /**
         * Request query parameters
         */
        @jakarta.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
