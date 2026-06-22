pluginManagement {
    repositories { google(); mavenCentral(); gradlePluginPortal() }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven {
            name = "gpr-vbwd-android-core"
            url = uri("https://maven.pkg.github.com/vbwd-platform/vbwd-android-core")
            credentials {
                username = System.getenv("GITHUB_ACTOR") ?: (providers.gradleProperty("gpr.user").orNull ?: "")
                password = System.getenv("GITHUB_TOKEN") ?: (providers.gradleProperty("gpr.key").orNull ?: "")
            }
        }
        maven {
            name = "gpr-vbwd-android-example"
            url = uri("https://maven.pkg.github.com/vbwd-platform/vbwd-android-example")
            credentials {
                username = System.getenv("GITHUB_ACTOR") ?: (providers.gradleProperty("gpr.user").orNull ?: "")
                password = System.getenv("GITHUB_TOKEN") ?: (providers.gradleProperty("gpr.key").orNull ?: "")
            }
        }
        maven {
            name = "gpr-vbwd-android-subscription"
            url = uri("https://maven.pkg.github.com/vbwd-platform/vbwd-android-subscription")
            credentials {
                username = System.getenv("GITHUB_ACTOR") ?: (providers.gradleProperty("gpr.user").orNull ?: "")
                password = System.getenv("GITHUB_TOKEN") ?: (providers.gradleProperty("gpr.key").orNull ?: "")
            }
        }
        maven {
            name = "gpr-vbwd-android-token-payment"
            url = uri("https://maven.pkg.github.com/vbwd-platform/vbwd-android-token-payment")
            credentials {
                username = System.getenv("GITHUB_ACTOR") ?: (providers.gradleProperty("gpr.user").orNull ?: "")
                password = System.getenv("GITHUB_TOKEN") ?: (providers.gradleProperty("gpr.key").orNull ?: "")
            }
        }
        maven {
            name = "gpr-vbwd-android-stripe"
            url = uri("https://maven.pkg.github.com/vbwd-platform/vbwd-android-stripe")
            credentials {
                username = System.getenv("GITHUB_ACTOR") ?: (providers.gradleProperty("gpr.user").orNull ?: "")
                password = System.getenv("GITHUB_TOKEN") ?: (providers.gradleProperty("gpr.key").orNull ?: "")
            }
        }
        maven {
            name = "gpr-vbwd-android-invoice"
            url = uri("https://maven.pkg.github.com/vbwd-platform/vbwd-android-invoice")
            credentials {
                username = System.getenv("GITHUB_ACTOR") ?: (providers.gradleProperty("gpr.user").orNull ?: "")
                password = System.getenv("GITHUB_TOKEN") ?: (providers.gradleProperty("gpr.key").orNull ?: "")
            }
        }
        maven {
            name = "gpr-vbwd-android-cms"
            url = uri("https://maven.pkg.github.com/vbwd-platform/vbwd-android-cms")
            credentials {
                username = System.getenv("GITHUB_ACTOR") ?: (providers.gradleProperty("gpr.user").orNull ?: "")
                password = System.getenv("GITHUB_TOKEN") ?: (providers.gradleProperty("gpr.key").orNull ?: "")
            }
        }
        maven {
            name = "gpr-vbwd-android-tarot"
            url = uri("https://maven.pkg.github.com/vbwd-platform/vbwd-android-tarot")
            credentials {
                username = System.getenv("GITHUB_ACTOR") ?: (providers.gradleProperty("gpr.user").orNull ?: "")
                password = System.getenv("GITHUB_TOKEN") ?: (providers.gradleProperty("gpr.key").orNull ?: "")
            }
        }
        maven {
            name = "gpr-vbwd-android-meinchat"
            url = uri("https://maven.pkg.github.com/vbwd-platform/vbwd-android-meinchat")
            credentials {
                username = System.getenv("GITHUB_ACTOR") ?: (providers.gradleProperty("gpr.user").orNull ?: "")
                password = System.getenv("GITHUB_TOKEN") ?: (providers.gradleProperty("gpr.key").orNull ?: "")
            }
        }
        maven {
            name = "gpr-vbwd-android-meinchat-plus"
            url = uri("https://maven.pkg.github.com/vbwd-platform/vbwd-android-meinchat-plus")
            credentials {
                username = System.getenv("GITHUB_ACTOR") ?: (providers.gradleProperty("gpr.user").orNull ?: "")
                password = System.getenv("GITHUB_TOKEN") ?: (providers.gradleProperty("gpr.key").orNull ?: "")
            }
        }
    }
}
rootProject.name = "vbwd-android-app-example"
include(":app")
