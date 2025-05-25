# 📍 VTracking App

A real-time vehicle tracking system that integrates GPS, GSM, and sensor technology to monitor live location, speed, fuel usage, route history, and safety alerts. Built using Ionic for mobile, Node.js for backend, and microcontrollers for hardware integration, it’s designed for scalable deployment in fleet and personal vehicle management.



---

## 🎥 Project Demo

[![Watch the video](https://github.com/user-attachments/assets/b9fdc47e-4f3d-4c89-b4b5-2a0e3222534d)




## 🧠 Project Overview

VTracking offers:
- Real-time location tracking with GPS
- Alerts for overspeeding, idling, or unauthorized movement
- Route history and fuel usage analytics
- Monitoring total distance, average/top speed
- Integration with sensors like IR, fire detectors, and alcohol detection (future scope)

---

## 🚗 Features

- ✅ Live vehicle tracking on Google Maps
- ✅ Speed & fuel usage monitoring
- ✅ Parking, idle, and movement detection
- ✅ Notification for violations and rule breaking
- ✅ Alert system for overheating, fire, or suspicious activity
- ✅ Mobile app for real-time access (Ionic)
- ✅ Node.js backend with Redis for performance
- ✅ Sensor integration for future road safety features

---

## 💻 Tech Stack

| Layer          | Technology                        |
|----------------|------------------------------------|
| **Frontend**   | Ionic, Angular, HTML/CSS           |
| **Backend**    | Node.js, Express, Redis            |
| **Hardware**   | Microcontroller (AT89552), GPS, GSM, Sensors |
| **Database**   | NoSQL/Redis (session/cache)        |
| **APIs**       | Google Maps API                    |
| **Tools**      | Android Studio, Postman, Cordova   |

---


## 🛠️ Installation & Run

```bash
# Backend
cd backend/
npm install
node app.js

# Frontend (Ionic)
cd frontend/
npm install
ionic serve
