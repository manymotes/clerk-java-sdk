package io.github.zzhorizonzz.sdk.client.invitations.item;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import io.github.zzhorizonzz.sdk.client.invitations.item.revoke.RevokeRequestBuilder;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /invitations/{invitation_id}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithInvitationItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The revoke property
     */
    @jakarta.annotation.Nonnull
    public RevokeRequestBuilder revoke() {
        return new RevokeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new WithInvitation_ItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithInvitationItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/invitations/{invitation_id}", pathParameters);
    }
    /**
     * Instantiates a new WithInvitation_ItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithInvitationItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/invitations/{invitation_id}", rawUrl);
    }
}
