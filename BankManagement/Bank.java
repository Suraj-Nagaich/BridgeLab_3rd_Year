package BankManagement;

public class Bank {
		private String bankname;
		private long mobileumber;
		private long accountnumber;
		public String getBankname() {
			return bankname;
		}
		public void setBankname(String bankname) {
			this.bankname = bankname;
		}
		public long getMobileumber() {
			return mobileumber;
		}
		public void setMobileumber(long mobileumber) {
			this.mobileumber = mobileumber;
		}
		public long getAccountnumber() {
			return accountnumber;
		}
		public void setAccountnumber(long accountnumber) {
			this.accountnumber = accountnumber;
		}
		@Override
		public String toString() {
			return "bank name : " + getBankname() + "mobilenumber: " + getMobileumber() + "account number: " + getAccountnumber();
		}
		
		

	}


