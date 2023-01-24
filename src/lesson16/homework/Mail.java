package lesson16.homework;

public class Mail {

    public void getMail(String m) {
        int i;
        int y=0;
        for (i=0;i<m.length();i++) {
            if (i==m.indexOf(';',i)) {
               String s = m.substring(y,i);
               int a = s.indexOf('@');
               int b = s.indexOf('.');
               String qwerty = s.substring(a+1,b);
               System.out.println(qwerty);
               y=i;
               continue;
            }

        }
    }
    public static void main(String[] args) {
     Mail m = new Mail();
     m.getMail("ya@yahoo.com; on@meta.ua; ona@gmail.com;");
    }
}
