package pkgCore;

public class WordFilter {
		private String strStartWith;
		private String strEndWith;
		private String strContains;
		private int iContainsIdx;
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
			this.strEndWith = strEndWith;
		}
		public String getStrContains() {
			return strContains;
		}
		public void setStrContains(String strContains) {
			this.strContains = strContains;
		}
		public int getiContainsIdx() {
			return iContainsIdx;
		}
		public void setiContainsIdx(int iContainsIdx) {
			this.iContainsIdx = iContainsIdx;
		}
		public int getiLength() {
			return iLength;
		}
		public void setiLength(int iLength) {
			this.iLength = iLength;
		}
}