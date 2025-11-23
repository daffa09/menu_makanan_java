<!-- portfolio -->
<!-- slug: menu-makanan-java -->
<!-- title: Menu Makanan Java -->
<!-- description: Simple food menu desktop application built with Java Swing and NetBeans -->
<!-- image: https://github.com/user-attachments/assets/71d35019-b4d5-4067-b17d-4faa581f2d67 -->
<!-- tags: java, swing, netbeans, mysql, desktop-app, food-menu -->

# Food Menu Application (Menu Makanan)

<img width="1536" height="1024" alt="menu-makanan-java" src="https://github.com/user-attachments/assets/71d35019-b4d5-4067-b17d-4faa581f2d67" />

A simple food menu management desktop application built with Java Swing using NetBeans IDE. This application allows restaurant staff to manage food menu items, categories, and pricing through an intuitive graphical interface.

## 📋 Overview

This is a desktop-based food menu application (Menu Makanan) created during my Java learning journey. It provides a complete solution for managing restaurant menu items with features for adding, editing, viewing, and deleting food items.

## ✨ Features

- **Menu Management (CRUD)**
  - Add new food items with details
  - View all menu items in a table format
  - Update existing menu information
  - Delete menu items with confirmation

- **Category Management**
  - Organize food items by categories
  - Filter menu items by category
  - Category-based sorting

- **Price Management**
  - Set and update food prices
  - Display prices in formatted currency
  - Track price changes

- **Database Integration**
  - MySQL database for data persistence
  - Reliable data storage
  - Query optimization

- **User-Friendly Interface**
  - Clean Swing-based GUI
  - Intuitive navigation
  - Data grid display with sorting
  - Form validation

## 🛠️ Technologies Used

- **Java**: Core programming language
- **Swing**: GUI framework
- **NetBeans 8**: IDE for development
- **MySQL**: Database management system
- **JDBC**: Database connectivity
- **JTable**: Data display component

## 📁 Project Structure

```
menu_makanan_java/
├── src/
│   └── menu/
│       ├── Main.java          # Application entry point
│       ├── MenuForm.java      # Main form UI
│       ├── Database.java      # DB connection
│       └── FoodItem.java      # Data model
├── nbproject/                 # NetBeans project files
├── build/                     # Compiled classes
├── dist/                      # Distributable JAR
├── build.xml                  # Ant build file
├── java_menu_makanan.sql     # Database schema
└── README.md
```

## 🚀 Getting Started

### Prerequisites

- **JDK 8 or higher**
- **NetBeans IDE 8+** (recommended) or any Java IDE
- **MySQL Server 5.7+**
- **MySQL Connector/J** (JDBC driver)

### Database Setup

1. **Create Database**
   
   Open MySQL and run:
   ```sql
   CREATE DATABASE java_menu_makanan;
   ```

2. **Import Schema**
   ```bash
   mysql -u root -p java_menu_makanan < java_menu_makanan.sql
   ```

   Or import via MySQLWorkbench/phpMyAdmin

3. **Configure Connection**
   
   Update database credentials in `Database.java`:
   ```java
   private static final String URL = "jdbc:mysql://localhost:3306/java_menu_makanan";
   private static final String USER = "root";
   private static final String PASSWORD = "your_password";
   ```

### Running with NetBeans

1. **Open Project**
   - Launch NetBeans IDE
   - File → Open Project
   - Navigate to project folder
   - Select and open

2. **Add MySQL Connector**
   - Right-click on "Libraries"
   - Add JAR/Folder
   - Select `mysql-connector-java-x.x.x.jar`

3. **Build Project**
   - Right-click on project
   - Select "Clean and Build"
   - Wait for compilation

4. **Run Application**
   - Press F6 or click Run button
   - Application window will appear

### Running JAR File

After building:
```bash
java -jar dist/menu_makanan_java.jar
```

## 💻 Usage Guide

### Adding Menu Items

1. Click "Add New Item" button
2. Fill in the form:
   - **Food Name**: Name of the dish
   - **Category**: Select category (Appetizer, Main Course, Dessert, Beverage)
   - **Price**: Enter price in numbers
   - **Description**: Brief description
   - **Available**: Check if currently available
3. Click "Save"
4. Item appears in the table

### Viewing Menu

- All menu items display in the main table
- Columns show: ID, Name, Category, Price, Availability
- Click column headers to sort
- Use search box to filter items

### Editing Menu Items

1. Select item from table
2. Click "Edit" button
3. Modify fields as needed
4. Click "Update" to save changes

### Deleting Menu Items

1. Select item from table
2. Click "Delete" button
3. Confirm deletion in dialog
4. Item removed from database

### Filtering by Category

1. Select category from dropdown
2. Table automatically filters
3. Select "All" to show all items

## 🎨 UI Components

### Main Window
- **Menu Table**: Displays all food items
- **Search Bar**: Filter items by name
- **Category Filter**: Dropdown for category selection
- **Action Buttons**: Add, Edit, Delete, Refresh

### Add/Edit Form
- **Text Fields**: Name, Price, Description
- **Combo Box**: Category selection
- **Checkbox**: Availability status
- **Buttons**: Save, Cancel

## 🗄️ Database Schema

### Main Table: `menu_items`

```sql
CREATE TABLE menu_items (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    category VARCHAR(50) NOT NULL,
    price DECIMAL(10,2) NOT NULL,
    description TEXT,
    is_available BOOLEAN DEFAULT TRUE,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);
```

## 🔧 Configuration

### Database Connection

Edit `Database.java`:
```java
public class Database {
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/java_menu_makanan";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
```

## 🐛 Troubleshooting

**MySQL Connector Not Found**
-Download MySQL Connector/J from official site
- Add to project libraries in NetBeans

**Database Connection Failed**
- Verify MySQL is running
- Check credentials in Database.java
- Ensure database exists

**NetBeans Won't Build**
- Clean project first (Shift+F11)
- Ensure JDK is properly configured
- Check build.xml for errors

**UI Not Displaying Correctly**
- Verify Swing components are properly initialized

- Check form designer in NetBeans

## 🚀 Future Enhancements

Potential improvements:
- Image upload for food items
- Order management system
- Sales tracking and reports
- Multi-language support
- Print menu functionality
- Barcode/QR code generation
- Customer reviews/ratings
- Ingredient tracking

## 🎓 Learning Outcomes

This project helped me learn:
- Java Swing GUI development
- NetBeans Form Designer
- MySQL database integration
- JDBC connections and queries
- CRUD operations
- MVC pattern basics
- Event-driven programming
- Table models and renderers

## 🤝 Contributing

This is an educational project. Suggestions and improvements are welcome!

## 📄 License

Open source and available for educational purposes.

---

**Built with NetBeans 8** ☕🍔  
A simple food menu management solution for learning Java desktop development
