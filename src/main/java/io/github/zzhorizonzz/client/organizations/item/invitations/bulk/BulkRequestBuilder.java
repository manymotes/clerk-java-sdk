package io.github.zzhorizonzz.client.organizations.item.invitations.bulk;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import io.github.zzhorizonzz.client.models.ClerkErrors;
import io.github.zzhorizonzz.client.models.OrganizationInvitations;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /organizations/{organization_id}/invitations/bulk
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BulkRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new BulkRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public BulkRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/organizations/{organization_id}/invitations/bulk", pathParameters);
    }
    /**
     * Instantiates a new BulkRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public BulkRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/organizations/{organization_id}/invitations/bulk", rawUrl);
    }
    /**
     * Creates new organization invitations in bulk and sends out emails to the provided email addresses with a link to accept the invitation and join the organization.You can specify a different `role` for each invited organization member.New organization invitations get a "pending" status until they are revoked by an organization administrator or accepted by the invitee.The request body supports passing an optional `redirect_url` parameter for each invitation.When the invited user clicks the link to accept the invitation, they will be redirected to the provided URL.Use this parameter to implement a custom invitation acceptance flow.You must specify the ID of the user that will send the invitation with the `inviter_user_id` parameter. Each invitationcan have a different inviter user.Inviter users must be members with administrator privileges in the organization.Only "admin" members can create organization invitations.You can optionally provide public and private metadata for each organization invitation. The public metadata are visibleby both the Frontend and the Backend, whereas the private metadata are only visible by the Backend.When the organization invitation is accepted, the metadata will be transferred to the newly created organization membership.
     * @param body The request body
     * @return a OrganizationInvitations
     */
    @jakarta.annotation.Nullable
    public OrganizationInvitations post(@jakarta.annotation.Nonnull final java.util.List<Bulk> body) {
        return post(body, null);
    }
    /**
     * Creates new organization invitations in bulk and sends out emails to the provided email addresses with a link to accept the invitation and join the organization.You can specify a different `role` for each invited organization member.New organization invitations get a "pending" status until they are revoked by an organization administrator or accepted by the invitee.The request body supports passing an optional `redirect_url` parameter for each invitation.When the invited user clicks the link to accept the invitation, they will be redirected to the provided URL.Use this parameter to implement a custom invitation acceptance flow.You must specify the ID of the user that will send the invitation with the `inviter_user_id` parameter. Each invitationcan have a different inviter user.Inviter users must be members with administrator privileges in the organization.Only "admin" members can create organization invitations.You can optionally provide public and private metadata for each organization invitation. The public metadata are visibleby both the Frontend and the Backend, whereas the private metadata are only visible by the Backend.When the organization invitation is accepted, the metadata will be transferred to the newly created organization membership.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a OrganizationInvitations
     */
    @jakarta.annotation.Nullable
    public OrganizationInvitations post(@jakarta.annotation.Nonnull final java.util.List<Bulk> body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", ClerkErrors::createFromDiscriminatorValue);
        errorMapping.put("403", ClerkErrors::createFromDiscriminatorValue);
        errorMapping.put("404", ClerkErrors::createFromDiscriminatorValue);
        errorMapping.put("422", ClerkErrors::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, OrganizationInvitations::createFromDiscriminatorValue);
    }
    /**
     * Creates new organization invitations in bulk and sends out emails to the provided email addresses with a link to accept the invitation and join the organization.You can specify a different `role` for each invited organization member.New organization invitations get a "pending" status until they are revoked by an organization administrator or accepted by the invitee.The request body supports passing an optional `redirect_url` parameter for each invitation.When the invited user clicks the link to accept the invitation, they will be redirected to the provided URL.Use this parameter to implement a custom invitation acceptance flow.You must specify the ID of the user that will send the invitation with the `inviter_user_id` parameter. Each invitationcan have a different inviter user.Inviter users must be members with administrator privileges in the organization.Only "admin" members can create organization invitations.You can optionally provide public and private metadata for each organization invitation. The public metadata are visibleby both the Frontend and the Backend, whereas the private metadata are only visible by the Backend.When the organization invitation is accepted, the metadata will be transferred to the newly created organization membership.
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final java.util.List<Bulk> body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Creates new organization invitations in bulk and sends out emails to the provided email addresses with a link to accept the invitation and join the organization.You can specify a different `role` for each invited organization member.New organization invitations get a "pending" status until they are revoked by an organization administrator or accepted by the invitee.The request body supports passing an optional `redirect_url` parameter for each invitation.When the invited user clicks the link to accept the invitation, they will be redirected to the provided URL.Use this parameter to implement a custom invitation acceptance flow.You must specify the ID of the user that will send the invitation with the `inviter_user_id` parameter. Each invitationcan have a different inviter user.Inviter users must be members with administrator privileges in the organization.Only "admin" members can create organization invitations.You can optionally provide public and private metadata for each organization invitation. The public metadata are visibleby both the Frontend and the Backend, whereas the private metadata are only visible by the Backend.When the organization invitation is accepted, the metadata will be transferred to the newly created organization membership.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final java.util.List<Bulk> body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body.toArray(new Bulk[0]));
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a BulkRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public BulkRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new BulkRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
