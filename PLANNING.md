# Financial Manager App

Kotlin Android application for managing personal finances. Built with Jetpack Compose and a scalable architecture designed for Kotlin Multiplatform.

---

## 🛠️ Tech Stack

- Kotlin
- Jetpack Compose (Material 3)
- MVVM Architecture
- Koin (Dependency Injection)
- Room (Local Database)
- Supabase (Remote Backend)
- Coroutines & Flow
- DataStore Preferences
- Navigation Compose
- Accompanist
- Timber (Logging)
- (Future-ready for Kotlin Multiplatform: iOS / Desktop)

---

## 📁 Project Structure

```
financial-manager-app/
├── shared/        # Domain + Data (business logic)
│   ├── data/              # Data sources (Room, Supabase)
│   │   ├── local/
│   │   ├── remote/
│   │   ├── repository/
│   │   └── model/
│   ├── domain/            # Use cases
│   └── utils/             # Extensions, helpers
│
└── androidApp/    # Android UI (Compose, ViewModels, Navigation)
    ├── di/                 # Koin modules
    ├── presentation/
    │   ├── home/
    │   ├── add_transaction/
    │   ├── stats/
    │   ├── settings/
    │   └── components/     # Reusable composables
    ├── navigation/
    └── MainActivity.kt
```

---

## 🚀 MVP Features

### Home Screen
- Total balance display
- Transaction list
- Category/date filters

### Add Transaction
- Add income/expense
- Input category, amount, notes

### Stats
- Simple monthly breakdown
- Charts and summaries

### (Optional) Settings
- Theme (dark/light)
- User profile (if using Supabase Auth)

---

## 🧠 Future Ideas

- Supabase Auth (login/register)
- Offline/online sync
- Export to CSV
- Notifications
- Widget for quick add
- Graphs with deeper insights
- iOS and Desktop versions (KMP)
