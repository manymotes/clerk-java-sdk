package io.github.zzhorizonzz.sdk.client.organizations.item.invitations.item.revoke;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import io.github.zzhorizonzz.sdk.client.models.ClerkErrors;
import io.github.zzhorizonzz.sdk.client.models.OrganizationInvitation;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /organizations/{organization_id}/invitations/{invitation_id}/revoke
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RevokeRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new RevokeRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public RevokeRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/organizations/{organization_id}/invitations/{invitation_id}/revoke", pathParameters);
    }
    /**
     * Instantiates a new RevokeRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public RevokeRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/organizations/{organization_id}/invitations/{invitation_id}/revoke", rawUrl);
    }
    /**
     * Use this request to revoke a previously issued organization invitation.Revoking an organization invitation makes it invalid; the invited user will no longer be able to join the organization with the revoked invitation.Only organization invitations with "pending" status can be revoked.The request needs the `requesting_user_id` parameter to specify the user which revokes the invitation.Only users with "admin" role can revoke invitations.
     * @param body The request body
     * @return a OrganizationInvitation
     */
    @jakarta.annotation.Nullable
    public OrganizationInvitation post(@jakarta.annotation.Nonnull final RevokePostRequestBody body) {
        return post(body, null);
    }
    /**
     * Use this request to revoke a previously issued organization invitation.Revoking an organization invitation makes it invalid; the invited user will no longer be able to join the organization with the revoked invitation.Only organization invitations with "pending" status can be revoked.The request needs the `requesting_user_id` parameter to specify the user which revokes the invitation.Only users with "admin" role can revoke invitations.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a OrganizationInvitation
     */
    @jakarta.annotation.Nullable
    public OrganizationInvitation post(@jakarta.annotation.Nonnull final RevokePostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", ClerkErrors::createFromDiscriminatorValue);
        errorMapping.put("403", ClerkErrors::createFromDiscriminatorValue);
        errorMapping.put("404", ClerkErrors::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, OrganizationInvitation::createFromDiscriminatorValue);
    }
    /**
     * Use this request to revoke a previously issued organization invitation.Revoking an organization invitation makes it invalid; the invited user will no longer be able to join the organization with the revoked invitation.Only organization invitations with "pending" status can be revoked.The request needs the `requesting_user_id` parameter to specify the user which revokes the invitation.Only users with "admin" role can revoke invitations.
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final RevokePostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Use this request to revoke a previously issued organization invitation.Revoking an organization invitation makes it invalid; the invited user will no longer be able to join the organization with the revoked invitation.Only organization invitations with "pending" status can be revoked.The request needs the `requesting_user_id` parameter to specify the user which revokes the invitation.Only users with "admin" role can revoke invitations.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final RevokePostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a RevokeRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public RevokeRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new RevokeRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
