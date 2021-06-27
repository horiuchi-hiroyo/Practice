/*
 *		WorkRepair:修理業務
 *			Work：業務　を拡張！
 */

public class WorkRepair extends Work{
	/*
	 * 		WorkRepair（修理内容）
	 * 			Service：作業		<-　Workからの継承
	 * 			Pric：料金		<-　Workからの継承
	 * 			Limit：保証期間
	 */
	int limit;

	public WorkRepair(String service, int price,int limit) {
		super(service,price);
		this.limit = limit;
	}

	@Override
	public void Quotation() {
		System.out.println(workService + "は１回" + workPrice + "円となります。");
		System.out.println("なお、別途出張費が必要となります。");
	}

	@Override
	public void Invoice(int cost) {
		int expense = cost;
		System.out.print("今回の" + workService + "は、" + workPrice + "円 + ");
		System.out.print("出張費：" + expense + "円の合計");
		System.out.println(workPrice + expense + "円となります。");
		System.out.println("(保障期間は、"+ limit + "日です。)");
	}
}
