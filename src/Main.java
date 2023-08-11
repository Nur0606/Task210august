// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

                Beast tigeer = new Tiger("Tiger",84,6);
                Beast gepard = new Gepard("Gepard1",96,9);
                Beast wolf = new Wolf("wolf",72,4);
                Beast gepard1 = new Gepard("Gepard2",89,10);
                Beast wolf1 = new Wolf("Wolf2",64,4);
                int maxSpeed = 5;
                Beast [] beasts = {tigeer,wolf,gepard1,wolf1,gepard1};
                for (Beast beastss:beasts) {
                    if(beastss.getSpeed()>=maxSpeed){
                        System.out.println(beastss);
                    }
                }
            }
        }
