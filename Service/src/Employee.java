import java.util.Calendar;
import java.util.Date;		//	日付情報を扱うAPI

/*
 *		Employee:従業員
 */

public class Employee {
	/*
	 * 		Employee（従業員情報）
	 * 			Name：氏名
	 * 			Add：住所
	 * 			Tel：電話番号
	 * 		EmploymentDate：入社日
	 */
	String EmployeeName;
	String EmployeeAdd;
	String EmployeeTel;
	Date EmploymentDate;

	public Employee(String name,String add,String Tel,Date HireDate) {
		this.EmployeeName = name;
		this.EmployeeAdd = add;
		this.EmployeeTel = Tel;
		this.EmploymentDate = HireDate;

		/*
		 * 		Date -> 年・月・日・時・分・秒　を取得するため、
		 * 		ＹＹＹＹ年 Ｍ月 Ｄ日　の表示に整える
		 */
		Calendar ymd = Calendar.getInstance();
		ymd.setTime(EmploymentDate);
		int year = ymd.get(Calendar.YEAR);
		int month = ymd.get(Calendar.MONTH);
		int day = ymd.get(Calendar.DAY_OF_MONTH);

		System.out.println("〜 社 員 情 報 〜");
		System.out.println("社員：" + EmployeeName + "は、" + EmployeeAdd + "に在中しています。");
		System.out.print(year + "年" + month + "月" + day + "日");
		System.out.println("より働いています。");
		System.out.println("連絡先は、" + EmployeeTel + "です。");
	}

	public Employee() {
		System.out.println("社員情報は採用後登録してください。");
	}
}
