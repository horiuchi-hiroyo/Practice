/*
 *		Work:業務
 */

public class Work {
	/*
	 * 		Work（業務内容）
	 * 			Service：作業
	 * 			Pric：料金
	 */
	String workService;
	int workPrice;

	public Work(String service,int price) {
		this.workService = service;
		this.workPrice = price;
	}

	/*
	 * 		Quotation：見積り
	 */
	public void Quotation() {
		System.out.println(workService + "は、１０分間で" + workPrice + "円となります。");
	}

	/*
	 * 		Invoice：請求
	 */
	public void Invoice() {
		System.out.println("今回の" + workService + "は、" + workPrice + "円となります。");
	}

	/*
	 * 		Invoice：請求(オーバーライド)
	 * 			作業時間指定
	 */
	public void Invoice(int workTime) {
		int total=0;

		if(workTime <= 0) {
			System.out.println("時間指定は【分単位】で入力をお願いします");
			return;
		}else if(workTime < 10) {
			total = (workPrice/10) * workTime;
		}else {
			total = workPrice * (workTime/10);
		}

		System.out.println("今回の" + workService + "は、" + workTime + "分のご用命でした。");
		System.out.println(total + "円となります。");
	}
}