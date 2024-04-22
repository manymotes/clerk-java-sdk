package org.gradle.accessors.dm;

import org.gradle.api.NonNullApi;
import org.gradle.api.artifacts.MinimalExternalModuleDependency;
import org.gradle.plugin.use.PluginDependency;
import org.gradle.api.artifacts.ExternalModuleDependencyBundle;
import org.gradle.api.artifacts.MutableVersionConstraint;
import org.gradle.api.provider.Provider;
import org.gradle.api.model.ObjectFactory;
import org.gradle.api.provider.ProviderFactory;
import org.gradle.api.internal.catalog.AbstractExternalDependencyFactory;
import org.gradle.api.internal.catalog.DefaultVersionCatalog;
import java.util.Map;
import org.gradle.api.internal.attributes.ImmutableAttributesFactory;
import org.gradle.api.internal.artifacts.dsl.CapabilityNotationParser;
import javax.inject.Inject;

/**
 * A catalog of dependencies accessible via the {@code libs} extension.
 */
@NonNullApi
public class LibrariesForLibsInPluginsBlock extends AbstractExternalDependencyFactory {

    private final AbstractExternalDependencyFactory owner = this;
    private final ComLibraryAccessors laccForComLibraryAccessors = new ComLibraryAccessors(owner);
    private final JakartaLibraryAccessors laccForJakartaLibraryAccessors = new JakartaLibraryAccessors(owner);
    private final OrgLibraryAccessors laccForOrgLibraryAccessors = new OrgLibraryAccessors(owner);
    private final VersionAccessors vaccForVersionAccessors = new VersionAccessors(providers, config);
    private final BundleAccessors baccForBundleAccessors = new BundleAccessors(objects, providers, config, attributesFactory, capabilityNotationParser);
    private final PluginAccessors paccForPluginAccessors = new PluginAccessors(providers, config);

    @Inject
    public LibrariesForLibsInPluginsBlock(DefaultVersionCatalog config, ProviderFactory providers, ObjectFactory objects, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) {
        super(config, providers, objects, attributesFactory, capabilityNotationParser);
    }

    /**
     * Group of libraries at <b>com</b>
     *
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public ComLibraryAccessors getCom() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForComLibraryAccessors;
    }

    /**
     * Group of libraries at <b>jakarta</b>
     *
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public JakartaLibraryAccessors getJakarta() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForJakartaLibraryAccessors;
    }

    /**
     * Group of libraries at <b>org</b>
     *
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public OrgLibraryAccessors getOrg() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForOrgLibraryAccessors;
    }

    /**
     * Group of versions at <b>versions</b>
     */
    public VersionAccessors getVersions() {
        return vaccForVersionAccessors;
    }

    /**
     * Group of bundles at <b>bundles</b>
     *
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public BundleAccessors getBundles() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return baccForBundleAccessors;
    }

    /**
     * Group of plugins at <b>plugins</b>
     */
    public PluginAccessors getPlugins() {
        return paccForPluginAccessors;
    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class ComLibraryAccessors extends SubDependencyFactory {
        private final ComMicrosoftLibraryAccessors laccForComMicrosoftLibraryAccessors = new ComMicrosoftLibraryAccessors(owner);

        public ComLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>com.microsoft</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public ComMicrosoftLibraryAccessors getMicrosoft() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForComMicrosoftLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class ComMicrosoftLibraryAccessors extends SubDependencyFactory {
        private final ComMicrosoftKiotaLibraryAccessors laccForComMicrosoftKiotaLibraryAccessors = new ComMicrosoftKiotaLibraryAccessors(owner);

        public ComMicrosoftLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>com.microsoft.kiota</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public ComMicrosoftKiotaLibraryAccessors getKiota() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForComMicrosoftKiotaLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class ComMicrosoftKiotaLibraryAccessors extends SubDependencyFactory {
        private final ComMicrosoftKiotaMicrosoftLibraryAccessors laccForComMicrosoftKiotaMicrosoftLibraryAccessors = new ComMicrosoftKiotaMicrosoftLibraryAccessors(owner);

        public ComMicrosoftKiotaLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>com.microsoft.kiota.microsoft</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public ComMicrosoftKiotaMicrosoftLibraryAccessors getMicrosoft() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForComMicrosoftKiotaMicrosoftLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class ComMicrosoftKiotaMicrosoftLibraryAccessors extends SubDependencyFactory {
        private final ComMicrosoftKiotaMicrosoftKiotaLibraryAccessors laccForComMicrosoftKiotaMicrosoftKiotaLibraryAccessors = new ComMicrosoftKiotaMicrosoftKiotaLibraryAccessors(owner);

        public ComMicrosoftKiotaMicrosoftLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>com.microsoft.kiota.microsoft.kiota</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public ComMicrosoftKiotaMicrosoftKiotaLibraryAccessors getKiota() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForComMicrosoftKiotaMicrosoftKiotaLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class ComMicrosoftKiotaMicrosoftKiotaLibraryAccessors extends SubDependencyFactory {
        private final ComMicrosoftKiotaMicrosoftKiotaSerializationLibraryAccessors laccForComMicrosoftKiotaMicrosoftKiotaSerializationLibraryAccessors = new ComMicrosoftKiotaMicrosoftKiotaSerializationLibraryAccessors(owner);

        public ComMicrosoftKiotaMicrosoftKiotaLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>abstractions</b> with <b>com.microsoft.kiota:microsoft-kiota-abstractions</b> coordinates and
         * with version reference <b>com.microsoft.kiota.microsoft.kiota.abstractions</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getAbstractions() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("com.microsoft.kiota.microsoft.kiota.abstractions");
        }

        /**
         * Group of libraries at <b>com.microsoft.kiota.microsoft.kiota.serialization</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public ComMicrosoftKiotaMicrosoftKiotaSerializationLibraryAccessors getSerialization() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForComMicrosoftKiotaMicrosoftKiotaSerializationLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class ComMicrosoftKiotaMicrosoftKiotaSerializationLibraryAccessors extends SubDependencyFactory {

        public ComMicrosoftKiotaMicrosoftKiotaSerializationLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>form</b> with <b>com.microsoft.kiota:microsoft-kiota-serialization-form</b> coordinates and
         * with version reference <b>com.microsoft.kiota.microsoft.kiota.serialization.form</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getForm() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("com.microsoft.kiota.microsoft.kiota.serialization.form");
        }

        /**
         * Dependency provider for <b>json</b> with <b>com.microsoft.kiota:microsoft-kiota-serialization-json</b> coordinates and
         * with version reference <b>com.microsoft.kiota.microsoft.kiota.serialization.json</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getJson() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("com.microsoft.kiota.microsoft.kiota.serialization.json");
        }

        /**
         * Dependency provider for <b>multipart</b> with <b>com.microsoft.kiota:microsoft-kiota-serialization-multipart</b> coordinates and
         * with version reference <b>com.microsoft.kiota.microsoft.kiota.serialization.multipart</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getMultipart() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("com.microsoft.kiota.microsoft.kiota.serialization.multipart");
        }

        /**
         * Dependency provider for <b>text</b> with <b>com.microsoft.kiota:microsoft-kiota-serialization-text</b> coordinates and
         * with version reference <b>com.microsoft.kiota.microsoft.kiota.serialization.text</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getText() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("com.microsoft.kiota.microsoft.kiota.serialization.text");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class JakartaLibraryAccessors extends SubDependencyFactory {
        private final JakartaAnnotationLibraryAccessors laccForJakartaAnnotationLibraryAccessors = new JakartaAnnotationLibraryAccessors(owner);
        private final JakartaEnterpriseLibraryAccessors laccForJakartaEnterpriseLibraryAccessors = new JakartaEnterpriseLibraryAccessors(owner);

        public JakartaLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>jakarta.annotation</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public JakartaAnnotationLibraryAccessors getAnnotation() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForJakartaAnnotationLibraryAccessors;
        }

        /**
         * Group of libraries at <b>jakarta.enterprise</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public JakartaEnterpriseLibraryAccessors getEnterprise() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForJakartaEnterpriseLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class JakartaAnnotationLibraryAccessors extends SubDependencyFactory {
        private final JakartaAnnotationJakartaLibraryAccessors laccForJakartaAnnotationJakartaLibraryAccessors = new JakartaAnnotationJakartaLibraryAccessors(owner);

        public JakartaAnnotationLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>jakarta.annotation.jakarta</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public JakartaAnnotationJakartaLibraryAccessors getJakarta() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForJakartaAnnotationJakartaLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class JakartaAnnotationJakartaLibraryAccessors extends SubDependencyFactory {
        private final JakartaAnnotationJakartaAnnotationLibraryAccessors laccForJakartaAnnotationJakartaAnnotationLibraryAccessors = new JakartaAnnotationJakartaAnnotationLibraryAccessors(owner);

        public JakartaAnnotationJakartaLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>jakarta.annotation.jakarta.annotation</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public JakartaAnnotationJakartaAnnotationLibraryAccessors getAnnotation() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForJakartaAnnotationJakartaAnnotationLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class JakartaAnnotationJakartaAnnotationLibraryAccessors extends SubDependencyFactory {

        public JakartaAnnotationJakartaAnnotationLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>api</b> with <b>jakarta.annotation:jakarta.annotation-api</b> coordinates and
         * with version reference <b>jakarta.annotation.jakarta.annotation.api</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getApi() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("jakarta.annotation.jakarta.annotation.api");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class JakartaEnterpriseLibraryAccessors extends SubDependencyFactory {
        private final JakartaEnterpriseJakartaLibraryAccessors laccForJakartaEnterpriseJakartaLibraryAccessors = new JakartaEnterpriseJakartaLibraryAccessors(owner);

        public JakartaEnterpriseLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>jakarta.enterprise.jakarta</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public JakartaEnterpriseJakartaLibraryAccessors getJakarta() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForJakartaEnterpriseJakartaLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class JakartaEnterpriseJakartaLibraryAccessors extends SubDependencyFactory {
        private final JakartaEnterpriseJakartaEnterpriseLibraryAccessors laccForJakartaEnterpriseJakartaEnterpriseLibraryAccessors = new JakartaEnterpriseJakartaEnterpriseLibraryAccessors(owner);

        public JakartaEnterpriseJakartaLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>jakarta.enterprise.jakarta.enterprise</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public JakartaEnterpriseJakartaEnterpriseLibraryAccessors getEnterprise() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForJakartaEnterpriseJakartaEnterpriseLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class JakartaEnterpriseJakartaEnterpriseLibraryAccessors extends SubDependencyFactory {
        private final JakartaEnterpriseJakartaEnterpriseCdiLibraryAccessors laccForJakartaEnterpriseJakartaEnterpriseCdiLibraryAccessors = new JakartaEnterpriseJakartaEnterpriseCdiLibraryAccessors(owner);

        public JakartaEnterpriseJakartaEnterpriseLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>jakarta.enterprise.jakarta.enterprise.cdi</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public JakartaEnterpriseJakartaEnterpriseCdiLibraryAccessors getCdi() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForJakartaEnterpriseJakartaEnterpriseCdiLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class JakartaEnterpriseJakartaEnterpriseCdiLibraryAccessors extends SubDependencyFactory {

        public JakartaEnterpriseJakartaEnterpriseCdiLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>api</b> with <b>jakarta.enterprise:jakarta.enterprise.cdi-api</b> coordinates and
         * with version reference <b>jakarta.enterprise.jakarta.enterprise.cdi.api</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getApi() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("jakarta.enterprise.jakarta.enterprise.cdi.api");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgLibraryAccessors extends SubDependencyFactory {
        private final OrgBitbucketLibraryAccessors laccForOrgBitbucketLibraryAccessors = new OrgBitbucketLibraryAccessors(owner);
        private final OrgEclipseLibraryAccessors laccForOrgEclipseLibraryAccessors = new OrgEclipseLibraryAccessors(owner);
        private final OrgJetbrainsLibraryAccessors laccForOrgJetbrainsLibraryAccessors = new OrgJetbrainsLibraryAccessors(owner);
        private final OrgMapstructLibraryAccessors laccForOrgMapstructLibraryAccessors = new OrgMapstructLibraryAccessors(owner);
        private final OrgProjectlombokLibraryAccessors laccForOrgProjectlombokLibraryAccessors = new OrgProjectlombokLibraryAccessors(owner);

        public OrgLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.bitbucket</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgBitbucketLibraryAccessors getBitbucket() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgBitbucketLibraryAccessors;
        }

        /**
         * Group of libraries at <b>org.eclipse</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgEclipseLibraryAccessors getEclipse() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgEclipseLibraryAccessors;
        }

        /**
         * Group of libraries at <b>org.jetbrains</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgJetbrainsLibraryAccessors getJetbrains() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgJetbrainsLibraryAccessors;
        }

        /**
         * Group of libraries at <b>org.mapstruct</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgMapstructLibraryAccessors getMapstruct() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgMapstructLibraryAccessors;
        }

        /**
         * Group of libraries at <b>org.projectlombok</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgProjectlombokLibraryAccessors getProjectlombok() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgProjectlombokLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgBitbucketLibraryAccessors extends SubDependencyFactory {
        private final OrgBitbucketBLibraryAccessors laccForOrgBitbucketBLibraryAccessors = new OrgBitbucketBLibraryAccessors(owner);

        public OrgBitbucketLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.bitbucket.b</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgBitbucketBLibraryAccessors getB() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgBitbucketBLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgBitbucketBLibraryAccessors extends SubDependencyFactory {
        private final OrgBitbucketBCLibraryAccessors laccForOrgBitbucketBCLibraryAccessors = new OrgBitbucketBCLibraryAccessors(owner);

        public OrgBitbucketBLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.bitbucket.b.c</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgBitbucketBCLibraryAccessors getC() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgBitbucketBCLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgBitbucketBCLibraryAccessors extends SubDependencyFactory {

        public OrgBitbucketBCLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>jose4j</b> with <b>org.bitbucket.b_c:jose4j</b> coordinates and
         * with version reference <b>org.bitbucket.b.c.jose4j</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getJose4j() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.bitbucket.b.c.jose4j");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgEclipseLibraryAccessors extends SubDependencyFactory {
        private final OrgEclipseMicroprofileLibraryAccessors laccForOrgEclipseMicroprofileLibraryAccessors = new OrgEclipseMicroprofileLibraryAccessors(owner);

        public OrgEclipseLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.eclipse.microprofile</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgEclipseMicroprofileLibraryAccessors getMicroprofile() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgEclipseMicroprofileLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgEclipseMicroprofileLibraryAccessors extends SubDependencyFactory {
        private final OrgEclipseMicroprofileJwtLibraryAccessors laccForOrgEclipseMicroprofileJwtLibraryAccessors = new OrgEclipseMicroprofileJwtLibraryAccessors(owner);

        public OrgEclipseMicroprofileLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.eclipse.microprofile.jwt</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgEclipseMicroprofileJwtLibraryAccessors getJwt() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgEclipseMicroprofileJwtLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgEclipseMicroprofileJwtLibraryAccessors extends SubDependencyFactory {
        private final OrgEclipseMicroprofileJwtMicroprofileLibraryAccessors laccForOrgEclipseMicroprofileJwtMicroprofileLibraryAccessors = new OrgEclipseMicroprofileJwtMicroprofileLibraryAccessors(owner);

        public OrgEclipseMicroprofileJwtLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.eclipse.microprofile.jwt.microprofile</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgEclipseMicroprofileJwtMicroprofileLibraryAccessors getMicroprofile() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgEclipseMicroprofileJwtMicroprofileLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgEclipseMicroprofileJwtMicroprofileLibraryAccessors extends SubDependencyFactory {
        private final OrgEclipseMicroprofileJwtMicroprofileJwtLibraryAccessors laccForOrgEclipseMicroprofileJwtMicroprofileJwtLibraryAccessors = new OrgEclipseMicroprofileJwtMicroprofileJwtLibraryAccessors(owner);

        public OrgEclipseMicroprofileJwtMicroprofileLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.eclipse.microprofile.jwt.microprofile.jwt</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgEclipseMicroprofileJwtMicroprofileJwtLibraryAccessors getJwt() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgEclipseMicroprofileJwtMicroprofileJwtLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgEclipseMicroprofileJwtMicroprofileJwtLibraryAccessors extends SubDependencyFactory {
        private final OrgEclipseMicroprofileJwtMicroprofileJwtAuthLibraryAccessors laccForOrgEclipseMicroprofileJwtMicroprofileJwtAuthLibraryAccessors = new OrgEclipseMicroprofileJwtMicroprofileJwtAuthLibraryAccessors(owner);

        public OrgEclipseMicroprofileJwtMicroprofileJwtLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.eclipse.microprofile.jwt.microprofile.jwt.auth</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgEclipseMicroprofileJwtMicroprofileJwtAuthLibraryAccessors getAuth() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgEclipseMicroprofileJwtMicroprofileJwtAuthLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgEclipseMicroprofileJwtMicroprofileJwtAuthLibraryAccessors extends SubDependencyFactory {

        public OrgEclipseMicroprofileJwtMicroprofileJwtAuthLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>api</b> with <b>org.eclipse.microprofile.jwt:microprofile-jwt-auth-api</b> coordinates and
         * with version reference <b>org.eclipse.microprofile.jwt.microprofile.jwt.auth.api</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getApi() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.eclipse.microprofile.jwt.microprofile.jwt.auth.api");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgJetbrainsLibraryAccessors extends SubDependencyFactory {

        public OrgJetbrainsLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>annotations</b> with <b>org.jetbrains:annotations</b> coordinates and
         * with version reference <b>org.jetbrains.annotations</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getAnnotations() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.jetbrains.annotations");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgMapstructLibraryAccessors extends SubDependencyFactory {
        private final OrgMapstructMapstructLibraryAccessors laccForOrgMapstructMapstructLibraryAccessors = new OrgMapstructMapstructLibraryAccessors(owner);

        public OrgMapstructLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.mapstruct.mapstruct</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgMapstructMapstructLibraryAccessors getMapstruct() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgMapstructMapstructLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgMapstructMapstructLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public OrgMapstructMapstructLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>mapstruct</b> with <b>org.mapstruct:mapstruct</b> coordinates and
         * with version reference <b>org.mapstruct.mapstruct</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> asProvider() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.mapstruct.mapstruct");
        }

        /**
         * Dependency provider for <b>processor</b> with <b>org.mapstruct:mapstruct-processor</b> coordinates and
         * with version reference <b>org.mapstruct.mapstruct.processor</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getProcessor() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.mapstruct.mapstruct.processor");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgProjectlombokLibraryAccessors extends SubDependencyFactory {
        private final OrgProjectlombokLombokLibraryAccessors laccForOrgProjectlombokLombokLibraryAccessors = new OrgProjectlombokLombokLibraryAccessors(owner);

        public OrgProjectlombokLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.projectlombok.lombok</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgProjectlombokLombokLibraryAccessors getLombok() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgProjectlombokLombokLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgProjectlombokLombokLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {
        private final OrgProjectlombokLombokMapstructLibraryAccessors laccForOrgProjectlombokLombokMapstructLibraryAccessors = new OrgProjectlombokLombokMapstructLibraryAccessors(owner);

        public OrgProjectlombokLombokLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>lombok</b> with <b>org.projectlombok:lombok</b> coordinates and
         * with version reference <b>org.projectlombok.lombok</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> asProvider() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.projectlombok.lombok");
        }

        /**
         * Group of libraries at <b>org.projectlombok.lombok.mapstruct</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgProjectlombokLombokMapstructLibraryAccessors getMapstruct() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgProjectlombokLombokMapstructLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgProjectlombokLombokMapstructLibraryAccessors extends SubDependencyFactory {

        public OrgProjectlombokLombokMapstructLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>binding</b> with <b>org.projectlombok:lombok-mapstruct-binding</b> coordinates and
         * with version reference <b>org.projectlombok.lombok.mapstruct.binding</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getBinding() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.projectlombok.lombok.mapstruct.binding");
        }

    }

    public static class VersionAccessors extends VersionFactory  {

        private final ComVersionAccessors vaccForComVersionAccessors = new ComVersionAccessors(providers, config);
        private final JakartaVersionAccessors vaccForJakartaVersionAccessors = new JakartaVersionAccessors(providers, config);
        private final OrgVersionAccessors vaccForOrgVersionAccessors = new OrgVersionAccessors(providers, config);
        public VersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.com</b>
         */
        public ComVersionAccessors getCom() {
            return vaccForComVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.jakarta</b>
         */
        public JakartaVersionAccessors getJakarta() {
            return vaccForJakartaVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.org</b>
         */
        public OrgVersionAccessors getOrg() {
            return vaccForOrgVersionAccessors;
        }

    }

    public static class ComVersionAccessors extends VersionFactory  {

        private final ComMicrosoftVersionAccessors vaccForComMicrosoftVersionAccessors = new ComMicrosoftVersionAccessors(providers, config);
        public ComVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.com.microsoft</b>
         */
        public ComMicrosoftVersionAccessors getMicrosoft() {
            return vaccForComMicrosoftVersionAccessors;
        }

    }

    public static class ComMicrosoftVersionAccessors extends VersionFactory  {

        private final ComMicrosoftKiotaVersionAccessors vaccForComMicrosoftKiotaVersionAccessors = new ComMicrosoftKiotaVersionAccessors(providers, config);
        public ComMicrosoftVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.com.microsoft.kiota</b>
         */
        public ComMicrosoftKiotaVersionAccessors getKiota() {
            return vaccForComMicrosoftKiotaVersionAccessors;
        }

    }

    public static class ComMicrosoftKiotaVersionAccessors extends VersionFactory  {

        private final ComMicrosoftKiotaMicrosoftVersionAccessors vaccForComMicrosoftKiotaMicrosoftVersionAccessors = new ComMicrosoftKiotaMicrosoftVersionAccessors(providers, config);
        public ComMicrosoftKiotaVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.com.microsoft.kiota.microsoft</b>
         */
        public ComMicrosoftKiotaMicrosoftVersionAccessors getMicrosoft() {
            return vaccForComMicrosoftKiotaMicrosoftVersionAccessors;
        }

    }

    public static class ComMicrosoftKiotaMicrosoftVersionAccessors extends VersionFactory  {

        private final ComMicrosoftKiotaMicrosoftKiotaVersionAccessors vaccForComMicrosoftKiotaMicrosoftKiotaVersionAccessors = new ComMicrosoftKiotaMicrosoftKiotaVersionAccessors(providers, config);
        public ComMicrosoftKiotaMicrosoftVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.com.microsoft.kiota.microsoft.kiota</b>
         */
        public ComMicrosoftKiotaMicrosoftKiotaVersionAccessors getKiota() {
            return vaccForComMicrosoftKiotaMicrosoftKiotaVersionAccessors;
        }

    }

    public static class ComMicrosoftKiotaMicrosoftKiotaVersionAccessors extends VersionFactory  {

        private final ComMicrosoftKiotaMicrosoftKiotaSerializationVersionAccessors vaccForComMicrosoftKiotaMicrosoftKiotaSerializationVersionAccessors = new ComMicrosoftKiotaMicrosoftKiotaSerializationVersionAccessors(providers, config);
        public ComMicrosoftKiotaMicrosoftKiotaVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>com.microsoft.kiota.microsoft.kiota.abstractions</b> with value <b>1.0.4</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getAbstractions() { return getVersion("com.microsoft.kiota.microsoft.kiota.abstractions"); }

        /**
         * Group of versions at <b>versions.com.microsoft.kiota.microsoft.kiota.serialization</b>
         */
        public ComMicrosoftKiotaMicrosoftKiotaSerializationVersionAccessors getSerialization() {
            return vaccForComMicrosoftKiotaMicrosoftKiotaSerializationVersionAccessors;
        }

    }

    public static class ComMicrosoftKiotaMicrosoftKiotaSerializationVersionAccessors extends VersionFactory  {

        public ComMicrosoftKiotaMicrosoftKiotaSerializationVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>com.microsoft.kiota.microsoft.kiota.serialization.form</b> with value <b>1.0.4</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getForm() { return getVersion("com.microsoft.kiota.microsoft.kiota.serialization.form"); }

        /**
         * Version alias <b>com.microsoft.kiota.microsoft.kiota.serialization.json</b> with value <b>1.0.4</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getJson() { return getVersion("com.microsoft.kiota.microsoft.kiota.serialization.json"); }

        /**
         * Version alias <b>com.microsoft.kiota.microsoft.kiota.serialization.multipart</b> with value <b>1.0.4</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getMultipart() { return getVersion("com.microsoft.kiota.microsoft.kiota.serialization.multipart"); }

        /**
         * Version alias <b>com.microsoft.kiota.microsoft.kiota.serialization.text</b> with value <b>1.0.4</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getText() { return getVersion("com.microsoft.kiota.microsoft.kiota.serialization.text"); }

    }

    public static class JakartaVersionAccessors extends VersionFactory  {

        private final JakartaAnnotationVersionAccessors vaccForJakartaAnnotationVersionAccessors = new JakartaAnnotationVersionAccessors(providers, config);
        private final JakartaEnterpriseVersionAccessors vaccForJakartaEnterpriseVersionAccessors = new JakartaEnterpriseVersionAccessors(providers, config);
        public JakartaVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.jakarta.annotation</b>
         */
        public JakartaAnnotationVersionAccessors getAnnotation() {
            return vaccForJakartaAnnotationVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.jakarta.enterprise</b>
         */
        public JakartaEnterpriseVersionAccessors getEnterprise() {
            return vaccForJakartaEnterpriseVersionAccessors;
        }

    }

    public static class JakartaAnnotationVersionAccessors extends VersionFactory  {

        private final JakartaAnnotationJakartaVersionAccessors vaccForJakartaAnnotationJakartaVersionAccessors = new JakartaAnnotationJakartaVersionAccessors(providers, config);
        public JakartaAnnotationVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.jakarta.annotation.jakarta</b>
         */
        public JakartaAnnotationJakartaVersionAccessors getJakarta() {
            return vaccForJakartaAnnotationJakartaVersionAccessors;
        }

    }

    public static class JakartaAnnotationJakartaVersionAccessors extends VersionFactory  {

        private final JakartaAnnotationJakartaAnnotationVersionAccessors vaccForJakartaAnnotationJakartaAnnotationVersionAccessors = new JakartaAnnotationJakartaAnnotationVersionAccessors(providers, config);
        public JakartaAnnotationJakartaVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.jakarta.annotation.jakarta.annotation</b>
         */
        public JakartaAnnotationJakartaAnnotationVersionAccessors getAnnotation() {
            return vaccForJakartaAnnotationJakartaAnnotationVersionAccessors;
        }

    }

    public static class JakartaAnnotationJakartaAnnotationVersionAccessors extends VersionFactory  {

        public JakartaAnnotationJakartaAnnotationVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>jakarta.annotation.jakarta.annotation.api</b> with value <b>3.0.0-M1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getApi() { return getVersion("jakarta.annotation.jakarta.annotation.api"); }

    }

    public static class JakartaEnterpriseVersionAccessors extends VersionFactory  {

        private final JakartaEnterpriseJakartaVersionAccessors vaccForJakartaEnterpriseJakartaVersionAccessors = new JakartaEnterpriseJakartaVersionAccessors(providers, config);
        public JakartaEnterpriseVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.jakarta.enterprise.jakarta</b>
         */
        public JakartaEnterpriseJakartaVersionAccessors getJakarta() {
            return vaccForJakartaEnterpriseJakartaVersionAccessors;
        }

    }

    public static class JakartaEnterpriseJakartaVersionAccessors extends VersionFactory  {

        private final JakartaEnterpriseJakartaEnterpriseVersionAccessors vaccForJakartaEnterpriseJakartaEnterpriseVersionAccessors = new JakartaEnterpriseJakartaEnterpriseVersionAccessors(providers, config);
        public JakartaEnterpriseJakartaVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.jakarta.enterprise.jakarta.enterprise</b>
         */
        public JakartaEnterpriseJakartaEnterpriseVersionAccessors getEnterprise() {
            return vaccForJakartaEnterpriseJakartaEnterpriseVersionAccessors;
        }

    }

    public static class JakartaEnterpriseJakartaEnterpriseVersionAccessors extends VersionFactory  {

        private final JakartaEnterpriseJakartaEnterpriseCdiVersionAccessors vaccForJakartaEnterpriseJakartaEnterpriseCdiVersionAccessors = new JakartaEnterpriseJakartaEnterpriseCdiVersionAccessors(providers, config);
        public JakartaEnterpriseJakartaEnterpriseVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.jakarta.enterprise.jakarta.enterprise.cdi</b>
         */
        public JakartaEnterpriseJakartaEnterpriseCdiVersionAccessors getCdi() {
            return vaccForJakartaEnterpriseJakartaEnterpriseCdiVersionAccessors;
        }

    }

    public static class JakartaEnterpriseJakartaEnterpriseCdiVersionAccessors extends VersionFactory  {

        public JakartaEnterpriseJakartaEnterpriseCdiVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>jakarta.enterprise.jakarta.enterprise.cdi.api</b> with value <b>4.0.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getApi() { return getVersion("jakarta.enterprise.jakarta.enterprise.cdi.api"); }

    }

    public static class OrgVersionAccessors extends VersionFactory  {

        private final OrgBitbucketVersionAccessors vaccForOrgBitbucketVersionAccessors = new OrgBitbucketVersionAccessors(providers, config);
        private final OrgEclipseVersionAccessors vaccForOrgEclipseVersionAccessors = new OrgEclipseVersionAccessors(providers, config);
        private final OrgJetbrainsVersionAccessors vaccForOrgJetbrainsVersionAccessors = new OrgJetbrainsVersionAccessors(providers, config);
        private final OrgMapstructVersionAccessors vaccForOrgMapstructVersionAccessors = new OrgMapstructVersionAccessors(providers, config);
        private final OrgProjectlombokVersionAccessors vaccForOrgProjectlombokVersionAccessors = new OrgProjectlombokVersionAccessors(providers, config);
        public OrgVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.org.bitbucket</b>
         */
        public OrgBitbucketVersionAccessors getBitbucket() {
            return vaccForOrgBitbucketVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.org.eclipse</b>
         */
        public OrgEclipseVersionAccessors getEclipse() {
            return vaccForOrgEclipseVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.org.jetbrains</b>
         */
        public OrgJetbrainsVersionAccessors getJetbrains() {
            return vaccForOrgJetbrainsVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.org.mapstruct</b>
         */
        public OrgMapstructVersionAccessors getMapstruct() {
            return vaccForOrgMapstructVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.org.projectlombok</b>
         */
        public OrgProjectlombokVersionAccessors getProjectlombok() {
            return vaccForOrgProjectlombokVersionAccessors;
        }

    }

    public static class OrgBitbucketVersionAccessors extends VersionFactory  {

        private final OrgBitbucketBVersionAccessors vaccForOrgBitbucketBVersionAccessors = new OrgBitbucketBVersionAccessors(providers, config);
        public OrgBitbucketVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.org.bitbucket.b</b>
         */
        public OrgBitbucketBVersionAccessors getB() {
            return vaccForOrgBitbucketBVersionAccessors;
        }

    }

    public static class OrgBitbucketBVersionAccessors extends VersionFactory  {

        private final OrgBitbucketBCVersionAccessors vaccForOrgBitbucketBCVersionAccessors = new OrgBitbucketBCVersionAccessors(providers, config);
        public OrgBitbucketBVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.org.bitbucket.b.c</b>
         */
        public OrgBitbucketBCVersionAccessors getC() {
            return vaccForOrgBitbucketBCVersionAccessors;
        }

    }

    public static class OrgBitbucketBCVersionAccessors extends VersionFactory  {

        public OrgBitbucketBCVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>org.bitbucket.b.c.jose4j</b> with value <b>0.9.4</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getJose4j() { return getVersion("org.bitbucket.b.c.jose4j"); }

    }

    public static class OrgEclipseVersionAccessors extends VersionFactory  {

        private final OrgEclipseMicroprofileVersionAccessors vaccForOrgEclipseMicroprofileVersionAccessors = new OrgEclipseMicroprofileVersionAccessors(providers, config);
        public OrgEclipseVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.org.eclipse.microprofile</b>
         */
        public OrgEclipseMicroprofileVersionAccessors getMicroprofile() {
            return vaccForOrgEclipseMicroprofileVersionAccessors;
        }

    }

    public static class OrgEclipseMicroprofileVersionAccessors extends VersionFactory  {

        private final OrgEclipseMicroprofileJwtVersionAccessors vaccForOrgEclipseMicroprofileJwtVersionAccessors = new OrgEclipseMicroprofileJwtVersionAccessors(providers, config);
        public OrgEclipseMicroprofileVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.org.eclipse.microprofile.jwt</b>
         */
        public OrgEclipseMicroprofileJwtVersionAccessors getJwt() {
            return vaccForOrgEclipseMicroprofileJwtVersionAccessors;
        }

    }

    public static class OrgEclipseMicroprofileJwtVersionAccessors extends VersionFactory  {

        private final OrgEclipseMicroprofileJwtMicroprofileVersionAccessors vaccForOrgEclipseMicroprofileJwtMicroprofileVersionAccessors = new OrgEclipseMicroprofileJwtMicroprofileVersionAccessors(providers, config);
        public OrgEclipseMicroprofileJwtVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.org.eclipse.microprofile.jwt.microprofile</b>
         */
        public OrgEclipseMicroprofileJwtMicroprofileVersionAccessors getMicroprofile() {
            return vaccForOrgEclipseMicroprofileJwtMicroprofileVersionAccessors;
        }

    }

    public static class OrgEclipseMicroprofileJwtMicroprofileVersionAccessors extends VersionFactory  {

        private final OrgEclipseMicroprofileJwtMicroprofileJwtVersionAccessors vaccForOrgEclipseMicroprofileJwtMicroprofileJwtVersionAccessors = new OrgEclipseMicroprofileJwtMicroprofileJwtVersionAccessors(providers, config);
        public OrgEclipseMicroprofileJwtMicroprofileVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.org.eclipse.microprofile.jwt.microprofile.jwt</b>
         */
        public OrgEclipseMicroprofileJwtMicroprofileJwtVersionAccessors getJwt() {
            return vaccForOrgEclipseMicroprofileJwtMicroprofileJwtVersionAccessors;
        }

    }

    public static class OrgEclipseMicroprofileJwtMicroprofileJwtVersionAccessors extends VersionFactory  {

        private final OrgEclipseMicroprofileJwtMicroprofileJwtAuthVersionAccessors vaccForOrgEclipseMicroprofileJwtMicroprofileJwtAuthVersionAccessors = new OrgEclipseMicroprofileJwtMicroprofileJwtAuthVersionAccessors(providers, config);
        public OrgEclipseMicroprofileJwtMicroprofileJwtVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.org.eclipse.microprofile.jwt.microprofile.jwt.auth</b>
         */
        public OrgEclipseMicroprofileJwtMicroprofileJwtAuthVersionAccessors getAuth() {
            return vaccForOrgEclipseMicroprofileJwtMicroprofileJwtAuthVersionAccessors;
        }

    }

    public static class OrgEclipseMicroprofileJwtMicroprofileJwtAuthVersionAccessors extends VersionFactory  {

        public OrgEclipseMicroprofileJwtMicroprofileJwtAuthVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>org.eclipse.microprofile.jwt.microprofile.jwt.auth.api</b> with value <b>2.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getApi() { return getVersion("org.eclipse.microprofile.jwt.microprofile.jwt.auth.api"); }

    }

    public static class OrgJetbrainsVersionAccessors extends VersionFactory  {

        public OrgJetbrainsVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>org.jetbrains.annotations</b> with value <b>24.0.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getAnnotations() { return getVersion("org.jetbrains.annotations"); }

    }

    public static class OrgMapstructVersionAccessors extends VersionFactory  {

        private final OrgMapstructMapstructVersionAccessors vaccForOrgMapstructMapstructVersionAccessors = new OrgMapstructMapstructVersionAccessors(providers, config);
        public OrgMapstructVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.org.mapstruct.mapstruct</b>
         */
        public OrgMapstructMapstructVersionAccessors getMapstruct() {
            return vaccForOrgMapstructMapstructVersionAccessors;
        }

    }

    public static class OrgMapstructMapstructVersionAccessors extends VersionFactory  implements VersionNotationSupplier {

        public OrgMapstructMapstructVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>org.mapstruct.mapstruct</b> with value <b>1.5.5.Final</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> asProvider() { return getVersion("org.mapstruct.mapstruct"); }

        /**
         * Version alias <b>org.mapstruct.mapstruct.processor</b> with value <b>1.5.5.Final</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getProcessor() { return getVersion("org.mapstruct.mapstruct.processor"); }

    }

    public static class OrgProjectlombokVersionAccessors extends VersionFactory  {

        private final OrgProjectlombokLombokVersionAccessors vaccForOrgProjectlombokLombokVersionAccessors = new OrgProjectlombokLombokVersionAccessors(providers, config);
        public OrgProjectlombokVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.org.projectlombok.lombok</b>
         */
        public OrgProjectlombokLombokVersionAccessors getLombok() {
            return vaccForOrgProjectlombokLombokVersionAccessors;
        }

    }

    public static class OrgProjectlombokLombokVersionAccessors extends VersionFactory  implements VersionNotationSupplier {

        private final OrgProjectlombokLombokMapstructVersionAccessors vaccForOrgProjectlombokLombokMapstructVersionAccessors = new OrgProjectlombokLombokMapstructVersionAccessors(providers, config);
        public OrgProjectlombokLombokVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>org.projectlombok.lombok</b> with value <b>1.18.30</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> asProvider() { return getVersion("org.projectlombok.lombok"); }

        /**
         * Group of versions at <b>versions.org.projectlombok.lombok.mapstruct</b>
         */
        public OrgProjectlombokLombokMapstructVersionAccessors getMapstruct() {
            return vaccForOrgProjectlombokLombokMapstructVersionAccessors;
        }

    }

    public static class OrgProjectlombokLombokMapstructVersionAccessors extends VersionFactory  {

        public OrgProjectlombokLombokMapstructVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>org.projectlombok.lombok.mapstruct.binding</b> with value <b>0.2.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getBinding() { return getVersion("org.projectlombok.lombok.mapstruct.binding"); }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class BundleAccessors extends BundleFactory {

        public BundleAccessors(ObjectFactory objects, ProviderFactory providers, DefaultVersionCatalog config, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) { super(objects, providers, config, attributesFactory, capabilityNotationParser); }

    }

    public static class PluginAccessors extends PluginFactory {

        public PluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

    }

}
