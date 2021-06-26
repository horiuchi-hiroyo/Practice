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
		 * 		変数：CompanyName
		 */
		String CompanyName = "＊＊サポート";
		System.out.println(CompanyName + "に、社名を変更しました。");

		//	゜+.――゜+.――゜+.――゜+.――゜+.――゜+.――゜+.――゜+.――゜+		//
		System.out.println("\n *:..。o○☆○o。..:*゜*:..。o○☆○o。..:*゜*:..。o○☆○o。..:*゜*:..。 \n");
		//	゜+.――゜+.――゜+.――゜+.――゜+.――゜+.――゜+.――゜+.――゜+		//

		/*
		 * 		『社員』情報を登録しましょう
		 * 		【 Employee 】クラスを作成
		 */
		Date now = new Date();
		Employee Emp1 = new Employee("高橋 知也","南国市","000-888-4567",now);

		/*
		 * 		「新入社員」を登録しましょう
		 * 		ただし、社員情報は、後日となるため、今はインスタンス化のみ。
		 */
		Employee Emp2 = new Employee();

		//	゜+.――゜+.――゜+.――゜+.――゜+.――゜+.――゜+.――゜+.――゜+		//
		System.out.println("\n *:..。o○☆○o。..:*゜*:..。o○☆○o。..:*゜*:..。o○☆○o。..:*゜*:..。 \n");
		//	゜+.――゜+.――゜+.――゜+.――゜+.――゜+.――゜+.――゜+.――゜+		//

		/*
		 * 		取扱商品を登録してみよう
		 * 		【 Work 】クラスを作成
		 */
	}
}
