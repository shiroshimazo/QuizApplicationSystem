# System UI Rules

## General UI Guidelines

The Quiz Application System follows a consistent user interface design to provide a simple, organized, and user-friendly experience for administrators, teachers, and students.

### General Rules:
- All authentication interfaces must use a fixed resolution of **1000x500 pixels**.
- All user dashboard panels must use a fixed resolution of **1180x700 pixels**.
- The interface must maintain consistent spacing, alignment, colors, and button styles.
- Navigation elements must be easy to understand and accessible.
- The design must support clear separation between different user roles.

# UI Consistency Rules

## Colors
- Use a consistent color palette throughout all screens.
- Primary colors should be used for buttons and important actions.
- Warning colors should only be used for errors or destructive actions.

## Brand Colors
:root {
  --bg-main: #F7FAFC;
  --bg-surface: #FFFFFF;
  --bg-secondary: #EDF4F8;

  --primary: #A8DADC;
  --primary-hover: #82C4C7;
  --accent: #BDE0FE;

  --text-primary: #253238;
  --text-secondary: #68777D;

  --border: #DCE5E8;

  --success: #CDEDD6;
  --warning: #FAEDCD;
  --error: #F6CACA;
}

## Typography
- Use Satoshi fonts in folder /Resources/Fonts/Satoshi
- Satoshi-Bold: For headings
- Satoshi-Medium: For subheadings
- Satoshi-Regular: For paragraphs
- Maintain consistent font sizes for:
  - Titles
  - Labels
  - Buttons
  - Navigation items
## Buttons
- All buttons must have:
  - Clear text labels
  - Consistent size
  - Consistent placement
  - Hover and click feedback
## Forms
- Required fields must be clearly identified.
- Input validation messages must be displayed clearly.
- Invalid inputs must provide user feedback.

---

[[Authentication UI Rules.md]]
[[Sidebar Nav Ui.md]]