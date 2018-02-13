import java.io.*;
public class encrypt_decrypt
{
  public static void main(String args[]) throws Exception
  {
    encrypt_decrypt ed = new encrypt_decrypt();

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
    System.out.print("\nEnter the password: ");
    String password = br.readLine();

    //encryption process...
    StringBuilder str = new StringBuilder(password);
    password = ed.encrypt(str,0xFACA);
    System.out.print("\nEncrypted Password: " + password);

    //decryption process...
    str = new StringBuilder(password);
    password = ed.decrypt(str,0xFACA);
    System.out.print("\nDecrypted Password: " + password);

    System.out.println();
  }

  public String encrypt(StringBuilder str,int key)
  {
    for(int i=0; i<=(str.length() - 1); i++)
    {
      char c = (char)(str.charAt(i) - key);
      str.setCharAt(i,c);
    }
    return new String(str);
  }

  public String decrypt(StringBuilder str,int key)
  {
    for(int i=0; i<=(str.length() - 1); i++)
    {
      char c = (char)(str.charAt(i) + key);
      str.setCharAt(i,c);
    }
    return new String(str);
  }
}