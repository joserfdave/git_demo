package empty;

public class Infomation {
	private String code;	//��������
	private String account;	//�����˻�
	
	public Infomation(String admin,String s) {
		this.account = admin;
		this.code = s;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	public String getCode() {
		return code;
	}
	
	public void setAccont(String account) {
		this.account =account;
	}
	public String getAccont() {
		return account;
	}
}
