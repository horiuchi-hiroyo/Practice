import java.util.ArrayList;
import java.util.Date;

public class Main {
	public static void main(String[] args) {
		/*
		 * 		社名を表示しよう！
		 */
		System.out.print("＋＋サービス");
		System.out.println("を設立しました。");

		/*
		 * 		「社名」を変数に代入し、新しい社名をコンソールに表示しうよ！
		 * 		変数：companyName
		 */
		String companyName = "＊＊サポート";
		System.out.println(companyName + "に、社名を変更しました。");

		//	゜+.――゜+.――゜+.――゜+.――゜+.――゜+.――゜+.――゜+.――゜+		//
		System.out.println("\n *:..。o○☆○o。..:*゜*:..。o○☆○o。..:*゜*:..。o○☆○o。..:*゜*:..。 \n");
		//	゜+.――゜+.――゜+.――゜+.――゜+.――゜+.――゜+.――゜+.――゜+		//

		/*
		 * 		『社員』情報を登録しましょう
		 * 		【 Employee 】クラスを作成
		 */
		Date now = new Date();
		Employee emp1 = new Employee("高橋 知也","南国市","000-888-4567",now);

		/*
		 * 		「新入社員」を登録しましょう
		 * 		ただし、社員情報は、後日となるため、今はインスタンス化のみ。
		 */
		Employee emp2 = new Employee();

		//	゜+.――゜+.――゜+.――゜+.――゜+.――゜+.――゜+.――゜+.――゜+		//
		System.out.println("\n *:..。o○☆○o。..:*゜*:..。o○☆○o。..:*゜*:..。o○☆○o。..:*゜*:..。 \n");
		//	゜+.――゜+.――゜+.――゜+.――゜+.――゜+.――゜+.――゜+.――゜+		//

		/*
		 * 		取扱商品を登録しよう＜家事代行＞
		 * 		【 Work 】クラスを作成
		 * 		３サービスを登録
		 */
		Work service1 = new Work("犬のさんぽ",500);
		Work service2 = new Work("庭掃除",800);
		Work service3 = new Work("買い物代行",300);

		/*
		 * 		「犬のさんぽ」について見積りを出しましょう！
		 */
		service1.Quotation();

		/*
		 * 		「犬のさんぽ」について請求を出しましょう！
		 */
		service1.Invoice();
		System.out.println("\n * * * * * * \n");

		/*
		 * 		「犬のさんぽ」について請求を出しましょう！
		 *			請求は、「利用時間」を指定できるように変更しましょう。
		 *		　注意）単位：分
		 */
		service1.Invoice(30);

		//	゜+.――゜+.――゜+.――゜+.――゜+.――゜+.――゜+.――゜+.――゜+		//
		System.out.println("\n *:..。o○☆○o。..:*゜*:..。o○☆○o。..:*゜*:..。o○☆○o。..:*゜*:..。 \n");
		//	゜+.――゜+.――゜+.――゜+.――゜+.――゜+.――゜+.――゜+.――゜+		//

		/*
		 * 		業務拡大を登録しよう
		 * 		【 Work 】クラスを元に、【 WorkRepair 】クラスを作成
		 * 		フィールド：「サービス名」・「利用料金」に「保証期間」を追加
		 * 		メソッド：文言を＜修理業務＞用に変更
		 */
		WorkRepair wr1 = new WorkRepair("自転車パンク修理",100,3);
		WorkRepair wr2 = new WorkRepair("水まわり修理",700,7);

		wr1.Quotation();
		wr1.Invoice();
		System.out.println("\n * * * * * * \n");
		wr2.Quotation();
		wr2.Invoice(1000);

		//	゜+.――゜+.――゜+.――゜+.――゜+.――゜+.――゜+.――゜+.――゜+		//
		System.out.println("\n *:..。o○☆○o。..:*゜*:..。o○☆○o。..:*゜*:..。o○☆○o。..:*゜*:..。 \n");
		//	゜+.――゜+.――゜+.――゜+.――゜+.――゜+.――゜+.――゜+.――゜+		//

		/*
		 * 		社員情報登録
		 * 		「emp2」インスタンスへ社員情報を登録してください。
		 * 		＊ 入社年月日は、now を使用すること。
		 *
		 */
		emp2.setEmployeeName("サーモン イクラ");
		emp2.setEmployeeAdd("土佐清水市");
		emp2.setEmployeeTel("02-0004-1234");
		emp2.setEmploymentDate(now);
		emp2.display();

		//	゜+.――゜+.――゜+.――゜+.――゜+.――゜+.――゜+.――゜+.――゜+		//
		System.out.println("\n *:..。o○☆○o。..:*゜*:..。o○☆○o。..:*゜*:..。o○☆○o。..:*゜*:..。 \n");
		//	゜+.――゜+.――゜+.――゜+.――゜+.――゜+.――゜+.――゜+.――゜+		//

		/*
		 * 		取引先登録
		 *		【 Necessary 】をインターフェースとし、【 Client 】クラスを作成
		 *
		 */
		Client cliA = new Client("Irimajiriペットショップ","高知市","837-3118","iri-pet@example.com");
		cliA.trafic("バス", "30分", 1000);
		cliA.pay("引落", "四国BK", "100-999999", "イリマジリペットショップ");
		System.out.println("\n * * * * * * \n");
		Client cliB = new Client("sakura植物園","室戸市","888-9876","sakura-garden@example.com");
		cliB.trafic("徒歩", "5分", 0);
		cliB.pay("振込", "サクラショクブツエン");

		//	゜+.――゜+.――゜+.――゜+.――゜+.――゜+.――゜+.――゜+.――゜+		//
		System.out.println("\n *:..。o○☆○o。..:*゜*:..。o○☆○o。..:*゜*:..。o○☆○o。..:*゜*:..。 \n");
		//	゜+.――゜+.――゜+.――゜+.――゜+.――゜+.――゜+.――゜+.――゜+		//

		/*
		 * 		社員情報へフィールド情報追加
		 * 		【 Necessary 】インターフェースを追加し、交通費支給額と、給与精算方法を登録
		 *
		 */
		emp1.display();
		System.out.println();
		emp1.trafic("自家用車", "１時間", 300,8);
		System.out.println();
		emp1.pay("給与振込", "四国BK", "200-888888", "タカハシ カズヤ");
		System.out.println("\n * * * * * * \n");
		emp2.display();
		System.out.println();
		emp2.trafic("電車", "20分", 500,25);
		System.out.println();
		emp2.pay("給与振込", "四国BK", "300-777666", "サーモン イクラ");

		//	゜+.――゜+.――゜+.――゜+.――゜+.――゜+.――゜+.――゜+.――゜+		//
		System.out.println("\n *:..。o○☆○o。..:*゜*:..。o○☆○o。..:*゜*:..。o○☆○o。..:*゜*:..。 \n");
		//	゜+.――゜+.――゜+.――゜+.――゜+.――゜+.――゜+.――゜+.――゜+		//

		/*
		 * 		注文をもらおう！
		 * 		コレクション?配列？を使う？！
		 *		【 Order 】クラスを作成？？
		 */
		Order orders[] = new Order[5];
//			orders[0] = Order(cliA,wr1,now);
		ArrayList<Order> list = new ArrayList<>();
			list.add(orders[0]);
	}
}
