package hospital;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hospital {

	Map<String, Employee> employeeRoster = new HashMap<>();

	public void addExistingEmployees() {
		Employee current;

		current = new Doctor("Phil", "111", 90000, "Brain");
		this.addEmployee(current);
		current = new Doctor("Harry", "222", 120000, "Plastic");
		this.addEmployee(current);
		current = new Nurse("Jackie", "333", 50000, 6);
		this.addEmployee(current);
		current = new Receptionist("Janine", "444", 45000);
		this.addEmployee(current);
		current = new Janitor("Rosie", "555", 40000);
		this.addEmployee(current);
		current = new VampireJanitor("Sparkles", "666", 40000);
		this.addEmployee(current);
	}

	public int getRosterSize() {
		return employeeRoster.size();
	}

	public void addEmployee(Employee newPerson) {
		employeeRoster.put(newPerson.getIDNumber(), newPerson);
	}

	public void removeEmployee(String id) {
		employeeRoster.remove(id);
	}

	public boolean checkForEmployeeByID(String id) {
		return employeeRoster.containsKey(id);
	}

	public Employee findEmployeeByID(String id) {
		return employeeRoster.get(id);
	}

	public boolean checkForEmployeeByName(String name) {
		for (Employee i : employeeRoster.values()) {
			if (i.getName().equals(name)) {
				return true;
			}
		}
		return false;
	}

	public Employee findEmployeeByName(String name) {
		for (Employee i : employeeRoster.values()) {
			if (i.getName().equals(name)) {
				return i;
			}
		}
		return null;
	}

	public Collection<Employee> getAllEmployees() {
		return employeeRoster.values();
	}

	public void start() {
		Scanner input = new Scanner(System.in);
		String choice;
		String nameInput;
		String idInput;
		int salaryInput;
		String specialtyInput;
		int numOfPatientsInput;
		Employee currentEmployee;
		Collection<Employee> currentEmployeeList;
		this.addExistingEmployees();

		do {
			System.out.println("Welcome to the High St. Hospital Employee Management System.");
			System.out.println("Please select an option:");
			System.out.println();
			System.out.println("1. Search for an employee by name");
			System.out.println("2. Search for an employee by employee ID");
			System.out.println("3. Display the status of all current employees");
			System.out.println("4. Display the salaries of all current employees");
			System.out.println("5. Display all employees who are able to draw blood");
			System.out.println("6. Display all employees who are authorized to administer patient care");
			System.out.println("7. Add new employee to roster");
			System.out.println("8. Remove employee from roster");
			System.out.println("9. Quit");
			choice = input.nextLine();
			System.out.println();

			switch (choice) {
			case "1":
				System.out.println();
				System.out.println("Please enter the name of the employee you would like to find:");
				nameInput = input.nextLine().trim();

				if (!this.checkForEmployeeByName(nameInput)) {
					System.out.println();
					System.out.println("There is no employee with that name in the hospital.");
					System.out.println("Press enter to continue.");
					input.nextLine();
					continue;
				}

				currentEmployee = this.findEmployeeByName(nameInput);

				System.out.println();
				System.out.println("Here is the employee's info:");
				System.out.println("----------");
				System.out.println(currentEmployee);
				System.out.println();
				System.out.println("Press enter to continue.");
				input.nextLine();
				break;
			case "2":
				System.out.println();
				System.out.println("Please enter the ID # of the employee you would like to find:");
				idInput = input.nextLine().trim();

				if (!this.checkForEmployeeByID(idInput)) {
					System.out.println();
					System.out.println("There is no employee with that ID # in the hospital.");
					System.out.println("Press enter to continue.");
					input.nextLine();
					continue;
				}

				currentEmployee = this.findEmployeeByID(idInput);

				System.out.println();
				System.out.println("Here is the employee's info:");
				System.out.println("----------");
				System.out.println(currentEmployee);
				System.out.println();
				System.out.println("Press enter to continue.");
				input.nextLine();
				break;
			case "3":
				System.out.println();
				System.out.println("Here is the current status of all employees:");
				System.out.println("----------");

				currentEmployeeList = this.getAllEmployees();
				for (Employee i : currentEmployeeList) {
					System.out.println(i);
				}

				System.out.println();
				System.out.println("Press enter to continue.");
				input.nextLine();
				break;
			case "4":
				System.out.println();
				System.out.println("Here is the salary info of all employees:");
				System.out.println("----------");

				currentEmployeeList = this.getAllEmployees();
				for (Employee i : currentEmployeeList) {
					System.out.println("Name: " + i.getName() + "\t Salary: $" + i.calculatePay() + " per year");
				}

				System.out.println();
				System.out.println("Press enter to continue.");
				input.nextLine();
				break;
			case "5":
				System.out.println();
				System.out.println("Here are all employees who are able to draw blood:");
				System.out.println("----------");

				currentEmployeeList = this.getAllEmployees();
				for (Employee i : currentEmployeeList) {
					if (i instanceof BloodDrawer) {
						System.out.println("Name: " + i.getName() + "\t ID #: " + i.getIDNumber());
					}
				}

				System.out.println();
				System.out.println("Press enter to continue.");
				input.nextLine();
				break;
			case "6":
				System.out.println();
				System.out.println("Here are all employees who are authorized to administer patient care:");
				System.out.println("----------");

				currentEmployeeList = this.getAllEmployees();
				for (Employee i : currentEmployeeList) {
					if (i instanceof MedicalDuties) {
						System.out.println("Name: " + i.getName() + "\t ID #: " + i.getIDNumber());
					}
				}

				System.out.println();
				System.out.println("Press enter to continue.");
				input.nextLine();
				break;
			case "7":
				System.out.println();
				System.out.println("Please enter the full name (First, Last) of the employee that you would like to add:");
				nameInput = input.nextLine().trim();
				if (nameInput.equals("")) {
					System.out.println("Invalid entry.");
					System.out.println("Press enter to continue.");
					input.nextLine();
					continue;
				}

				System.out.println();
				System.out.println("Please enter the new employee's ID #:");
				idInput = input.nextLine().trim();

				if (idInput.equals("")) {
					System.out.println();
					System.out.println("Invalid entry.");
					System.out.println("Press enter to continue.");
					input.nextLine();
					continue;
				}

				if (this.checkForEmployeeByID(idInput)) {
					System.out.println();
					System.out.println("An employee with that ID already exists.");
					System.out.println("Press enter to continue.");
					input.nextLine();
					continue;
				}

				System.out.println();
				System.out.println("Please choose an employee type:");
				System.out.println();
				System.out.println("1. Doctor");
				System.out.println("2. Surgeon");
				System.out.println("3. Nurse");
				System.out.println("4. Emergency Dispatcher");
				System.out.println("5. Receptionist");
				System.out.println("6. Janitor");
				choice = input.nextLine();
				System.out.println();

				switch (choice) {
				case "1":
					salaryInput = 90000;
					System.out.println("Please enter a specialty:");
					specialtyInput = input.nextLine().trim();
					currentEmployee = new Doctor(nameInput, idInput, salaryInput, specialtyInput);
					break;
				case "2":
					salaryInput = 120000;
					System.out.println("Please enter a specialty:");
					specialtyInput = input.nextLine().trim();
					currentEmployee = new Surgeon(nameInput, idInput, salaryInput, specialtyInput);
					break;
				case "3":
					salaryInput = 50000;
					System.out.println("Please enter a number of patients:");
					numOfPatientsInput = input.nextInt();
					input.nextLine();
					currentEmployee = new Nurse(nameInput, idInput, salaryInput, numOfPatientsInput);
					break;
				case "4":
					salaryInput = 45000;
					currentEmployee = new EmergencyDispatcher(nameInput, idInput, salaryInput);
					break;
				case "5":
					salaryInput = 45000;
					currentEmployee = new Receptionist(nameInput, idInput, salaryInput);
					break;
				case "6":
					salaryInput = 40000;
					currentEmployee = new Janitor(nameInput, idInput, salaryInput);
					break;
				default:
					System.out.println();
					System.out.println("Invalid entry.");
					System.out.println("Press enter to continue.");
					input.nextLine();
					continue;
				}

				this.addEmployee(currentEmployee);
				System.out.println();
				System.out.println(nameInput + " has been successfully added to the employee roster.");
				System.out.println("Press enter to continue.");
				input.nextLine();
				break;
			case "8":
				System.out.println();
				System.out.println("Please enter the ID # of the employee you would like to find:");
				idInput = input.nextLine().trim();

				if (!this.checkForEmployeeByID(idInput)) {
					System.out.println();
					System.out.println("There is no employee with that ID # in the hospital.");
					System.out.println("Press enter to continue.");
					input.nextLine();
					continue;
				}

				System.out.println();
				System.out.println("Are you sure you wish to remove this employee from the roster? (y/n)");
				choice = input.nextLine();

				if (choice.toLowerCase().equals("y")) {
					this.removeEmployee(idInput);
					System.out.println();
					System.out.println("Employee #" + idInput + " has been successfully removed from the roster.");
					System.out.println("Press enter to continue.");
					input.nextLine();
				} else if (choice.toLowerCase().equals("n")) {
					continue;
				} else {
					System.out.println();
					System.out.println("Invalid entry.");
					System.out.println("Press enter to continue.");
					input.nextLine();
					continue;
				}
			case "9":
				break;
			default:
				continue;
			}

		} while (!choice.equals("9"));

		System.out.println("Thank you. Goodbye.");
		input.close();
	}
}
