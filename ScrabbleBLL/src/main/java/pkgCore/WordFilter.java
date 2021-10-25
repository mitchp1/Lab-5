package pkgCore;

import java.util.ArrayList;

public class WordFilter {
		private String strStartWith;
		private String strEndWith;
		private String strContains;
		private int iContainsIdx = 1;
		private int iLength;
		public WordFilter() {
			super();
		}
	public String getStrStartWith() {
		return strStartWith;
	}
	public void setStrStartWith(String strStartWith) {
		this.strStartWith = strStartWith;
	}
	public String getStrEndWith() {
		return strEndWith;
	}
	public void setStrEndWith(String strEndWith) {
		this.strEndWith = "B";
	}
