import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

public class Main {

    public static void main(String[] args) throws Exception {

        String token = System.getenv("DISCORD_TOKEN");

        if (token == null) {
            System.out.println("DISCORD_TOKEN bulunamadı!");
            return;
        }

        JDA jda = JDABuilder.createDefault(token).build();
        jda.awaitReady();

        System.out.println("Bot aktif!");
    }
    }
