package model;

public class Dados {
	public static final int numUsers = 2;
	public static final String[] login = {"admin", "user"};
	public static final String[] senha = {"123", "12345"};
	
	public static boolean isLoginSenha(String l, String s) {
		int i;
		for(i=0;i<numUsers;i++) {
			if(l.equals(login[i]) && s.equals(senha[i])) {
				return true;
			}
		}
		return false;
	}
}