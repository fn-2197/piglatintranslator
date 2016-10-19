package gamesnstuff;

public class Piglatintrans {
	String in = "";
	
public Piglatintrans(String n){
in = n;	
}
public String translate(){
String working = in;
working = working.toLowerCase();
String w[];
w = working.split("\\s");
String out = "";
for(int a = 0; a < w.length; a++){
	out += change(w[a]) + " ";
}
	
	
	
	return out;
}

private String change(String a){
	String alpha = "";
	int b;
	if(a.substring(0, 1).equalsIgnoreCase("a") || a.substring(0, 1).equalsIgnoreCase("e") || a.substring(0, 1).equalsIgnoreCase("i") ||a.substring(0, 1).equalsIgnoreCase("o")|| a.substring(0, 1).equalsIgnoreCase("u")){
		 alpha += (a + "yay"); 
	}
	else if(a.contains("a") ||a.contains("e") ||a.contains("i") ||a.contains("o") ||a.contains("u")){
		
		String c = a.substring(0,findfirstvowel(a) );
		alpha += a.substring(findfirstvowel(a)) + c + "ay";
	}
	else{
		alpha += a + "yay";
	}
	
	return alpha;
}
private int findfirstvowel(String a) {
	int n = 0;
	for(int b = 0; b < a.length(); b++){
		if(a.charAt(b) =='a' || a.charAt(b) =='e' || a.charAt(b) == 'i' || a.charAt(b) =='o' || a.charAt(b) =='u'){
			n = b;
			break;
		}
	
	}
	return n;
}

}
