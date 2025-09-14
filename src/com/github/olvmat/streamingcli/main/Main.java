package com.github.olvmat.streamingcli.main;

import com.github.olvmat.streamingcli.console.ConsoleDisplay;
import com.github.olvmat.streamingcli.console.ConsoleInput;
import com.github.olvmat.streamingcli.model.catalogs.MovieCatalog;
import com.github.olvmat.streamingcli.model.catalogs.MusicCatalog;
import com.github.olvmat.streamingcli.model.catalogs.PodcastCatalog;
import com.github.olvmat.streamingcli.model.catalogs.SeriesCatalog;

public class Main {
    public static void main(String[] args) {
        System.out.println("Streaming");

        ConsoleInput consoleInput = new ConsoleInput();
        MovieCatalog moviesCatalog = new MovieCatalog();
        MusicCatalog musicCatalog = new MusicCatalog();
        PodcastCatalog podcastCatalog = new PodcastCatalog();
        SeriesCatalog seriesCatalog = new SeriesCatalog();

        ConsoleDisplay.display("Over " +  0 + " Minutes Of Content!\n");
        boolean hasSubscribed = true;
        if (hasSubscribed) {
            while (true) {
                ConsoleDisplay.display("""
                        Menu
                        1 - Movie Catalog
                        2 - Music Catalog
                        3 - Podcast Catalog
                        4 - Series Catalog
                        5 - Exit
                        """
                );
                ConsoleDisplay.display("Option: ");
                int option = consoleInput.readInt();
                switch (option) {
                    case 1:
                        ConsoleDisplay.displayCatalog("Movie Catalog", moviesCatalog);
                        break;
                    case 2:
                        ConsoleDisplay.displayCatalog("Music Catalog", musicCatalog);
                        break;
                    case 3:
                        ConsoleDisplay.displayCatalog("Podcast Catalog", podcastCatalog);
                        break;
                    case 4:
                        ConsoleDisplay.displayCatalog("Series Catalog", seriesCatalog);
                        break;
                    case 5:
                        System.out.println("Thank You For Using Screen Match!");
                        return;
                    default:
                        System.out.println("Invalid Option");
                        break;
                }
            }
        } else {
            System.out.println("Please, Subscribe To Our Platform");
        }
    }
}
