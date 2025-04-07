import com.android.build.gradle.AppExtension

val android = project.extensions.getByType(AppExtension::class.java)

android.apply {
    flavorDimensions("flavor-type")

    productFlavors {
        create("development") {
            dimension = "flavor-type"
            applicationId = "com.test.dev"
            resValue(type = "string", name = "app_name", value = "test-dev")
        }
        create("production") {
            dimension = "flavor-type"
            applicationId = "com.prod.com"
            resValue(type = "string", name = "app_name", value = "onlyMyHealth")
        }
    }
}