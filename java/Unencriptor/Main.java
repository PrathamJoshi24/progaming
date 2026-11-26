import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String encrypted = s.nextLine();
		String encryption = "";
		int l = encrypted.length();
		for(int i=0;i<l;i++){
            char ch = encrypted.charAt(i);		    
            switch(ch){
                case '#':
                    encryption = encryption+"A";
                    break;
                
                case '%':
                    encryption = encryption+"B";
                    break;
                case '+':
                    encryption = encryption+"C";
                    break;
                case '-':
                    encryption = encryption+"D";
                    break;
                case '*':
                    encryption = encryption+"E";
                    break;
                case '(':
                    encryption = encryption+"F";
                    break;
                case '@':
                    encryption = encryption+"G";
                    break;
                case '^':
                    encryption = encryption+"H";
                    break;
                case '|':
                    encryption = encryption+"I";
                    break;
                case '$':
                    encryption = encryption+"J";
                    break;
                case '!':
                    encryption = encryption+"K";
                    break;
                case '`':
                    encryption = encryption+"L";
                    break;
                case '~':
                    encryption = encryption+"M";
                    break;
                case '>':
                    encryption = encryption+"N";
                    break;
                case '?':
                    encryption = encryption+"O";
                    break;
                case '\u00BB':
                    encryption = encryption+"P";
                    break;
                case '¿':
                    encryption = encryption+"Q";
                    break;
                case '∞':
                    encryption = encryption+"R";
                    break;
                case '':
                    encryption = encryption+"S";
                    break;
                case '∆':
                    encryption = encryption+"T";
                    break;
                case '\u01A9':
                    encryption = encryption+"U";
                    break;
                case '\u00B5':
                    encryption = encryption+"V";
                    break;
                case ':':
                    encryption = encryption+"W";
                    break;
                case '}':
                    encryption = encryption+"X";
                    break;
                case '\u00FA':
                    encryption = encryption+"Y";
                    break;
                case '\u01F1':
                    encryption = encryption+"Z";
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
                case 'y':
                    encryption = encryption+"\u01FD";
                    break;
                case 'z':
                    encryption = encryption+"\u01B1";
                    break;
                
                default:
                    encryption = encryption+ch;
            }
	
		}
		System.out.print(encryption);
	}
	
}
