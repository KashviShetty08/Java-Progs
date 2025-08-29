Transport Package – Java OOP Demonstration

This project demonstrates **Java OOP concepts** such as:
- Abstract classes
- Inheritance
- Method overriding
- Interfaces
- Final classes
- Package importing
- Constructor invocation order  

 Project Structure

src/
├── transport/
│ ├── Vehicle.java # Abstract base class
│ ├── Bicycle.java # Extends Vehicle
│ ├── EBike.java # Extends Bicycle (method overriding with super)
│ ├── Drone.java # Extends Vehicle + implements Payable
│ ├── Payable.java # Interface for cost calculation
│ └── SecurityRules.java # Final class with static rules
└── Main.java # Demonstration class (outside package)


Constructor Chaining

Creating an EBike calls parent constructors in order:

Vehicle() constructor called
Bicycle() constructor called
EBike() constructor called


Method Overriding with super

EBike.deliver(...) prints battery info before calling Bicycle.deliver(...).

Interface Implementation

Drone implements Payable and calculates delivery cost.

double bill = d.cost(5); // 5 km → Rs.100.0


Final Class Restriction

SecurityRules is final → cannot be extended.

class HackRules extends SecurityRules {} // ❌ Compilation error


Static Utility Method

SecurityRules.canFly(place) blocks delivery to "ExamCell".

▶️ How to Run

Compile:

javac transport/*.java Main.java


Run:

java Main
