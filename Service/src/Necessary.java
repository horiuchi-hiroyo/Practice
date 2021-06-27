
public interface Necessary {
	void trafic(String way,String required,int cost);
	//	交通手段
	/*
	 * 		method:方法（自転車・徒歩・自家用車・バス・電車・先方送迎など）
	 * 		required:所要時間
	 * 		cost:費用
	 */

	void pay(String method,String bankName,String account,String nominee);
	//	精算方法
	/*
	 * 		method:手段（振込・口座引落など）
	 * 		bankName:銀行名
	 * 		account:口座番号
	 * 		nominee:名義人
	 */
}
