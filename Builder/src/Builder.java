
public abstract class Builder {
	/**
	 * タイトル
	 * @param title
	 */
	public abstract void makeTitle(String title);

	/**
	 * 文字列
	 * @param str
	 */
	public abstract void makeString(String str);

	/**
	 * 箇条書き
	 * @param items
	 */
	public abstract void makeItems(String[] items);

	/**
	 * 文書を完成させる
	 */
	public abstract void close();
}
