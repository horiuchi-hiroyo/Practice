import java.util.Date;

/*
 * 	正規学習時は、Employeeクラスへ追加記載！
 */
public class Employee2 extends Employee implements Necessary{
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

	String employeeWay;
	String employeeRequired;
	int employeeCost;
	int employeeDistance;
	int grant;

	String employeeMethod;
	String employeeBankName;
	String employeeAccount;
	String employeeNominee;

	public Employee2(String name,String add,String tel,Date hireDate) {
		this.employeeName = name;
		this.employeeAdd = add;
		this.employeeTel = tel;
		this.employmentDate = hireDate;
		display();
	}

	public void trafic(String way, String required, int cost, int distance) {
		this.trafic(way,required,cost);
		// 距離により、交通費が変動
		this.employeeDistance = distance;
		if(employeeDistance < 0){
			this.grant = 0;
		}else if(employeeDistance <= 50){
			this.grant = 50;
		}else if (employeeDistance <= 10){
			this.grant = 100;
		}else {
			this.grant = 150;
		}
		System.out.println("距離：" + employeeDistance + "キロより、交通費は" + grant + "円です。");
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
			System.out.println("　　" + employeeCost + "は各自負担となります。");
		}
	}

	@Override
	public void pay(String method, String bankName, String account, String nominee) {
		// 精算方法：口座引落
		this.employeeMethod = method;
		this.employeeBankName = bankName;
		this.employeeAccount = account;
		this.employeeNominee = nominee;

		System.out.println("☆ 精算方法：" + employeeMethod);
		System.out.println("　　毎月25日に"+ employeeBankName);
		System.out.println("　　口座No：" +  employeeAccount + " / 口座名義人：" + employeeNominee + "へ支給します。");
	}
}