
package Lesson8.SamplePrograms;

public class IceCreamSurvey {

    public static void main(String[] args) {
        String survey[][]={
            {"Matt","chocolate"},
            {"Mitch","Strawberry"},
            {"Josh","chocolate"},
            {"Joe","Vanilla"},
            {"Cheryl","Strawberry"},
            {"Cindy","Vanilla"},
            {"Serge","chocolate"},
            {"Abby","Vanilla"},
            {"Alex","Strawberry"},
            
        };
        for (int i = 0; i < survey.length; i++) {
            for (int j = 0; j < survey[i].length; j++) {
                System.out.print(j==0?"Name:" : "Flavour:");
                System.out.print("\t"+ survey[i][j]+"\t");
            }
            System.out.println("");
        }
        String cpeople[] = filter(survey,"chocolate");
        String vpeople[] = filter(survey,"Vanilla");
        String speople[] = filter(survey,"Strawberry");
        
         System.out.println("Here is a list fo chocolate people");
         for (int i = 0; i < cpeople.length; i++) {
             System.out.print(cpeople[i]+" , ");
        }
          System.out.println("\n\nHere is a list fo vanilla people");
          for (int i = 0; i < vpeople.length; i++) {
             System.out.print(vpeople[i]+" , ");
        }
          System.out.println("\n\nHere is a list fo Strawberry people");
           for (int i = 0; i < speople.length; i++) {
             System.out.print(speople[i]+" , ");
        }
    }
    public static String[] filter(String data[][],String flav){
        String results="";
        
        for (int i = 0; i < data.length; i++) {
            if(flav.equals(data[i][1]))
                results+= data[i][0] + " , ";
        }
        return results.split(" , ");
    }
    
}
