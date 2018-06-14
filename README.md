# ScreenshotCapturingSample

This is a sample project with a failing UI test. It is used to show how to capture screenshots of failing tests automatically and embed them in JUnit reports.

To run UI tests execute:
```
./gradlew connectedDebugAndroidTest
```

UI test reports can be found at `app/build/reports/androidTests/connected`.

To make the test in this project pass go to `MainActivity.kt` and uncommented the code there.
