# Defence System

A **Java Swing simulation** of a multi-vehicle defence control system  
(**Helicopter, Tank, Submarine**) with a central **Main Controller**.  

Built with **OOP principles**:  
- Inheritance  
- Polymorphism  
- Encapsulation  
- Interfaces  
- Composition  

### Features
- 🖥️ Swing-based UI for control & monitoring  
- 🚁🚜🚢 Vehicle types: Helicopter, Tank, Submarine  
- 📡 Messaging system:  
  - Public (broadcast) messages  
  - Private/direct messages  
  - Media attachments: GIFs + sound files  
- ⚡ Energy monitoring system  
- 🌊 Oxygen monitoring system (for submarines)  
- 🔔 Alerts when energy/oxygen is low  

---

## Tech Stack
- **Java 11+**  
- **Java Swing** (UI)  
- **OOP concepts**  

---

## How to Run
```bash
# Clone repository
git clone https://github.com/pasindupramod755/defence-system.git
cd defence-system

# Compile & Run
javac -d out src/**/*.java
java -cp out Main
