package lu.pistache.pinger;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class ScheduledTasks {

    private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 60000)
    public void reportCurrentTime() throws IOException {
        Document document = Jsoup.connect("https://zukr.herokuapp.com").get();
        String html = document.html();
        Assert.isTrue(html.contains("<title>Nightscout</title>"));
        log.info("Page pinged successfully");
    }
}
