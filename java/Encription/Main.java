import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
 	   Scanner s = new Scanner(System.in);
	    

        String password = s.nextLine();
        int l = password.length();
        String encryption = "";
        
        
        for (int i = 0; i<l;i++ ) {
            char ch = password.charAt(i);
            
            switch(ch){
                case 'A':
                    encryption = encryption+"#";
                    break;
                
                case 'B':
                    encryption = encryption+"%";
                    break;
                case 'C':
                    encryption = encryption+"+";
                    break;
                case 'D':
                    encryption = encryption+"-";
                    break;
                case 'E':
                    encryption = encryption+"*";
                    break;
                case 'F':
                    encryption = encryption+"(";
                    break;
                case 'G':
                    encryption = encryption+"@";
                    break;
                case 'H':
                    encryption = encryption+"^";
                    break;
                case 'I':
                    encryption = encryption+"|";
                    break;
                case 'J':
                    encryption = encryption+"$";
                    break;
                case 'K':
                    encryption = encryption+"!";
                    break;
                case 'L':
                    encryption = encryption+"`";
                    break;
                case 'M':
                    encryption = encryption+"~";
                    break;
                case 'N':
                    encryption = encryption+">";
                    break;
                case 'O':
                    encryption = encryption+"?";
                    break;
                case 'P':
                    encryption = encryption+"\u00BB";
                    break;
                case 'Q':
                    encryption = encryption+"¿";
                    break;
                case 'R':
                    encryption = encryption+"∞";
                    break;
                case 'S':
                    encryption = encryption+"";
                    break;
                case 'T':
                    encryption = encryption+"∆";
                    break;
                case 'U':
                    encryption = encryption+"\u01A9";
                    break;
                case 'V':
                    encryption = encryption+"\u00B5";
                    break;
                case 'W':
                    encryption = encryption+":";
                    break;
                case 'X':
                    encryption = encryption+"}";
                    break;
                case 'Y':
                    encryption = encryption+"\u00FA";
                    break;
                case 'Z':
                    encryption = encryption+"\u01F1";
                    break;
                    
                case 'a':
                    encryption = encryption+"\u01AE";
                    break;
                case 'b':
                    encryption = encryption+"®";
                    break;
                case 'c':
                    encryption = encryption+"\u0224";
                    break;
                case 'd':
                    encryption = encryption+"\u00AB";
                    break;
                case 'e':
                    encryption = encryption+"\u00F7";
                    break;
                case 'f':
                    encryption = encryption+"\u0080";
                    break;
                case 'g':
                    encryption = encryption+"\u023B";
                    break;
                case 'h':
                    encryption = encryption+"\u0175";
                    break;
                case 'i':
                    encryption = encryption+"\u00A7";
                    break;
                case 'j':
                    encryption = encryption+"\u01C2";
                    break;
                case 'k':
                    encryption = encryption+"\u01F5";
                    break;
                case 'l':
                    encryption = encryption+'\u00B1';
                    break;
                case 'm':
                    encryption = encryption+"\u023F";
                    break;
                case 'n':
                    encryption = encryption+"\u018E";
                    break;
                case 'o':
                    encryption = encryption+"\u021C";
                    break;
                case 'p':
                    encryption = encryption+"\u013B";
                    break;
                case 'q':
                    encryption = encryption+"¶";
                    break;
                case 'r':
                    encryption = encryption+"\u01BB";
                    break;
                case 's':
                    encryption = encryption+"\u0087";
                    break;
                case 't':
                    encryption = encryption+"\u0083";
                    break;
                case 'u':
                    encryption = encryption+"\u0086";
                    break;
                case 'v':
                    encryption = encryption+"\u01F2";
                    break;
                case 'w':
                    encryption = encryption+"\u023A";
                    break;
                case 'x':
                    encryption = encryption+"\u01EF";
                    break;
                case 'y':}