public class Ppj21 {
    public static void main(String[] args) {
        String name = new String("JOHny");
        norm(name);
        System.out.println(name);
        String fullname = new String("Tomasz Tomasz Sternicki");
        init(fullname);
    }
    public static String norm(String name){
        name.toUpperCase();
        String first = name.substring(0,1);
        String makename = name.substring(1);
        makename.toLowerCase();
        name = first+makename;
        return name;
    }
    public static String[] init(String fullname){
        String namepartsarr[] = fullname.split(" ");
        for(int i=0; i<namepartsarr.length; i++){
            if(i==2) {
                namepartsarr[i].toUpperCase();
                String first = namepartsarr[i].substring(0,1);
                String makename = namepartsarr[i].substring(1);
                makename.toLowerCase();
                namepartsarr[i] = first+makename;
            }
            if(i!=2) {
                namepartsarr[i].toUpperCase();
                namepartsarr[i] = namepartsarr[i].substring(0, 1)+". ";
            }
        }for(int j=0;j<namepartsarr.length;j++)
        System.out.print(namepartsarr[j]);
        return namepartsarr;
    }

  //  private static String toString(String s) {

 //   }
}
