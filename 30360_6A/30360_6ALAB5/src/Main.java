import MusicPlaylist.MusicPlaylist;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    static MusicPlaylist musicPlaylist = new MusicPlaylist();

    static void menu(){
        System.out.println("|               Menu            |");
        System.out.println("Add Song to the playlist (add)");
        System.out.println("Remove Song from the playlist (remove)");
        System.out.println("Move Song (move)");
        System.out.println("View Playlist (view)");
        System.out.println("Exit (exit)");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String command, song;
        int position;

        menu();

        do{
            System.out.print(">: ");
            command = input.next();

            if(command.equalsIgnoreCase("menu"))
                menu();
            else if(command.equalsIgnoreCase("add")){
                System.out.print("Song: ");
                input.nextLine();
                song = input.nextLine();
                if(!musicPlaylist.isSong(song)){
                    if((musicPlaylist.addSong(song)))
                        System.out.println("Song Added Successfully ot the Playlist");
                    else
                        System.out.println("Failed to Add to the Playlist");
                }
                else
                    System.out.println("Song already exits in the Playlist");
            }
            else if(command.equalsIgnoreCase("remove")){
                System.out.print("Song: ");
                input.nextLine();
                song = input.nextLine();
                if(musicPlaylist.isEmpty()){
                    if (musicPlaylist.isSong(song)) {
                        if (musicPlaylist.removeSong(song))
                            System.out.println("Song Removed Successfully from the Playlist");
                        else
                            System.out.println("Failed to Remove Song from the Playlist");
                    } else
                        System.out.println("Could not find the Song");
                }
                else
                    System.out.println("Playlist is Empty");
            }
            else if(command.equalsIgnoreCase("move")){
                System.out.print("Move Song: ");
                input.nextLine();
                song = input.nextLine();
                System.out.print("To Position: ");
                position = input.nextInt();
                if(musicPlaylist.isEmpty()){
                    if (musicPlaylist.isSong(song)) {
                        if (position <= musicPlaylist.getSize()) {
                            if (position - 1 != musicPlaylist.getIndex(song)) {
                                if (Objects.nonNull(musicPlaylist.moveSong(song, position - 1)))
                                    System.out.println("Song Moved to Position " + position);
                                else
                                    System.out.println("Failed to Move Song");
                            } else
                                System.out.println("Song is in the Position " + position);
                        } else
                            System.out.println("Invalid Position");
                    }
                }
                else
                    System.out.println("Playlist is Empty");
            }
            else if(command.equalsIgnoreCase("view")){
                if(musicPlaylist.isEmpty())
                    musicPlaylist.playList();
                else
                    System.out.println("Playlist is Empty");
            }
            else if(command.equalsIgnoreCase("exit"))
                System.out.println("Exiting...");
            else
                System.out.println("Invalid Operation");
        }while(!command.equalsIgnoreCase("exit"));
    }
}
