# Swing UI Development Rules

## Purpose

This document defines the development rules for creating the user interface of the Quiz Application System.

All UI development must follow these standards to maintain consistency, readability, and proper Java Swing implementation.

The UI design must also follow the guidelines defined in:

[[System UI Rules.md]]

---

# Framework and Technology Requirements

## Required UI Framework

The system interface must be developed using:

- Java Swing only
- NetBeans GUI Builder (Design View)
- FlatLaf Look and Feel

Do not use:
- JavaFX
- Web-based UI frameworks
- Custom rendering frameworks unless required

---

# UI Development Environment

## NetBeans Design View

All Swing interfaces must be created using the NetBeans GUI Builder.

Developers should:

- Use the Design tab for placing components.
- Drag and drop Swing components from the Palette.
- Allow NetBeans to manage layout generation.
- Avoid manually creating large UI layouts using absolute positioning.

Preferred components:

- JPanel
- JLabel
- JButton
- JTextField
- JPasswordField
- JTable
- JScrollPane
- JComboBox
- JCheckBox
- JRadioButton
- JList

---

# Swing Component Naming Rules

All Swing components must have meaningful variable names using camelCase.

## Naming Format

```
componentPurpose
```

Examples:

| Component | Variable Name |
|-|-|
| JLabel | titleLabel |
| JButton | loginButton |
| JTextField | usernameField |
| JPasswordField | passwordField |
| JPanel | sidebarPanel |
| JTable | studentTable |
| JComboBox | subjectComboBox |
| JScrollPane | quizScrollPane |

Avoid default NetBeans names:

Incorrect:
```
jButton1
jTextField1
jPanel1
```

Correct:
```
submitButton
usernameField
loginPanel
```

---

# UI Component Placement Rules

Each UI component must be placed in its correct designated area.

Example:

## Login UI

Window Size:
```
1000x500 pixels
```

Layout:

```
+--------------------------------------+
|                                      |
|     Logo/Image      Login Form       |
|                                      |
|     Left Panel      Right Panel      |
|                                      |
+--------------------------------------+
```

Components must remain inside their assigned panels.

Example:

Left Section:
- Logo
- Illustration
- Branding elements

Right Section:
- Username field
- Password field
- Login button
- Navigation links

---

# Code Organization Rules

## Event Handling

Button actions and component events must be placed inside their designated event methods.

Example:

When a user double-clicks:

```
loginButton
```

The action code should be placed inside:

```java
private void loginButtonActionPerformed(java.awt.event.ActionEvent evt)
{
    // Button action logic here
}
```

Do not place event logic randomly inside:

- Constructor
- initComponents()
- Generated UI code area

---

# NetBeans Generated Code Rules

The following areas must not be manually edited:

```java
initComponents()
```

Reason:
- NetBeans automatically manages this section.
- Manual changes may be overwritten when using Design View.

Custom code should be placed:

- After initComponents()
- Inside event handlers
- Inside separate methods

Example:

```java
public LoginUI()
{
    initComponents();
    setupUI();
}

private void setupUI()
{
    // Custom UI setup
}
```

---

# FlatLaf Design Rules

FlatLaf must be applied before displaying the UI.

The application should use FlatLaf for:

- Modern colors
- Button styling
- Text field appearance
- Table styling
- Consistent UI theme

Example:

```java
FlatLightLaf.setup();
```

or another selected FlatLaf theme.

All screens must maintain a consistent appearance.

---

# UI File Structure

Each UI screen should have its own Java class.

Example:

```
System UI
│
├── LoginUI.java
├── RegisterUI.java
├── ForgotPasswordUI.java
│
├── AdminPanelUI.java
├── TeacherPanelUI.java
└── StudentPanelUI.java
```

# Database Rules

[[Database Rules.md]]