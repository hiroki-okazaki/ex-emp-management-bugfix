package jp.co.sample.emp_management.form;

import java.io.Serializable;

public class BookSearchForm implements Serializable {

	   private static final long serialVersionUID = 1L;
	   
	    //検索条件（タイトル）
	    private String bookName ="";
	     
	    //ページ番号
	    private int pageNo;
	    
	    

		public String getBookName() {
			return bookName;
		}

		public void setBookName(String bookName) {
			this.bookName = bookName;
		}

		public int getPageNo() {
			return pageNo;
		}

		public void setPageNo(int pageNo) {
			this.pageNo = pageNo;
		}

		public static long getSerialversionuid() {
			return serialVersionUID;
		}
	        
	    
}
