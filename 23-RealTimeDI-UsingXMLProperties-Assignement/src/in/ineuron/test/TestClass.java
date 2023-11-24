package in.ineuron.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.bo.EmployeeBo;
import in.ineuron.controller.MyController;
import in.ineuron.vo.EmployeeVo;

public class TestClass {

	public static void main(String[] args) {

		// Taking the inputs from the user using scanner class

		/*
		 * Scanner scanner = new Scanner(System.in);
		 * 
		 * System.out.println("Enter the  eid: "); String employeeId = scanner.next();
		 * 
		 * System.out.println("Enter the Employee Name: "); String employeeName =
		 * scanner.next();
		 * 
		 * System.out.println("Enter the Employee Address: "); String employeeAddress =
		 * scanner.next();
		 * 
		 * System.out.println("Enter the Age: "); String employeeAge = scanner.next();
		 * 
		 * EmployeeVo vo = new EmployeeVo(); vo.setEid(employeeId);
		 * vo.setEname(employeeName); vo.setEage(employeeAge);
		 * vo.setEaddress(employeeAddress);
		 */

		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext(
				"in\\ineuron\\cfg\\ApplicationContext.xml");

		System.out.println("********Container Started**********");

		MyController controller = factory.getBean("employeeController", MyController.class);

		System.out.println(controller);

		try {

			/*
			 * @SuppressWarnings("unused") String add = MyController.AddEmployee(vo);
			 * 
			 * System.out.println(add);
			 */

			/*
			 * int id = 2; String delete = MyController.deleteEmployee(id);
			 * System.out.println(delete);
			 */

			/*
			 * int id1 = 1; EmployeeBo search = MyController.getEmployee(id1);
			 * System.out.println(search);
			 */
			List<EmployeeBo> getAll = MyController.getAllEmployee();

			for (EmployeeBo get : getAll) {
				System.out.println(get);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("********Container closed**********");
		factory.close();
		// scanner.close();

	}

}
