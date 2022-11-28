class CaesarCipher{
	public static StringBuffer encrypt(String text, int s){
		StringBuffer result= new StringBuffer();

		for (int i=0; i<text.length(); i++){
			if (Character.isUpperCase(text.charAt(i))){
				char ch = (char)(((int)text.charAt(i) +
								s - 65) % 26 + 65);
				result.append(ch);
			}
			else{
				char ch = (char)(((int)text.charAt(i) +
								s - 97) % 26 + 97);
				result.append(ch);
			}
		}
		return result;
	}

	public static StringBuffer depcrypt(StringBuffer enp, int s){
		StringBuffer result= new StringBuffer();

		for (int i=0; i<enp.length(); i++){
			if (Character.isUpperCase(enp.charAt(i))){
				char ch = (char)(((int)enp.charAt(i) -
								s - 65) % 26 + 65);
				result.append(ch);
			}
			else{
				char ch = (char)(((int)enp.charAt(i) -
								s - 97) % 26 + 97);
				result.append(ch);
			}
		}
		return result;
	}
	public static void main(String[] args){
		String text = "ATTACKATONCE";
		int s = 4;
		System.out.println("Text : " + text);
		StringBuffer enp= encrypt(text, s);
		System.out.println(enp);
		System.out.println("Main Text :" + depcrypt(enp, s));
	}
}