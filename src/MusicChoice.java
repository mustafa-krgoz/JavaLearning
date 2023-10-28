import java.util.Scanner;
public class MusicChoice {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            boolean isOnRepeat = true;

            while(isOnRepeat){
                System.out.println("Playing current song"); //mevcut şarkıyı çalıyor.
                System.out.print("Would you like to take this song off of repeat? If so, answer yes = ");
                //Bu şarkıyı tekrardan çıkarmak ister misiniz? Eğer öyleyse, evet cevabını verin.
                String input = scanner.next();

                if("yes".equals(input)){
                    isOnRepeat = false;
                }

            }
            System.out.println("Playing next song"); // Bir sonraki şarkıya geç
        }

    }
