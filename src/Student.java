public class Student extends Person
{
    private int numberOfModules, numberOfRepeatedModules, numberOfNewModules;
    private float amountPaid, balance, totalAmount, subTotalRepeatModules, subTotalNewModules;

    private String[] moduleNames =
            {
                    "Introduction to Computing", "Computer Programming 1", "Introduction to Human Computer Interaction",
                    "Computer Programming 2", "Data Structures and Algorithm", "Professional Development",
                    "Discrete Structures 1", "Computer Systems and Architecture", "Discrete Structures 2",
                    "Object Oriented Programming", "Information Management", "Design Thinking", "Algorithm",
                    "Fundamentals of Analysis", "Operating System", "Application Development of Emerging Technologies",
                    "Technoprenuership", "Database Systems", "Networks and Communications 1", "Automata Theory",
                    "CS Specialization 1", "CS Elective Parallel and Distributive Computing", "Mobile Programming", "Networks and Communications 2",
                    "Modeling and Simulation", "Software Engineering 1", "CS EElective Computer Graphics and Visual Computing",
                    "CS Specialization 2", "CS Project Management", "Software Engineering 2", "Programming Languages",
                    "CS Specialization 3", "Number Theory", "Information Assurance and Security", "CS Project 1",
                    "CS Specialization 4", "Social Issues and Professional Practice", "CS Project 2", "CS Elective Intelligent Systems",
                    "Internship 1", "Internship 2"
            };

    private String[] selectedModules = new String[6];
    private int[] selectedModulesByNumber = new int[6];

    public Student(int Id, String fName, String lName, String address, String gender, String pNumber, int newMods, int repeatMods, float amount) {
        super(Id, fName, lName, address, gender, pNumber);
        this.numberOfNewModules = newMods;
        this.numberOfRepeatedModules = repeatMods;
        this.amountPaid = amount;
    }

    /**
     * Setters
     */
    public void setAmountPaid(float amount)
    {
        this.amountPaid = amount;
    }

    public void setSelectedModulesByNumber(int[] selectedModuleArray)
    {
        if (selectedModuleArray.length <= 6)
        {
            for (int x = 0; x < selectedModuleArray.length; x++)
            {
                selectedModuleArray[x]--;
            }
            this.selectedModulesByNumber = selectedModuleArray;
        }
        else
            System.out.println("Selected Module Array is out of Bounds");
    }

    public void setSelectedModules()
    {
        for (int x = 0; x < selectedModulesByNumber.length; x++)
        {
            selectedModules[x] = moduleNames[selectedModulesByNumber[x]];
        }
    }

    public void setTotalAmount(float inputTotalAmount)
    {
        this.totalAmount = inputTotalAmount;
    }

    public void setNumberOfNewModules(int newModules)
    {
        this.numberOfNewModules = newModules;
    }

    public void setNumberOfRepeatedModulesModules(int repeatedModules)
    {
        this.numberOfRepeatedModules = repeatedModules;
    }

    public void setNumberOfModules(int inputNumberOfModules)
    {
        this.numberOfModules = inputNumberOfModules;
    }

    public void setBalance(float inputBalance)
    {
        this.balance = inputBalance;
    }

    /**
     * Getters
     */
    public float getAmountBalance()
    {
        return this.balance;
    }

    public float getTotalAmount()
    {
        return this.totalAmount;
    }

    public String[] getModuleNames()
    {
        return this.moduleNames;
    }

    public float getAmountPaid()
    {
        return this.amountPaid;
    }

    public int getNumberOfModules(){ return this.numberOfModules; }

    public int getNumberOfRepeatedModules() { return this.numberOfRepeatedModules; }

    public int getNumberOfNewModules() { return this.numberOfNewModules; }

    /**
     * Computational Functions
     */
    public void computeTotalAmount()
    {
        subTotalNewModules = 525 * numberOfNewModules;
        subTotalRepeatModules = 110 * numberOfRepeatedModules;
        totalAmount = subTotalNewModules + subTotalRepeatModules;
    }

    public void computeNumberOfModules()
    {
        this.numberOfModules = this.numberOfNewModules + this.numberOfRepeatedModules;
    }

    public void computeBalance()
    {
        this.balance = (float) (totalAmount - amountPaid);
    }

    //temporary
    public void displayStudentInfo()
    {
        displayPersonalInfo();
        System.out.println("Amount Paid: " + amountPaid);
        System.out.println("Balance: " + balance);
        System.out.println("Total Amount: " + totalAmount);
        System.out.println("New Modules: " + numberOfNewModules);
        System.out.println("Repeated Modules: " + numberOfRepeatedModules);
        System.out.println("Total Modules: " + numberOfModules);
    }

}
