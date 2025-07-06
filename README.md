# Spring Boot Microservices 

## 🚀 מה הפרויקט עושה?
הפרויקט מדגים פיתוח מערכת מבוססת מיקרו-שירותים (Microservices) באמצעות Spring Boot, שבה שני שירותים עצמאיים מתקשרים זה עם זה ב־REST.  
שני השירותים מופעלים יחד בסביבה מבודדת בעזרת Docker Compose.

- **user-service**: מספק מידע על משתמש לפי מזהה.
- **greeting-service**: פונה אל user-service כדי לקבל את שם המשתמש ומחזיר ברכה מותאמת.

---

## 🛠 באילו טכנולוגיות משתמשים?
- **Java 17** (או גרסה תואמת)
- **Spring Boot** (REST Controllers)
- **RestTemplate** או **WebClient** לתקשורת בין שירותים
- **Maven** לניהול תלויות ובנייה
- **Docker** ו-**Docker Compose** להפעלת השירותים יחד בסביבה מבודדת

---


---

## ⚙️ איך מריצים את הפרויקט?

### 🐳 הרצה באמצעות Docker Compose
זו הדרך המומלצת למי שמוריד מה-GitHub:

1. ודא ש-Docker ו-Docker Compose מותקנים במחשב שלך.
2. בתיקייה הראשית (שבה נמצא `docker-compose.yml`), הרץ:
    ```bash
    docker-compose up --build
    ```
3. השירותים יעלו בכתובות:
    - **user-service**: `http://localhost:8081/users/1`
    - **greeting-service**: `http://localhost:8082/greet/1`

---

### 🚀 הרצה ידנית מהמחשב
למי שרוצה להריץ בלי Docker:

1. פתח טרמינל בכל שירות בנפרד (למשל `user-service`):
    ```bash
    cd user-service
    ./mvnw spring-boot:run
    ```
2. פתח טרמינל נוסף והפעל בו את `greeting-service`:
    ```bash
    cd greeting-service
    ./mvnw spring-boot:run
    ```

> השירותים מאזינים בפורטים:
> - `8081` עבור user-service
> - `8082` עבור greeting-service

---

## 📝 דוגמאות שימוש
- קבלת מידע על משתמש:
    ```
    GET http://localhost:8081/users/1
    ```
    תשובה לדוגמה:
    ```json
    {
      "id": 1,
      "name": "Dana"
    }
    ```

- קבלת ברכה מותאמת:
    ```
    GET http://localhost:8082/greet/1
    ```
    תשובה לדוגמה:
    ```
    Hello Dana!
    ```

---

## ✅ סיום
זהו פרויקט דמו פשוט להדגמה של תקשורת REST בין מיקרו-שירותים עם Spring Boot, ולהרצה משותפת בסביבת Docker Compose.  
אפשר להרחיב אותו בעתיד עם מסדי נתונים, קונפיגורציות, או שירותי Discovery.

בהצלחה 🚀
