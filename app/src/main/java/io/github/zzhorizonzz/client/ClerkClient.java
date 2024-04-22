package io.github.zzhorizonzz.client;

import com.microsoft.kiota.ApiClientBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.serialization.FormParseNodeFactory;
import com.microsoft.kiota.serialization.FormSerializationWriterFactory;
import com.microsoft.kiota.serialization.JsonParseNodeFactory;
import com.microsoft.kiota.serialization.JsonSerializationWriterFactory;
import com.microsoft.kiota.serialization.MultipartSerializationWriterFactory;
import com.microsoft.kiota.serialization.ParseNodeFactoryRegistry;
import com.microsoft.kiota.serialization.SerializationWriterFactoryRegistry;
import com.microsoft.kiota.serialization.TextParseNodeFactory;
import com.microsoft.kiota.serialization.TextSerializationWriterFactory;
import io.github.zzhorizonzz.client.actor_tokens.ActorTokensRequestBuilder;
import io.github.zzhorizonzz.client.allowlist_identifiers.AllowlistIdentifiersRequestBuilder;
import io.github.zzhorizonzz.client.beta_features.BetaFeaturesRequestBuilder;
import io.github.zzhorizonzz.client.blocklist_identifiers.BlocklistIdentifiersRequestBuilder;
import io.github.zzhorizonzz.client.clients.ClientsRequestBuilder;
import io.github.zzhorizonzz.client.domains.DomainsRequestBuilder;
import io.github.zzhorizonzz.client.email_addresses.EmailAddressesRequestBuilder;
import io.github.zzhorizonzz.client.emails.EmailsRequestBuilder;
import io.github.zzhorizonzz.client.instance.InstanceRequestBuilder;
import io.github.zzhorizonzz.client.invitations.InvitationsRequestBuilder;
import io.github.zzhorizonzz.client.jwks.JwksRequestBuilder;
import io.github.zzhorizonzz.client.jwt_templates.JwtTemplatesRequestBuilder;
import io.github.zzhorizonzz.client.oauth_applications.OauthApplicationsRequestBuilder;
import io.github.zzhorizonzz.client.organizations.OrganizationsRequestBuilder;
import io.github.zzhorizonzz.client.phone_numbers.PhoneNumbersRequestBuilder;
import io.github.zzhorizonzz.client.proxy_checks.ProxyChecksRequestBuilder;
import io.github.zzhorizonzz.client.publicescaped.PublicRequestBuilder;
import io.github.zzhorizonzz.client.redirect_urls.RedirectUrlsRequestBuilder;
import io.github.zzhorizonzz.client.saml_connections.SamlConnectionsRequestBuilder;
import io.github.zzhorizonzz.client.sessions.SessionsRequestBuilder;
import io.github.zzhorizonzz.client.sign_in_tokens.SignInTokensRequestBuilder;
import io.github.zzhorizonzz.client.sign_ups.SignUpsRequestBuilder;
import io.github.zzhorizonzz.client.templates.TemplatesRequestBuilder;
import io.github.zzhorizonzz.client.users.UsersRequestBuilder;
import io.github.zzhorizonzz.client.webhooks.WebhooksRequestBuilder;
import java.util.HashMap;
import java.util.Objects;
/**
 * The main entry point of the SDK, exposes the configuration and the fluent API.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ClerkClient extends BaseRequestBuilder {
    /**
     * The actor_tokens property
     */
    @jakarta.annotation.Nonnull
    public ActorTokensRequestBuilder actorTokens() {
        return new ActorTokensRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The allowlist_identifiers property
     */
    @jakarta.annotation.Nonnull
    public AllowlistIdentifiersRequestBuilder allowlistIdentifiers() {
        return new AllowlistIdentifiersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The beta_features property
     */
    @jakarta.annotation.Nonnull
    public BetaFeaturesRequestBuilder betaFeatures() {
        return new BetaFeaturesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The blocklist_identifiers property
     */
    @jakarta.annotation.Nonnull
    public BlocklistIdentifiersRequestBuilder blocklistIdentifiers() {
        return new BlocklistIdentifiersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The clients property
     */
    @jakarta.annotation.Nonnull
    public ClientsRequestBuilder clients() {
        return new ClientsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The domains property
     */
    @jakarta.annotation.Nonnull
    public DomainsRequestBuilder domains() {
        return new DomainsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The email_addresses property
     */
    @jakarta.annotation.Nonnull
    public EmailAddressesRequestBuilder emailAddresses() {
        return new EmailAddressesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The emails property
     */
    @jakarta.annotation.Nonnull
    public EmailsRequestBuilder emails() {
        return new EmailsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The instance property
     */
    @jakarta.annotation.Nonnull
    public InstanceRequestBuilder instance() {
        return new InstanceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The invitations property
     */
    @jakarta.annotation.Nonnull
    public InvitationsRequestBuilder invitations() {
        return new InvitationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The jwks property
     */
    @jakarta.annotation.Nonnull
    public JwksRequestBuilder jwks() {
        return new JwksRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The jwt_templates property
     */
    @jakarta.annotation.Nonnull
    public JwtTemplatesRequestBuilder jwtTemplates() {
        return new JwtTemplatesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The oauth_applications property
     */
    @jakarta.annotation.Nonnull
    public OauthApplicationsRequestBuilder oauthApplications() {
        return new OauthApplicationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The organizations property
     */
    @jakarta.annotation.Nonnull
    public OrganizationsRequestBuilder organizations() {
        return new OrganizationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The phone_numbers property
     */
    @jakarta.annotation.Nonnull
    public PhoneNumbersRequestBuilder phoneNumbers() {
        return new PhoneNumbersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The proxy_checks property
     */
    @jakarta.annotation.Nonnull
    public ProxyChecksRequestBuilder proxyChecks() {
        return new ProxyChecksRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The public property
     */
    @jakarta.annotation.Nonnull
    public PublicRequestBuilder publicEscaped() {
        return new PublicRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The redirect_urls property
     */
    @jakarta.annotation.Nonnull
    public RedirectUrlsRequestBuilder redirectUrls() {
        return new RedirectUrlsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The saml_connections property
     */
    @jakarta.annotation.Nonnull
    public SamlConnectionsRequestBuilder samlConnections() {
        return new SamlConnectionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The sessions property
     */
    @jakarta.annotation.Nonnull
    public SessionsRequestBuilder sessions() {
        return new SessionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The sign_in_tokens property
     */
    @jakarta.annotation.Nonnull
    public SignInTokensRequestBuilder signInTokens() {
        return new SignInTokensRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The sign_ups property
     */
    @jakarta.annotation.Nonnull
    public SignUpsRequestBuilder signUps() {
        return new SignUpsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The templates property
     */
    @jakarta.annotation.Nonnull
    public TemplatesRequestBuilder templates() {
        return new TemplatesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The users property
     */
    @jakarta.annotation.Nonnull
    public UsersRequestBuilder users() {
        return new UsersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The webhooks property
     */
    @jakarta.annotation.Nonnull
    public WebhooksRequestBuilder webhooks() {
        return new WebhooksRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new ClerkClient and sets the default values.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ClerkClient(@jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}");
        this.pathParameters = new HashMap<>();
        ApiClientBuilder.registerDefaultSerializer(() -> new JsonSerializationWriterFactory());
        ApiClientBuilder.registerDefaultSerializer(() -> new TextSerializationWriterFactory());
        ApiClientBuilder.registerDefaultSerializer(() -> new FormSerializationWriterFactory());
        ApiClientBuilder.registerDefaultSerializer(() -> new MultipartSerializationWriterFactory());
        ApiClientBuilder.registerDefaultDeserializer(() -> new JsonParseNodeFactory());
        ApiClientBuilder.registerDefaultDeserializer(() -> new FormParseNodeFactory());
        ApiClientBuilder.registerDefaultDeserializer(() -> new TextParseNodeFactory());
        if (requestAdapter.getBaseUrl() == null || requestAdapter.getBaseUrl().isEmpty()) {
            requestAdapter.setBaseUrl("https://api.clerk.com/v1");
        }
        pathParameters.put("baseurl", requestAdapter.getBaseUrl());
    }
}
