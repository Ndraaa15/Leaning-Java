package src.ASD_HackerRank.MusicPlayerLite;

import java.util.*;

class Node {
    Node prev;
    Node next;
    String artist;
    String judul;

    Node(String artist, String judul) {
        this.artist = artist;
        this.judul = judul;
    }
}

class DoubleLinkedListScratch {
    Node head;
    Node tail;
    Node state;

    int length = 0;

    boolean isEmpty (){
        return length == 0;
    }
    void addSong(Node newNode) {
        if (isEmpty()){
            head = tail = newNode;
        }else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    void printPlaylist() {
        Node temp = head;
        while (temp != null) {
            System.out.println("Artist: " + temp.artist + " | Judul: " + temp.judul);
            temp = temp.next;
        }
    }

    void playPlaylist() {
        if (this.state == null && length == 0) {
            System.out.println("No Playlist to Play!");
            return;
        } else if (this.state == null) {
            this.state = head;
            System.out.println("Now Playing:\nArtist: " + state.artist + " | Judul: " + state.judul);
        } else if (this.state != null) {
            System.out.println("Playlist has been played!");
        }
    }

    void printCurrentPlay() {
        if (this.state == null) {
            return;
        } else System.out.println("Now Playing:\nArtist: " + state.artist + " | Judul: " + state.judul);
    }

    void toNextSong() {
        if (this.state == null){
            this.state = head;
        }

        if (this.state.next == null) {
            System.out.println("Cannot go to next song, no song specified in playlist!");
        } else {
            this.state = this.state.next;
            System.out.println("Now Playing:\nArtist: " + state.artist + " | Judul: " + state.judul);
        }
    }

    void toPreviousSong() {
        if (this.state == null){
            this.state = head;
        }

        if (this.state.prev == null) {
            System.out.println("Cannot go to preivous song, no song specified in playlist!");
        } else {
            this.state = this.state.prev;
            System.out.println("Now Playing:\nArtist: " + state.artist + " | Judul: " + state.judul);
        }
    }
}

class QueueScratch {
    Node head;
    Node tail;
    int length = 0;

    boolean isEmpty (){
        return length == 0;
    }

    void addSong(Node newNode) {
        if (isEmpty()){
            head = tail = newNode;
        }else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    Node deQueue() {
        Node temp;
        if (length == 0) {
            System.out.println("No song to pick from waiting list!");
            return null;
        }else {
            temp = head;
            head = head.next;
        }
        length--;
        return temp;
    }

    void printWaitingList() {
        Node temp = head;
        System.out.println("Waiting List:");
        for (int i = 0; i < length; i++) {
            System.out.println("Artist: " + temp.artist + " | Judul: " + temp.judul);
            temp = temp.next;
        }
    }
}

public class MusicPlayerLite {
    public static void main(String args[]) throws Exception {
        DoubleLinkedListScratch playlist = new DoubleLinkedListScratch();
        QueueScratch waitingList = new QueueScratch();
        Scanner in = new Scanner(System.in);

        int totalActions = in.nextInt();
        in.nextLine();
        for (int action = 0; action < totalActions; action++) {
            String actionIndicator = in.nextLine();
            if (actionIndicator.equals("ADDSONG")) {
                playlist.addSong(new Node(in.nextLine(), in.nextLine()));
            } else if (actionIndicator.equals("PLAYSONG")) {
                playlist.playPlaylist();
            } else if (actionIndicator.equals("NEXTSONG")) {
                playlist.toNextSong();
            } else if (actionIndicator.equals("PREVSONG")) {
                playlist.toPreviousSong();
            } else if (actionIndicator.equals("PRINTSONG")) {
                playlist.printCurrentPlay();
            } else if (actionIndicator.equals("PRINTPLAYLIST")) {
                playlist.printPlaylist();
            } else if (actionIndicator.equals("ADDWAIT")) {
                waitingList.addSong(new Node(in.nextLine(), in.nextLine()));
            } else if (actionIndicator.equals("ADDSONGWAIT")) {
                Node temp = waitingList.deQueue();
                playlist.addSong(new Node(temp.artist, temp.judul));
            } else if (actionIndicator.equals("PRINTWAIT")) {
                waitingList.printWaitingList();
            }
        }
    }
}