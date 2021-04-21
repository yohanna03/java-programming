package day23_String_manipulation_while_loop;

/**
 * String message = "Sender: [Nadir] From Number<2223334444> Message:{Hello, lets code some java}";
 * You do not have permission to send messages in this channel.
 */
public class SMSMessage {
    public static void main(String[] args) {
        String message = "sender:[ Saim ] From Number<(233)-475-1474>Message:{Hello, lets code some java}";
        int start = message.indexOf("[");
        int end = message.indexOf("]");
        System.out.println(message.substring(start+1,end));
        String sender = message.substring(start+1,end);
        System.out.println("sender = "+ sender);

        String mobile = message.substring(message.indexOf("<")+1,message.indexOf(">"));
        System.out.println("mobile = " + mobile);

        String text = message.substring(message.indexOf("{")+1,message.indexOf("}"));
        System.out.println("text = " + text);

        System.out.println("Fikret" . trim());
        sender = sender.trim();

        if (sender.equals("Saim")) {
            System.out.println("message from Saim about homework");
        }else {
            System.out.println("someone else message");
        }
        String word = " java ";
        System.out.println(word.trim());//==>"java"

    }
}
