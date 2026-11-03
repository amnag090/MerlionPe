# SGD to INR Currency Converter & Native Android Home Widget

This is a complete native Android Studio project with:
- **Offline Currency App**: Embedded fast WebView running the morning locked rate protocol.
- **Native Android Home Screen Widget** (`SgdInrWidgetProvider`): An actual Android OS widget tile you can place on your home screen.

## How to Get Your Signed APK:

### Method 1: Instant 60-Second Cloud Build (Free via GitHub)
1. Upload this repository folder to GitHub.
2. Go to the **Actions** tab in GitHub.
3. The included workflow (`build-apk.yml`) will automatically build and compile `app-debug.apk`.
4. Download the `.apk` file directly to your phone and install!

### Method 2: Open in Android Studio
1. Unzip this project on your computer.
2. Open Android Studio -> **Open an Existing Project**.
3. Click **Build -> Build Bundle(s) / APK(s) -> Build APK(s)**.
4. Android Studio will output the ready-to-install `.apk` file in `app/build/outputs/apk/debug/`.

### Method 3: PWABuilder (Fastest, No Android Studio Required)
1. Open [PWABuilder](https://www.pwabuilder.com).
2. Enter your hosted web app URL (from Netlify Drop or GitHub Pages).
3. Click **Package for Android** -> Download the signed `.apk` file immediately!
