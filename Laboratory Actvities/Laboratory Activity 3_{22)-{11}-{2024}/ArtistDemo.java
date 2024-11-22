public class ArtistDemo {
    public static void main(String[] args) {

         // instance of Artist
         Artist artist = new Artist("Charlie Puth", "American", 32, "Music");
         artist.displayInfo();

         System.out.println("");
 
         Artist artist1 = new Artist("Yaosobi(Lilas Ikuta)", "Japanese", 24, "Music" );
         artist1.displayInfo();
 
         System.out.println("");
 
         Singer singer = new Singer("Nayeon Im", "Korean", 29, "Music", Genre.POP);
         singer.displayInfo();
 
         System.out.println("");

         Singer singer1 = new Singer("Sabrina Carpenter", "American", 25, "Music", Genre.POP);
         singer1.displayInfo();
 
         System.out.println("");

         Painter painter = new Painter("Vincent Van Gogh","Dutch",37,"art", Medium.OIL);
         painter.displayInfo();

         System.out.println("");

         Dancer dancer = new Dancer("Kirsten Dodgen","Swiss", 26, "afro", DanceStyle.HIPHOP);
         dancer.displayInfo();

         System.out.println("");

         Writer writer = new Writer("J.K Rowling", "British", 59, "fantasy", WritingStyle.FICTION);
         writer.displayInfo();
    }
}
