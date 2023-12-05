package in.ashokit;

public class JwtResponse {

	public String token;
	public String uname;

	public JwtResponse() {
	}

	public JwtResponse(String token, String uname) {
		this.token = token;
		this.uname = uname;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

}
