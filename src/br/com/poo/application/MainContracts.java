 package br.com.poo.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import br.com.poo.entities.Department;
import br.com.poo.entities.HourContract;
import br.com.poo.entities.Worker;
import br.com.poo.entities.enums.WorkerLevel;

public class MainContracts {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		
		//informações do trabalhador
		System.out.println("Enter department's name: ");
		String departmentName = sc.nextLine();
		System.out.println("Enter worker data: ");
		System.out.print("Name:");
		String workerName = sc.nextLine();
		System.out.print("Level:");
		String workerLevel = sc.nextLine();
		System.out.print("Salary: ");
		double baseSalary = sc.nextDouble();
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));
		
		
		System.out.println("How many contracts to this worker? ");
		int n = sc.nextInt();
		
		//vai ler todos os contratos que o trabalhador tem
		for(int i = 1; i <= n; i++) {
			System.out.println("Enter contract #" + i + " data: ");
			System.out.println("Date (DD/MM/yyyy) ");
			Date contractDate = sdf.parse(sc.next());//precisa incluir o throws ParseException
			System.out.println("Value per Hour: ");
			double valuePerHour = sc.nextDouble();
			System.out.println("Duration (Hour): ");
			int hours = sc.nextInt();
			//instancia o contrato
			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
			worker.addContract(contract);
		}
		
		
		System.out.println("Enter month and year to calculate income (MM//yyyy): ");
		String monthAndYear = sc.next();
		//vai fazer a extração das strings da data
		int month = Integer.parseInt(monthAndYear.substring(0, 2)); 
		int year = Integer.parseInt(monthAndYear.substring(3));
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));
	}

}
