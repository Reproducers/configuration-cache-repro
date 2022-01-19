plugins {
    kotlin("jvm") version "1.6.10"
    id("com.diffplug.spotless") version "6.2.0"
}

tasks.spotlessCheck {
    notCompatibleWithConfigurationCache("https://github.com/diffplug/spotless/issues/987")
}
