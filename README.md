# 📱 Business Card Android App

[![Kotlin](https://img.shields.io/badge/Kotlin-2.2.10-7F52FF.svg?logo=kotlin&logoColor=white)](https://kotlinlang.org)
[![Jetpack Compose](https://img.shields.io/badge/Jetpack%20Compose-BOM%202026.02-4285F4.svg?logo=android&logoColor=white)](https://developer.android.com/jetpack/compose)
[![Material 3](https://img.shields.io/badge/Material%203-Design-795548.svg?logo=material-design&logoColor=white)](https://m3.material.io)
[![Android Min SDK](https://img.shields.io/badge/Min%20SDK-24-34A853.svg?logo=android&logoColor=white)](https://developer.android.com)
[![Android Target SDK](https://img.shields.io/badge/Target%20SDK-37-3DDC84.svg?logo=android&logoColor=white)](https://developer.android.com)
[![License](https://img.shields.io/badge/License-MIT-blue.svg)](LICENSE)

A modern, elegant digital business card application built natively for Android using **Jetpack Compose** and **Material 3**. Created as part of the **Google Android Basics with Compose** course pathway, this project demonstrates modern declarative UI design, responsive layouts, and clean Kotlin architecture.

---

## ✨ Features

- **🎨 Modern Dark Aesthetic**: Designed with an eye-catching dark palette featuring rich charcoal surfaces (`#10151C`) and warm gold accents (`#E0B96D`).
- **📐 Declarative Compose Layouts**: Structured cleanly into modular composables (`Intro` for developer branding, `Contact` for communication channels).
- **🎛️ Intrinsic Size Alignment**: Leverages Compose's `IntrinsicSize.Min` to ensure all contact rows and icon badges align consistently across screen densities.
- **📱 Edge-to-Edge Experience**: Uses `enableEdgeToEdge()` to blend the user interface smoothly with system bars.
- **⚡ Android Studio Live Preview**: Includes preview composables (`@Preview`) for rapid UI iteration without needing a full device deployment.

---

## 📸 App Preview & Design

```
+------------------------------------+
|                                    |
|              [ Avatar ]            |
|        Oubaid Allah Zmander        |
|        Full Stack Developer        |
|                                    |
|                                    |
|                                    |
|  [Phone]     24 301 793            |
|  [Instagram] @obaydz               |
|  [Email]     oubeidallahzmander... |
+------------------------------------+
```

### Color Palette

| Role | Color | Hex Code | Preview |
| :--- | :--- | :--- | :--- |
| **Background** | Midnight Slate | `#10151C` | `■` |
| **Accent / Icons** | Warm Gold | `#E0B96D` | `■` |
| **Primary Text** | Soft White / Slate | `#F4F6F0` | `■` |
| **Secondary Text** | Muted Silver | `#AAB2BD` | `■` |

---

## 🛠️ Tech Stack & Architecture

- **Language:** [Kotlin](https://kotlinlang.org/)
- **UI Toolkit:** [Jetpack Compose](https://developer.android.com/jetpack/compose) with Material 3 (`androidx.compose.material3`)
- **Activity & Lifecycle:** `ComponentActivity`, `androidx.activity.compose.setContent`
- **Build System:** Gradle Kotlin DSL (`build.gradle.kts`) with Gradle Version Catalog (`libs.versions.toml`)
- **Tooling:** Android Studio, Jetpack Compose Tooling & Preview

---

## 📂 Project Structure

```text
MyApplication3/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/example/myapplication/
│   │   │   │   ├── MainActivity.kt        # Main Activity & Composables (Intro, Contact)
│   │   │   │   └── ui/theme/
│   │   │   │       ├── Color.kt           # Custom color tokens
│   │   │   │       ├── Theme.kt           # Material 3 dynamic & dark/light themes
│   │   │   │       └── Type.kt            # Typography definitions
│   │   │   ├── res/
│   │   │   │   ├── drawable-nodpi/        # Profile picture & contact icons
│   │   │   │   └── values/                # String resources & app styles
│   │   │   └── AndroidManifest.xml        # Application manifest
│   │   └── test/                          # Unit & instrumentation tests
│   └── build.gradle.kts                   # Module-level Gradle configuration
├── gradle/
│   └── libs.versions.toml                 # Centralized dependency management
├── build.gradle.kts                       # Root project configuration
└── settings.gradle.kts                    # Gradle settings & plugin management
```

---

## 🚀 Getting Started

### Prerequisites

- **Android Studio** Ladybug (2024.2+) or newer
- **JDK 17** or **JDK 21**
- **Android SDK** with compileSdk / targetSdk 37 (or configure to your installed SDK level)

### Installation & Run

1. **Clone the repository:**
   ```bash
   git clone https://github.com/Obaydz/Business-Card-Android-Google-Course-.git
   cd Business-Card-Android-Google-Course-
   ```

2. **Open in Android Studio:**
   - Launch Android Studio.
   - Select **Open** and choose the cloned project root directory.
   - Wait for Gradle sync to complete.

3. **Run on Device or Emulator:**
   - Select an emulator or connected physical Android device (API 24+).
   - Click the green **Run (▶)** button or press `Shift + F10`.

---

## 🎨 Customization

You can easily adapt this project to create your own personalized business card:

1. **Profile Details:**
   Open [`MainActivity.kt`](app/src/main/java/com/example/myapplication/MainActivity.kt) and update the `Intro` composable with your name and title:
   ```kotlin
   Text(text = "Your Full Name", fontSize = 30.sp, fontWeight = FontWeight.Bold)
   Text(text = "Your Role / Specialty", fontSize = 15.sp, color = Color(0xFFE0B96D))
   ```

2. **Contact Links:**
   Update the `Contact` composable in [`MainActivity.kt`](app/src/main/java/com/example/myapplication/MainActivity.kt) with your phone number, social handles, and email address.

3. **Avatar & Assets:**
   Replace the profile photo (`oppf.jpg`) and vector icons in `app/src/main/res/drawable-nodpi/` with your own assets.

---

## 👤 Author

**Oubaid Allah Zmander**
- **GitHub:** [@Obaydz](https://github.com/Obaydz)
- **Instagram:** [@obaydz](https://instagram.com/obaydz)
- **Email:** [oubeidallahzmander@gmail.com](mailto:oubeidallahzmander@gmail.com)

---

## 📚 Acknowledgments

- [Google Android Basics with Compose](https://developer.android.com/courses/android-basics-compose/course) - for the foundational curriculum and project brief.
- [Android Developers Documentation](https://developer.android.com/jetpack/compose) - for Compose best practices and Material 3 design patterns.
