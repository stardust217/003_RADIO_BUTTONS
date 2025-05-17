MAY 17-05-25 PROJECT START DATE 
MAY 17-05-25 PROJECT COMPLETE DATE
HI IM MOJES TODAY ON MY WAY JAVA SWING COURSE, I DECIDED TO EXPERIMENT WITH JRADIOBUTTONS 

# Mood Radio Buttons App

This is a simple Java Swing application that asks the user how they are feeling today and provides a friendly, customized response based on their answer. The UI features a label question, three radio button options, and a Submit button. This project is great for learning the basics of Java GUI programming.

## Features

- **Question Prompt:** Asks "HI HOW ARE FEELING TODAY" at the top.
- **Three Mood Options:**
  - "IM GREAT"
  - "IM JUST FINE"
  - "IT HASN'T BEEN GREAT"
- **Single Selection:** Only one radio button can be selected at a time.
- **Custom Response:** After clicking Submit, a dialog box shows a positive message based on the selected option.
- **Console Logging:** Selections and submissions are printed to the console for debugging/demo purposes.
- **Simple UI:** Clean layout with intuitive controls.

## 1. **Preparation**

### a. Requirements
- Ensure you have Java JDK 8 or newer installed.
- Download or clone the repository containing the app code.

### b. Compilation
Open a terminal or command prompt and navigate to the project directory. Compile the code by running:
```sh
javac com/moes/CONS.java
```

---

## 2. **Running the Application**

Start the application with:
```sh
java com.moes.CONS
```

A window should appear with the question and three radio button options.

---

## 3. **Understanding the UI**

- At the top, you’ll see the label:  
  `HI HOW ARE FEELING TODAY`
- Three radio buttons for answers:
    - IM GREAT
    - IM JUST FINE
    - IT HASN'T BEEN GREAT
- A "Submit" button underneath.

---

## 4. **Testing Functionality**

### a. Radio Button Selection

- Click on each radio button one by one.
- Observe the console—it should print which option you selected, e.g., `you selected "IM GREAT"`.

### b. Submit Button

- Select one of the options.
- Click "Submit".
- The window will close and a dialog with a message will appear:
    - For "IM GREAT":  
      **"IM GREAT"? That's great to hear from you brother**
    - For "IM JUST FINE":  
      **GLAD TO HEAR IT FROM YOU. HOPE YOU DO EVEN BETTER**
    - For "IT HASN'T BEEN GREAT":  
      **DON'T WORRY THINGS WILL GET BETTER**
- The console will also log which answer was submitted.
