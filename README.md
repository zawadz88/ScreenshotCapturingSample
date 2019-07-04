# ScreenshotCapturingSample

This is a sample project with a failing UI test. It is used to show how to capture screenshots of failing tests automatically and embed them in JUnit reports. More details available at https://medium.com/stepstone-tech/how-to-capture-screenshots-for-failed-ui-tests-9927eea6e1e4

To run UI tests execute:
```
./gradlew connectedDebugAndroidTest
```

UI test reports can be found at `app/build/reports/androidTests/connected`.

To make the test in this project pass go to `MainActivity.kt` and uncommented the code there.
