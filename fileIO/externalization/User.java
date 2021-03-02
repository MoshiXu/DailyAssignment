package externalization;
import java.io.*;
import java.util.Date;

public class User implements Externalizable {
	public static final long serialVersionUID = 1234L;
	 
    // attributes
    private int code;
    private String name;
    private String password;
    private Date birthday;
    private int socialSecurityNumber;
	public User() {
		
	}
	public User(int code, String name, String password, Date birthday, int socialSecurityNumber) {
		super();
		this.code = code;
		this.name = name;
		this.password = password;
		this.birthday = birthday;
		this.socialSecurityNumber = socialSecurityNumber;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public int getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	public void setSocialSecurityNumber(int socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		
	    out.writeInt(code);
	    out.writeObject(name);
	 
	    // write empty password:
	    out.writeObject("");
	 
	    out.writeObject(birthday);
	 

	}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		this.code = in.readInt();
	    this.name = (String) in.readObject();
	    this.password = (String) in.readObject();
	    this.birthday = (Date) in.readObject();

		
	}   

public String toString(){
	return"codde "+ getCode()+" name "+getName()+" password "+getPassword()+"   birthday "+getBirthday();
}
}
