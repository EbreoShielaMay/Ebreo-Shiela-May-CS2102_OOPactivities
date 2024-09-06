import java.util.Scanner;

public class GettingInputs {
    public static void main (String[] args ){
        int year;
        String genre;
        String album;
        String title;
        String artist;
        Scanner input = new Scanner (System.in);

        System.out.print("Enter the year:");
        year = input.nextInt();
        input.nextLine();

        System.out.print("Enter the genre:");
        genre = input.nextLine();

        System.out.print("Enter the album:");
        album = input.nextLine();

        System.out.print("Enter the song title:");
        title = input.nextLine();

        System.out.print("Enter the artist:");
        artist = input.nextLine();

    System.out.println("-------------------------------------");
    System.out.println("SONG DETAILS");
    System.out.println("-------------------------------------");

    System.out.println("Year Released: " + year);
    System.out.println("Genre: " + genre);
    System.out.println("Album: " + album);
    System.out.println("Title: \"" + title + "\"");
    System.out.println("Artist: " + artist);

    input.close();
    }
}
