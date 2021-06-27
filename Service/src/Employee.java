import java.util.Calendar;
import java.util.Date;		//	日付情報を扱うAPI

/*
 *		Employee:従業員
 */

public class Employee implements Necessary{
	/*
	 * 		Employee（従業員情報）
	 * 			Name：氏名
	 * 			Add：住所
	 * 			Tel：電話番号
	 * 		EmploymentDate：入社日
	 */
	String employeeName;
	String employeeAdd;
	String employeeTel;
	Date employmentDate;

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeAdd() {
		return employeeAdd;
	}

	public void setEmployeeAdd(String employeeAdd) {
		this.employeeAdd = employeeAdd;
	}

	public String getEmployeeTel() {
		return employeeTel;
	}

	public void setEmployeeTel(String employeeTel) {
		this.employeeTel = employeeTel;
	}

	public Date getEmploymentDate() {
		return employmentDate;
	}

	public void setEmploymentDate(Date employmentDate) {
		this.employmentDate = employmentDate;
	}

	public Employee(String name,String add,String tel,Date hireDate) {
		this.employeeName = name;
		this.employeeAdd = add;
		this.employeeTel = tel;
		this.employmentDate = hireDate;
		display();
	}

	public void display() {
		/*
		 * 		Date -> 年・月・日・時・分・秒　を取得するため、
		 * 		ＹＹＹＹ年 Ｍ月 Ｄ日　の表示に整える
		 */
		Calendar ymd = Calendar.getInstance();
		ymd.setTime(employmentDate);
		int year = ymd.get(Calendar.YEAR);
		int month = ymd.get(Calendar.MONTH);
		int day = ymd.get(Calendar.DAY_OF_MONTH);

		System.out.println("〜 社 員 情 報 〜");
		System.out.println("社員：" + employeeName + "は、" + employeeAdd + "に在中しています。");
		System.out.print(year + "年" + month + "月" + day + "日");
		System.out.println("より働いています。");
		System.out.println("連絡先は、" + employeeTel + "です。");
	}

	public Employee() {
		System.out.println("社員情報は採用後登録してください。");
	}

	/*		- - - - - - - - - - - - - - - -
	 * 			インターフェース追加
	 *		- - - - - - - - - - - - - - - -
	 */

	String employeeWay;
	String employeeRequired;
	int employeeCost;
	int employeeDistance;
	int grant;

	String employeeMethod;
	String employeeBankName;
	String employeeAccount;
	String employeeNominee;

	public void trafic(String way, String required, int cost, int distance) {
		this.trafic(way,required,cost);
		// 距離により、交通費が変動
		this.employeeDistance = distance;
		if(employeeDistance < 0){
			this.grant = 0;
		}else if(employeeDistance <= 5){
			this.grant = 5000;
		}else if (employeeDistance <= 10){
			this.grant = 10000;
		}else {
			this.grant = 15000;
		}
		System.out.println("　　距離：" + employeeDistance + "キロより、交通費は" + grant + "円です。");
	}

	@Override
	public void trafic(String way, String required, int cost) {
		// 距離により、交通費が変動
		this.employeeWay = way;
		this.employeeRequired = required;
		this.employeeCost = cost;

		System.out.println("☆ 交通手段：" + employeeWay + "で、片道" + employeeRequired + "の通勤距離です。");
		if(cost<=0) {
			System.out.println("　　交通費は発生しません。");
		}else {
			System.out.println("　　" + employeeCost + "円は各自負担となります。");
		}
	}

	@Override
	public void pay(String method, String bankName, String account, String nominee) {
		// 精算方法：給与振込
		this.employeeMethod = method;
		this.employeeBankName = bankName;
		this.employeeAccount = account;
		this.employeeNominee = nominee;

		System.out.println("☆ 精算方法：" + employeeMethod);
		System.out.println("　　毎月25日に"+ employeeBankName);
		System.out.println("　　口座No：" +  employeeAccount + " / 口座名義人：" + employeeNominee + "　へ支給します。");
	}
}
