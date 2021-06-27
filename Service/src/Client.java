
public class Client implements Necessary{
	String clientName;
	String clientAdd;
	String clientTel;
	String clientMail;

	String clientWay;
	String clientRequired;
	int clientCost;

	String clientMethod;
	String clientBankName;
	String clientAccount;
	String clientNominee;
	/*
	 * 		契約完了
	 */
	public Client(String name,String add,String tel,String mail) {
		this.clientName = name;
		this.clientAdd = add;
		this.clientTel = tel;
		this.clientMail = mail;
		Agreement();
	}

	public void Agreement() {
		System.out.println(clientName + "様");
		System.out.println("作業完了の際は、" + clientAdd + "へ請求書を送付致します。");
		System.out.println("尚、連絡は "+ clientTel + " または、" + clientMail + " へ行います。");
	}

	@Override
	public void trafic(String way, String required, int cost) {
		// 交通手段
		this.clientWay = way;
		this.clientRequired = required;
		this.clientCost = cost;

		System.out.println("☆ 交通手段：" + clientWay + "で、片道" + clientRequired + "程度");
		if(cost<=0) {
			System.out.println("　　交通費は発生しません。");
		}else {
			System.out.println("　　" + clientCost + "は、後日精算します。");
		}
	}

	@Override
	public void pay(String method, String bankName, String account, String nominee) {
		// 精算方法：口座引落
		this.clientMethod = method;
		this.clientBankName = bankName;
		this.clientAccount = account;
		this.clientNominee = nominee;

		System.out.println("☆ 精算方法：" + clientMethod + "は、" + clientBankName + "の");
		System.out.println("　　口座No：" +  clientAccount + " / 口座名義人：" + clientNominee + "より");
		System.out.println("　　毎月末に実施します。");
	}
	//	オーバーロード
	public void pay(String method,String nominee) {
		//精算方法：振込
		this.clientMethod = method;
		this.clientNominee = nominee;

		System.out.println("☆ 精算方法：" + clientMethod + "は、" + clientNominee + "より実施します。");
	}
}
