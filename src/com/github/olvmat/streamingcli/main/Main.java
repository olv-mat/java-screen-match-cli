package com.github.olvmat.streamingcli.main;

import com.github.olvmat.streamingcli.console.ConsoleDisplay;
import com.github.olvmat.streamingcli.console.ConsoleInput;
import com.github.olvmat.streamingcli.model.Classifiable;
import com.github.olvmat.streamingcli.model.Informative;
import com.github.olvmat.streamingcli.model.catalogs.*;
import com.github.olvmat.streamingcli.service.MarathonCalculator;
import com.github.olvmat.streamingcli.service.RecommendationFilter;

import java.util.List;

public class Main {
    private final ConsoleDisplay consoleDisplay = new ConsoleDisplay();
    private final ConsoleInput consoleInput = new ConsoleInput();
    private final MarathonCalculator marathonCalculator = new MarathonCalculator();
    private final RecommendationFilter recommendationFilter = new RecommendationFilter();
    private final MoviesCatalog moviesCatalog = new MoviesCatalog();
    private final MusicsCatalog musicsCatalog = new MusicsCatalog();
    private final PodcastsCatalog podcastsCatalog = new PodcastsCatalog();
    private final SeriesCatalog seriesCatalog = new SeriesCatalog();

    public static void main(String[] args) {
        new Main().run();
    }

    public void run() {
        this.marathonCalculator.add(moviesCatalog.getItems());
        this.marathonCalculator.add(seriesCatalog.getItems());
        int totalTime = this.marathonCalculator.getTotalTime();

        this.consoleDisplay.display("Welcome to Our Streaming!\n");
        this.consoleDisplay.display("Over " + totalTime + " Minutes of Content\n");
        while (true) {
            consoleDisplay.display("""
                    Menu
                    1 - Movies
                    2 - Musics
                    3 - Podcasts
                    4 - Series
                    5 - Exit
                    """
            );
            consoleDisplay.display("Option: ");
            switch (consoleInput.readInt()) {
                case 1:
                    this.consoleDisplay.display("Movies Catalog\n");
                    this.handleCatalog(this.moviesCatalog);
                    break;
                case 2:
                    this.consoleDisplay.display("Musics Catalog\n");
                    this.handleCatalog(this.musicsCatalog);
                    break;
                case 3:
                    this.consoleDisplay.display("Podcasts Catalog\n");
                    this.handleCatalog(this.podcastsCatalog);
                    break;
                case 4:
                    this.consoleDisplay.display("Series Catalog\n");
                    this.handleCatalog(this.seriesCatalog);
                    break;
                case 5:
                    consoleDisplay.display("Goodbye...");
                    return;
                default:
                    consoleDisplay.display("Invalid Option\n");
                    break;
            }
        }
    }

    public <T extends Classifiable & Informative> void handleCatalog(
            Catalog<T> catalog
    ) {
        List<T> items = catalog.getItems();
        while (true) {
            System.out.println("=".repeat(50));
            for (int i = 0; i < items.size(); i++) {
                System.out.printf("%d - %s%n", i + 1, items.get(i));
            }
            this.consoleDisplay.display("""
                    1 - Information
                    2 - Back
                    """
            );
            this.consoleDisplay.display("Option: ");
            switch (this.consoleInput.readInt()) {
                case 1:
                    int option;
                    do {
                        consoleDisplay.display("About: ");
                        option = this.consoleInput.readInt();
                    } while (option > items.size());
                    T item = items.get(option - 1);
                    consoleDisplay.display(item.information());
                    System.out.println(this.recommendationFilter.recommend(item));
                    break;
                case 2:
                    return;
                default:
                    consoleDisplay.display("Invalid Option\n");
                    break;
            }
        }
    }
}
